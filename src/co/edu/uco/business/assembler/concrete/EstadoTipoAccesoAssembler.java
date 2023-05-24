package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoTipoAccesoDomain;
import co.edu.uco.dto.EstadoTipoAccesoDTO;
import co.edu.uco.entities.EstadoTipoAccesoEntity;

public final class EstadoTipoAccesoAssembler implements Assembler<EstadoTipoAccesoDomain,EstadoTipoAccesoDTO,EstadoTipoAccesoEntity>{
	
	private static final Assembler<EstadoTipoAccesoDomain,EstadoTipoAccesoDTO,EstadoTipoAccesoEntity> INSTANCE = new EstadoTipoAccesoAssembler();
	
	private EstadoTipoAccesoAssembler() {
		super();
	}

	public static final Assembler<EstadoTipoAccesoDomain, EstadoTipoAccesoDTO, EstadoTipoAccesoEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoTipoAccesoDTO toDTOFromDomain(EstadoTipoAccesoDomain domain) {
		return EstadoTipoAccesoDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoTipoAccesoDomain toDomainFromDto(EstadoTipoAccesoDTO dto) {
		return new EstadoTipoAccesoDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoTipoAccesoEntity toEntityFromDomain(EstadoTipoAccesoDomain domain) {
		return new EstadoTipoAccesoEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public EstadoTipoAccesoDomain toDomainFromEntity(EstadoTipoAccesoEntity entity) {
		return new EstadoTipoAccesoDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}

	@Override
	public List<EstadoTipoAccesoDomain> toDomainListFromEntityList(List<EstadoTipoAccesoEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EstadoTipoAccesoDTO> toDtoListFromDomainList(List<EstadoTipoAccesoDomain> domainList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
