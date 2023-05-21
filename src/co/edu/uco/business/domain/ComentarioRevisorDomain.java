package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilText;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class ComentarioRevisorDomain {

	private static final ComentarioRevisorDomain DEFUALT_OBJECT = new ComentarioRevisorDomain();
	private UUID identificador;
	private RevisionRevisorDomain revisionRevisor;
	private TipoComentarioRevisorDomain tipoComentario;
	private String comentario;
	
	
	
	
	public ComentarioRevisorDomain(UUID identificador, RevisionRevisorDomain revisionRevisor,
			TipoComentarioRevisorDomain tipoComentario, String comentario) {
		super();
		setIdentificador(identificador);
		setRevisionRevisor(revisionRevisor);
		setTipoComentario(tipoComentario);
		setComentario(comentario);
	}




	private ComentarioRevisorDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setRevisionRevisor(RevisionRevisorDomain.getDefualtObject());
		setTipoComentario(TipoComentarioRevisorDomain.getDefaultObject());
		setComentario(UtilText.getUtilText().getDefaultValue());
	}


	
	

	public static final ComentarioRevisorDomain getDefualtObject() {
		return DEFUALT_OBJECT;
	}




	public final UUID getIdentificador() {
		return identificador;
	}




	private final void setIdentificador(UUID identificador) {
		this.identificador = UtilUUID.getDefault(identificador);
	
	}




	public final RevisionRevisorDomain getRevisionRevisor() {
		return revisionRevisor;
	}




	private final void setRevisionRevisor(RevisionRevisorDomain revisionRevisor) {
		this.revisionRevisor = UtilObject.getDefault(revisionRevisor, RevisionRevisorDomain.getDefualtObject());
		
	}




	public final TipoComentarioRevisorDomain getTipoComentario() {
		return tipoComentario;
	}




	private final void setTipoComentario(TipoComentarioRevisorDomain tipoComentario) {
		this.tipoComentario = UtilObject.getDefault(tipoComentario, TipoComentarioRevisorDomain.getDefaultObject());
		
	}




	public final String getComentario() {
		return comentario;
	}




	private final void setComentario(String comentario) {
		this.comentario = comentario;
		
	}
	
	
	
	
	
}
