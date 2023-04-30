package co.edu.uco.business.assembler.concrete;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoPublicacionDomain;
import co.edu.uco.dto.EstadoPublicacionDTO;
import co.edu.uco.entities.EstadoPublicacionEntity;

public final  class EstadoPublicacionAssembler implements Assembler<EstadoPublicacionDomain,EstadoPublicacionDTO,EstadoPublicacionEntity> {
	
	private static final Assembler<EstadoPublicacionDomain,EstadoPublicacionDTO,EstadoPublicacionEntity> INSTANCE = new EstadoPublicacionAssembler();
	
	
	private EstadoPublicacionAssembler() {
		super();
	}


	public static final Assembler<EstadoPublicacionDomain, EstadoPublicacionDTO, EstadoPublicacionEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public EstadoPublicacionDTO toDTOFromDomain(EstadoPublicacionDomain domain) {
		return EstadoPublicacionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}


	@Override
	public EstadoPublicacionDomain toDomainFromDto(EstadoPublicacionDTO dto) {
		return new EstadoPublicacionDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}


	@Override
	public EstadoPublicacionEntity toEntityFromDomain(EstadoPublicacionDomain domain) {
		return new EstadoPublicacionEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}


	@Override
	public EstadoPublicacionDomain toDomainFromEntity(EstadoPublicacionEntity entity) {
		return new EstadoPublicacionDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}
	
	
	

}
