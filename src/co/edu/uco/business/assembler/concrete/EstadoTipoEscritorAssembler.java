package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoTipoEscritorDomain;
import co.edu.uco.dto.EstadoTipoEscritorDTO;
import co.edu.uco.entities.EstadoTipoEscritorEntity;

public final class EstadoTipoEscritorAssembler implements Assembler<EstadoTipoEscritorDomain,EstadoTipoEscritorDTO,EstadoTipoEscritorEntity> {
	
	private static final Assembler<EstadoTipoEscritorDomain,EstadoTipoEscritorDTO,EstadoTipoEscritorEntity> INSTANCE = new EstadoTipoEscritorAssembler();
	
	
	private EstadoTipoEscritorAssembler() {
		super();
	}


	public static final Assembler<EstadoTipoEscritorDomain, EstadoTipoEscritorDTO, EstadoTipoEscritorEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public EstadoTipoEscritorDTO toDTOFromDomain(EstadoTipoEscritorDomain domain) {
		return EstadoTipoEscritorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}


	@Override
	public EstadoTipoEscritorDomain toDomainFromDto(EstadoTipoEscritorDTO dto) {
		return new EstadoTipoEscritorDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}


	@Override
	public EstadoTipoEscritorEntity toEntityFromDomain(EstadoTipoEscritorDomain domain) {
		return new EstadoTipoEscritorEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}


	@Override
	public EstadoTipoEscritorDomain toDomainFromEntity(EstadoTipoEscritorEntity entity) {
		return new EstadoTipoEscritorDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}


	@Override
	public List<EstadoTipoEscritorDomain> toDomainListFromEntityList(List<EstadoTipoEscritorEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<EstadoTipoEscritorDTO> toDtoListFromDomainList(List<EstadoTipoEscritorDomain> domainList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
