package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilBoolean;
import co.edu.uco.crosscutting.utils.UtilMail;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public class RevisorDomain {

	private static final RevisorDomain DEFAULT_OBJECT = new RevisorDomain();
	private UUID identificador;
	private TipoIdentificacionDomain tipoIdentificacion;
	private String numeroIdentificacion;
	private String primerNombre;
	private String segundoNombre;
	private String primerApellido;
	private String segundoApellido;
	private String correoElectronico;
	private String indicadorPaisTelefono;
	private String numeroTelefonicoMovil;
	private TipoRelacionInstitucionDomain tipoRelacionIntitucion;
	private boolean correoEstaVerificado;
	private boolean numeroTelefonoMovilEstaVerificado;
	private EstadoRevisorDomain estado;
	
	
	
	
	public RevisorDomain(UUID identificador, TipoIdentificacionDomain tipoIdentificacion, String numeroIdentificacion,
			String primerNombre, String segundoNombre, String primerApellido, String segundoApellido,
			String correoElectronico, String indicadorPaisTelefono, String numeroTelefonicoMovil,
			TipoRelacionInstitucionDomain tipoRelacionIntitucion, boolean correoEstaVerificado,
			boolean numeroTelefonoMovilEstaVerificado, EstadoRevisorDomain estado) {
		super();
		setIdentificador(identificador);
		setTipoIdentificacion(tipoIdentificacion);
		setNumeroIdentificacion(numeroIdentificacion);
		setPrimerNombre(primerNombre);
		setSegundoNombre(segundoNombre);
		setPrimerApellido(primerApellido);
		setSegundoApellido(segundoApellido);
		setCorreoElectronico(correoElectronico);
		setIndicadorPaisTelefono(indicadorPaisTelefono);
		setNumeroTelefonicoMovil(numeroTelefonicoMovil);
		setTipoRelacionIntitucion(tipoRelacionIntitucion);
		setCorreoEstaVerificado(correoEstaVerificado);
		setCorreoEstaVerificado(numeroTelefonoMovilEstaVerificado);
		setEstado(estado);
	}




	private RevisorDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setTipoIdentificacion(TipoIdentificacionDomain.getDefaultObject());
		setNumeroIdentificacion(UtilText.getUtilText().getDefaultValue());
		setPrimerNombre(UtilText.getUtilText().getDefaultValue());
		setSegundoNombre(UtilText.getUtilText().getDefaultValue());
		setPrimerApellido(UtilText.getUtilText().getDefaultValue());
		setSegundoApellido(UtilText.getUtilText().getDefaultValue());
		setCorreoElectronico(UtilMail.getDefaultValueMail());
		setIndicadorPaisTelefono(UtilText.getUtilText().getDefaultValue());
		setNumeroTelefonicoMovil(UtilText.getUtilText().getDefaultValue());
		setTipoRelacionIntitucion(TipoRelacionInstitucionDomain.getDefaultObject());
		setCorreoEstaVerificado(UtilBoolean.getDefaultValue());
		setCorreoEstaVerificado(UtilBoolean.getDefaultValue());
		setEstado(EstadoRevisorDomain.getDefaultObject());
	}
	
	
	




	public static final RevisorDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}




	public final UUID getIdentificador() {
		return identificador;
	}




	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}




	public final TipoIdentificacionDomain getTipoIdentificacion() {
		return tipoIdentificacion;
	}




	private  final void setTipoIdentificacion(TipoIdentificacionDomain tipoIdentificacion) {
		this.tipoIdentificacion = UtilObject.getDefault(tipoIdentificacion, TipoIdentificacionDomain.getDefaultObject());

	}




	public final String getNumeroIdentificacion() {
		return numeroIdentificacion;
	}




	private final void setNumeroIdentificacion(String numeroIdentificacion) {
		this.numeroIdentificacion = UtilText.getUtilText().applyTrim(numeroIdentificacion);
		
	}




	public final String getPrimerNombre() {
		return primerNombre;
	}




	private final void setPrimerNombre(String primerNombre) {
		this.primerNombre = UtilText.getUtilText().applyTrim(primerNombre);
	
	}




	public final String getSegundoNombre() {
		return segundoNombre;
	}




	private final void setSegundoNombre(String segundoNombre) {
		this.segundoNombre = UtilText.getUtilText().applyTrim(segundoNombre);
		
	}




	public final String getPrimerApellido() {
		return primerApellido;
	}




	private final void setPrimerApellido(String primerApellido) {
		this.primerApellido = UtilText.getUtilText().applyTrim(primerApellido);
		
	}




	public final String getSegundoApellido() {
		return segundoApellido;
	}




	private final void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = UtilText.getUtilText().applyTrim(segundoApellido);
		
	}




	public final String getCorreoElectronico() {
		return correoElectronico;
	}




	private final void setCorreoElectronico(String correoElectronico) {
		this.correoElectronico = UtilMail.applyTrimMail(correoElectronico);
		
	}




	public final String getIndicadorPaisTelefono() {
		return indicadorPaisTelefono;
	}




	private final void setIndicadorPaisTelefono(String indicadorPaisTelefono) {
		this.indicadorPaisTelefono = UtilText.getUtilText().applyTrim(indicadorPaisTelefono);
		
	}




	public final String getNumeroTelefonicoMovil() {
		return numeroTelefonicoMovil;
	}




	private final void setNumeroTelefonicoMovil(String numeroTelefonicoMovil) {
		this.numeroTelefonicoMovil = UtilText.getUtilText().applyTrim(numeroTelefonicoMovil);
		
	}




	public final TipoRelacionInstitucionDomain getTipoRelacionIntitucion() {
		return tipoRelacionIntitucion;
	}




	private final void setTipoRelacionIntitucion(TipoRelacionInstitucionDomain tipoRelacionIntitucion) {
		this.tipoRelacionIntitucion = UtilObject.getDefault(tipoRelacionIntitucion, TipoRelacionInstitucionDomain.getDefaultObject());
		
	}




	public final boolean isCorreoEstaVerificado() {
		return correoEstaVerificado;
	}




	private final void setCorreoEstaVerificado(boolean correoEstaVerificado) {
		this.correoEstaVerificado = UtilBoolean.getDefault(correoEstaVerificado);
	
	}




	public final boolean isNumeroTelefonoMovilEstaVerificado() {
		return numeroTelefonoMovilEstaVerificado;
	}




	private final void setNumeroTelefonoMovilEstaVerificado(boolean numeroTelefonoMovilEstaVerificado) {
		this.numeroTelefonoMovilEstaVerificado = UtilBoolean.getDefault(numeroTelefonoMovilEstaVerificado);
	
	}




	public final EstadoRevisorDomain getEstado() {
		return estado;
	}




	private final void setEstado(EstadoRevisorDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisorDomain.getDefaultObject());
		
	}
	
	
	
	
	
	
 }
