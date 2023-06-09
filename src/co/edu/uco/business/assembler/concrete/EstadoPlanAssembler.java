package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoPlanDomain;
import co.edu.uco.dto.EstadoPlanDTO;
import co.edu.uco.entities.EstadoPlanEntity;

public final class EstadoPlanAssembler implements Assembler<EstadoPlanDomain,EstadoPlanDTO,EstadoPlanEntity>{
	
	private static final Assembler<EstadoPlanDomain,EstadoPlanDTO,EstadoPlanEntity> INSTANCE = new EstadoPlanAssembler();
	
	
	private EstadoPlanAssembler() {
		super();
	}


	public static final Assembler<EstadoPlanDomain, EstadoPlanDTO, EstadoPlanEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public EstadoPlanDTO toDTOFromDomain(EstadoPlanDomain domain) {
		return EstadoPlanDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}


	@Override
	public EstadoPlanDomain toDomainFromDto(EstadoPlanDTO dto) {
		return new EstadoPlanDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}


	@Override
	public EstadoPlanEntity toEntityFromDomain(EstadoPlanDomain domain) {
		return new EstadoPlanEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}


	@Override
	public EstadoPlanDomain toDomainFromEntity(EstadoPlanEntity entity) {
		return new EstadoPlanDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}


	@Override
	public List<EstadoPlanDomain> toDomainListFromEntityList(List<EstadoPlanEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<EstadoPlanDTO> toDtoListFromDomainList(List<EstadoPlanDomain> domainList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
