package com.geekster.restaurant.controller;

import com.geekster.restaurant.model.Restaurant;
import com.geekster.restaurant.service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class RestaurantController {

    @Autowired
    RestaurantService restaurantService;

   @GetMapping(value = "/allRestaurants")
    public List<Restaurant> getAllRestaurants(){
       return restaurantService.getAllRestaurants();
   }

    @GetMapping(value = "/restaurantById/{id}")
    public Restaurant getRestaurantById(@PathVariable String id){
       return restaurantService.getRestaurantById(id);
    }

    @PostMapping(value = "/addRestaurant")
    public String addRestaurantById(@RequestBody Restaurant restaurant){
        return restaurantService.addToRestaurant(restaurant);
    }

    @DeleteMapping(value = "/restaurantById/{id}")
    public String deleteRestaurant(@PathVariable String id){
       return restaurantService.removeRestaurantById(id);
    }

    @PutMapping(value = "/updateRestaurantById/{is}/{specialty}")
    public String updateRestaurantSpecialtyById(@PathVariable String id, @PathVariable String specialty){
        return restaurantService.updateRestaurantSpecialtyById(id,specialty);
    }


}
