package com.lambdaschool.crudyrestaurants.service;

import com.lambdaschool.crudyrestaurants.model.Restaurant;
import com.lambdaschool.crudyrestaurants.repos.RestaurantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service(value = "restaurantService")
public class RestaurantServiceImpl implements RestaurantService {

    @Autowired
    private RestaurantRepository restrepos;

    @Override
    public ArrayList<Restaurant> findAll() {
        return null;
    }

    @Override
    public Restaurant findRestaurantById(long id) {
        return null;
    }

    @Override
    public Restaurant findRestaurantByName(String name) {
        return null;
    }

    @Override
    public void delete(long id) {

    }

    @Override
    public Restaurant save(Restaurant restaurant) {
        return null;
    }

    @Override
    public Restaurant update(Restaurant restaurant, long id) {
        return null;
    }
}
