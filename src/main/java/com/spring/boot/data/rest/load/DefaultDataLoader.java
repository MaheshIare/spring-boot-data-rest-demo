/**
 * 
 */
package com.spring.boot.data.rest.load;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.spring.boot.data.rest.entity.Course;
import com.spring.boot.data.rest.entity.Institute;
import com.spring.boot.data.rest.entity.Student;

import lombok.extern.slf4j.Slf4j;

/**
 * @author mahes
 *
 */
@Slf4j
@Component
public class DefaultDataLoader {

	@PersistenceContext
	private EntityManager entityManager;

	@EventListener(classes = ApplicationReadyEvent.class)
	public void loadDefaultData() {
		Session session = null;
		Transaction tx = null;
		try {
			log.info("Creating session");
			// open session
			session = entityManager.unwrap(Session.class);

			// start transaction
			tx = session.beginTransaction();
			Institute instituteData = buildInstituteData();

			log.info("Persisting default data started...");
			session.saveOrUpdate(instituteData);
			// Commit transaction
			tx.commit();

			log.info("Persisting default data finished...");
		} catch (Exception e) {
			log.error("Exception while loading default data due to: {}", e);
		} finally {
			// close the session
			log.info("Closing the default data loading session...");
			if (session.isOpen()) {
				session.close();
			}
		}
	}

	private Institute buildInstituteData() {
		log.info("Loading default data");
		Institute institute = new Institute();
		institute.setInstitudeCode("INST");
		institute.setInstituteName("Institute of Electronics Engineering");

		Course courses = new Course("Computer Science Engineering", "CSE", institute);
		Course coursesTwo = new Course("Electronics Electrical Engineering", "EEE", institute);
		Course coursesThree = new Course("Electronics Communication Engineering", "ECE", institute);

		Set<Student> students = new HashSet<>();
		Student studentOne = new Student("Student", "One", "studentone@gmail.com", courses);
		Student studentTwo = new Student("Student", "Two", "studenttwo@gmail.com", courses);
		students.add(studentOne);
		students.add(studentTwo);
		courses.setStudents(students);

		Set<Student> studentsSet = new HashSet<>();
		Student studentThree = new Student("Student", "Three", "studentthree@gmail.com", coursesTwo);
		Student studentFour = new Student("Student", "Four", "studentfour@gmail.com", coursesTwo);
		studentsSet.add(studentThree);
		studentsSet.add(studentFour);
		coursesTwo.setStudents(studentsSet);

		Set<Student> studentsSetNew = new HashSet<>();
		Student studentFive = new Student("Student", "Five", "studentfive@gmail.com", coursesThree);
		Student studentSix = new Student("Student", "Six", "studentsix@gmail.com", coursesThree);
		studentsSet.add(studentFive);
		studentsSet.add(studentSix);
		coursesThree.setStudents(studentsSetNew);

		Set<Course> coursesSet = new HashSet<>();
		coursesSet.add(courses);
		coursesSet.add(coursesTwo);
		coursesSet.add(coursesThree);

		institute.setCourses(coursesSet);
		return institute;

	}
}
