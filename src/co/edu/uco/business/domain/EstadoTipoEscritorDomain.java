 package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;
import co.edu.uco.entities.EstadoTipoRelacionInstitucionEntity;

public class EstadoTipoEscritorDomain {
	
	
	private static final EstadoTipoEscritorDomain DEFAULT_OBJECT = new EstadoTipoEscritorDomain();
	private UUID identificador;
	private String nombre;
	private String descripcion;
	
	
	
	public EstadoTipoEscritorDomain(UUID identificador, String nombre, String descripcion) {
		super();
		setIdentificador(identificador);
		setNombre(nombre);
		setDescripcion(descripcion);	
		}
	
	
	
	
	private  EstadoTipoEscritorDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
	}
	
	
	public static EstadoTipoEscritorDomain getDefaultObject() {
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
		this.descripcion = UtilText.getUtilText().applyTrim(nombre);
		
	
	}



}

