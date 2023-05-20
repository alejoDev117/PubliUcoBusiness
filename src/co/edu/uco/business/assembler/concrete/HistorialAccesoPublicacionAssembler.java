package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.HistorialAccesoPublicacionDomain;
import co.edu.uco.dto.HistorialAccesoPublicacionDTO;
import co.edu.uco.entities.HistorialAccesoPublicacionEntity;

public final class HistorialAccesoPublicacionAssembler implements Assembler<HistorialAccesoPublicacionDomain, HistorialAccesoPublicacionDTO, HistorialAccesoPublicacionEntity>{
	
	private static final Assembler<HistorialAccesoPublicacionDomain, HistorialAccesoPublicacionDTO, HistorialAccesoPublicacionEntity> INSTANCE = new HistorialAccesoPublicacionAssembler();
	
	
	private HistorialAccesoPublicacionAssembler() {
		
	}


	public static final Assembler<HistorialAccesoPublicacionDomain, HistorialAccesoPublicacionDTO, HistorialAccesoPublicacionEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public HistorialAccesoPublicacionDTO toDTOFromDomain(HistorialAccesoPublicacionDomain domain) {
		return HistorialAccesoPublicacionDTO.create().setIdentificador(domain.getIdentificador()).
				setLector(LectorAssembler.getInstance().toDTOFromDomain(domain.getLector())).
				setPublicacion(PublicacionAssembler.getInstance().toDTOFromDomain(domain.getPublicacion()));
	}


	@Override
	public HistorialAccesoPublicacionDomain toDomainFromDto(HistorialAccesoPublicacionDTO dto) {
		return new HistorialAccesoPublicacionDomain(dto.getIdentificador(),
				LectorAssembler.getInstance().toDomainFromDto(dto.getLector()),
				PublicacionAssembler.getInstance().toDomainFromDto(dto.getPublicacion()));
	}


	@Override
	public HistorialAccesoPublicacionEntity toEntityFromDomain(HistorialAccesoPublicacionDomain domain) {
		return new HistorialAccesoPublicacionEntity(domain.getIdentificador(),
				LectorAssembler.getInstance().toEntityFromDomain(domain.getLector()),
				PublicacionAssembler.getInstance().toEntityFromDomain(domain.getPublicacion()));
	}


	@Override
	public HistorialAccesoPublicacionDomain toDomainFromEntity(HistorialAccesoPublicacionEntity entity) {
		return new HistorialAccesoPublicacionDomain(entity.getIdentificador(),
				LectorAssembler.getInstance().toDomainFromEntity(entity.getLector()),
				PublicacionAssembler.getInstance().toDomainFromEntity(entity.getPublicacion()));
	}
	


	@Override
	public List<HistorialAccesoPublicacionDomain> toDomainListFromEntityList(
			List<HistorialAccesoPublicacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}


	@Override
	public List<HistorialAccesoPublicacionDTO> toDtoListFromDomainList(
			List<HistorialAccesoPublicacionDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	

}
