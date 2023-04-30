package co.edu.uco.business.assembler.concrete;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoObservacionRevisorDomain;
import co.edu.uco.dto.EstadoObservacionRevisorDTO;
import co.edu.uco.entities.EstadoObservacionRevisorEntity;

public final class EstadoObservacionRevisorAssembler implements Assembler<EstadoObservacionRevisorDomain,EstadoObservacionRevisorDTO,EstadoObservacionRevisorEntity> {

	private static final Assembler<EstadoObservacionRevisorDomain,EstadoObservacionRevisorDTO,EstadoObservacionRevisorEntity> INSTANCE = new EstadoObservacionRevisorAssembler();
	
	
	private EstadoObservacionRevisorAssembler() {
		super();
	}


	public static final Assembler<EstadoObservacionRevisorDomain, EstadoObservacionRevisorDTO, EstadoObservacionRevisorEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public EstadoObservacionRevisorDTO toDTOFromDomain(EstadoObservacionRevisorDomain domain) {
		return EstadoObservacionRevisorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}


	@Override
	public EstadoObservacionRevisorDomain toDomainFromDto(EstadoObservacionRevisorDTO dto) {
		return new EstadoObservacionRevisorDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}


	@Override
	public EstadoObservacionRevisorEntity toEntityFromDomain(EstadoObservacionRevisorDomain domain) {
		return new EstadoObservacionRevisorEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}


	@Override
	public EstadoObservacionRevisorDomain toDomainFromEntity(EstadoObservacionRevisorEntity entity) {
		return new EstadoObservacionRevisorDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}
	
	
	
	
}
