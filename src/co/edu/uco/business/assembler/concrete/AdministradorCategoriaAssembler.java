package co.edu.uco.business.assembler.concrete;

import java.util.List;

import co.edu.uco.business.assembler.Assembler;
import co.edu.uco.business.domain.AdministradorCategoriaDomain;
import co.edu.uco.dto.AdministradorCategoriaDTO;
import co.edu.uco.entities.AdministradorCategoriaEntity;

public final class AdministradorCategoriaAssembler implements Assembler<AdministradorCategoriaDomain,AdministradorCategoriaDTO,AdministradorCategoriaEntity>{
	
	private static final Assembler<AdministradorCategoriaDomain,AdministradorCategoriaDTO,AdministradorCategoriaEntity> INSTANCE = new AdministradorCategoriaAssembler();

	private AdministradorCategoriaAssembler() {
		super();
	}
	
	
	public static final Assembler<AdministradorCategoriaDomain, AdministradorCategoriaDTO, AdministradorCategoriaEntity> getInstance() {
		return INSTANCE;
	}

	@Override
	public AdministradorCategoriaDTO toDTOFromDomain(AdministradorCategoriaDomain domain) {
		return AdministradorCategoriaDTO.create().setIdentificador(domain.getIdentificador()).setTipoIdentificacion(TipoIdentificacionAssembler.getInstance().toDTOFromDomain(domain.getTipoIdentificacion())).
				setNumeroIdentificacion(domain.getNumeroIdentificacion()).setPrimerNombre(domain.getPrimerNombre()).setSegundoNombre(domain.getSegundoNombre()).
				setPrimerApellido(domain.getPrimerApellido()).setSegundoApellido(domain.getSegundoApellido()).setCorreoElectronico(domain.getCorreoElectronico()).
				setIndicadorPaisTelefono(domain.getIndicadorPaisTelefono()).setNumeroTelefonoMovil(domain.getNumeroTelefonoMovil()).setTipoRelacionInstitucion(TipoRelacionInstitucionAssembler.getInstance().toDTOFromDomain(domain.getTipoRelacionInstitucion())).
				setCuentaDeCorreoEstaVerificada(domain.isCuentaDeCorreoEstaVerificada()).setNumeroTelefonoEstaVerificado(domain.isNumeroTelefonoEstaVerificado()).setEstado(EstadoAdministradorCategoriaAssembler.getInstance().toDTOFromDomain(domain.getEstado()));
		}

	@Override
	public AdministradorCategoriaDomain toDomainFromDto(AdministradorCategoriaDTO dto) {
		return new AdministradorCategoriaDomain(dto.getIdentificador(),TipoIdentificacionAssembler.getInstance().toDomainFromDto(dto.getTipoIdentificacion()),
				dto.getNumeroIdentificacion(),dto.getPrimerNombre(),dto.getSegundoNombre(),dto.getPrimerApellido(),dto.getSegundoApellido(),dto.getCorreoElectronico(),
		dto.getIndicadorPaisTelefono(),dto.getNumeroTelefonoMovil(),TipoRelacionInstitucionAssembler.getInstance().toDomainFromDto(dto.getTipoRelacionInstitucion()),dto.isCuentaDeCorreoEstaVerificada(),dto.isNumeroTelefonoEstaVerificado(),
		EstadoAdministradorCategoriaAssembler.getInstance().toDomainFromDto(dto.getEstado()));
	}

	@Override
	public AdministradorCategoriaEntity toEntityFromDomain(AdministradorCategoriaDomain domain) {
		return new AdministradorCategoriaEntity(domain.getIdentificador(),TipoIdentificacionAssembler.getInstance().toEntityFromDomain(domain.getTipoIdentificacion()),
				domain.getNumeroIdentificacion(),domain.getPrimerNombre(),domain.getSegundoNombre(),domain.getPrimerApellido(),domain.getSegundoApellido(),domain.getCorreoElectronico(),
				domain.getIndicadorPaisTelefono(),domain.getNumeroTelefonoMovil(),TipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain.getTipoRelacionInstitucion()),domain.isCuentaDeCorreoEstaVerificada(),domain.isNumeroTelefonoEstaVerificado(),
		EstadoAdministradorCategoriaAssembler.getInstance().toEntityFromDomain(domain.getEstado()));
	}

	@Override
	public AdministradorCategoriaDomain toDomainFromEntity(AdministradorCategoriaEntity entity) {
		return new AdministradorCategoriaDomain(entity.getIdentificador(),TipoIdentificacionAssembler.getInstance().toDomainFromEntity(entity.getTipoIdentificacion()),
				entity.getNumeroIdentificacion(),entity.getPrimerNombre(),entity.getSegundoNombre(),entity.getPrimerApellido(),entity.getSegundoApellido(),entity.getCorreoElectronico(),
				entity.getIndicadorPaisTelefono(),entity.getNumeroTelefonoMovil(),TipoRelacionInstitucionAssembler.getInstance().toDomainFromEntity(entity.getTipoRelacionInstitucion()),entity.isCuentaDeCorreoEstaVerificada(),entity.isNumeroTelefonoEstaVerificado(),
		EstadoAdministradorCategoriaAssembler.getInstance().toDomainFromEntity(entity.getEstado()));
	}

	@Override
	public List<AdministradorCategoriaDomain> toDomainListFromEntityList(
			List<AdministradorCategoriaEntity> entityList) {
		return entityList.stream().map(entity -> toDomainFromEntity(entity)).toList();
	}
	
	
	
	
}
