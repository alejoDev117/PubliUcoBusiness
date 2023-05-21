package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.ReporteDomain;
import co.edu.uco.dto.ReporteDTO;
import co.edu.uco.entities.ReporteEntity;

public final class ReporteAssembler implements Assembler<ReporteDomain, ReporteDTO, ReporteEntity>{
	
	private static final  Assembler<ReporteDomain, ReporteDTO, ReporteEntity> INSTANCE = new ReporteAssembler();
	
	
	private ReporteAssembler() {

	}


	public static final Assembler<ReporteDomain, ReporteDTO, ReporteEntity> getInstance() {
		return INSTANCE;
	}


	@Override
	public ReporteDTO toDTOFromDomain(ReporteDomain domain) {
		return ReporteDTO.create().setIdentificador(domain.getIdentificador()).
				setLector(LectorAssembler.getInstance().toDTOFromDomain(domain.getLector())).
				setComentario(ComentarioLectorAssembler.getInstance().toDTOFromDomain(domain.getComentario())).
				setTipoReporte(TipoReporteAssembler.getInstasnce().toDTOFromDomain(domain.getTipoReporte()));
	}


	@Override
	public ReporteDomain toDomainFromDto(ReporteDTO dto) {
		return new ReporteDomain(dto.getIdentificador(), LectorAssembler.getInstance().toDomainFromDto(dto.getLector())
				, ComentarioLectorAssembler.getInstance().toDomainFromDto(dto.getComentario()),
				TipoReporteAssembler.getInstasnce().toDomainFromDto(dto.getTipoReporte()));
	}


	@Override
	public ReporteEntity toEntityFromDomain(ReporteDomain domain) {
		return new ReporteEntity(domain.getIdentificador(), LectorAssembler.getInstance().toEntityFromDomain(domain.getLector())
				, ComentarioLectorAssembler.getInstance().toEntityFromDomain(domain.getComentario()),
				TipoReporteAssembler.getInstasnce().toEntityFromDomain(domain.getTipoReporte()));
	}


	@Override
	public ReporteDomain toDomainFromEntity(ReporteEntity entity) {
		return new ReporteDomain(entity.getIdentificador(), LectorAssembler.getInstance().toDomainFromEntity(entity.getLector())
				, ComentarioLectorAssembler.getInstance().toDomainFromEntity(entity.getComentario()),
				TipoReporteAssembler.getInstasnce().toDomainFromEntity(entity.getTipoReporte()));
	}


	@Override
	public List<ReporteDomain> toDomainListFromEntityList(List<ReporteEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}


	@Override
	public List<ReporteDTO> toDtoListFromDomainList(List<ReporteDomain> domainList) {
		return domainList.stream().map(dto -> toDTOFromDomain(dto)).toList();
	}
	
	
}
