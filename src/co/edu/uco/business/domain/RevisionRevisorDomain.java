package co.edu.uco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class RevisionRevisorDomain {

	private static final RevisionRevisorDomain  DEFUALT_OBJECT = new RevisionRevisorDomain();
	private UUID identificador;
	private RevisionDomain revision;
	private RevisorDomain revisor;
	private Date fechaAsignacionRevision;
	private Date fechaCompletitudRevision;
	private EstadoRevisionDomain estado;
	
	
	
	
	
	public RevisionRevisorDomain(UUID identificador, RevisionDomain revision, RevisorDomain revisor,
			Date fechaAsignacionRevision, Date fechaCompletitudRevision, EstadoRevisionDomain estado) {
		super();
	setIdentificador(identificador);
	setRevision(revision);
	setRevisor(revisor);
	setFechaAsignacionRevision(fechaAsignacionRevision);
	setFechaCompletitudRevision(fechaCompletitudRevision);
	setEstado(estado);
	}





	private RevisionRevisorDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setRevision(RevisionDomain.getDefaultObject());
		setRevisor(RevisorDomain.getDefaultObject());
		setFechaAsignacionRevision(UtilDateTime.getDefaultValueDate());
		setFechaCompletitudRevision(UtilDateTime.getDefaultDate(fechaAsignacionRevision));
		setEstado(EstadoRevisionDomain.getDefaultObject());
	}

	
	

	public static final RevisionRevisorDomain getDefualtObject() {
		return DEFUALT_OBJECT;
	}





	public final UUID getIdentificador() {
		return identificador;
	}





	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}





	public final RevisionDomain getRevision() {
		return revision;
	}





	private final void setRevision(RevisionDomain revision) {
		this.revision = UtilObject.getDefault(revision, RevisionDomain.getDefaultObject());
		
	}





	public final RevisorDomain getRevisor() {
		return revisor;
	}





	private final void setRevisor(RevisorDomain revisor) {
		this.revisor = UtilObject.getDefault(revisor, RevisorDomain.getDefaultObject());
		
	}





	public final Date getFechaAsignacionRevision() {
		return fechaAsignacionRevision;
	}





	private final void setFechaAsignacionRevision(Date fechaAsignacionRevision) {
		this.fechaAsignacionRevision = UtilDateTime.getDefaultDate(fechaAsignacionRevision);
	
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
		this.estado = UtilObject.getDefault(estado, EstadoRevisionDomain.getDefaultObject	());
		
	}

	
	
	
	
}

