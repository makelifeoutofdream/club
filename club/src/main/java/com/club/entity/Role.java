package com.club.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="role")
public class Role implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8063159295776441232L;


	@Id
	@GeneratedValue
	private Long roleId;
	
	
	private String roleName;


	public Long getRoleId() {
		return roleId;
	}


	public void setRoleId(Long roleId) {
		this.roleId = roleId;
	}


	public String getRoleName() {
		return roleName;
	}


	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	
	
	
}
