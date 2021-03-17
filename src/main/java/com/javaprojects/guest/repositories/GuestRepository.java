package com.javaprojects.guest.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.javaprojects.guest.model.Guest;

public interface GuestRepository extends JpaRepository<Guest, Integer>{

	@Query("from Guest where firstName like %:guestName% or lastName like %:guestName%")
	List<Guest> findByNameWildcard(@Param("guestName") String guestName);

}