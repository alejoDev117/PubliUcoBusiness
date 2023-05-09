package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class CategoriaDomain {

	private static final CategoriaDomain DEFAULT_OBJECT = new CategoriaDomain();
	private UUID identificador;
	private CategoriaDomain categoriaPadre;
	private String nombre;
	private String descripcion;
	private EstadoCategoriaDomain estado;
	
	
	
	

	public CategoriaDomain(UUID identificador, CategoriaDomain categoriaPadre, String nombre, String descripcion,
			EstadoCategoriaDomain estado) {
		super();
		setIdentificador(identificador);
		setCategoriaPadre(categoriaPadre);
		setNombre(nombre);
		setDescripcion(descripcion);
		setEstado(estado);
	}
	
	
	
	
	
	
	public CategoriaDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCategoriaPadre(CategoriaDomain.getDefaultObject());
		setNombre(UtilText.getUtilText().getDefaultValue());
		setDescripcion(UtilText.getUtilText().getDefaultValue());
		setEstado(EstadoCategoriaDomain.getDefaultObject());
		
	}






	public static final CategoriaDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}






	public final UUID getIdentificador() {
		return identificador;
	}
	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	
	}
	public final CategoriaDomain getCategoriaPadre() {
		return categoriaPadre;
	}
	private final void setCategoriaPadre(CategoriaDomain categoriaPadre) {
		this.categoriaPadre = UtilObject.getDefault(categoriaPadre, CategoriaDomain.getDefaultObject());
		
	}
	public final String getNombre() {
		return nombre;
	}
	private final void setNombre(String nombre) {
		this.nombre = UtilText.getUtilText().applyTrim(nombre);
	
	}
	public final String getDescripcion() {
		return descripcion;
	}
	private final void setDescripcion(String descripcion) {
		this.descripcion = UtilText.getUtilText().applyTrim(descripcion);
		
	}
	public final EstadoCategoriaDomain getEstado() {
		return estado;
	}
	private final void setEstado(EstadoCategoriaDomain estado) {
		this.estado = UtilObject.getDefault(estado, EstadoCategoriaDomain.getDefaultObject());
	
	}

	
	
	
}
