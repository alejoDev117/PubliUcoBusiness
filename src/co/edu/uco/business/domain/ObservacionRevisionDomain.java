package co.edu.uco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class ObservacionRevisionDomain {
	
	
	private static final ObservacionRevisionDomain DEFUALT_OBJECT = new ObservacionRevisionDomain();
	private UUID identificador;
	private EscritorPublicacionDomain escritor;
	private ComentarioRevisorDomain comentario;
	private Date fechaReporteObservacion;
	private Date fechaRevisionObservacion;
	private EstadoObservacionRevisorDomain estado;
	private String observacion;
	
	
	
	
	
	
	public ObservacionRevisionDomain(UUID identificador, EscritorPublicacionDomain escritor, ComentarioRevisorDomain comentario,
			Date fechaReporteObservacion, Date fechaRevisionObservacion, EstadoObservacionRevisorDomain estado,
			String observacion) {
		super();
		setIdentificador(identificador);
		setEscritor(escritor);
		setComentario(comentario);
		setFechaReporteObservacion(fechaReporteObservacion);
		setFechaRevisionObservacion(fechaRevisionObservacion);
		setEstado(estado);
		setObservacion(observacion);
	}






	private ObservacionRevisionDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setEscritor(EscritorPublicacionDomain.getDefaultObject());
		setComentario(ComentarioRevisorDomain.getDefualtObject());
		setFechaReporteObservacion(UtilDateTime.getDefaultValueDate());
		setFechaRevisionObservacion(UtilDateTime.getDefaultValueDate());
		setEstado(EstadoObservacionRevisorDomain.getDefaultObject());
		setObservacion(UtilText.getUtilText().getDefaultValue());
	}


	
	



	public static final ObservacionRevisionDomain getDefualtObject() {
		return DEFUALT_OBJECT;
	}






	public final UUID getIdentificador() {
		return identificador;
	}






	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	
	}






	public final EscritorPublicacionDomain getEscritor() {
		return escritor;
	}






	private final void setEscritor(EscritorPublicacionDomain escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorPublicacionDomain.getDefaultObject());
		
	}






	public final ComentarioRevisorDomain getComentario() {
		return comentario;
	}






	private final void setComentario(ComentarioRevisorDomain comentario) {
		this.comentario = UtilObject.getDefault(comentario, ComentarioRevisorDomain.getDefualtObject());
		
	}






	public final Date getFechaReporteObservacion() {
		return fechaReporteObservacion;
	}






	private final void setFechaReporteObservacion(Date fechaReporteObservacion) {
		this.fechaReporteObservacion = UtilDateTime.getDefaultDate(fechaReporteObservacion);
		
	}






	public final Date getFechaRevisionObservacion() {
		return fechaRevisionObservacion;
	}






	private final void setFechaRevisionObservacion(Date fechaRevisionObservacion) {
		this.fechaRevisionObservacion = UtilDateTime.getDefaultDate(fechaRevisionObservacion);
	
	}






	public final EstadoObservacionRevisorDomain getEstado() {
		return estado;
	}






	private final void setEstado(EstadoObservacionRevisorDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoObservacionRevisorDomain.getDefaultObject());
		
	}






	public final String getObservacion() {
		return observacion;
	}






	private final void setObservacion(String observacion) {
		this.observacion = UtilText.getUtilText().applyTrim(observacion);
		
	}
	
	
	

}
