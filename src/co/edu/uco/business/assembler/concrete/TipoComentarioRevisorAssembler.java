package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.TipoComentarioRevisorDomain;
import co.edu.uco.dto.TipoComentarioRevisorDTO;
import co.edu.uco.entities.TipoComentarioRevisorEntity;

public final class TipoComentarioRevisorAssembler implements Assembler<TipoComentarioRevisorDomain,TipoComentarioRevisorDTO,TipoComentarioRevisorEntity> {

	private static final Assembler<TipoComentarioRevisorDomain,TipoComentarioRevisorDTO,TipoComentarioRevisorEntity> INSTANCE = new TipoComentarioRevisorAssembler();
	
	private TipoComentarioRevisorAssembler() {
		super();
	}

	public static final Assembler<TipoComentarioRevisorDomain, TipoComentarioRevisorDTO, TipoComentarioRevisorEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public TipoComentarioRevisorDTO toDTOFromDomain(TipoComentarioRevisorDomain domain) {
		return TipoComentarioRevisorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}

	@Override
	public TipoComentarioRevisorDomain toDomainFromDto(TipoComentarioRevisorDTO dto) {
		return new TipoComentarioRevisorDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}

	@Override
	public TipoComentarioRevisorEntity toEntityFromDomain(TipoComentarioRevisorDomain domain) {
		return new TipoComentarioRevisorEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}

	@Override
	public TipoComentarioRevisorDomain toDomainFromEntity(TipoComentarioRevisorEntity entity) {
		return new TipoComentarioRevisorDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}

	@Override
	public List<TipoComentarioRevisorDomain> toDomainListFromEntityList(List<TipoComentarioRevisorEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TipoComentarioRevisorDTO> toDtoListFromDomainList(List<TipoComentarioRevisorDomain> domainList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
