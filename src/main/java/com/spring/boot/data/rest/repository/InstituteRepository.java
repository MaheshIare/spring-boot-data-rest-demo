/**
 * 
 */
package com.spring.boot.data.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.data.rest.entity.Institute;

/**
 * @author mahes
 *
 */
public interface InstituteRepository extends JpaRepository<Institute, Integer> {

}
