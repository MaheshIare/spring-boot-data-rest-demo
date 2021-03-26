/**
 * 
 */
package com.spring.boot.data.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

/**
 * @author mahes
 *
 */
@Entity
@Table(name = "STUDENT")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Student {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "student_id")
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "email")
	private String email;
	
	@ManyToOne
	@JoinColumn(name = "course_id", nullable = false)
	private Course course;

	/**
	 * @param instituteName
	 * @param institudeCode
	 * @param email
	 * @param course
	 */
	public Student(String firstName, String lastName, String email, Course course) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.course = course;
	}
	
	
}
