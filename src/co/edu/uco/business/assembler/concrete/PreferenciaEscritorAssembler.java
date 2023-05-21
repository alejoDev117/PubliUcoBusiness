package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.PreferenciaEscritorDomain;
import co.edu.uco.dto.PreferenciaEscritorDTO;
import co.edu.uco.entities.PreferenciaEscritorEntity;

public final class PreferenciaEscritorAssembler implements Assembler<PreferenciaEscritorDomain,PreferenciaEscritorDTO, PreferenciaEscritorEntity>{
	
	private static final Assembler<PreferenciaEscritorDomain,PreferenciaEscritorDTO, PreferenciaEscritorEntity> INSTANCE = new PreferenciaEscritorAssembler();
	
	
	private PreferenciaEscritorAssembler() {
		
	}


	public static final Assembler<PreferenciaEscritorDomain, PreferenciaEscritorDTO, PreferenciaEscritorEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public PreferenciaEscritorDTO toDTOFromDomain(PreferenciaEscritorDomain domain) {
		return PreferenciaEscritorDTO.create().setIdentificador(domain.getIdentificador()).
				setPerfil(PerfilAssembler.getInstance().toDTOFromDomain(domain.getPerfil())).
				setEscritor(EscritorAssembler.getInstance().toDTOFromDomain(domain.getEscritor()));
	}


	@Override
	public PreferenciaEscritorDomain toDomainFromDto(PreferenciaEscritorDTO dto) {
		return new PreferenciaEscritorDomain(dto.getIdentificador(),
				PerfilAssembler.getInstance().toDomainFromDto(dto.getPerfil()),
				EscritorAssembler.getInstance().toDomainFromDto(dto.getEscritor()));
	}


	@Override
	public PreferenciaEscritorEntity toEntityFromDomain(PreferenciaEscritorDomain domain) {
		return new PreferenciaEscritorEntity(domain.getIdentificador(),
				PerfilAssembler.getInstance().toEntityFromDomain(domain.getPerfil()),
				EscritorAssembler.getInstance().toEntityFromDomain(domain.getEscritor()));
	}


	@Override
	public PreferenciaEscritorDomain toDomainFromEntity(PreferenciaEscritorEntity entity) {
		return new PreferenciaEscritorDomain(entity.getIdentificador(),
				PerfilAssembler.getInstance().toDomainFromEntity(entity.getPerfil()),
				EscritorAssembler.getInstance().toDomainFromEntity(entity.getEscritor()));
	}


	@Override
	public List<PreferenciaEscritorDomain> toDomainListFromEntityList(List<PreferenciaEscritorEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}


	@Override
	public List<PreferenciaEscritorDTO> toDtoListFromDomainList(List<PreferenciaEscritorDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	
}
