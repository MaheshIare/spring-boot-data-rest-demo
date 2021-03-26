/**
 * 
 */
package com.spring.boot.data.rest.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
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
@Table(name = "COURSE")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Course {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "course_id")
	private int id;

	@Column(name = "course_name")
	private String courseName;

	@Column(name = "course_code")
	private String courseCode;
	
	@ManyToOne
	@JoinColumn(name = "inst_id", nullable = false)
	private Institute institue;
	
	@OneToMany(mappedBy = "course", cascade = CascadeType.ALL)
	private Set<Student> students;

	/**
	 * @param instituteName
	 * @param institudeCode
	 * @param institue
	 * @param students
	 */
	public Course(String courseName, String courseCode, Institute institute) {
		super();
		this.courseName = courseName;
		this.courseCode = courseCode;
		this.institue = institute;
	}
	
	
	
}
