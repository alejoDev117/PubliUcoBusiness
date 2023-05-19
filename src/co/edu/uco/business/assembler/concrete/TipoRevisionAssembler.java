package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.TipoRevisionDomain;
import co.edu.uco.dto.TipoRevisionDTO;
import co.edu.uco.entities.TipoRevisionEntity;

public final class TipoRevisionAssembler implements Assembler<TipoRevisionDomain,TipoRevisionDTO,TipoRevisionEntity>{
	
	private static final Assembler<TipoRevisionDomain,TipoRevisionDTO,TipoRevisionEntity> INSTANCE = new TipoRevisionAssembler();
	
	private TipoRevisionAssembler() {
		super();
	}

	public static final Assembler<TipoRevisionDomain, TipoRevisionDTO, TipoRevisionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public TipoRevisionDTO toDTOFromDomain(TipoRevisionDomain domain) {
		return TipoRevisionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public TipoRevisionDomain toDomainFromDto(TipoRevisionDTO dto) {
		return new TipoRevisionDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public TipoRevisionEntity toEntityFromDomain(TipoRevisionDomain domain) {
		return new TipoRevisionEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public TipoRevisionDomain toDomainFromEntity(TipoRevisionEntity entity) {
		return new TipoRevisionDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}

	@Override
	public List<TipoRevisionDomain> toDomainListFromEntityList(List<TipoRevisionEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
