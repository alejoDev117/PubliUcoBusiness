package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoVersionDomain;
import co.edu.uco.dto.EstadoVersionDTO;
import co.edu.uco.entities.EstadoVersionEntity;

public final class EstadoVersionAssembler implements Assembler<EstadoVersionDomain,EstadoVersionDTO,EstadoVersionEntity> {
	
	private static final Assembler<EstadoVersionDomain,EstadoVersionDTO,EstadoVersionEntity> INSTANCE = new EstadoVersionAssembler();
	
	private EstadoVersionAssembler() {
		super();
	}

	public static final Assembler<EstadoVersionDomain, EstadoVersionDTO, EstadoVersionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EstadoVersionDTO toDTOFromDomain(EstadoVersionDomain domain) {
		return EstadoVersionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoVersionDomain toDomainFromDto(EstadoVersionDTO dto) {
		return new EstadoVersionDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoVersionEntity toEntityFromDomain(EstadoVersionDomain domain) {
		return new EstadoVersionEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public EstadoVersionDomain toDomainFromEntity(EstadoVersionEntity entity) {
		return new EstadoVersionDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}

	@Override
	public List<EstadoVersionDomain> toDomainListFromEntityList(List<EstadoVersionEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}
	

}
