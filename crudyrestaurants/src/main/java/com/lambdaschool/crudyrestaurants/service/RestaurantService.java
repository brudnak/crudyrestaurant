package com.lambdaschool.crudyrestaurants.service;

import com.lambdaschool.crudyrestaurants.model.Restaurant;

import java.util.ArrayList;

public interface RestaurantService {

    ArrayList<Restaurant> findAll();

    Restaurant findRestaurantById(long id);

    Restaurant findRestaurantByName(String name);

    void delete(long id);

    Restaurant save(Restaurant restaurant);

    Restaurant update(Restaurant restaurant, long id);
}
