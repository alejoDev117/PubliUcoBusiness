package co.edu.uco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilNumeric;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;
import co.edu.uco.dto.PublicacionDTO;

public final class PlanPublicacionDomain {

	private static final PlanPublicacionDomain DEFUALT_OBJECT = new PlanPublicacionDomain();
	private UUID identificador;
	private PublicacionDomain publicacion;
	private float precio;
	private Date fechaDesde;
	private Date fechaFin;
	
	
	
	public PlanPublicacionDomain(UUID identificador, PublicacionDomain publicacion, float precio, Date fechaDesde,
			Date fechaFin) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPrecio(precio);
		setFechaDesde(fechaDesde);
		setFechaFin(fechaFin);
	}




	private PlanPublicacionDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPublicacion(PublicacionDomain.getDefaultObject());
		setPrecio(UtilNumeric.getDefaultFloatValue());
		setFechaDesde(UtilDateTime.getDefaultValueDate());
		setFechaFin(UtilDateTime.getDefaultValueDate());
	}


	
	

	public static final PlanPublicacionDomain getDefualtObject() {
		return DEFUALT_OBJECT;
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




	public final float getPrecio() {
		return precio;
	}




	private final void setPrecio(float precio) {
		this.precio = UtilNumeric.getDefaultValueFloat(precio);
		
	}




	public final Date getFechaDesde() {
		return fechaDesde;
	}




	private final void setFechaDesde(Date fechaDesde) {
		this.fechaDesde = UtilDateTime.getDefaultDate(fechaDesde);
		
	}




	public final Date getFechaFin() {
		return fechaFin;
	}




	private final void setFechaFin(Date fechaFin) {
		this.fechaFin = UtilDateTime.getDefaultDate(fechaFin);
		
	}
	
	
	
	
	
}
