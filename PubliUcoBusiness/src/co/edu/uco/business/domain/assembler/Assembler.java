package co.edu.uco.business.domain.assembler;

public interface Assembler<D, T, E> {

	T toDTOFromDomain(D domain);
	D toDomainFromDto(T dto);
	E toEntityFromDomain(D domain);
	D toDomainFromEntity(E entity);

	
}
