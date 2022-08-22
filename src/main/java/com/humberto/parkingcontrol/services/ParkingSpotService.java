package com.humberto.parkingcontrol.services;

import org.springframework.beans.factory.annotation.Autowired;

import com.humberto.parkingcontrol.repositories.ParkingSpotRepository;

public class ParkingSpotService {
	
	@Autowired
	ParkingSpotRepository parkingSpotRepository;
}
