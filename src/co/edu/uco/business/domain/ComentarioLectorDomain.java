package co.edu.uco.business.domain;



import java.util.Date;
import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilDateTime;
import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class ComentarioLectorDomain {

	
	private static final ComentarioLectorDomain DEFUALT_OBJECT = new ComentarioLectorDomain();
	private UUID identificador;
	private LectorDomain lector;
	private PublicacionDomain publicacion;
	private ComentarioLectorDomain comentarioPadre;
	private String comentario;
	private Date fechaComentario;
	private EstadoComentarioLectorDomain estado;
	
	
	
	public ComentarioLectorDomain(UUID identificador,LectorDomain lector, PublicacionDomain publicacion, ComentarioLectorDomain comentarioPadre,
			String comentario, Date fechaComentario, EstadoComentarioLectorDomain estado) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setPublicacion(publicacion);
		setComentarioPadre(comentarioPadre);
		setComentario(comentario);
		setFechaComentario(fechaComentario);
		setEstado(estado);

	}



	private ComentarioLectorDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorDomain.getDefaultObject());
		setPublicacion(PublicacionDomain.getDefaultObject());
		setComentarioPadre(ComentarioLectorDomain.getDefualtObject());
		setComentario(UtilText.getUtilText().getDefaultValue());
		setFechaComentario(UtilDateTime.getDefaultValueDate());
		setEstado(EstadoComentarioLectorDomain.getDefaultObject());
	}


	
	
	
	

	public static final ComentarioLectorDomain getDefualtObject() {
		return DEFUALT_OBJECT;
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



	public final ComentarioLectorDomain getComentarioPadre() {
		return comentarioPadre;
	}



	private final void setComentarioPadre(ComentarioLectorDomain comentarioPadre) {
		this.comentarioPadre = UtilObject.getDefault(comentarioPadre, ComentarioLectorDomain.getDefualtObject());
	
	}



	public final String getComentario() {
		return comentario;
	}



	private final void setComentario(String comentario) {
		this.comentario = UtilText.getUtilText().applyTrim(comentario);
		
	}



	public final Date getFechaComentario() {
		return fechaComentario;
	}



	private final void setFechaComentario(Date fechaComentario) {
		this.fechaComentario = UtilDateTime.getDefaultDate(fechaComentario);
	}



	public final EstadoComentarioLectorDomain getEstado() {
		return estado;
	}



	private final void setEstado(EstadoComentarioLectorDomain estado) {
		this.estado =UtilObject.getDefault(estado, EstadoComentarioLectorDomain.getDefaultObject());

	}
	
	
	
	
	
}
