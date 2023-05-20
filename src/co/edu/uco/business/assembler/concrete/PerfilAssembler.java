package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.PerfilDomain;
import co.edu.uco.dto.PerfilDTO;
import co.edu.uco.entities.PerfilEntity;

public final class PerfilAssembler implements Assembler<PerfilDomain,PerfilDTO, PerfilEntity>{
	
	private static final Assembler<PerfilDomain,PerfilDTO, PerfilEntity> INSTANCE = new PerfilAssembler();
	
	private PerfilAssembler() {
		
	}

	public static final Assembler<PerfilDomain, PerfilDTO, PerfilEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public PerfilDTO toDTOFromDomain(PerfilDomain domain) {
		return PerfilDTO.create().setIdentificador(domain.getIdentificador()).setLector(LectorAssembler.getInstance().toDTOFromDomain(domain.getLector())).
				setEnviarCorreoRecomendacionesCategoria(domain.isEnviarCorreoRecomendacionesCategoria()).setEnviarCorreoRecomendacionesAutor(domain.isEnviarCorreoRecomendacionesAutor());
	}

	@Override
	public PerfilDomain toDomainFromDto(PerfilDTO dto) {
		return new PerfilDomain(dto.getIdentificador(),LectorAssembler.getInstance().toDomainFromDto(dto.getLector()), dto.isEnviarCorreoRecomendacionesCategoria(), dto.isEnviarCorreoRecomendacionesAutor());
	}

	@Override
	public PerfilEntity toEntityFromDomain(PerfilDomain domain) {
		return new PerfilEntity(domain.getIdentificador(),LectorAssembler.getInstance().toEntityFromDomain(domain.getLector()), domain.isEnviarCorreoRecomendacionesCategoria(), domain.isEnviarCorreoRecomendacionesAutor());
	}

	@Override
	public PerfilDomain toDomainFromEntity(PerfilEntity entity) {
		return new PerfilDomain(entity.getIdentificador(),LectorAssembler.getInstance().toDomainFromEntity(entity.getLector()), entity.isEnviarCorreoRecomendacionesCategoria(), entity.isEnviarCorreoRecomendacionesAutor());
	}

	@Override
	public List<PerfilDomain> toDomainListFromEntityList(List<PerfilEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<PerfilDTO> toDtoListFromDomainList(List<PerfilDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	

}
