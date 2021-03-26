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
@Table(name = "INSTITUTE")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Institute {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "inst_id")
	private int id;

	@Column(name = "inst_name")
	private String instituteName;

	@Column(name = "inst_code")
	private String institudeCode;
	
	@OneToMany(mappedBy = "institue", cascade = CascadeType.ALL)
	private Set<Course> courses;

	/**
	 * @param instituteName
	 * @param institudeCode
	 */
	public Institute(String instituteName, String institudeCode) {
		super();
		this.instituteName = instituteName;
		this.institudeCode = institudeCode;
	}
	
	

}
