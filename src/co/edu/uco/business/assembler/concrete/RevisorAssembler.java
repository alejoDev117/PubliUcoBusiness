package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EscritorDomain;
import co.edu.uco.business.domain.RevisorDomain;
import co.edu.uco.dto.EscritorDTO;
import co.edu.uco.dto.RevisorDTO;
import co.edu.uco.entities.EscritorEntity;
import co.edu.uco.entities.RevisorEntity;

public final class RevisorAssembler implements Assembler<RevisorDomain,RevisorDTO,RevisorEntity>{
	
	private static final Assembler<RevisorDomain, RevisorDTO, RevisorEntity> INSTANCE = new RevisorAssembler();
	
	
	private RevisorAssembler() {
		super();
	}
	

	public static final Assembler<RevisorDomain, RevisorDTO, RevisorEntity> getInstance() {
		return INSTANCE;
	}



	@Override
	public RevisorDTO toDTOFromDomain(RevisorDomain domain) {
		return RevisorDTO.create().setIdentificador(domain.getIdentificador()).setTipoIdentificacion(TipoIdentificacionAssembler.getInstance().toDTOFromDomain(domain.getTipoIdentificacion())).
				setNumeroIdentificacion(domain.getNumeroIdentificacion()).setPrimerNombre(domain.getPrimerNombre()).setSegundoNombre(domain.getSegundoNombre()).setPrimerApellido(domain.getPrimerApellido()).setSegundoApellido(domain.getSegundoApellido()).
				setCorreoElectronico(domain.getCorreoElectronico()).setIndicadorPaisTelefono(domain.getIndicadorPaisTelefono()).setNumeroTelefonicoMovil(domain.getNumeroTelefonicoMovil()).setTipoRelacionIntitucion(TipoRelacionInstitucionAssembler.getInstance().toDTOFromDomain(domain.getTipoRelacionIntitucion())).
				setCorreoEstaVerificado(domain.isCorreoEstaVerificado()).setNumeroTelefonoMovilEstaVerificado(domain.isNumeroTelefonoMovilEstaVerificado()).setEstado(EstadoRevisorAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}


	@Override
	public RevisorDomain toDomainFromDto(RevisorDTO dto) {
		return new RevisorDomain(dto.getIdentificador(),TipoIdentificacionAssembler.getInstance().toDomainFromDto(dto.getTipoIdentificacion()),dto.getNumeroIdentificacion(),
				dto.getPrimerNombre(),dto.getSegundoNombre(),dto.getPrimerApellido(),dto.getSegundoApellido(),dto.getCorreoElectronico(),dto.getIndicadorPaisTelefono(),dto.getNumeroTelefonicoMovil(),
				TipoRelacionInstitucionAssembler.getInstance().toDomainFromDto(dto.getTipoRelacionIntitucion()),dto.isCorreoEstaVerificado(),dto.isNumeroTelefonoMovilEstaVerificado(),EstadoRevisorAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}


	@Override
	public RevisorEntity toEntityFromDomain(RevisorDomain domain) {
		return new RevisorEntity(domain.getIdentificador(),TipoIdentificacionAssembler.getInstance().toEntityFromDomain(domain.getTipoIdentificacion()),domain.getNumeroIdentificacion(),
				domain.getPrimerNombre(),domain.getSegundoNombre(),domain.getPrimerApellido(),domain.getSegundoApellido(),domain.getCorreoElectronico(),domain.getIndicadorPaisTelefono(),domain.getNumeroTelefonicoMovil(),
				TipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain.getTipoRelacionIntitucion()),domain.isCorreoEstaVerificado(),domain.isNumeroTelefonoMovilEstaVerificado(),EstadoRevisorAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}


	@Override
	public RevisorDomain toDomainFromEntity(RevisorEntity entity) {
		return  new RevisorDomain(entity.getIdentificador(),TipoIdentificacionAssembler.getInstance().toDomainFromEntity(entity.getTipoIdentificacion()),entity.getNumeroIdentificacion(),
				entity.getPrimerNombre(),entity.getSegundoNombre(),entity.getPrimerApellido(),entity.getSegundoApellido(),entity.getCorreoElectronico(),entity.getIndicadorPaisTelefono(),entity.getNumeroTelefonicoMovil(),
				TipoRelacionInstitucionAssembler.getInstance().toDomainFromEntity(entity.getTipoRelacionIntitucion()),entity.isCorreoEstaVerificado(),entity.isNumeroTelefonoMovilEstaVerificado(),EstadoRevisorAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}
	


	@Override
	public List<RevisorDomain> toDomainListFromEntityList(List<RevisorEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<RevisorDTO> toDtoListFromDomainList(List<RevisorDomain> domainList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
