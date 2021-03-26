/**
 * 
 */
package com.spring.boot.data.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.data.rest.entity.Course;

/**
 * @author mahes
 *
 */
public interface CourseRepository extends JpaRepository<Course, Integer> {

}
