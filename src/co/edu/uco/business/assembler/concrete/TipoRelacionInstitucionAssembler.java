package co.edu.uco.business.assembler.concrete;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.business.domain.TipoRelacionInstitucionDomain;
import co.edu.uco.dto.EstadoTipoRelacionInstitucionDTO;
import co.edu.uco.dto.TipoRelacionInstitucionDTO;
import co.edu.uco.entities.EstadoTipoRelacionInstitucionEntity;
import co.edu.uco.entities.TipoRelacionInstitucionEntity;

public final class TipoRelacionInstitucionAssembler implements Assembler<TipoRelacionInstitucionDomain,TipoRelacionInstitucionDTO,TipoRelacionInstitucionEntity> {
	
	private static final Assembler<TipoRelacionInstitucionDomain,TipoRelacionInstitucionDTO,TipoRelacionInstitucionEntity> INSTANCE = new TipoRelacionInstitucionAssembler();
	
	private TipoRelacionInstitucionAssembler() {
		super();
	}
	
	

	public static final Assembler<TipoRelacionInstitucionDomain, TipoRelacionInstitucionDTO, TipoRelacionInstitucionEntity> getInstance() {
		return INSTANCE;
	}



	@Override
	public TipoRelacionInstitucionDTO toDTOFromDomain(TipoRelacionInstitucionDomain domain) {
		return TipoRelacionInstitucionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion()).setEstadoTipoRelacionInstitucion(EstadoTipoRelacionInstitucionAssembler.getInstance().toDTOFromDomain(domain.getEstadoTipoRelacionInstitucion()));
	} 

	@Override
	public TipoRelacionInstitucionDomain toDomainFromDto(TipoRelacionInstitucionDTO dto) {
		return new TipoRelacionInstitucionDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion(),EstadoTipoRelacionInstitucionAssembler.getInstance().toDomainFromDto(dto.getEstadoTipoRelacionInstitucion()));
	}

	@Override
	public TipoRelacionInstitucionEntity toEntityFromDomain(TipoRelacionInstitucionDomain domain) {
		return new TipoRelacionInstitucionEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion(),EstadoTipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain.getEstadoTipoRelacionInstitucion()));
	}

	@Override
	public TipoRelacionInstitucionDomain toDomainFromEntity(TipoRelacionInstitucionEntity entity) {
		return new TipoRelacionInstitucionDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion(),EstadoTipoRelacionInstitucionAssembler.getInstance().toDomainFromEntity(entity.getEstadoTipoRelacionInstitucion()));
	}

}
