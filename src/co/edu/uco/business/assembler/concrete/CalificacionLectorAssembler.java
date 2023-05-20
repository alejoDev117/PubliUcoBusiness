package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.CalificacionDomain;
import co.edu.uco.dto.CalificacionDTO;
import co.edu.uco.entities.CalificacionEntity;

public final class CalificacionLectorAssembler implements Assembler<CalificacionDomain,CalificacionDTO, CalificacionEntity>{
	
	private static final Assembler<CalificacionDomain,CalificacionDTO, CalificacionEntity>  INSTANCE = new CalificacionLectorAssembler();
	
	private CalificacionLectorAssembler() {
		
	}

	public static final Assembler<CalificacionDomain, CalificacionDTO, CalificacionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public CalificacionDTO toDTOFromDomain(CalificacionDomain domain) {
		return CalificacionDTO.create().setIdentificador(domain.getIdentificador()).setLector(LectorAssembler.getInstance().toDTOFromDomain(domain.getLector()))
				.setPublicacion(PublicacionAssembler.getInstance().toDTOFromDomain(domain.getPublicacion())).setFechaCalificacion(domain.getFechaCalificacion());	
		}

	@Override
	public CalificacionDomain toDomainFromDto(CalificacionDTO dto) {
		return new CalificacionDomain(dto.getIdentificador(),LectorAssembler.getInstance().toDomainFromDto(dto.getLector()),PublicacionAssembler.getInstance().toDomainFromDto(dto.getPublicacion()),
				dto.getFechaCalificacion());
	}

	@Override
	public CalificacionEntity toEntityFromDomain(CalificacionDomain domain) {
		return new CalificacionEntity(domain.getIdentificador(),LectorAssembler.getInstance().toEntityFromDomain(domain.getLector()),PublicacionAssembler.getInstance().toEntityFromDomain(domain.getPublicacion()),
				domain.getFechaCalificacion());
	}

	@Override
	public CalificacionDomain toDomainFromEntity(CalificacionEntity entity) {
		return new CalificacionDomain(entity.getIdentificador(),LectorAssembler.getInstance().toDomainFromEntity(entity.getLector()),PublicacionAssembler.getInstance().toDomainFromEntity(entity.getPublicacion()),
				entity.getFechaCalificacion());
	}

	@Override
	public List<CalificacionDomain> toDomainListFromEntityList(List<CalificacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<CalificacionDTO> toDtoListFromDomainList(List<CalificacionDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	

}
