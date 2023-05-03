package co.edu.uco.business.assembler.concrete;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.TipoIdentificacionDomain;
import co.edu.uco.dto.TipoIdentificacionDTO;
import co.edu.uco.entities.TipoIdentificacionEntity;

public final class TipoIdentificacionAssembler implements Assembler<TipoIdentificacionDomain,TipoIdentificacionDTO,TipoIdentificacionEntity> {

	private static final Assembler<TipoIdentificacionDomain,TipoIdentificacionDTO,TipoIdentificacionEntity> INSTANCE = new TipoIdentificacionAssembler();
	
	
	private TipoIdentificacionAssembler() {
		super();
	}


	public static final Assembler<TipoIdentificacionDomain, TipoIdentificacionDTO, TipoIdentificacionEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public TipoIdentificacionDTO toDTOFromDomain(TipoIdentificacionDomain domain) {
		return TipoIdentificacionDTO.create().setIdentificador(domain.getIdentificador()).setCodigo(domain.getCodigo()).setNombre(domain.getNombre()).
				setDescripcion(domain.getDescripcion()).setEstado(EstadoTipoIdentificacionAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}


	@Override
	public TipoIdentificacionDomain toDomainFromDto(TipoIdentificacionDTO dto) {
		return new TipoIdentificacionDomain(dto.getIdentificador(),dto.getCodigo(),dto.getNombre(),dto.getDescripcion(),EstadoTipoIdentificacionAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}


	@Override
	public TipoIdentificacionEntity toEntityFromDomain(TipoIdentificacionDomain domain) {
		return new TipoIdentificacionEntity(domain.getIdentificador(),domain.getCodigo(),domain.getNombre(),domain.getDescripcion(),EstadoTipoIdentificacionAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}


	@Override
	public TipoIdentificacionDomain toDomainFromEntity(TipoIdentificacionEntity entity) {
		return new TipoIdentificacionDomain(entity.getIdentificador(),entity.getCodigo(),entity.getNombre(),entity.getDescripcion(),EstadoTipoIdentificacionAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}
	
	
}
