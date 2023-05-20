package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.PublicacionDomain;
import co.edu.uco.dto.PublicacionDTO;
import co.edu.uco.entities.PublicacionEntity;

public final class PublicacionAssembler implements Assembler<PublicacionDomain, PublicacionDTO, PublicacionEntity>{
	
	private static final Assembler<PublicacionDomain, PublicacionDTO, PublicacionEntity> INSTANCE = new PublicacionAssembler();
	
	private PublicacionAssembler() {
		
	}

	
	public static final Assembler<PublicacionDomain, PublicacionDTO, PublicacionEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public PublicacionDTO toDTOFromDomain(PublicacionDomain domain) {
		return PublicacionDTO.create().setIdentificador(domain.getIdentificador()).
				setCategoria(CategoriaAssembler.getInstance().toDTOFromDomain(domain.getCategoria())).
				setTipoAccceso(TipoAccesoAssembler.getInstance().toDTOFromDomain(domain.getTipoAccceso())).
				setFechaPublicacion(domain.getFechaPublicacion());
	}

	@Override
	public PublicacionDomain toDomainFromDto(PublicacionDTO dto) {
		return new PublicacionDomain(dto.getIdentificador(),CategoriaAssembler.getInstance().toDomainFromDto(dto.getCategoria()),
				TipoAccesoAssembler.getInstance().toDomainFromDto(dto.getTipoAccceso()),dto.getFechaPublicacion());
	}

	@Override
	public PublicacionEntity toEntityFromDomain(PublicacionDomain domain) {
		return new PublicacionEntity(domain.getIdentificador(),CategoriaAssembler.getInstance().toEntityFromDomain(domain.getCategoria()),
				TipoAccesoAssembler.getInstance().toEntityFromDomain(domain.getTipoAccceso()),domain.getFechaPublicacion());
	}

	@Override
	public PublicacionDomain toDomainFromEntity(PublicacionEntity entity) {
		return new PublicacionDomain(entity.getIdentificador(),CategoriaAssembler.getInstance().toDomainFromEntity(entity.getCategoria()),
				TipoAccesoAssembler.getInstance().toDomainFromEntity(entity.getTipoAccceso()),entity.getFechaPublicacion());
	}

	@Override
	public List<PublicacionDomain> toDomainListFromEntityList(List<PublicacionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}

	@Override
	public List<PublicacionDTO> toDtoListFromDomainList(List<PublicacionDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
}
