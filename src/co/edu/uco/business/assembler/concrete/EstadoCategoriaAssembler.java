package co.edu.uco.business.assembler.concrete;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoCategoriaDomain;
import co.edu.uco.dto.EstadoCategoriaDTO;
import co.edu.uco.entities.EstadoCategoriaEntity;

public final class EstadoCategoriaAssembler implements Assembler<EstadoCategoriaDomain,EstadoCategoriaDTO,EstadoCategoriaEntity>{
	
	private static final Assembler<EstadoCategoriaDomain,EstadoCategoriaDTO,EstadoCategoriaEntity> INSTANCE = new EstadoCategoriaAssembler();
	
	
	private EstadoCategoriaAssembler() {
		super();
	}
	
	

	public static final Assembler<EstadoCategoriaDomain, EstadoCategoriaDTO, EstadoCategoriaEntity> getInstance() {
		return INSTANCE;
	}



	@Override
	public EstadoCategoriaDTO toDTOFromDomain(EstadoCategoriaDomain domain) {
		return EstadoCategoriaDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoCategoriaDomain toDomainFromDto(EstadoCategoriaDTO dto) {
		return new EstadoCategoriaDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoCategoriaEntity toEntityFromDomain(EstadoCategoriaDomain domain) {
		return new EstadoCategoriaEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public EstadoCategoriaDomain toDomainFromEntity(EstadoCategoriaEntity entity) {
		return new EstadoCategoriaDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}
	

}
