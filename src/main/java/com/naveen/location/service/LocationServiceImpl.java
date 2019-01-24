package com.naveen.location.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naveen.location.entities.Location;
import com.naveen.location.repos.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository repository;

	@Override
	public Location saveLocation(Location location) {
		// TODO Auto-generated method stub
		return repository.save(location);
	}

	@Override
	public Location updateLocatio(Location location) {
		// TODO Auto-generated method stub
		return repository.save(location);

	}

	@Override
	public void deleteLocation(Location location) {
		// TODO Auto-generated method stub
		repository.delete(location);
	}

	@Override
	public Location getLocationById(int id) {
		// TODO Auto-generated method stub
		return repository.findById(id).get();
	}

	@Override
	public List<Location> getAllLocation() {
		return repository.findAll();
	}

	public LocationRepository getRepository() {
		return repository;
	}

	public void setRepository(LocationRepository repository) {
		this.repository = repository;
	}


}