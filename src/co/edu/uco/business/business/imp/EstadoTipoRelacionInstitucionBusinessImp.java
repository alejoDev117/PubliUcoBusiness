package co.edu.uco.business.business.imp;

import java.util.List;
import java.util.UUID;

import co.edu.uco.business.assembler.concrete.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.business.business.EstadoTipoRelacionInstitucionBusiness;
import co.edu.uco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.crosscutting.exceptions.PubliucoBusinessException;
import co.edu.uco.crosscutting.utils.UtilUUID;
import co.edu.uco.data.dao.factory.DAOFactory;
import co.edu.uco.entities.EstadoTipoRelacionInstitucionEntity;

public final class EstadoTipoRelacionInstitucionBusinessImp implements EstadoTipoRelacionInstitucionBusiness{

	private DAOFactory daoFactory;
	
	public EstadoTipoRelacionInstitucionBusinessImp(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}
	@Override
	public final void register( final EstadoTipoRelacionInstitucionDomain domain) {
		
	   UUID identificador;
	   EstadoTipoRelacionInstitucionEntity entityTmp;
	   List<EstadoTipoRelacionInstitucionEntity> result;
	   do {
		  identificador = UtilUUID.generateNewUUID();
		  entityTmp = EstadoTipoRelacionInstitucionEntity.createWithIdentificador(identificador);
		  result = daoFactory.getEstadoTipoRelacionInstitucionDAO().read(entityTmp);
	   }while(!result.isEmpty());
		
	   entityTmp = EstadoTipoRelacionInstitucionEntity.createWithNombre(domain.getNombre());
	   result = daoFactory.getEstadoTipoRelacionInstitucionDAO().read(entityTmp);
	   
	   if(!result.isEmpty()) {
		   var UserMessage = "El estado de tipo relacion institucion que intenta crear ya existe, por favor verifique los datos y de ser necesario proceda a actualizarlos...";
		   
		   throw PubliucoBusinessException.create(UserMessage);
	   }
		
	 final 	EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain);
		daoFactory.getEstadoTipoRelacionInstitucionDAO().create(entity);
		
	}

	@Override
	public final List<EstadoTipoRelacionInstitucionDomain> list(final EstadoTipoRelacionInstitucionDomain domain) {
		 final 	EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain);
		 final List<EstadoTipoRelacionInstitucionEntity> resultEntityList = daoFactory.getEstadoTipoRelacionInstitucionDAO().read(entity);
		 
		 return EstadoTipoRelacionInstitucionAssembler.getInstance().toDomainListFromEntityList(resultEntityList);
	}

	@Override
	public  final void modify( final EstadoTipoRelacionInstitucionDomain domain) {
		final 	EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain);
				daoFactory.getEstadoTipoRelacionInstitucionDAO().update(entity);
				
		
	}

	@Override
	public final void drop( final EstadoTipoRelacionInstitucionDomain domain) {
		final 	EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain);
				daoFactory.getEstadoTipoRelacionInstitucionDAO().delete(entity);
				
		
	}

}
