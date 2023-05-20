package co.edu.uco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class CalificacionDomain {

	private static final CalificacionDomain DEFAULT_OBJECT = new CalificacionDomain();
	private UUID identificador;
	private LectorDomain lector;
	private PublicacionDomain publicacion;
	private Date fechaCalificacion;
	
	
	
	public CalificacionDomain(UUID identificador, LectorDomain lector, PublicacionDomain publicacion, Date fechaCalificacion) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setFechaCalificacion(fechaCalificacion);
	}



	private CalificacionDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorDomain.getDefaultObject());
		setPublicacion(PublicacionDomain.getDefaultObject());
		setFechaCalificacion(UtilDateTime.getDefaultValueDate());
	}


	 

	public static final CalificacionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}



	public final UUID getIdentificador() {
		return identificador;
	}



	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}



	public final LectorDomain getLector() {
		return lector;
	}



	private final void setLector(LectorDomain lector) {
		this.lector = UtilObject.getDefault(lector, LectorDomain.getDefaultObject());
	}



	public final PublicacionDomain getPublicacion() {
		return publicacion;
	}



	private final void setPublicacion(PublicacionDomain publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDomain.getDefaultObject());
	}



	public final Date getFechaCalificacion() {
		return fechaCalificacion;
	}



	private final void setFechaCalificacion(Date fechaCalificacion) {
		this.fechaCalificacion = UtilDateTime.getDefaultDate(fechaCalificacion);
	}

	
	
	
	
}
