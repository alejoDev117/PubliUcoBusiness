package co.edu.uco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class RevisionDomain {

	private static final RevisionDomain DEFAULT_OBJECT = new RevisionDomain();
	private UUID identificador;
	private VersionDomain version;
	private TipoRevisionDomain tipo;
	private  Date fechaSolicitudRevision;
	private Date fechaLimiteRevision;
	private Date fechaCompletitudRevision;
	private EstadoRevisionDomain estado;
	
	
	
	
	
	
	public RevisionDomain(UUID identificador, VersionDomain version, TipoRevisionDomain tipo, Date fechaSolicitudRevision,
			Date fechaLimiteRevision, Date fechaCompletitudRevision, EstadoRevisionDomain estado) {
		super();
		setIdentificador(identificador);
		setVersion(version);
		setTipo(tipo);
		setFechaSolicitudRevision(fechaSolicitudRevision);
		setFechaLimiteRevision(fechaLimiteRevision);
		setFechaCompletitudRevision(fechaCompletitudRevision);
		setEstado(estado);
	}






	private RevisionDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setVersion(VersionDomain.getDefaultObject());
		setTipo(TipoRevisionDomain.getDefaultObject());
		setFechaSolicitudRevision(UtilDateTime.getDefaultValueDate());
		setFechaLimiteRevision(UtilDateTime.getDefaultValueDate());
		setFechaCompletitudRevision(UtilDateTime.getDefaultValueDate());
		setEstado(EstadoRevisionDomain.getDefaultObject());
	}
	





	public static final RevisionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}






	public final UUID getIdentificador() {
		return identificador;
	}






	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}






	public final VersionDomain getVersion() {
		return version;
	}






	private final void setVersion(VersionDomain version) {
		this.version = UtilObject.getDefault(version, VersionDomain.getDefaultObject());
		
	}






	public final TipoRevisionDomain getTipo() {
		return tipo;
	}






	private final void setTipo(TipoRevisionDomain tipo) {
		this.tipo = UtilObject.getDefault(tipo, TipoRevisionDomain.getDefaultObject());
		
	}






	public final Date getFechaSolicitudRevision() {
		return fechaSolicitudRevision;
	}






	private final void setFechaSolicitudRevision(Date fechaSolicitudRevision) {
		this.fechaSolicitudRevision = UtilDateTime.getDefaultDate(fechaSolicitudRevision);
	
	}






	public final Date getFechaLimiteRevision() {
		return fechaLimiteRevision;
	}






	private final void setFechaLimiteRevision(Date fechaLimiteRevision) {
		this.fechaLimiteRevision = UtilDateTime.getDefaultDate(fechaLimiteRevision);
	
	}






	public final Date getFechaCompletitudRevision() {
		return fechaCompletitudRevision;
	}






	private final void setFechaCompletitudRevision(Date fechaCompletitudRevision) {
		this.fechaCompletitudRevision = UtilDateTime.getDefaultDate(fechaCompletitudRevision);
		
	}






	public final EstadoRevisionDomain getEstado() {
		return estado;
	}






	private final void setEstado(EstadoRevisionDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoRevisionDomain.getDefaultObject());
		
	}

	 	
	
	
}
