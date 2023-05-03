package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;
import co.edu.uco.entities.EstadoTipoIdentificacionEntity;

public class TipoIdentificacionDomain {
	
	private static final TipoIdentificacionDomain DEFAULT_OBJECT = new TipoIdentificacionDomain();
	private UUID identificador;
	private String codigo;
	private String nombre;
	private String descripcion;
	private EstadoTipoIdentificacionDomain estado;
	
	
	public TipoIdentificacionDomain(UUID identificador,String codigo, String nombre, String descripcion,EstadoTipoIdentificacionDomain estado) {
		super();
		setIdentificador(identificador);
		setCodigo(codigo);
		setNombre(nombre);
		setDescripcion(descripcion);	
		setEstado(estado);
		}
	
	
	private TipoIdentificacionDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCodigo(UtilText.getUtilText().getDefaultValue());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		
	}
	
	
	
	
	
	public static final TipoIdentificacionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}


	public final UUID getIdentificador() {
		return identificador;
	}
	
	private final void setIdentificador(final UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador); 
		

	}
	public final String getNombre() {
		return nombre;
	}
	
	
	private final void setNombre(final String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
	
		
	}
	
	public final String getDescripcion() {
		return descripcion;
	}
	
	
	private final void setDescripcion(final String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);

	}


	public final EstadoTipoIdentificacionDomain getEstado() {
		return estado;
	}


	private final void setEstado(EstadoTipoIdentificacionDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoIdentificacionDomain.getDefaultObject());

	}


	public final String getCodigo() {
		return codigo;
	}


	private final void setCodigo(String codigo) {
		this.codigo = UtilText.getUtilText().applyTrim(codigo);
	
	}


	

	

}

