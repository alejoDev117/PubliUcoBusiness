package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoComentarioLectorDomain;
import co.edu.uco.dto.EstadoComentarioLectorDTO;
import co.edu.uco.entities.EstadoComentarioLectorEntity;

public final class EstadoComentarioLectorAssembler implements Assembler<EstadoComentarioLectorDomain,EstadoComentarioLectorDTO,EstadoComentarioLectorEntity> {

	
	private static final Assembler<EstadoComentarioLectorDomain,EstadoComentarioLectorDTO,EstadoComentarioLectorEntity> INSTANCE = new EstadoComentarioLectorAssembler();
	
	
	private EstadoComentarioLectorAssembler() {
		super();
	}
	
	
	
	public static final Assembler<EstadoComentarioLectorDomain, EstadoComentarioLectorDTO, EstadoComentarioLectorEntity> getInstance() {
		return INSTANCE;
	}



	@Override
	public EstadoComentarioLectorDTO toDTOFromDomain(EstadoComentarioLectorDomain domain) {
		return EstadoComentarioLectorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoComentarioLectorDomain toDomainFromDto(EstadoComentarioLectorDTO dto) {
		return new EstadoComentarioLectorDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoComentarioLectorEntity toEntityFromDomain(EstadoComentarioLectorDomain domain) {
		return new EstadoComentarioLectorEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public EstadoComentarioLectorDomain toDomainFromEntity(EstadoComentarioLectorEntity entity) {
		return new EstadoComentarioLectorDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}



	@Override
	public List<EstadoComentarioLectorDomain> toDomainListFromEntityList(
			List<EstadoComentarioLectorEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}



	@Override
	public List<EstadoComentarioLectorDTO> toDtoListFromDomainList(List<EstadoComentarioLectorDomain> domainList) {
		// TODO Auto-generated method stub
		return null;
	}

}
