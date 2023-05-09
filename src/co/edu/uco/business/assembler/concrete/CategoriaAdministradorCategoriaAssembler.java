package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.CategoriaAdministradorCategoriaDomain;
import co.edu.uco.dto.CategoriaAdministradorCategoriaDTO;
import co.edu.uco.entities.CategoriaAdministradorCategoriaEntity;

public final class CategoriaAdministradorCategoriaAssembler implements Assembler<CategoriaAdministradorCategoriaDomain,CategoriaAdministradorCategoriaDTO,CategoriaAdministradorCategoriaEntity> {

	private static final Assembler<CategoriaAdministradorCategoriaDomain,CategoriaAdministradorCategoriaDTO,CategoriaAdministradorCategoriaEntity> INSTANCE = new CategoriaAdministradorCategoriaAssembler();
	
	
	private CategoriaAdministradorCategoriaAssembler() {
		super();
	}


	public static final Assembler<CategoriaAdministradorCategoriaDomain, CategoriaAdministradorCategoriaDTO, CategoriaAdministradorCategoriaEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public CategoriaAdministradorCategoriaDTO toDTOFromDomain(CategoriaAdministradorCategoriaDomain domain) {
		return CategoriaAdministradorCategoriaDTO.create().setIdentificador(domain.getIdentificador()).setCategoria(CategoriaAssembler.getInstance().toDTOFromDomain(domain.getCategoria())).
				setAdministradorCategoria(AdministradorCategoriaAssembler.getInstance().toDTOFromDomain(domain.getAdministradorCategoria()));
	}


	@Override
	public CategoriaAdministradorCategoriaDomain toDomainFromDto(CategoriaAdministradorCategoriaDTO dto) {
		return new CategoriaAdministradorCategoriaDomain(dto.getIdentificador(),CategoriaAssembler.getInstance().toDomainFromDto(dto.getCategoria()),
				AdministradorCategoriaAssembler.getInstance().toDomainFromDto(dto.getAdministradorCategoria()));
	}


	@Override
	public CategoriaAdministradorCategoriaEntity toEntityFromDomain(CategoriaAdministradorCategoriaDomain domain) {
		return new CategoriaAdministradorCategoriaEntity(domain.getIdentificador(),CategoriaAssembler.getInstance().toEntityFromDomain(domain.getCategoria()),
				AdministradorCategoriaAssembler.getInstance().toEntityFromDomain(domain.getAdministradorCategoria()));
	}


	@Override
	public CategoriaAdministradorCategoriaDomain toDomainFromEntity(CategoriaAdministradorCategoriaEntity entity) {
		return new CategoriaAdministradorCategoriaDomain(entity.getIdentificador(),CategoriaAssembler.getInstance().toDomainFromEntity(entity.getCategoria()),
				AdministradorCategoriaAssembler.getInstance().toDomainFromEntity(entity.getAdministradorCategoria()));
	}


	@Override
	public List<CategoriaAdministradorCategoriaDomain> toDomainListFromEntityList(
			List<CategoriaAdministradorCategoriaEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
