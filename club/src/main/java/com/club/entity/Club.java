package com.club.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="club")
public class Club  implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 740857240407272929L;

	@Id
	@GeneratedValue
	private Long clubId;
	
	
	private String clubName;
	
	private String locationName;
	
	private String latitude;
	
	private String longitude;
	
	@ManyToOne
	@JoinColumn(name="ownerId",referencedColumnName="ownerId")
	private Owner owner;

	public Long getClubId() {
		return clubId;
	}

	public void setClubId(Long clubId) {
		this.clubId = clubId;
	}

	public String getClubName() {
		return clubName;
	}

	public void setClubName(String clubName) {
		this.clubName = clubName;
	}

	public String getLocationName() {
		return locationName;
	}

	public void setLocationName(String locationName) {
		this.locationName = locationName;
	}

	public String getLatitude() {
		return latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public Owner getOwner() {
		return owner;
	}

	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	
}
