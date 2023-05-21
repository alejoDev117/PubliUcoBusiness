package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.SuscripcionCategoriaDomain;
import co.edu.uco.dto.SuscripcionCategoriaDTO;
import co.edu.uco.entities.SuscripcionCategoriaEntity;

public final class SuscripcionCategoriaAssembler implements Assembler<SuscripcionCategoriaDomain, SuscripcionCategoriaDTO, SuscripcionCategoriaEntity>{
	
	private static final Assembler<SuscripcionCategoriaDomain, SuscripcionCategoriaDTO, SuscripcionCategoriaEntity> INSTANCE = new SuscripcionCategoriaAssembler();
	
	
	private SuscripcionCategoriaAssembler() {
		
	}


	public static final Assembler<SuscripcionCategoriaDomain, SuscripcionCategoriaDTO, SuscripcionCategoriaEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public SuscripcionCategoriaDTO toDTOFromDomain(SuscripcionCategoriaDomain domain) {
		return SuscripcionCategoriaDTO.create().setIdentificador(domain.getIdentificador()).
				setPerfil(PerfilAssembler.getInstance().toDTOFromDomain(domain.getPerfil())).
				setCategoria(PlanCategoriaAssembler.getInstance().toDTOFromDomain(domain.getCategoria()));
	}


	@Override
	public SuscripcionCategoriaDomain toDomainFromDto(SuscripcionCategoriaDTO dto) {
		return new SuscripcionCategoriaDomain(dto.getIdentificador(),PerfilAssembler.getInstance().toDomainFromDto(dto.getPerfil()),
			   PlanCategoriaAssembler.getInstance().toDomainFromDto(dto.getCategoria()));
	}


	@Override
	public SuscripcionCategoriaEntity toEntityFromDomain(SuscripcionCategoriaDomain domain) {
		return new SuscripcionCategoriaEntity(domain.getIdentificador(),PerfilAssembler.getInstance().toEntityFromDomain(domain.getPerfil()),
				   PlanCategoriaAssembler.getInstance().toEntityFromDomain(domain.getCategoria()));
	}


	@Override
	public SuscripcionCategoriaDomain toDomainFromEntity(SuscripcionCategoriaEntity entity) {
		return new SuscripcionCategoriaDomain(entity.getIdentificador(),PerfilAssembler.getInstance().toDomainFromEntity(entity.getPerfil()),
				   PlanCategoriaAssembler.getInstance().toDomainFromEntity(entity.getCategoria()));
	}


	@Override
	public List<SuscripcionCategoriaDomain> toDomainListFromEntityList(List<SuscripcionCategoriaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}


	@Override
	public List<SuscripcionCategoriaDTO> toDtoListFromDomainList(List<SuscripcionCategoriaDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	

}
