package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.CalificacionDomain;
import co.edu.uco.business.domain.ComentarioLectorDomain;
import co.edu.uco.dto.CalificacionDTO;
import co.edu.uco.dto.ComentarioLectorDTO;
import co.edu.uco.entities.CalificacionEntity;
import co.edu.uco.entities.ComentarioLectorEntity;

public final class ComentarioLectorAssembler implements Assembler<ComentarioLectorDomain,ComentarioLectorDTO,ComentarioLectorEntity>{
	
	private static final Assembler<ComentarioLectorDomain,ComentarioLectorDTO,ComentarioLectorEntity>  INSTANCE = new ComentarioLectorAssembler();
	
	private ComentarioLectorAssembler() {
		
	}

	public static final Assembler<ComentarioLectorDomain,ComentarioLectorDTO,ComentarioLectorEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public ComentarioLectorDTO toDTOFromDomain(ComentarioLectorDomain domain) {
		return ComentarioLectorDTO.create().setIdentificador(domain.getIdentificador()).setLector(LectorAssembler.getInstance().toDTOFromDomain(domain.getLector())).
				setPublicacion(PublicacionAssembler.getInstance().toDTOFromDomain(domain.getPublicacion())).setComentarioPadre(ComentarioLectorAssembler.getInstance().toDTOFromDomain(domain.getComentarioPadre())).
				setComentario(domain.getComentario()).setFechaComentario(domain.getFechaComentario()).setEstado(EstadoComentarioLectorAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}

	@Override
	public ComentarioLectorDomain toDomainFromDto(ComentarioLectorDTO dto) {
		return new ComentarioLectorDomain(dto.getIdentificador(),
				LectorAssembler.getInstance().toDomainFromDto(dto.getLector()),
				PublicacionAssembler.getInstance().toDomainFromDto(dto.getPublicacion()),
				ComentarioLectorAssembler.getInstance().toDomainFromDto(dto.getComentarioPadre()),
				dto.getComentario(),dto.getFechaComentario(), 
				EstadoComentarioLectorAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public ComentarioLectorEntity toEntityFromDomain(ComentarioLectorDomain domain) {
		return new ComentarioLectorEntity(domain.getIdentificador(),
				LectorAssembler.getInstance().toEntityFromDomain(domain.getLector()),
				PublicacionAssembler.getInstance().toEntityFromDomain(domain.getPublicacion()),
				ComentarioLectorAssembler.getInstance().toEntityFromDomain(domain.getComentarioPadre()),
				domain.getComentario(),domain.getFechaComentario(), 
				EstadoComentarioLectorAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public ComentarioLectorDomain toDomainFromEntity(ComentarioLectorEntity entity) {
		return new ComentarioLectorDomain(entity.getIdentificador(),
				LectorAssembler.getInstance().toDomainFromEntity(entity.getLector()),
				PublicacionAssembler.getInstance().toDomainFromEntity(entity.getPublicacion()),
				ComentarioLectorAssembler.getInstance().toDomainFromEntity(entity.getComentarioPadre()),
				entity.getComentario(),entity.getFechaComentario(), 
				EstadoComentarioLectorAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<ComentarioLectorDomain> toDomainListFromEntityList(List<ComentarioLectorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<ComentarioLectorDTO> toDtoListFromDomainList(List<ComentarioLectorDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	

}
