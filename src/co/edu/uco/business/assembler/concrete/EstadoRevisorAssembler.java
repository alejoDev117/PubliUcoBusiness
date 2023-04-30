package co.edu.uco.business.assembler.concrete;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoRevisorDomain;
import co.edu.uco.dto.EstadoRevisorDTO;
import co.edu.uco.entities.EstadoRevisorEntity;

public final class EstadoRevisorAssembler implements Assembler<EstadoRevisorDomain,EstadoRevisorDTO,EstadoRevisorEntity> {
	
	private static final Assembler<EstadoRevisorDomain,EstadoRevisorDTO,EstadoRevisorEntity> INSTANCE = new EstadoRevisorAssembler();
	
	
	private EstadoRevisorAssembler() {
		super();
	}


	public static final Assembler<EstadoRevisorDomain, EstadoRevisorDTO, EstadoRevisorEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public EstadoRevisorDTO toDTOFromDomain(EstadoRevisorDomain domain) {
		return EstadoRevisorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}


	@Override
	public EstadoRevisorDomain toDomainFromDto(EstadoRevisorDTO dto) {
		return new EstadoRevisorDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}


	@Override
	public EstadoRevisorEntity toEntityFromDomain(EstadoRevisorDomain domain) {
		return new EstadoRevisorEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}


	@Override
	public EstadoRevisorDomain toDomainFromEntity(EstadoRevisorEntity entity) {
		return new EstadoRevisorDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}
	
	

}
