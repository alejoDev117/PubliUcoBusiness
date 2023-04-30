package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class TipoRelacionInstitucionDomain {
	private static final TipoRelacionInstitucionDomain DEFAULT_OBJECT = new TipoRelacionInstitucionDomain();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoRelacionInstitucionDomain estadoTipoRelacionInstitucion;
	
	
	public TipoRelacionInstitucionDomain(UUID identificador, String nombre, String descripcion,
			EstadoTipoRelacionInstitucionDomain estadoTipoRelacionInstitucion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstadoTipoRelacionInstitucion(estadoTipoRelacionInstitucion);
		
	
	}
	
	private TipoRelacionInstitucionDomain() {
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstadoTipoRelacionInstitucion(EstadoTipoRelacionInstitucionDomain.getDefaultObject());
		
	}
	
	
	public static final TipoRelacionInstitucionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}


	
	public final UUID getIdentificador() {
		return identificador;
	}


	public final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	
	}


	public final String getNombre() {
		return nombre;
	}


	public final void  setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
		
	}


	public final String getDescripcion() {
		return descripcion;
	}


	private final void  setDescripcion(String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		
	}


	public final EstadoTipoRelacionInstitucionDomain getEstadoTipoRelacionInstitucion() {
		return estadoTipoRelacionInstitucion;
	}


	public final void setEstadoTipoRelacionInstitucion(EstadoTipoRelacionInstitucionDomain estadoTipoRelacionInstitucion) {
		this.estadoTipoRelacionInstitucion = UtilObject.getDefault(estadoTipoRelacionInstitucion, EstadoTipoRelacionInstitucionDomain.getDefaultObject());
	}
	
	
	
	
	
	
	
	
}
