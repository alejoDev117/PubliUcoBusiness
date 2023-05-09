package co.edu.uco.business.facade.imp;

import java.util.List;

import co.edu.uco.business.assembler.concrete.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.business.business.EstadoTipoRelacionInstitucionBusiness;
import co.edu.uco.business.business.imp.EstadoTipoRelacionInstitucionBusinessImp;
import co.edu.uco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.business.facade.EstadoTipoRelacionInstitucionFacade;
import co.edu.uco.crosscutting.exceptions.PubliucoBusinessException;
import co.edu.uco.crosscutting.exceptions.PubliucoException;
import co.edu.uco.data.dao.Factory;
import co.edu.uco.data.dao.factory.DAOFactory;
import co.edu.uco.dto.EstadoTipoRelacionInstitucionDTO;

public final class EstadoTipoRelacionInstitucionFacadeImp implements EstadoTipoRelacionInstitucionFacade{

	private final  DAOFactory daoFactory;
	private final EstadoTipoRelacionInstitucionBusiness business;
	
	
	public EstadoTipoRelacionInstitucionFacadeImp(){
		daoFactory =   DAOFactory.getFactory(Factory.SQLSERVER);
		business = new EstadoTipoRelacionInstitucionBusinessImp(daoFactory);
	}
	
	
	@Override
	public void register(EstadoTipoRelacionInstitucionDTO dto) {
		try {
			daoFactory.startTransaction();
			
			 final var  domain = 
					EstadoTipoRelacionInstitucionAssembler.getInstance().toDomainFromDto(dto);
			
			business.register(domain);
			
			daoFactory.confirmTransaction();
			
		}catch(PubliucoException exception){
			daoFactory.cancelTransaction();
			throw exception;
		}catch(Exception exception) {
			daoFactory.cancelTransaction();
			
			
			var userMessage = "error tratando de registrar , si el problema persiste intente de nuevo, si no contacte con el administrador de sistema...";
			var technicalMessage= "se ha presentado una excepcion no conocida al momento de registrar el nuevo estadoTipoRelacionInstitucion, por favor valide la traza completa de la exccepcion presentada...";
			
			throw PubliucoBusinessException.create(userMessage, technicalMessage, exception);
		}finally {
			daoFactory.closeConnection();
		}
	}

	@Override
	public List<EstadoTipoRelacionInstitucionDTO> list(EstadoTipoRelacionInstitucionDTO dto) {
		
	}

	@Override
	public void modify(EstadoTipoRelacionInstitucionDTO dto) {
		
	}

	@Override
	public void drop(EstadoTipoRelacionInstitucionDTO dto) {
		// TODO Auto-generated method stub
		
	}

}
