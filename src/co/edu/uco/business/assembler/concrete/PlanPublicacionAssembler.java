package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.PlanCategoriaDomain;
import co.edu.uco.business.domain.PlanPublicacionDomain;
import co.edu.uco.dto.PlanPublicacionDTO;
import co.edu.uco.entities.PlanPublicacionEntity;

public final class PlanPublicacionAssembler implements Assembler<PlanPublicacionDomain, PlanPublicacionDTO, PlanPublicacionEntity>{
	

	private static final Assembler<PlanPublicacionDomain, PlanPublicacionDTO, PlanPublicacionEntity> INSTANCE = new PlanPublicacionAssembler();
	
	
	private PlanPublicacionAssembler() {
		
	}


	public static final Assembler<PlanPublicacionDomain, PlanPublicacionDTO, PlanPublicacionEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public PlanPublicacionDTO toDTOFromDomain(PlanPublicacionDomain domain) {
		return PlanPublicacionDTO.create().setIdentificador(domain.getIdentificador()).
				setPublicacion(PublicacionAssembler.getInstance().toDTOFromDomain(domain.getPublicacion())).
				setPrecio(domain.getPrecio()).setFechaDesde(domain.getFechaDesde()).setFechaFin(domain.getFechaFin());
	}


	@Override
	public PlanPublicacionDomain toDomainFromDto(PlanPublicacionDTO dto) {
		return new PlanPublicacionDomain(dto.getIdentificador(),PublicacionAssembler.getInstance().toDomainFromDto(dto.getPublicacion()),
				dto.getPrecio(),dto.getFechaDesde(),dto.getFechaFin());
	}


	@Override
	public PlanPublicacionEntity toEntityFromDomain(PlanPublicacionDomain domain) {
		return new PlanPublicacionEntity(domain.getIdentificador(),PublicacionAssembler.getInstance().toEntityFromDomain(domain.getPublicacion()),
				domain.getPrecio(),domain.getFechaDesde(),domain.getFechaFin());
	}


	@Override
	public PlanPublicacionDomain toDomainFromEntity(PlanPublicacionEntity entity) {
		return new PlanPublicacionDomain(entity.getIdentificador(),PublicacionAssembler.getInstance().toDomainFromEntity(entity.getPublicacion()),
				entity.getPrecio(),entity.getFechaDesde(),entity.getFechaFin());
	}


	@Override
	public List<PlanPublicacionDomain> toDomainListFromEntityList(List<PlanPublicacionEntity> entityList) {

		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}


	@Override
	public List<PlanPublicacionDTO> toDtoListFromDomainList(List<PlanPublicacionDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}


	
	
}
