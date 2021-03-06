package ca.mcgill.ecse428.parkingsystem.repository;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import ca.mcgill.ecse428.parkingsystem.model.ParkingSpot;

@Repository
public class ParkingSpotRepository {
	
	@Autowired
	EntityManager entityManager;
	
	@Transactional
	public ParkingSpot addParkingSpot(ParkingSpot ps) {
		entityManager.persist(ps);
		return ps;
	}

}
