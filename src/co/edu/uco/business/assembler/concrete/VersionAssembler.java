package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.VersionDomain;
import co.edu.uco.dto.VersionDTO;
import co.edu.uco.entities.VersionEntity;

public final class VersionAssembler implements Assembler<VersionDomain, VersionDTO, VersionEntity>{
	
	private static final Assembler<VersionDomain, VersionDTO, VersionEntity> INSTANCE = new VersionAssembler();
	
	private VersionAssembler() {
		
	}

	public static final Assembler<VersionDomain, VersionDTO, VersionEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public VersionDTO toDTOFromDomain(VersionDomain domain) {
		return VersionDTO.create().setIdentificador(domain.getIdentificador()).
				setPublicacion(PublicacionAssembler.getInstance().toDTOFromDomain(domain.getPublicacion())).
				setVersion(VersionAssembler.getInstance().toDTOFromDomain(domain.getVersion())).
				setNumeroVersion(domain.getNumeroVersion()).setFechaCreacion(domain.getFechaCreacion()).
				setFechaUltimaModificacion(domain.getFechaUltimaModificacion()).setTitulo(domain.getTitulo()).
				setResumen(domain.getResumen()).setCuerpo(domain.getCuerpo()).setEstado(EstadoVersionAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}

	@Override
	public VersionDomain toDomainFromDto(VersionDTO dto) {
		return new VersionDomain(dto.getIdentificador(),
				PublicacionAssembler.getInstance().toDomainFromDto(dto.getPublicacion()),
				VersionAssembler.getInstance().toDomainFromDto(dto.getVersion()), dto.getNumeroVersion(),
				dto.getFechaCreacion(), dto.getFechaUltimaModificacion(),
				dto.getTitulo(), dto.getResumen(),dto.getCuerpo(),
				EstadoVersionAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public VersionEntity toEntityFromDomain(VersionDomain domain) {
		return new VersionEntity(domain.getIdentificador(),
				PublicacionAssembler.getInstance().toEntityFromDomain(domain.getPublicacion()),
				VersionAssembler.getInstance().toEntityFromDomain(domain.getVersion()), domain.getNumeroVersion(),
				domain.getFechaCreacion(), domain.getFechaUltimaModificacion(),
				domain.getTitulo(), domain.getResumen(),domain.getCuerpo(),
				EstadoVersionAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public VersionDomain toDomainFromEntity(VersionEntity entity) {
		return new VersionDomain(entity.getIdentificador(),
				PublicacionAssembler.getInstance().toDomainFromEntity(entity.getPublicacion()),
				VersionAssembler.getInstance().toDomainFromEntity(entity.getVersion()), entity.getNumeroVersion(),
				entity.getFechaCreacion(), entity.getFechaUltimaModificacion(),
				entity.getTitulo(), entity.getResumen(),entity.getCuerpo(),
				EstadoVersionAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<VersionDomain> toDomainListFromEntityList(List<VersionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<VersionDTO> toDtoListFromDomainList(List<VersionDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	
	
}
