package com.club.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.club.entity.Role;

public interface RoleRepository extends JpaRepository<Role,Long> {
	
	public Role findByRoleName(String roleName);

}
