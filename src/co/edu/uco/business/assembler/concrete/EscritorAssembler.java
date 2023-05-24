package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EscritorDomain;
import co.edu.uco.dto.EscritorDTO;
import co.edu.uco.entities.EscritorEntity;

public final class EscritorAssembler implements Assembler<EscritorDomain,EscritorDTO,EscritorEntity>{
	
	private static final Assembler<EscritorDomain,EscritorDTO,EscritorEntity> INSTANCE = new EscritorAssembler();
	
	
	private EscritorAssembler() {
		super();
	}
	

	public static final Assembler<EscritorDomain, EscritorDTO, EscritorEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public EscritorDTO toDTOFromDomain(EscritorDomain domain) {
		return EscritorDTO.create().setIdentificador(domain.getIdentificador()).setTipoIdentificacion(TipoIdentificacionAssembler.getInstance().toDTOFromDomain(domain.getTipoIdentificacion())).
				setNumeroIdentificacion(domain.getNumeroIdentificacion()).setPrimerNombre(domain.getPrimerNombre()).setSegundoNombre(domain.getSegundoNombre()).setPrimerApellido(domain.getPrimerApellido()).setSegundoApellido(domain.getSegundoApellido()).
				setCorreoElectronico(domain.getCorreoElectronico()).setIndicadorPaisTelefono(domain.getIndicadorPaisTelefono()).setNumeroTelefonicoMovil(domain.getNumeroTelefonicoMovil()).setTipoRelacionIntitucion(TipoRelacionInstitucionAssembler.getInstance().toDTOFromDomain(domain.getTipoRelacionIntitucion())).
				setCorreoEstaVerificado(domain.isCorreoEstaVerificado()).setNumeroTelefonoMovilEstaVerificado(domain.isNumeroTelefonoMovilEstaVerificado()).setEstado(EstadoEscritorAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	}

	@Override
	public EscritorDomain toDomainFromDto(EscritorDTO dto) {
		return new EscritorDomain(dto.getIdentificador(),TipoIdentificacionAssembler.getInstance().toDomainFromDto(dto.getTipoIdentificacion()),dto.getNumeroIdentificacion(),
				dto.getPrimerNombre(),dto.getSegundoNombre(),dto.getPrimerApellido(),dto.getSegundoApellido(),dto.getCorreoElectronico(),dto.getIndicadorPaisTelefono(),dto.getNumeroTelefonicoMovil(),
				TipoRelacionInstitucionAssembler.getInstance().toDomainFromDto(dto.getTipoRelacionIntitucion()),dto.isCorreoEstaVerificado(),dto.isNumeroTelefonoMovilEstaVerificado(),EstadoEscritorAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public EscritorEntity toEntityFromDomain(EscritorDomain domain) {
		return new EscritorEntity(domain.getIdentificador(),TipoIdentificacionAssembler.getInstance().toEntityFromDomain(domain.getTipoIdentificacion()),domain.getNumeroIdentificacion(),
				domain.getPrimerNombre(),domain.getSegundoNombre(),domain.getPrimerApellido(),domain.getSegundoApellido(),domain.getCorreoElectronico(),domain.getIndicadorPaisTelefono(),domain.getNumeroTelefonicoMovil(),
				TipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain.getTipoRelacionIntitucion()),domain.isCorreoEstaVerificado(),domain.isNumeroTelefonoMovilEstaVerificado(),EstadoEscritorAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public EscritorDomain toDomainFromEntity(EscritorEntity entity) {
		return new EscritorDomain(entity.getIdentificador(),TipoIdentificacionAssembler.getInstance().toDomainFromEntity(entity.getTipoIdentificacion()),entity.getNumeroIdentificacion(),
				entity.getPrimerNombre(),entity.getSegundoNombre(),entity.getPrimerApellido(),entity.getSegundoApellido(),entity.getCorreoElectronico(),entity.getIndicadorPaisTelefono(),entity.getNumeroTelefonicoMovil(),
				TipoRelacionInstitucionAssembler.getInstance().toDomainFromEntity(entity.getTipoRelacionIntitucion()),entity.isCorreoEstaVerificado(),entity.isNumeroTelefonoMovilEstaVerificado(),EstadoEscritorAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<EscritorDomain> toDomainListFromEntityList(List<EscritorEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<EscritorDTO> toDtoListFromDomainList(List<EscritorDomain> domainList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
