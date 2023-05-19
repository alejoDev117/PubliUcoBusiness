package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoRevisionDomain;
import co.edu.uco.dto.EstadoRevisionDTO;
import co.edu.uco.entities.EstadoRevisionEntity;

public final class EstadoRevisionAssembler implements Assembler<EstadoRevisionDomain,EstadoRevisionDTO,EstadoRevisionEntity>{
	
	private static final Assembler<EstadoRevisionDomain,EstadoRevisionDTO,EstadoRevisionEntity> INSTANCE = new EstadoRevisionAssembler();
	
	
	private EstadoRevisionAssembler() {
		super();
	}
	
	

	public static final Assembler<EstadoRevisionDomain, EstadoRevisionDTO, EstadoRevisionEntity> getInstance() {
		return INSTANCE;
	}



	@Override
	public EstadoRevisionDTO toDTOFromDomain(EstadoRevisionDomain domain) {
		return EstadoRevisionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoRevisionDomain toDomainFromDto(EstadoRevisionDTO dto) {
		return new EstadoRevisionDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoRevisionEntity toEntityFromDomain(EstadoRevisionDomain domain) {
		return new EstadoRevisionEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public EstadoRevisionDomain toDomainFromEntity(EstadoRevisionEntity entity) {
		return new EstadoRevisionDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}



	@Override
	public List<EstadoRevisionDomain> toDomainListFromEntityList(List<EstadoRevisionEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}

}
