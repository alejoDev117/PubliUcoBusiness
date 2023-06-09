package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoLectorDomain;
import co.edu.uco.dto.EstadoLectorDTO;
import co.edu.uco.entities.EstadoLectorEntity;

public final class EstadoLectorAssembler implements Assembler<EstadoLectorDomain,EstadoLectorDTO,EstadoLectorEntity>{
	
	
	private static final Assembler<EstadoLectorDomain,EstadoLectorDTO,EstadoLectorEntity> INSTANCE = new EstadoLectorAssembler();
	
	
	private EstadoLectorAssembler() {
		super();
	}
	
	
	 

	public static final Assembler<EstadoLectorDomain, EstadoLectorDTO, EstadoLectorEntity> getInstance() {
		return INSTANCE;
	}




	@Override
	public EstadoLectorDTO toDTOFromDomain(EstadoLectorDomain domain) {
		return EstadoLectorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public EstadoLectorDomain toDomainFromDto(EstadoLectorDTO dto) {
		return new EstadoLectorDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoLectorEntity toEntityFromDomain(EstadoLectorDomain domain) {
		return new EstadoLectorEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public EstadoLectorDomain toDomainFromEntity(EstadoLectorEntity entity) {
		return new EstadoLectorDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}




	@Override
	public List<EstadoLectorDomain> toDomainListFromEntityList(List<EstadoLectorEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}




	@Override
	public List<EstadoLectorDTO> toDtoListFromDomainList(List<EstadoLectorDomain> domainList) {
		// TODO Auto-generated method stub
		return null;
	}

}
