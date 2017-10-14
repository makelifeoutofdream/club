package com.club.entity;

import java.io.Serializable;

import javax.annotation.Generated;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Owner implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 639890014525730759L;

	@Id
	private String ownerId;
	
	private String ownerName;

	private String role;

	public String getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(String ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}
	
	
}
