package com.club.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.club.converter.RoleConverter;
import com.club.dto.RoleDto;
import com.club.entity.Role;
import com.club.repository.RoleRepository;
import com.club.service.RoleService;

@Service
public class RoleServiceImpl implements RoleService{
	
	@Autowired
	private RoleRepository roleRepository;
	
	public List<RoleDto> getRoles(){
		List<Role> roleList=roleRepository.findAll();
		return RoleConverter.roleListToDtoList(roleList);
	}
	
	public RoleDto getRoleByName(String name) {
		Role role=roleRepository.findByRoleName(name);
		return RoleConverter.roleToDto(role);
	}

}
