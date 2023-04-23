package com.geekster.restaurant.repository;

import com.geekster.restaurant.model.Restaurant;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class RestaurantDao {

    private List<Restaurant> restaurantList;

    public RestaurantDao(){
        restaurantList = new ArrayList<>();
        restaurantList.add(new Restaurant("0","First Restaurant","Agra","Chinese","10"));
    }

    public List<Restaurant> getRestaurantsFromDataSourcee() {
        return restaurantList;
    }

    public boolean save(Restaurant restaurant){
        restaurantList.add(restaurant);
        return true;
    }

    public boolean remove(Restaurant restaurant) {
        restaurantList.remove(restaurant);
        return true;
    }

    public boolean update(String id, String specialty) {
        boolean updateSpecialty = false;
        for(Restaurant restaurant : restaurantList){
            if(restaurant.getId().equals(id))
            {
                remove(restaurant);
                restaurant.setSpecialty(specialty);
                save(restaurant);
                return true;
            }
        }
        return false;
    }
}
