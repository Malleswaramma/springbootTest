package com.app;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.app.entity.Item;
import com.app.entity.Restaurant;
import com.app.service.RestaurantServiceImpl;

@SpringBootApplication
public class SpringBootApplicationFullJpa1Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplicationFullJpa1Application.class, args);
	}
	
	
	private RestaurantServiceImpl RestaurantSero;
	
    @Autowired
	public void setRestaurantSero(RestaurantServiceImpl restaurantSero) {
		RestaurantSero = restaurantSero;
	}


	@Override
	public void run(String... args) throws Exception {
		
		Item i1=new Item("biryani","italian ",560);
		Item i2=new Item("noodeles","chinesse ",46);
		Item i3=new Item("dosa","indian",89);
		List<Item> itemList = Arrays.asList(i1,i2,i3);
		Set<Item> items =new HashSet<>(itemList);
		
		//Restaurant resta1=new Restaurant("bhavarchi","non-veg","bengaloor",items);
		//Restaurant saveRestaurant = RestaurantSero.saveRestaurant(resta1);
		//System.out.println(saveRestaurant);
		List<Restaurant> allRestaurants = RestaurantSero.getAllRestaurants();
		System.out.println(allRestaurants);
		
		
	}

}
