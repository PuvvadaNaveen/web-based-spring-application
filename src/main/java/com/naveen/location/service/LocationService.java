package com.naveen.location.service;

import java.util.List;

import com.naveen.location.entities.Location;

public interface LocationService {

	Location saveLocation(Location location);

	Location updateLocatio(Location location);

	void deleteLocation(Location location);

	Location getLocationById(int id);

	List<Location> getAllLocation();
}
