package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.ComentarioRevisorDomain;
import co.edu.uco.dto.ComentarioRevisorDTO;
import co.edu.uco.entities.ComentarioRevisorEntity;

public final class ComentarioRevisorAssembler implements Assembler<ComentarioRevisorDomain, ComentarioRevisorDTO, ComentarioRevisorEntity>{

	private static final Assembler<ComentarioRevisorDomain, ComentarioRevisorDTO, ComentarioRevisorEntity> INSTANCE = new ComentarioRevisorAssembler();
	

	private ComentarioRevisorAssembler() {
		
	}


	public static final Assembler<ComentarioRevisorDomain, ComentarioRevisorDTO, ComentarioRevisorEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public ComentarioRevisorDTO toDTOFromDomain(ComentarioRevisorDomain domain) {
		return ComentarioRevisorDTO.create().setIdentificador(domain.getIdentificador()).
				setRevisionRevisor(RevisionRevisorAssembler.getInstance().toDTOFromDomain(domain.getRevisionRevisor())).
				setTipoComentario(TipoComentarioRevisorAssembler.getInstance().toDTOFromDomain(domain.getTipoComentario())).
				setComentario(domain.getComentario());
	}


	@Override
	public ComentarioRevisorDomain toDomainFromDto(ComentarioRevisorDTO dto) {
		return new ComentarioRevisorDomain(dto.getIdentificador(),
				RevisionRevisorAssembler.getInstance().toDomainFromDto(dto.getRevisionRevisor()),
				TipoComentarioRevisorAssembler.getInstance().toDomainFromDto(dto.getTipoComentario()), 
				dto.getComentario());
	}


	@Override
	public ComentarioRevisorEntity toEntityFromDomain(ComentarioRevisorDomain domain) {
		return new ComentarioRevisorEntity(domain.getIdentificador(),
				RevisionRevisorAssembler.getInstance().toEntityFromDomain(domain.getRevisionRevisor()),
				TipoComentarioRevisorAssembler.getInstance().toEntityFromDomain(domain.getTipoComentario()), 
				domain.getComentario());
	}


	@Override
	public ComentarioRevisorDomain toDomainFromEntity(ComentarioRevisorEntity entity) {
		return new ComentarioRevisorDomain(entity.getIdentificador(),
				RevisionRevisorAssembler.getInstance().toDomainFromEntity(entity.getRevisionRevisor()),
				TipoComentarioRevisorAssembler.getInstance().toDomainFromEntity(entity.getTipoComentario()), 
				entity.getComentario());
	}


	@Override
	public List<ComentarioRevisorDomain> toDomainListFromEntityList(List<ComentarioRevisorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}


	@Override
	public List<ComentarioRevisorDTO> toDtoListFromDomainList(List<ComentarioRevisorDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	
}
