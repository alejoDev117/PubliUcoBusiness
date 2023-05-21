package co.edu.uco.business.domain;

import java.util.UUID;

import co.edu.uco.crosscutting.utils.UtilObject;
import co.edu.uco.crosscutting.utils.UtilUUID;

public final class ReporteDomain {

	private static final ReporteDomain DEFAULT_OBJECT = new ReporteDomain();
	private UUID identificador;
	private LectorDomain lector;
	private ComentarioLectorDomain comentario;
	private TipoReporteDomain tipoReporte;
	
	
	
	
	public ReporteDomain(UUID identificador, LectorDomain lector, ComentarioLectorDomain comentario,
			TipoReporteDomain tipoReporte) {
		super();
		setIdentificador(identificador);
		setLector(lector);
		setComentario(comentario);
		setTipoReporte(tipoReporte);
	}




	private ReporteDomain() {
		super();
		setIdentificador(UtilUUID.getDefaultUuid());
		setLector(LectorDomain.getDefaultObject());
		setComentario(ComentarioLectorDomain.getDefualtObject());
		setTipoReporte(TipoReporteDomain.getDefaultObject());
	}
	
	
	
	

	public static final ReporteDomain getDefaultObject() {
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




	public final ComentarioLectorDomain getComentario() {
		return comentario;
	}




	private final void setComentario(ComentarioLectorDomain comentario) {
		this.comentario = UtilObject.getDefault(comentario, ComentarioLectorDomain.getDefualtObject());
		
	}




	public final TipoReporteDomain getTipoReporte() {
		return tipoReporte;
	}




	private final void setTipoReporte(TipoReporteDomain tipoReporte) {
		this.tipoReporte = UtilObject.getDefault(tipoReporte, TipoReporteDomain.getDefaultObject());
		
	}
	
	
	
}
