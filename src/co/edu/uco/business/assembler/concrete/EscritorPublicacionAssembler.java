package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EscritorPublicacionDomain;
import co.edu.uco.dto.EscritorPublicacionDTO;
import co.edu.uco.entities.EscritorPublicacionEntity;

public final class EscritorPublicacionAssembler implements Assembler<EscritorPublicacionDomain, EscritorPublicacionDTO, EscritorPublicacionEntity>{
	
	private static final Assembler<EscritorPublicacionDomain, EscritorPublicacionDTO, EscritorPublicacionEntity> INSTANCE = new EscritorPublicacionAssembler();
	
	
	private EscritorPublicacionAssembler() {
		
	}


	public static final Assembler<EscritorPublicacionDomain, EscritorPublicacionDTO, EscritorPublicacionEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public EscritorPublicacionDTO toDTOFromDomain(EscritorPublicacionDomain domain) {
		return EscritorPublicacionDTO.create().setIdentificador(domain.getIdentificador()).
				setEscritor(EscritorAssembler.getInstance().toDTOFromDomain(domain.getEscritor())).
				setPublicacion(PublicacionAssembler.getInstance().toDTOFromDomain(domain.getPublicacion())).
				setTipoEscritor(TipoEscritorAssembler.getInstance().toDTOFromDomain(domain.getTipoEscritor()));
	}


	@Override
	public EscritorPublicacionDomain toDomainFromDto(EscritorPublicacionDTO dto) {
		return new EscritorPublicacionDomain(dto.getIdentificador(), 
				PublicacionAssembler.getInstance().toDomainFromDto(dto.getPublicacion()),
				EscritorAssembler.getInstance().toDomainFromDto(dto.getEscritor()),
				TipoEscritorAssembler.getInstance().toDomainFromDto(dto.getTipoEscritor()));
	}


	@Override
	public EscritorPublicacionEntity toEntityFromDomain(EscritorPublicacionDomain domain) {
		return new EscritorPublicacionEntity(domain.getIdentificador(), 
				PublicacionAssembler.getInstance().toEntityFromDomain(domain.getPublicacion()),
				EscritorAssembler.getInstance().toEntityFromDomain(domain.getEscritor()),
				TipoEscritorAssembler.getInstance().toEntityFromDomain(domain.getTipoEscritor()));
	}


	@Override
	public EscritorPublicacionDomain toDomainFromEntity(EscritorPublicacionEntity entity) {
		return new EscritorPublicacionDomain(entity.getIdentificador(), 
				PublicacionAssembler.getInstance().toDomainFromEntity(entity.getPublicacion()),
				EscritorAssembler.getInstance().toDomainFromEntity(entity.getEscritor()),
				TipoEscritorAssembler.getInstance().toDomainFromEntity(entity.getTipoEscritor()));
	}


	@Override
	public List<EscritorPublicacionDomain> toDomainListFromEntityList(List<EscritorPublicacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}


	@Override
	public List<EscritorPublicacionDTO> toDtoListFromDomainList(List<EscritorPublicacionDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	

}
