package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class EscritorPublicacionDomain {

	
	private static final EscritorPublicacionDomain DEFAULT_OBJECT  = new EscritorPublicacionDomain();
	private UUID identificador;
	private PublicacionDomain publicacion;
	private EscritorDomain escritor;
	private TipoEscritorDomain tipoEscritor;
	
	
	
	
	
	public EscritorPublicacionDomain(UUID identificador, PublicacionDomain publicacion, EscritorDomain escritor,
			TipoEscritorDomain tipoEscritor) {
		super();
		setIdentificador(identificador);
		setPublicacion(publicacion);
		setEscritor(escritor);
		setTipoEscritor(tipoEscritor);
	}





	private EscritorPublicacionDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setPublicacion(PublicacionDomain.getDefaultObject());
		setEscritor(EscritorDomain.getDefaultObject());
		setTipoEscritor(TipoEscritorDomain.getDefaultObject());
	}





	public static final EscritorPublicacionDomain getDefaultObject() {
		return DEFAULT_OBJECT;
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





	public final EscritorDomain getEscritor() {
		return escritor;
	}





	private final void setEscritor(EscritorDomain escritor) {
		this.escritor = UtilObject.getDefault(escritor, EscritorDomain.getDefaultObject());

	}





	public final TipoEscritorDomain getTipoEscritor() {
		return tipoEscritor;
	}





	private final void setTipoEscritor(TipoEscritorDomain tipoEscritor) {
		this.tipoEscritor = UtilObject.getDefault(tipoEscritor, TipoEscritorDomain.getDefaultObject());
		
	}
	
	
	
	
	
	
	
}
