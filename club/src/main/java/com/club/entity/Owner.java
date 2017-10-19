package com.club.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="owner")
public class Owner implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 639890014525730759L;

	@Id
	@GeneratedValue
	private Long ownerId;
	
	private String ownerName;

	@OneToOne
	private Role role;
	
	@OneToMany(mappedBy="owner")
	private List<Club> clubs;

	
	public List<Club> getClubs() {
		return clubs;
	}

	public void setClubs(List<Club> clubs) {
		this.clubs = clubs;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public Long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(Long ownerId) {
		this.ownerId = ownerId;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}


	
}
