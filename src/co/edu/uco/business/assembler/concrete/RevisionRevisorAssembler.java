package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.RevisionRevisorDomain;import co.edu.uco.business.domain.RevisorDomain;
import co.edu.uco.dto.RevisionRevisorDTO;
import co.edu.uco.entities.RevisionRevisorEntity;

public final class RevisionRevisorAssembler implements Assembler<RevisionRevisorDomain, RevisionRevisorDTO, RevisionRevisorEntity>{
	
	private static final Assembler<RevisionRevisorDomain, RevisionRevisorDTO, RevisionRevisorEntity> INSTANCE = new RevisionRevisorAssembler();
	
	private RevisionRevisorAssembler() {
		
	}

	public static final Assembler<RevisionRevisorDomain, RevisionRevisorDTO, RevisionRevisorEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public RevisionRevisorDTO toDTOFromDomain(RevisionRevisorDomain domain) {
		return RevisionRevisorDTO.create().setIdentificador(domain.getIdentificador()).
				setRevision(RevisionAssembler.getInstance().toDTOFromDomain(domain.getRevision())).
				setRevisor(RevisorAssembler.getInstance().toDTOFromDomain(domain.getRevisor())).
				setFechaAsignacionRevision(domain.getFechaAsignacionRevision()).setFechaCompletitudRevision(domain.getFechaCompletitudRevision()).
				setEstado(EstadoRevisionAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}

	@Override
	public RevisionRevisorDomain toDomainFromDto(RevisionRevisorDTO dto) {
		return new RevisionRevisorDomain(dto.getIdentificador(), 
				RevisionAssembler.getInstance().toDomainFromDto(dto.getRevision()),
				RevisorAssembler.getInstance().toDomainFromDto(dto.getRevisor()),
				dto.getFechaAsignacionRevision(), dto.getFechaCompletitudRevision(), 
				EstadoRevisionAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public RevisionRevisorEntity toEntityFromDomain(RevisionRevisorDomain domain) {
		return new RevisionRevisorEntity(domain.getIdentificador(), 
				RevisionAssembler.getInstance().toEntityFromDomain(domain.getRevision()),
				RevisorAssembler.getInstance().toEntityFromDomain(domain.getRevisor()),
				domain.getFechaAsignacionRevision(), domain.getFechaCompletitudRevision(), 
				EstadoRevisionAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public RevisionRevisorDomain toDomainFromEntity(RevisionRevisorEntity entity) {
		return new RevisionRevisorDomain(entity.getIdentificador(), 
				RevisionAssembler.getInstance().toDomainFromEntity(entity.getRevision()),
				RevisorAssembler.getInstance().toDomainFromEntity(entity.getRevisor()),
				entity.getFechaAsignacionRevision(), entity.getFechaCompletitudRevision(), 
				EstadoRevisionAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<RevisionRevisorDomain> toDomainListFromEntityList(List<RevisionRevisorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<RevisionRevisorDTO> toDtoListFromDomainList(List<RevisionRevisorDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	

}
