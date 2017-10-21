package com.club.dto;

import java.io.Serializable;

public class RoleDto implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8329945047685477877L;
	
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
