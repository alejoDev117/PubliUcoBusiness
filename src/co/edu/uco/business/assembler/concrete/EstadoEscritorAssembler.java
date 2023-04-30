package co.edu.uco.business.assembler.concrete;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoEscritorDomain;
import co.edu.uco.dto.EstadoEscritorDTO;
import co.edu.uco.entities.EstadoEscritorEntity;

public final class EstadoEscritorAssembler implements Assembler<EstadoEscritorDomain,EstadoEscritorDTO,EstadoEscritorEntity> {
	
	private static final Assembler<EstadoEscritorDomain,EstadoEscritorDTO,EstadoEscritorEntity> INSTANCE = new EstadoEscritorAssembler();
	
	
	private EstadoEscritorAssembler() {
		super();
	}
	
	

	public static final Assembler<EstadoEscritorDomain, EstadoEscritorDTO, EstadoEscritorEntity> getInstance() {
		return INSTANCE;
	}



	@Override
	public EstadoEscritorDTO toDTOFromDomain(EstadoEscritorDomain domain) {
		return EstadoEscritorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoEscritorDomain toDomainFromDto(EstadoEscritorDTO dto) {
		return new EstadoEscritorDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoEscritorEntity toEntityFromDomain(EstadoEscritorDomain domain) {
		return new EstadoEscritorEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public EstadoEscritorDomain toDomainFromEntity(EstadoEscritorEntity entity) {
		return new EstadoEscritorDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}

}
