package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final  class PreferenciaEscritorDomain {

	private static final PreferenciaEscritorDomain DEFAULT_OBJECT = new PreferenciaEscritorDomain();
	private UUID identificador;
	private PerfilDomain perfil;
	private EscritorDomain escritor;
	
	
	
	
	public PreferenciaEscritorDomain(UUID identificador, PerfilDomain perfil, EscritorDomain escritor) {
		super();
		setIdentificador(identificador);
		setPerfil(perfil);
		setEscritor(escritor);
	}




	private PreferenciaEscritorDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPerfil(PerfilDomain.getDefaultObject());
		setEscritor(EscritorDomain.getDefaultObject());
	}


	
	
	
	
	

	public static final PreferenciaEscritorDomain getDefaultObject() {
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




	public final EscritorDomain getEscritor() {
		return escritor;
	}




	private final void setEscritor(EscritorDomain escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorDomain.getDefaultObject());
		
	}
	
	
	
	
}
