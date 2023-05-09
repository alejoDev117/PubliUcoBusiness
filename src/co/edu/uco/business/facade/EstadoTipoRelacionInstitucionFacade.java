package co.edu.uco.business.facade;

import java.util.List;

import co.edu.uco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.dto.EstadoTipoRelacionInstitucionDTO;

public interface EstadoTipoRelacionInstitucionFacade {

	void register(EstadoTipoRelacionInstitucionDTO domain);
	
	List<EstadoTipoRelacionInstitucionDTO> list(EstadoTipoRelacionInstitucionDTO domain);
	
	void modify(EstadoTipoRelacionInstitucionDTO domain);
	
	void drop(EstadoTipoRelacionInstitucionDTO domain);
}
