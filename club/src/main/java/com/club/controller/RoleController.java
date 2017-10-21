package com.club.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.club.dto.RoleDto;
import com.club.service.RoleService;

@RestController
public class RoleController {

	@Autowired
	private RoleService roleSerice;
	
	@RequestMapping(value="/role",method=RequestMethod.GET)
	public List<RoleDto> getRoles(){
		return roleSerice.getRoles();
	}
	
	@RequestMapping(value="/role/{roleName}",method=RequestMethod.GET)
	public RoleDto getRoleByName(@PathVariable String roleName){
		return roleSerice.getRoleByName(roleName);
	}
}
