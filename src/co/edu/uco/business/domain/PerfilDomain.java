package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilBoolean;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PerfilDomain {

	private static final PerfilDomain DEFAULT_OBJECT = new PerfilDomain();
	private UUID identificador;
	private LectorDomain lector;
	private boolean enviarCorreoRecomendacionesCategoria;
	private boolean enviarCorreoRecomendacionesAutor;
	
	
	
	public PerfilDomain(UUID identificador ,LectorDomain lector, boolean enviarCorreoRecomendacionesCategoria,
			boolean enviarCorreoRecomendacionesAutor) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setEnviarCorreoRecomendacionesCategoria(enviarCorreoRecomendacionesCategoria);
		setEnviarCorreoRecomendacionesAutor(enviarCorreoRecomendacionesAutor);
	}



	private PerfilDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorDomain.getDefaultObject());
		setEnviarCorreoRecomendacionesCategoria(UtilBoolean.getDefaultValue());
		setEnviarCorreoRecomendacionesAutor(UtilBoolean.getDefaultValue());
	}

	
		

	public static final PerfilDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}



	public final LectorDomain getLector() {
		return lector;
	}



	private final void setLector(LectorDomain lector) {
		this.lector = UtilObject.getDefault(lector, LectorDomain.getDefaultObject());

		
	}



	public final boolean isEnviarCorreoRecomendacionesCategoria() {
		return enviarCorreoRecomendacionesCategoria;
	}



	private final void setEnviarCorreoRecomendacionesCategoria(boolean enviarCorreoRecomendacionesCategoria) {
		this.enviarCorreoRecomendacionesCategoria = UtilBoolean.getDefault(enviarCorreoRecomendacionesCategoria);
	}



	public final boolean isEnviarCorreoRecomendacionesAutor() {
		return enviarCorreoRecomendacionesAutor;
	}



	private final void setEnviarCorreoRecomendacionesAutor(boolean enviarCorreoRecomendacionesAutor) {
		this.enviarCorreoRecomendacionesAutor = UtilBoolean.getDefault(enviarCorreoRecomendacionesAutor);

	}



	public final UUID getIdentificador() {
		return identificador;
	}



	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	}
	
	
	
	
	
	
}
