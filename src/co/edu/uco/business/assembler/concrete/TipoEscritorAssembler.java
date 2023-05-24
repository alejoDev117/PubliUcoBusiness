package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.TipoEscritorDomain;
import co.edu.uco.dto.TipoEscritorDTO;
import co.edu.uco.entities.TipoEscritorEntity;

public final class TipoEscritorAssembler implements Assembler<TipoEscritorDomain,TipoEscritorDTO,TipoEscritorEntity>{
	
	private static final Assembler<TipoEscritorDomain,TipoEscritorDTO,TipoEscritorEntity> INSTANCE = new TipoEscritorAssembler();
	
	
	private TipoEscritorAssembler() {
		super();
	}


	public static final Assembler<TipoEscritorDomain, TipoEscritorDTO, TipoEscritorEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public TipoEscritorDTO toDTOFromDomain(TipoEscritorDomain domain) {
		return TipoEscritorDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion()).setEstado(EstadoTipoEscritorAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}


	@Override
	public TipoEscritorDomain toDomainFromDto(TipoEscritorDTO dto) {
		return new TipoEscritorDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion(),EstadoTipoEscritorAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}


	@Override
	public TipoEscritorEntity toEntityFromDomain(TipoEscritorDomain domain) {
		return new TipoEscritorEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion(),EstadoTipoEscritorAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}


	@Override
	public TipoEscritorDomain toDomainFromEntity(TipoEscritorEntity entity) {
		return new TipoEscritorDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion(),EstadoTipoEscritorAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}


	@Override
	public List<TipoEscritorDomain> toDomainListFromEntityList(List<TipoEscritorEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<TipoEscritorDTO> toDtoListFromDomainList(List<TipoEscritorDomain> domainList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	

}
