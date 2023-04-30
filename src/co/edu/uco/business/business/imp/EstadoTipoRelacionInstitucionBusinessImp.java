package co.edu.uco.business.business.imp;

import java.util.List;

import co.edu.uco.business.assembler.concrete.EstadoTipoRelacionInstitucionAssembler;
import co.edu.uco.business.business.EstadoTipoRelacionInstitucionBusiness;
import co.edu.uco.business.domain.EstadoTipoRelacionInstitucionDomain;
import co.edu.uco.data.dao.factory.DAOFactory;
import co.edu.uco.entities.EstadoTipoRelacionInstitucionEntity;

public final class EstadoTipoRelacionInstitucionBusinessImp implements EstadoTipoRelacionInstitucionBusiness{

	private DAOFactory daoFactory;
	
	public EstadoTipoRelacionInstitucionBusinessImp(final DAOFactory daoFactory) {
		this.daoFactory = daoFactory;
	}
	@Override
	public final void register( final EstadoTipoRelacionInstitucionDomain domain) {
	 final 	EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain)
		daoFactory.getEstadoTipoRelacionInstitucionDAO().create(entity);
		
	}

	@Override
	public final List<EstadoTipoRelacionInstitucionDomain> list(final EstadoTipoRelacionInstitucionDomain domain) {
		 final 	EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain);
		 final List<EstadoTipoRelacionInstitucionEntity> result = daoFactory.getEstadoTipoRelacionInstitucionDAO().read(entity);
		 
	}

	@Override
	public  final void modify( final EstadoTipoRelacionInstitucionDomain domain) {
		final 	EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain)
				daoFactory.getEstadoTipoRelacionInstitucionDAO().update(entity);
				
		
	}

	@Override
	public final void drop( final EstadoTipoRelacionInstitucionDomain domain) {
		final 	EstadoTipoRelacionInstitucionEntity entity = EstadoTipoRelacionInstitucionAssembler.getInstance().toEntityFromDomain(domain)
				daoFactory.getEstadoTipoRelacionInstitucionDAO().delete(entity);
				
		
	}

}
