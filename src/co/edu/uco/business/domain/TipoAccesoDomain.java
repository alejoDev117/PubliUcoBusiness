package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public class TipoAccesoDomain {
	
	
	private static final TipoAccesoDomain DEFAULT_OBJECT = new TipoAccesoDomain();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	private EstadoTipoAccesoDomain estado;
	
	
	
	public TipoAccesoDomain(UUID identificador, String nombre, String descripcion,EstadoTipoAccesoDomain estado) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);	
		setEstado(estado);
		}
	
	
	private TipoAccesoDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoTipoAccesoDomain.getDefaultObject());
	}

	
	
	
	public static final TipoAccesoDomain getDefaultObject() {
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


	public final EstadoTipoAccesoDomain getEstado() {
		return estado;
	}


	private final void setEstado(EstadoTipoAccesoDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoTipoAccesoDomain.getDefaultObject());
		
	}



	

}

