package com.club.service;

import java.util.List;

import com.club.dto.RoleDto;

public interface RoleService {
	
	public List<RoleDto> getRoles();
	public RoleDto getRoleByName(String name);

}
