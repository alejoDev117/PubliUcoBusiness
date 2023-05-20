package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.PlanCategoriaDomain;
import co.edu.uco.dto.PlanCategoriaDTO;
import co.edu.uco.entities.PlanCategoriaEntity;

public final class PlanCategoriaAssembler implements Assembler<PlanCategoriaDomain,PlanCategoriaDTO, PlanCategoriaEntity>{
	
	private static final Assembler<PlanCategoriaDomain,PlanCategoriaDTO, PlanCategoriaEntity> INSTANCE = new PlanCategoriaAssembler();
	
	private PlanCategoriaAssembler() {
		
	}

	
	
	public static final Assembler<PlanCategoriaDomain, PlanCategoriaDTO, PlanCategoriaEntity> getInstance() {
		return INSTANCE;
	}



	
	@Override
	public PlanCategoriaDTO toDTOFromDomain(PlanCategoriaDomain domain) {
		return PlanCategoriaDTO.create().setIdentificador(domain.getIdentificador()).
				setCategoria(CategoriaAssembler.getInstance().toDTOFromDomain(domain.getCategoria())).setPrecio(domain.getPrecio())
				.setFechaDeste(domain.getFechaDeste()).setFechaHasta(domain.getFechaHasta());
	}

	@Override
	public PlanCategoriaDomain toDomainFromDto(PlanCategoriaDTO dto) {
		return new PlanCategoriaDomain(dto.getIdentificador(),CategoriaAssembler.getInstance().toDomainFromDto(dto.getCategoria()),
				dto.getPrecio(), dto.getFechaDeste(), dto.getFechaHasta());
	}

	@Override
	public PlanCategoriaEntity toEntityFromDomain(PlanCategoriaDomain domain) {
		return new PlanCategoriaEntity(domain.getIdentificador(),CategoriaAssembler.getInstance().toEntityFromDomain(domain.getCategoria()),
				domain.getPrecio(), domain.getFechaDeste(), domain.getFechaHasta());
	}

	@Override
	public PlanCategoriaDomain toDomainFromEntity(PlanCategoriaEntity entity) {
		return new PlanCategoriaDomain(entity.getIdentificador(),CategoriaAssembler.getInstance().toDomainFromEntity(entity.getCategoria()),
				entity.getPrecio(), entity.getFechaDeste(), entity.getFechaHasta());
	}

	@Override
	public List<PlanCategoriaDomain> toDomainListFromEntityList(List<PlanCategoriaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<PlanCategoriaDTO> toDtoListFromDomainList(List<PlanCategoriaDomain> domainList) {
		return domainList.stream().map(domain -> toDTOFromDomain(domain)).toList();
	}

}
