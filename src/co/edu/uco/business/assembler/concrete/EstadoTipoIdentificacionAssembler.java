package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoTipoIdentificacionDomain;
import co.edu.uco.dto.EstadoTipoIdentificacionDTO;
import co.edu.uco.entities.EstadoTipoIdentificacionEntity;

public final class EstadoTipoIdentificacionAssembler implements Assembler<EstadoTipoIdentificacionDomain,EstadoTipoIdentificacionDTO,EstadoTipoIdentificacionEntity>{
	private static final Assembler<EstadoTipoIdentificacionDomain,EstadoTipoIdentificacionDTO,EstadoTipoIdentificacionEntity> INSTANCE = new EstadoTipoIdentificacionAssembler();
	
	private EstadoTipoIdentificacionAssembler() {
		super();
		
	}

	public static final Assembler<EstadoTipoIdentificacionDomain, EstadoTipoIdentificacionDTO, EstadoTipoIdentificacionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoTipoIdentificacionDTO toDTOFromDomain(EstadoTipoIdentificacionDomain domain) {
		return EstadoTipoIdentificacionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoTipoIdentificacionDomain toDomainFromDto(EstadoTipoIdentificacionDTO dto) {
		return new EstadoTipoIdentificacionDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoTipoIdentificacionEntity toEntityFromDomain(EstadoTipoIdentificacionDomain domain) {
		return new EstadoTipoIdentificacionEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public EstadoTipoIdentificacionDomain toDomainFromEntity(EstadoTipoIdentificacionEntity entity) {
		return new EstadoTipoIdentificacionDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}

	@Override
	public List<EstadoTipoIdentificacionDomain> toDomainListFromEntityList(
			List<EstadoTipoIdentificacionEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<EstadoTipoIdentificacionDTO> toDtoListFromDomainList(List<EstadoTipoIdentificacionDomain> domainList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
