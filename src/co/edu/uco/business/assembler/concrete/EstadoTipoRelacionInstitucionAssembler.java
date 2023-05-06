package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.dto.EstadoTipoRelacionInstitucionDTO;
import co.edu.uco.entities.EstadoTipoRelacionInstitucionEntity;

public final class EstadoTipoRelacionInstitucionAssembler implements Assembler<EstadoTipoRelacionInstitucionDomain,EstadoTipoRelacionInstitucionDTO,EstadoTipoRelacionInstitucionEntity>{

	private static final Assembler<EstadoTipoRelacionInstitucionDomain,EstadoTipoRelacionInstitucionDTO,EstadoTipoRelacionInstitucionEntity> INSTANCE = new EstadoTipoRelacionInstitucionAssembler();
	
	
	private EstadoTipoRelacionInstitucionAssembler() {
		super();
		
	}
	
	
	public static final Assembler<EstadoTipoRelacionInstitucionDomain,EstadoTipoRelacionInstitucionDTO,EstadoTipoRelacionInstitucionEntity> getInstance() {
		return INSTANCE;
	}
	
	
	
	@Override
	public  EstadoTipoRelacionInstitucionDTO toDTOFromDomain(EstadoTipoRelacionInstitucionDomain domain) {
		return EstadoTipoRelacionInstitucionDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public  EstadoTipoRelacionInstitucionDomain toDomainFromDto(EstadoTipoRelacionInstitucionDTO dto) {
		return new EstadoTipoRelacionInstitucionDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public   EstadoTipoRelacionInstitucionEntity toEntityFromDomain(EstadoTipoRelacionInstitucionDomain domain) {
		
		return new EstadoTipoRelacionInstitucionEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public  EstadoTipoRelacionInstitucionDomain toDomainFromEntity(EstadoTipoRelacionInstitucionEntity entity) {

		return new EstadoTipoRelacionInstitucionDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}


	@Override
	public List<EstadoTipoRelacionInstitucionDomain> toDomainListFromEntityList(final List<EstadoTipoRelacionInstitucionEntity> entityList){
		
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

}
