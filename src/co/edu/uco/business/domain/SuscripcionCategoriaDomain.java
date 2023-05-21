package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;
import co.edu.uco.dto.PerfilDTO;
import co.edu.uco.dto.PlanCategoriaDTO;

public final class SuscripcionCategoriaDomain {

	private static final SuscripcionCategoriaDomain DEFAULT_OBJECT = new SuscripcionCategoriaDomain();
	private UUID identificador;
	private PerfilDomain perfil;
	private PlanCategoriaDomain categoria;
	
	
	
	
	
	
	public SuscripcionCategoriaDomain(UUID identificador, PerfilDomain perfil, PlanCategoriaDomain categoria) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setCategoria(categoria);
	}





	private SuscripcionCategoriaDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPerfil(PerfilDomain.getDefaultObject());
		setCategoria(PlanCategoriaDomain.getDefaultObject());
	}






	public static final SuscripcionCategoriaDomain getDefaultObject() {
		return DEFAULT_OBJECT;
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





	public final PlanCategoriaDomain getCategoria() {
		return categoria;
	}





	private final void setCategoria(PlanCategoriaDomain categoria) {
		this.categoria = UtilObject.getDefault(categoria, PlanCategoriaDomain.getDefaultObject());
		
	}
	
	
	
	
	
	
}
