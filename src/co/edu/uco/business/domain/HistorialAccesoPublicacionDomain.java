package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class HistorialAccesoPublicacionDomain {

	private static final HistorialAccesoPublicacionDomain DEFAULT_OBJECT = new HistorialAccesoPublicacionDomain();
	private UUID identificador;
	private LectorDomain lector;
	private PublicacionDomain publicacion;
	
	
	
	
	public HistorialAccesoPublicacionDomain(UUID identificador, LectorDomain lector, PublicacionDomain publicacion) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
	}




	public HistorialAccesoPublicacionDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorDomain.getDefaultObject());
		setPublicacion(PublicacionDomain.getDefaultObject());
	}

	
	
	
	
	
	public static final HistorialAccesoPublicacionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
	}




	public final UUID getIdentificador() {
		return identificador;
	}




	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
		
	}




	public final LectorDomain getLector() {
		return lector;
	}




	private final void setLector(LectorDomain lector) {
		this.lector = UtilObject.getDefault(lector, LectorDomain.getDefaultObject());
		
	}




	public final PublicacionDomain getPublicacion() {
		return publicacion;
	}




	private final void setPublicacion(PublicacionDomain publicacion) {
		this.publicacion = UtilObject.getDefault(publicacion, PublicacionDomain.getDefaultObject());
		
	}
	
	
	
	
	
}
