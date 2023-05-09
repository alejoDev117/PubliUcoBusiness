package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class CategoriaAdministradorCategoriaDomain {

	
	private static final CategoriaAdministradorCategoriaDomain DEFAULT_OBJECT = new CategoriaAdministradorCategoriaDomain();
	private UUID identificador;
	private CategoriaDomain categoria;
	private AdministradorCategoriaDomain administradorCategoria;
	
	
	
	public CategoriaAdministradorCategoriaDomain(UUID identificador, CategoriaDomain categoria,
			AdministradorCategoriaDomain administradorCategoria) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setAdministradorCategoria(administradorCategoria);
	}



	private CategoriaAdministradorCategoriaDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCategoria(CategoriaDomain.getDefaultObject());
		setAdministradorCategoria(AdministradorCategoriaDomain.getDefaultObject());
	}


	

	public static final CategoriaAdministradorCategoriaDomain getDefaultObject() {
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



	public final AdministradorCategoriaDomain getAdministradorCategoria() {
		return administradorCategoria;
	}



	private final void setAdministradorCategoria(AdministradorCategoriaDomain administradorCategoria) {
		this.administradorCategoria = UtilObject.getDefault(administradorCategoria,AdministradorCategoriaDomain.getDefaultObject());
	
		
	}

	

}
