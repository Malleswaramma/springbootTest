package com.app.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer restaurant_id;
	private String restaurant_name;
	private String type;
	private String city;
	@OneToMany(fetch = FetchType.EAGER)
	Set<Item> items;

	public Restaurant(String restaurant_name, String type, String city, Set<Item> items) {
		super();
		this.restaurant_name = restaurant_name;
		this.type = type;
		this.city = city;
		this.items = items;
	}

	public Integer getRestaurant_id() {
		return restaurant_id;
	}

	public void setRestaurant_id(Integer restaurant_id) {
		this.restaurant_id = restaurant_id;
	}

	public String getRestaurant_name() {
		return restaurant_name;
	}

	public void setRestaurant_name(String restaurant_name) {
		this.restaurant_name = restaurant_name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<Item> getItem() {
		return items;
	}

	public void setItem(Set<Item> item) {
		this.items = items;
	}

	@Override
	public String toString() {
		return "Restaurant [restaurant_id=" + restaurant_id + ", restaurant_name=" + restaurant_name + ", type=" + type
				+ ", city=" + city + ", item=" + items + "]";
	}

	public Restaurant() {
		// TODO Auto-generated constructor stub
	}

}
