package com.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.entity.Restaurant;
import com.app.repository.RestaurantRepository;

@Service
public class RestaurantServiceImpl {

	@Autowired
	private RestaurantRepository restaurantRepo;

	public Restaurant saveRestaurant(Restaurant restaurant) {
		return restaurantRepo.save(restaurant);
	}

	public List<Restaurant> getAllRestaurants() {
		return restaurantRepo.findAll();
	}

	public Restaurant getrestaurantById(Integer id) {
		return restaurantRepo.findById(id).get();
	}

}
