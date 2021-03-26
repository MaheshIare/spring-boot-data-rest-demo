/**
 * 
 */
package com.spring.boot.data.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
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
@Table(name = "Ticket")
@Setter
@Getter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Ticket {

	@Id
	@Column
	private Integer ticketId;
	
	@Column
	private String ticketDesc;
	
	@Column
	private String message;
	
}
