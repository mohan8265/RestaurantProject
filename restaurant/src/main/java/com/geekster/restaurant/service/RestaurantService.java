package com.geekster.restaurant.service;

import com.geekster.restaurant.model.Restaurant;
import com.geekster.restaurant.repository.RestaurantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RestaurantService {

    @Autowired
    RestaurantDao restaurantDao;

    public List<Restaurant> getAllRestaurants(){
        return restaurantDao.getRestaurantsFromDataSourcee();
    }

    public Restaurant getRestaurantById(String id){
        List<Restaurant> newRestaurantList = restaurantDao.getRestaurantsFromDataSourcee();

        for(Restaurant restaurant : newRestaurantList){
            if(restaurant.getId().equals(id)){
                return restaurant;
            }
        }

        return null;
    }
    public String addToRestaurant(Restaurant restaurant) {
        boolean insertRestaurant = restaurantDao.save(restaurant);
        if(insertRestaurant)
        {
            return  "Restaurant added";
        }else {
            return "Database Eroor occur";
        }
    }
    public String removeRestaurantById(String id){
        boolean deleteResponse = false;
        String status;
        if(id != null) {
            List<Restaurant> newRestaurantList = restaurantDao.getRestaurantsFromDataSourcee();

            for (Restaurant restaurant : newRestaurantList) {
                if (restaurant.getId().equals(id)) {
                    deleteResponse = restaurantDao.remove(restaurant);
                    if (deleteResponse) {
                        status = "Restaurant of Id:" + id + "was deleted";
                    } else {
                        status = "Restaurant of Id:" + id + " wasn't deleted";
                    }
                    return status;
                }
            }
            return "Restaurant of id:" + id + "is not available";
        }
        else
        {
            return "Invalid Id.....";
        }
    }

    public String updateRestaurantSpecialtyById(String id, String specialty)
    {
        boolean updateSpecialty = restaurantDao.update(id,specialty);

        if(updateSpecialty)
        {
            return "Restaurant with id: " + id + "was deleted";
        }
        else {
            return "Restaurant with id: " + id + " does not exist";
        }
    }
}
