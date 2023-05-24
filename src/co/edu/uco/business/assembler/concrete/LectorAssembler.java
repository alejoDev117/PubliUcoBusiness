package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.EscritorDomain;
import co.edu.uco.business.domain.LectorDomain;
import co.edu.uco.dto.EscritorDTO;
import co.edu.uco.dto.LectorDTO;
import co.edu.uco.entities.EscritorEntity;
import co.edu.uco.entities.LectorEntity;

public final class LectorAssembler implements Assembler<LectorDomain,LectorDTO,LectorEntity>{
	
	private static final Assembler<LectorDomain, LectorDTO, LectorEntity> INSTANCE = new LectorAssembler();

	private LectorAssembler() {
		super();
		
	}
	
	
	public static final Assembler<LectorDomain, LectorDTO, LectorEntity> getInstance() {
		return INSTANCE;
	}

	

	@Override
	public LectorDTO toDTOFromDomain(LectorDomain domain) {
		return LectorDTO.create().setIdentificador(domain.getIdentificador()).setTipoIdentificacion(TipoIdentificacionAssembler.getInstance().toDTOFromDomain(domain.getTipoIdentificacion())).
				setNumeroIdentificacion(domain.getNumeroIdentificacion()).setPrimerNombre(domain.getPrimerNombre()).setSegundoNombre(domain.getSegundoNombre()).setPrimerApellido(domain.getPrimerApellido()).setSegundoApellido(domain.getSegundoApellido()).
				setCorreoElectronico(domain.getCorreoElectronico()).setIndicadorPaisTelefono(domain.getIndicadorPaisTelefono()).setNumeroTelefonicoMovil(domain.getNumeroTelefonicoMovil()).setTipoRelacionIntitucion(TipoRelacionInstitucionAssembler.getInstance().toDTOFromDomain(domain.getTipoRelacionIntitucion())).
				setCorreoEstaVerificado(domain.isCorreoEstaVerificado()).setNumeroTelefonoMovilEstaVerificado(domain.isNumeroTelefonoMovilEstaVerificado()).setEstado(EstadoLectorAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
	
	}

	@Override
	public LectorDomain toDomainFromDto(LectorDTO dto) {
		return new LectorDomain(dto.getIdentificador(),TipoIdentificacionAssembler.getInstance().toDomainFromDto(dto.getTipoIdentificacion()),dto.getNumeroIdentificacion(),
				dto.getPrimerNombre(),dto.getSegundoNombre(),dto.getPrimerApellido(),dto.getSegundoApellido(),dto.getCorreoElectronico(),dto.getIndicadorPaisTelefono(),dto.getNumeroTelefonicoMovil(),
				TipoRelacionInstitucionAssembler.getInstance().toDomainFromDto(dto.getTipoRelacionIntitucion()),dto.isCorreoEstaVerificado(),dto.isNumeroTelefonoMovilEstaVerificado(),EstadoLectorAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public LectorEntity toEntityFromDomain(LectorDomain domain) {
		return new LectorEntity(domain.getIdentificador(),TipoIdentificacionAssembler.getInstance().toEntityFromDomain(domain.getTipoIdentificacion()),domain.getNumeroIdentificacion(),
				domain.getPrimerNombre(),domain.getSegundoNombre(),domain.getPrimerApellido(),domain.getSegundoApellido(),domain.getCorreoElectronico(),domain.getIndicadorPaisTelefono(),domain.getNumeroTelefonicoMovil(),
				TipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain.getTipoRelacionIntitucion()),domain.isCorreoEstaVerificado(),domain.isNumeroTelefonoMovilEstaVerificado(),EstadoLectorAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}
	

	@Override
	public LectorDomain toDomainFromEntity(LectorEntity entity) {
		return new LectorDomain(entity.getIdentificador(),TipoIdentificacionAssembler.getInstance().toDomainFromEntity(entity.getTipoIdentificacion()),entity.getNumeroIdentificacion(),
				entity.getPrimerNombre(),entity.getSegundoNombre(),entity.getPrimerApellido(),entity.getSegundoApellido(),entity.getCorreoElectronico(),entity.getIndicadorPaisTelefono(),entity.getNumeroTelefonicoMovil(),
				TipoRelacionInstitucionAssembler.getInstance().toDomainFromEntity(entity.getTipoRelacionIntitucion()),entity.isCorreoEstaVerificado(),entity.isNumeroTelefonoMovilEstaVerificado(),EstadoLectorAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<LectorDomain> toDomainListFromEntityList(List<LectorEntity> entityList) {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<LectorDTO> toDtoListFromDomainList(List<LectorDomain> domainList) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
