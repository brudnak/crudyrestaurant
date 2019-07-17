package com.lambdaschool.crudyrestaurants.controller;

import com.lambdaschool.crudyrestaurants.model.Restaurant;
import com.lambdaschool.crudyrestaurants.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/restaurants")
public class RestaurantController {

    @Autowired
    private RestaurantService restaurantService;

    @GetMapping(value = "/restaurants",
            produces = {"application/json"})
    public ResponseEntity<?> listAllRestaurants() {
        ArrayList<Restaurant> myList = restaurantService.findAll();
        return new ResponseEntity<>(myList, HttpStatus.OK);
    }

    @GetMapping(value = "/restaurant/{restaurantId}",
            produces = {"application/json"})
    public ResponseEntity<?> getRestaurantById(
            @PathVariable
                    Long restaurantId) {
        Restaurant r = restaurantService.findRestaurantById(restaurantId);
        return new ResponseEntity<>(r, HttpStatus.OK);
    }

    @GetMapping(value = "/restaurant/name/{name}",
            produces = {"application/json"})
    public ResponseEntity<?> getRestaurantByName(
            @PathVariable
                    String name) {
        Restaurant r = restaurantService.findRestaurantByName(name);
        return new ResponseEntity<>(r, HttpStatus.OK);
    }

    @DeleteMapping(value = "/restaurant/{restaurantid}")
    public ResponseEntity<?> deleteRestaurantById(
            @PathVariable
                    long restaurantid) {
        restaurantService.delete(restaurantid);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @PutMapping(value = "/restaurant/{restaurantid}")
    public ResponseEntity<?> updateRestaurantById(
            @RequestBody
                    Restaurant updateRestaurant,
            @PathVariable
                    long restaurantid) {

        restaurantService.update(updateRestaurant, restaurantid);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
