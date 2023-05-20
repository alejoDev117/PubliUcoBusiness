package co.edu.uco.business.domain;

import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class PublicacionDomain {

	private static final PublicacionDomain DEFAULT_OBJECT = new PublicacionDomain();
	private UUID identificador;
	private CategoriaDomain categoria;
	private TipoAccesoDomain tipoAccceso;
	private Date fechaPublicacion;
	
	
	
	
	public PublicacionDomain(UUID identificador, CategoriaDomain categoria, TipoAccesoDomain tipoAccceso,
			Date fechaPublicacion) {
		super();
		setIdentificador(identificador);
		setCategoria(categoria);
		setTipoAccceso(tipoAccceso);
		setFechaPublicacion(fechaPublicacion);
	}




	private PublicacionDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setCategoria(CategoriaDomain.getDefaultObject());
		setTipoAccceso(TipoAccesoDomain.getDefaultObject());
		setFechaPublicacion(UtilDateTime.getDefaultValueDate());
	}

	
	



	public static final PublicacionDomain getDefaultObject() {
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




	public final TipoAccesoDomain getTipoAccceso() {
		return tipoAccceso;
	}




	private final void setTipoAccceso(TipoAccesoDomain tipoAccceso) {
		this.tipoAccceso = UtilObject.getDefault(tipoAccceso, TipoAccesoDomain.getDefaultObject());
		
	}




	public final Date getFechaPublicacion() {
		return fechaPublicacion;
	}




	private final void setFechaPublicacion(Date fechaPublicacion) {
		this.fechaPublicacion = UtilDateTime.getDefaultDate(fechaPublicacion);
	
	}
	
	
	
	
	
}
