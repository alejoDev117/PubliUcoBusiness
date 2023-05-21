package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.ObservacionRevisionDomain;
import co.edu.uco.dto.ObservacionRevisionDTO;
import co.edu.uco.entities.ObservacionRevisionEntity;

public  final class ObservacionRevisionAssembler implements Assembler<ObservacionRevisionDomain, ObservacionRevisionDTO, ObservacionRevisionEntity>{
	
	private static final Assembler<ObservacionRevisionDomain, ObservacionRevisionDTO, ObservacionRevisionEntity> INSTANCE = new ObservacionRevisionAssembler();
	
	
	private ObservacionRevisionAssembler() {
		
	}


	public static final Assembler<ObservacionRevisionDomain, ObservacionRevisionDTO, ObservacionRevisionEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public ObservacionRevisionDTO toDTOFromDomain(ObservacionRevisionDomain domain) {
		return ObservacionRevisionDTO.create().setIdentificador(domain.getIdentificador()).
				setEscritor(EscritorPublicacionAssembler.getInstance().toDTOFromDomain(domain.getEscritor())).
				setComentario(ComentarioRevisorAssembler.getInstance().toDTOFromDomain(domain.getComentario())).
				setFechaReporteObservacion(domain.getFechaReporteObservacion()).setFechaRevisionObservacion(domain.getFechaReporteObservacion()).
				setEstado(EstadoObservacionRevisorAssembler.getInstance().toDTOFromDomain(domain.getEstado())).setObservacion(domain.getObservacion());
	}


	@Override
	public ObservacionRevisionDomain toDomainFromDto(ObservacionRevisionDTO dto) {
		return new ObservacionRevisionDomain(dto.getIdentificador(), 
				EscritorPublicacionAssembler.getInstance().toDomainFromDto(dto.getEscritor()), 
				ComentarioRevisorAssembler.getInstance().toDomainFromDto(dto.getComentario()), 
				dto.getFechaReporteObservacion(), 
				dto.getFechaRevisionObservacion(), 
				EstadoObservacionRevisorAssembler.getInstance().toDomainFromDto(dto.getEstado()), 
				dto.getObservacion());
	}


	@Override
	public ObservacionRevisionEntity toEntityFromDomain(ObservacionRevisionDomain domain) {
		return new ObservacionRevisionEntity(domain.getIdentificador(), 
				EscritorPublicacionAssembler.getInstance().toEntityFromDomain(domain.getEscritor()), 
				ComentarioRevisorAssembler.getInstance().toEntityFromDomain(domain.getComentario()), 
				domain.getFechaReporteObservacion(), 
				domain.getFechaRevisionObservacion(), 
				EstadoObservacionRevisorAssembler.getInstance().toEntityFromDomain(domain.getEstado()), 
				domain.getObservacion());
	}
	


	@Override
	public ObservacionRevisionDomain toDomainFromEntity(ObservacionRevisionEntity entity) {
		return new ObservacionRevisionDomain(entity.getIdentificador(), 
				EscritorPublicacionAssembler.getInstance().toDomainFromEntity(entity.getEscritor()), 
				ComentarioRevisorAssembler.getInstance().toDomainFromEntity(entity.getComentario()), 
				entity.getFechaReporteObservacion(), 
				entity.getFechaRevisionObservacion(), 
				EstadoObservacionRevisorAssembler.getInstance().toDomainFromEntity(entity.getEstado()), 
				entity.getObservacion());
	}


	@Override
	public List<ObservacionRevisionDomain> toDomainListFromEntityList(List<ObservacionRevisionEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}


	@Override
	public List<ObservacionRevisionDTO> toDtoListFromDomainList(List<ObservacionRevisionDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	

}
