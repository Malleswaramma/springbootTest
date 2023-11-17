package com.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.app.entity.Restaurant;
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant,Integer>{

}
