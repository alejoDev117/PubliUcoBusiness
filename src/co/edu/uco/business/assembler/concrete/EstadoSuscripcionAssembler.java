package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoSuscripcionDomain;
import co.edu.uco.dto.EstadoSuscripcionDTO;
import co.edu.uco.entities.EstadoSuscripcionEntity;

public final class EstadoSuscripcionAssembler implements Assembler<EstadoSuscripcionDomain,EstadoSuscripcionDTO,EstadoSuscripcionEntity>{
	
	private static final Assembler<EstadoSuscripcionDomain,EstadoSuscripcionDTO,EstadoSuscripcionEntity> INSTANCE = new EstadoSuscripcionAssembler();
	
	
	private EstadoSuscripcionAssembler() {
		super();
	}
	
	

	public static final Assembler<EstadoSuscripcionDomain, EstadoSuscripcionDTO, EstadoSuscripcionEntity> getInstance() {
		return INSTANCE;
	}



	@Override
	public EstadoSuscripcionDTO toDTOFromDomain(EstadoSuscripcionDomain domain) {
		return EstadoSuscripcionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoSuscripcionDomain toDomainFromDto(EstadoSuscripcionDTO dto) {
		return new EstadoSuscripcionDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoSuscripcionEntity toEntityFromDomain(EstadoSuscripcionDomain domain) {
		return new EstadoSuscripcionEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public EstadoSuscripcionDomain toDomainFromEntity(EstadoSuscripcionEntity entity) {
		return new EstadoSuscripcionDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}



	@Override
	public List<EstadoSuscripcionDomain> toDomainListFromEntityList(List<EstadoSuscripcionEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}

}
