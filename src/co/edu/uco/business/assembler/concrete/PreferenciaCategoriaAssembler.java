package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.PreferenciaCategoriaDomain;
import co.edu.uco.dto.PreferenciaCategoriaDTO;
import co.edu.uco.entities.PreferenciaCategoriaEntity;

public final class PreferenciaCategoriaAssembler implements Assembler<PreferenciaCategoriaDomain, PreferenciaCategoriaDTO, PreferenciaCategoriaEntity>{
	
	private static final Assembler<PreferenciaCategoriaDomain, PreferenciaCategoriaDTO, PreferenciaCategoriaEntity> INSTANCE = new PreferenciaCategoriaAssembler();
	
	
	private PreferenciaCategoriaAssembler() {
		
	}


	public static final Assembler<PreferenciaCategoriaDomain, PreferenciaCategoriaDTO, PreferenciaCategoriaEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public PreferenciaCategoriaDTO toDTOFromDomain(PreferenciaCategoriaDomain domain) {
		return PreferenciaCategoriaDTO.create().setIdentificador(domain.getIdentificador()).setPerfil(PerfilAssembler.getInstance().toDTOFromDomain(domain.getPerfil()))
				.setCategoria(CategoriaAssembler.getInstance().toDTOFromDomain(domain.getCategoria()));
	}


	@Override
	public PreferenciaCategoriaDomain toDomainFromDto(PreferenciaCategoriaDTO dto) {
		return new PreferenciaCategoriaDomain(dto.getIdentificador(),
				PerfilAssembler.getInstance().toDomainFromDto(dto.getPerfil()),
				CategoriaAssembler.getInstance().toDomainFromDto(dto.getCategoria()));
	}


	@Override
	public PreferenciaCategoriaEntity toEntityFromDomain(PreferenciaCategoriaDomain domain) {
		return new PreferenciaCategoriaEntity(domain.getIdentificador(),
				PerfilAssembler.getInstance().toEntityFromDomain(domain.getPerfil()),
				CategoriaAssembler.getInstance().toEntityFromDomain(domain.getCategoria()));
	}


	@Override
	public PreferenciaCategoriaDomain toDomainFromEntity(PreferenciaCategoriaEntity entity) {
		return new PreferenciaCategoriaDomain(entity.getIdentificador(),
				PerfilAssembler.getInstance().toDomainFromEntity(entity.getPerfil()),
				CategoriaAssembler.getInstance().toDomainFromEntity(entity.getCategoria()));
	}


	@Override
	public List<PreferenciaCategoriaDomain> toDomainListFromEntityList(List<PreferenciaCategoriaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}


	@Override
	public List<PreferenciaCategoriaDTO> toDtoListFromDomainList(List<PreferenciaCategoriaDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	
	

}
