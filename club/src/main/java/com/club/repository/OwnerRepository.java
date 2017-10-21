package com.club.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.club.entity.Owner;

public interface OwnerRepository extends JpaRepository<Owner, Long> {

}
