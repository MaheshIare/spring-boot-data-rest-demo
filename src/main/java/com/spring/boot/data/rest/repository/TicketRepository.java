/**
 * 
 */
package com.spring.boot.data.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.spring.boot.data.rest.entity.Ticket;

/**
 * @author mahes
 *
 */
@RepositoryRestResource(path = "bug")
public interface TicketRepository extends JpaRepository<Ticket, Integer> {

	@Override
	@RestResource(exported = false)
	default void deleteById(Integer id) {
		
	}

	@Override
	@RestResource(exported = false)
	default void delete(Ticket entity) {
		
	}
	
	
}
