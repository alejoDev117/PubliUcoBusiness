package co.edu.uco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilNumeric;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public  final class VersionDomain {

	
	private static final VersionDomain DEFAULT_OBJECT = new VersionDomain();
	private UUID identificador;
	private PublicacionDomain publicacion;
	private VersionDomain version;
	private int numeroVersion;
	private Date fechaCreacion;
	private Date fechaUltimaModificacion;
	private String titulo;
	private String resumen;
	private String cuerpo;
	private EstadoVersionDomain estado;
	
	
	
	public VersionDomain(UUID identificador, PublicacionDomain publicacion, VersionDomain version, int numeroVersion,
			Date fechaCreacion, Date fechaUltimaModificacion, String titulo, String resumen, String cuerpo,
			EstadoVersionDomain estado) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setVersion(version);
		setNumeroVersion(numeroVersion);
		setFechaCreacion(fechaCreacion);
		setFechaUltimaModificacion(fechaUltimaModificacion);
		setTitulo(titulo);
		setResumen(resumen);
		setCuerpo(cuerpo);
		setEstado(estado);
	}



	private VersionDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPublicacion(PublicacionDomain.getDefaultObject());
		setVersion(VersionDomain.getDefaultObject());
		setNumeroVersion(UtilNumeric.getDefaultIntValue());
		setFechaCreacion(UtilDateTime.getDefaultValueDate());
		setFechaUltimaModificacion(UtilDateTime.getDefaultValueDate());
		setTitulo(UtilText.getUtilText().getDefaultValue());
		setResumen(UtilText.getUtilText().getDefaultValue());
		setCuerpo(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoVersionDomain.getDefaultObject());
	}
	
	
	


	public static final VersionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}



	public final UUID getIdentificador() {
		return identificador;
	}



	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}



	public final PublicacionDomain getPublicacion() {
		return publicacion;
	}



	private final void setPublicacion(PublicacionDomain publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDomain.getDefaultObject());
		
	}



	public final VersionDomain getVersion() {
		return version;
	}



	private final void setVersion(VersionDomain version) {
		this.version = UtilObject.getDefault(version, VersionDomain.getDefaultObject());
		
	}



	public final int getNumeroVersion() {
		return numeroVersion;
	}



	private final void setNumeroVersion(int numeroVersion) {
		this.numeroVersion = UtilNumeric.getDefaultValueInt(numeroVersion);
		
	}



	public final Date getFechaCreacion() {
		return fechaCreacion;
	}



	private final void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = UtilDateTime.getDefaultDate(fechaCreacion);
		
	}



	public final Date getFechaUltimaModificacion() {
		return fechaUltimaModificacion;
	}



	private final void setFechaUltimaModificacion(Date fechaUltimaModificacion) {
		this.fechaUltimaModificacion = UtilDateTime.getDefaultDate(fechaUltimaModificacion);
		
	}



	public final String getTitulo() {
		return titulo;
	}



	private final void setTitulo(String titulo) {
		this.titulo = UtilText.getUtilText().applyTrim(titulo);
		
	}



	public final String getResumen() {
		return resumen;
	}



	private final void setResumen(String resumen) {
		this.resumen = UtilText.getUtilText().applyTrim(resumen);
		
	}



	public final String getCuerpo() {
		return cuerpo;
	}



	private final void setCuerpo(String cuerpo) {
		this.cuerpo = UtilText.getUtilText().applyTrim(cuerpo);
		
	}



	public final EstadoVersionDomain getEstado() {
		return estado;
	}



	private final void setEstado(EstadoVersionDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoVersionDomain.getDefaultObject());
	
	}

	
	
	
	
	
}
