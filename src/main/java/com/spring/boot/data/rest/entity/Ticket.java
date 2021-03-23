/**
 * 
 */
package com.spring.boot.data.rest.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * @author mahes
 *
 */
@Entity
public class Ticket {

	@Id
	@Column
	private Integer ticketId;
	
	@Column
	private String ticketDesc;
	
	@Column
	private String message;

	/**
	 * @return the ticketId
	 */
	public Integer getTicketId() {
		return ticketId;
	}

	/**
	 * @param ticketId the ticketId to set
	 */
	public void setTicketId(Integer ticketId) {
		this.ticketId = ticketId;
	}

	/**
	 * @return the ticketDesc
	 */
	public String getTicketDesc() {
		return ticketDesc;
	}

	/**
	 * @param ticketDesc the ticketDesc to set
	 */
	public void setTicketDesc(String ticketDesc) {
		this.ticketDesc = ticketDesc;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param message the message to set
	 */
	public void setMessage(String message) {
		this.message = message;
	}
	
	
}
