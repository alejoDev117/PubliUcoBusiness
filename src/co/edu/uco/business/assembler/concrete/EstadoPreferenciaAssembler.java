package co.edu.uco.business.assembler.concrete;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoPreferenciaDomain;
import co.edu.uco.dto.EstadoPreferenciaDTO;
import co.edu.uco.entities.EstadoPreferenciaEntity;

public final class EstadoPreferenciaAssembler implements Assembler<EstadoPreferenciaDomain,EstadoPreferenciaDTO,EstadoPreferenciaEntity>{
	
	private static final Assembler<EstadoPreferenciaDomain,EstadoPreferenciaDTO,EstadoPreferenciaEntity> INSTANCE = new EstadoPreferenciaAssembler();
	
	
	private EstadoPreferenciaAssembler() {
		super();
	}
	
	

	public static final Assembler<EstadoPreferenciaDomain, EstadoPreferenciaDTO, EstadoPreferenciaEntity> getInstance() {
		return INSTANCE;
	}



	@Override
	public EstadoPreferenciaDTO toDTOFromDomain(EstadoPreferenciaDomain domain) {
		return EstadoPreferenciaDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoPreferenciaDomain toDomainFromDto(EstadoPreferenciaDTO dto) {
		return new EstadoPreferenciaDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoPreferenciaEntity toEntityFromDomain(EstadoPreferenciaDomain domain) {
		return new EstadoPreferenciaEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public EstadoPreferenciaDomain toDomainFromEntity(EstadoPreferenciaEntity entity) {
		return new EstadoPreferenciaDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}

}
