package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PreferenciaCategoriaDomain {
	
	
	private static final PreferenciaCategoriaDomain DEFUALT_OBJECT = new PreferenciaCategoriaDomain();
	private UUID identificador;
	private PerfilDomain perfil;
	private CategoriaDomain categoria;
	
	
	
	
	
	
	public PreferenciaCategoriaDomain(UUID identificador, PerfilDomain perfil, CategoriaDomain categoria) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setCategoria(categoria);
	}






	private PreferenciaCategoriaDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPerfil(PerfilDomain.getDefaultObject());
		setCategoria(CategoriaDomain.getDefaultObject());
	}



	
	



	public static final PreferenciaCategoriaDomain getDefualtObject() {
		return DEFUALT_OBJECT;
	}






	public final UUID getIdentificador() {
		return identificador;
	}






	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}






	public final PerfilDomain getPerfil() {
		return perfil;
	}






	private final void setPerfil(PerfilDomain perfil) {
		this.perfil = UtilObject.getDefault(perfil, PerfilDomain.getDefaultObject());
	
	}






	public final CategoriaDomain getCategoria() {
		return categoria;
	}






	private final void setCategoria(CategoriaDomain categoria) {
		this.categoria = UtilObject.getDefault(categoria, CategoriaDomain.getDefaultObject());
		
	}

	

}
