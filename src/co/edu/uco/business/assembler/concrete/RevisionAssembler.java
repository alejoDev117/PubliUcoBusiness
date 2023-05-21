package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.RevisionDomain;
import co.edu.uco.dto.RevisionDTO;
import co.edu.uco.entities.RevisionEntity;

public final class RevisionAssembler implements Assembler<RevisionDomain,RevisionDTO, RevisionEntity>{
	
	private static final Assembler<RevisionDomain,RevisionDTO, RevisionEntity> INSTANCE = new RevisionAssembler();
	
	
	private RevisionAssembler() {
		
	}


	public static final Assembler<RevisionDomain, RevisionDTO, RevisionEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public RevisionDTO toDTOFromDomain(RevisionDomain domain) {
		return RevisionDTO.create().setIdentificador(domain.getIdentificador())
				.setVersion(VersionAssembler.getInstance().toDTOFromDomain(domain.getVersion())).
				setTipo(TipoRevisionAssembler.getInstance().toDTOFromDomain(domain.getTipo())).
				setFechaSolicitudRevision(domain.getFechaSolicitudRevision()).setFechaCompletitudRevision(domain.getFechaCompletitudRevision()).
				setFechaLimiteRevision(domain.getFechaLimiteRevision()).setEstado(EstadoRevisionAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}


	@Override
	public RevisionDomain toDomainFromDto(RevisionDTO dto) {
		return new RevisionDomain(dto.getIdentificador(),
				VersionAssembler.getInstance().toDomainFromDto(dto.getVersion()),
				TipoRevisionAssembler.getInstance().toDomainFromDto(dto.getTipo()),
				dto.getFechaSolicitudRevision(), 
				dto.getFechaLimiteRevision(), 
				dto.getFechaCompletitudRevision(), 
				EstadoRevisionAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}


	@Override
	public RevisionEntity toEntityFromDomain(RevisionDomain domain) {
		return new RevisionEntity(domain.getIdentificador(),
				VersionAssembler.getInstance().toEntityFromDomain(domain.getVersion()),
				TipoRevisionAssembler.getInstance().toEntityFromDomain(domain.getTipo()),
				domain.getFechaSolicitudRevision(), 
				domain.getFechaLimiteRevision(), 
				domain.getFechaCompletitudRevision(), 
				EstadoRevisionAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}


	@Override
	public RevisionDomain toDomainFromEntity(RevisionEntity entity) {
		return new RevisionDomain(entity.getIdentificador(),
				VersionAssembler.getInstance().toDomainFromEntity(entity.getVersion()),
				TipoRevisionAssembler.getInstance().toDomainFromEntity(entity.getTipo()),
				entity.getFechaSolicitudRevision(), 
				entity.getFechaLimiteRevision(), 
				entity.getFechaCompletitudRevision(), 
				EstadoRevisionAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}


	@Override
	public List<RevisionDomain> toDomainListFromEntityList(List<RevisionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}


	@Override
	public List<RevisionDTO> toDtoListFromDomainList(List<RevisionDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	

}
