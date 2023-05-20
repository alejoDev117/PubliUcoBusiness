package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.PalabraClavePublicacionDomain;
import co.edu.uco.dto.PalabraClavePublicacionDTO;
import co.edu.uco.entities.PalabraClavePublicacionEntity;

public final class PalabraClavePublicacionAssemble implements Assembler<PalabraClavePublicacionDomain, PalabraClavePublicacionDTO, PalabraClavePublicacionEntity>{
	
	private static final Assembler<PalabraClavePublicacionDomain, PalabraClavePublicacionDTO, PalabraClavePublicacionEntity> INSTANCE = new PalabraClavePublicacionAssemble();
	
	
	
	private PalabraClavePublicacionAssemble() {
		
	}



	public static final Assembler<PalabraClavePublicacionDomain, PalabraClavePublicacionDTO, PalabraClavePublicacionEntity> getInstance() {
		return INSTANCE;
	}



	@Override
	public PalabraClavePublicacionDTO toDTOFromDomain(PalabraClavePublicacionDomain domain) {
		return PalabraClavePublicacionDTO.create().setIdentificador(domain.getIdentificador()).
				setPublicacion(PublicacionAssembler.getInstance().toDTOFromDomain(domain.getPublicacion())).
				setPalabraClave(domain.getPalabraClave());	
		}



	@Override
	public PalabraClavePublicacionDomain toDomainFromDto(PalabraClavePublicacionDTO dto) {
		return new PalabraClavePublicacionDomain(dto.getIdentificador(),PublicacionAssembler.getInstance().toDomainFromDto(dto.getPublicacion()),
				dto.getPalabraClave());
	}



	@Override
	public PalabraClavePublicacionEntity toEntityFromDomain(PalabraClavePublicacionDomain domain) {
		return new PalabraClavePublicacionEntity(domain.getIdentificador(),PublicacionAssembler.getInstance().toEntityFromDomain(domain.getPublicacion()),
				domain.getPalabraClave());
	}



	@Override
	public PalabraClavePublicacionDomain toDomainFromEntity(PalabraClavePublicacionEntity entity) {
		return new PalabraClavePublicacionDomain(entity.getIdentificador(),PublicacionAssembler.getInstance().toDomainFromEntity(entity.getPublicacion()),
				entity.getPalabraClave());
	}



	@Override
	public List<PalabraClavePublicacionDomain> toDomainListFromEntityList(
			List<PalabraClavePublicacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}



	@Override
	public List<PalabraClavePublicacionDTO> toDtoListFromDomainList(List<PalabraClavePublicacionDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	

}
