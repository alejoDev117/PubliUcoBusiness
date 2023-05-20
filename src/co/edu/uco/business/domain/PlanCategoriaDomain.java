package co.edu.uco.business.domain;


import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilNumeric;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;
import co.edu.uco.dto.CategoriaDTO;

public final class PlanCategoriaDomain {

	private static final PlanCategoriaDomain DEFAULT_OBJECT = new PlanCategoriaDomain();
	private UUID identificador;
	private CategoriaDomain categoria;
	private float precio;
	private Date fechaDeste;
	private Date fechaHasta;
	
	
	public PlanCategoriaDomain(UUID identificador, CategoriaDomain categoria, float precio, Date fechaDeste,
			Date fechaHasta) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setPrecio(precio);
		setFechaDeste(fechaDeste);
		setFechaHasta(fechaHasta);
	}


	private PlanCategoriaDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCategoria(CategoriaDomain.getDefaultObject());
		setPrecio(UtilNumeric.getDefaultFloatValue());
		setFechaDeste(UtilDateTime.getDefaultValueDate());
		setFechaHasta(UtilDateTime.getDefaultValueDate());
	}


	


	public static final PlanCategoriaDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}


	public final UUID getIdentificador() {
		return identificador;
	}


	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}


	public final CategoriaDomain getCategoria() {
		return categoria;
	}


	private final void setCategoria(CategoriaDomain categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDomain.getDefaultObject());
		
	}


	public final float getPrecio() {
		return precio;
	}


	private final void setPrecio(float precio) {
		this.precio = UtilNumeric.getDefaultFloatValue();
		
	}


	public final Date getFechaDeste() {
		return fechaDeste;
	}


	private final void setFechaDeste(Date fechaDeste) {
		this.fechaDeste = UtilDateTime.getDefaultDate(fechaDeste);
	
	}


	public final Date getFechaHasta() {
		return fechaHasta;
	}


	private final void setFechaHasta(Date fechaHasta) {
		this.fechaHasta = UtilDateTime.getDefaultDate(fechaHasta);
		
	}
	
	
	
	
	
	
	
}
