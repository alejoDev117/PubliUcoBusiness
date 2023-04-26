package co.edu.uco.business.domain.assembler.concret;

import co.edu.uco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.business.domain.assembler.Assembler;
import co.edu.uco.dto.EstadoTipoRelacionInstitucionDTO;
import co.edu.uco.entities.EstadoTipoRelacionInstitucionEntity;

public final class EstadoTipoRelacionInstitucionAssembler implements Assembler<EstadoTipoRelacionInstitucionDomain,EstadoTipoRelacionInstitucionDTO,EstadoTipoRelacionInstitucionEntity>{

	@Override
	public EstadoTipoRelacionInstitucionDTO toDTOFromDomain(EstadoTipoRelacionInstitucionDomain domain) {
		return EstadoTipoRelacionInstitucionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getNombre());
	}

	@Override
	public EstadoTipoRelacionInstitucionDomain toDomainFromDto(EstadoTipoRelacionInstitucionDTO dto) {
		return new EstadoTipoRelacionInstitucionDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public EstadoTipoRelacionInstitucionEntity toEntityFromDomain(EstadoTipoRelacionInstitucionDomain domain) {
	
		return new EstadoTipoRelacionInstitucionEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public EstadoTipoRelacionInstitucionDomain toDomainFromEntity(EstadoTipoRelacionInstitucionEntity entity) {
	
		return new EstadoTipoRelacionInstitucionDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion()) ;
	}
	
	

}
