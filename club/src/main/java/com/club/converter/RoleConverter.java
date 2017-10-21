package com.club.converter;

import java.util.ArrayList;
import java.util.List;

import com.club.dto.RoleDto;
import com.club.entity.Role;

public class RoleConverter {
	
	public static RoleDto roleToDto(Role role) {
		if(role==null)
			return null;
		RoleDto dto=new RoleDto();
		dto.setRoleId(role.getRoleId());
		dto.setRoleName(role.getRoleName());
		return dto;
	}
	
	public static List<RoleDto> roleListToDtoList(List<Role> roleList){
		if(roleList==null)
			return null;
		List<RoleDto> dtoList=new ArrayList<>();
		roleList.forEach(role->{
			RoleDto dto=roleToDto(role);
			dtoList.add(dto);
		});
		return dtoList;
	}
	
	public static Role dtoToRole(RoleDto dto) {
		if(dto==null)
			return null;
		Role role=new Role();
		role.setRoleId(dto.getRoleId());
		role.setRoleName(dto.getRoleName());
		return role;
	}
	
	public static List<Role> dtoListToRoleList(List<RoleDto> dtoList){
		if(dtoList==null)
			return null;
		List<Role> roleList=new ArrayList<>();
		dtoList.forEach(dto->{
			Role role=dtoToRole(dto);
			roleList.add(role);
		});
		return roleList;
	}

}
