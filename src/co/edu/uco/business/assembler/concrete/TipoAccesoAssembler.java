package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.TipoAccesoDomain;
import co.edu.uco.dto.TipoAccesoDTO;
import co.edu.uco.entities.TipoAccesoEntity;

public final class TipoAccesoAssembler implements Assembler<TipoAccesoDomain,TipoAccesoDTO,TipoAccesoEntity>{
	
	private static final Assembler<TipoAccesoDomain,TipoAccesoDTO,TipoAccesoEntity> INSTANCE = new TipoAccesoAssembler();
	
	private TipoAccesoAssembler() {
		super();
	}

	public static final Assembler<TipoAccesoDomain, TipoAccesoDTO, TipoAccesoEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public TipoAccesoDTO toDTOFromDomain(TipoAccesoDomain domain) {
		return TipoAccesoDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion()).setEstado(EstadoTipoAccesoAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}

	@Override
	public TipoAccesoDomain toDomainFromDto(TipoAccesoDTO dto) {
		return new TipoAccesoDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion(),EstadoTipoAccesoAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public TipoAccesoEntity toEntityFromDomain(TipoAccesoDomain domain) {
		return new TipoAccesoEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion(),EstadoTipoAccesoAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public TipoAccesoDomain toDomainFromEntity(TipoAccesoEntity entity) {
		return new TipoAccesoDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion(),EstadoTipoAccesoAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<TipoAccesoDomain> toDomainListFromEntityList(List<TipoAccesoEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoAccesoDTO> toDtoListFromDomainList(List<TipoAccesoDomain> domainList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
