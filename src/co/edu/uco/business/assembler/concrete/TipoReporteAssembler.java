package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.TipoReporteDomain;
import co.edu.uco.dto.TipoReporteDTO;
import co.edu.uco.entities.TipoReporteEntity;

public final class TipoReporteAssembler implements Assembler<TipoReporteDomain,TipoReporteDTO,TipoReporteEntity>{
	
	private static final Assembler<TipoReporteDomain,TipoReporteDTO,TipoReporteEntity> INSTASNCE = new TipoReporteAssembler();
	
	
	private TipoReporteAssembler() {
		super();
	}


	public static final Assembler<TipoReporteDomain, TipoReporteDTO, TipoReporteEntity> getInstasnce() {
		return INSTASNCE;
	}


	@Override
	public TipoReporteDTO toDTOFromDomain(TipoReporteDomain domain) {
		return TipoReporteDTO.create().setIdentificador(domain.getIdentificador()).setNombre(domain.getNombre()).setDescripcion(domain.getDescripcion());
	}


	@Override
	public TipoReporteDomain toDomainFromDto(TipoReporteDTO dto) {
		return new TipoReporteDomain(dto.getIdentificador(),dto.getNombre(),dto.getDescripcion());
	}


	@Override
	public TipoReporteEntity toEntityFromDomain(TipoReporteDomain domain) {
		return new TipoReporteEntity(domain.getIdentificador(),domain.getNombre(),domain.getDescripcion());
	}


	@Override
	public TipoReporteDomain toDomainFromEntity(TipoReporteEntity entity) {
		return new TipoReporteDomain(entity.getIdentificador(),entity.getNombre(),entity.getDescripcion());
	}


	@Override
	public List<TipoReporteDomain> toDomainListFromEntityList(List<TipoReporteEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
