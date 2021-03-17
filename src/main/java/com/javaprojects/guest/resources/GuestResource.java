package com.javaprojects.guest.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.javaprojects.guest.model.Guest;
import com.javaprojects.guest.model.Guests;
import com.javaprojects.guest.repositories.GuestRepository;

@RestController
@RequestMapping("/guests")
public class GuestResource {
	
	@Autowired
	GuestRepository guestRepo;

	@PostMapping("addGuest")
	public Guest addGuest(@RequestBody Guest guest) {
		guestRepo.save(guest);
		return guest;
	}
	
	@GetMapping("/searchGuests")
	public Guests searchGuests(@RequestParam("guestName") String guestName) {
		Guests guests = new Guests();
		guests.setGuests(guestRepo.findByNameWildcard(guestName));
		return guests;
	}
}
