/**
 * 
 */
package com.spring.boot.data.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.data.rest.entity.Student;

/**
 * @author mahes
 *
 */
public interface StudentRepository extends JpaRepository<Student, Integer> {

}
