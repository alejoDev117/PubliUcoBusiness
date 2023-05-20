package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PalabraClavePublicacionDomain {

	private final static PalabraClavePublicacionDomain DEFUALT_OBJECT = new PalabraClavePublicacionDomain();
	private UUID identificador;
	private PublicacionDomain publicacion;
	private String palabraClave;
	
	
	
	
	public PalabraClavePublicacionDomain(UUID identificador, PublicacionDomain publicacion, String palabraClave) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setPalabraClave(palabraClave);
	}




	private PalabraClavePublicacionDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPublicacion(PublicacionDomain.getDefaultObject());
		setPalabraClave(UtilText.getUtilText().getDefaultValue());
	}



	
	


	public static final PalabraClavePublicacionDomain getDefualtObject() {
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




	public final String getPalabraClave() {
		return palabraClave;
	}




	private final void setPalabraClave(String palabraClave) {
		this.palabraClave = UtilText.getUtilText().applyTrim(palabraClave);
		
	}
	
	
	
	
	
	
}
