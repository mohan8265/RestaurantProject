package com.geekster.restaurant.model;

public class Restaurant {
    private String id;
    private String restaurantName;
    private String restaurantAddress;
    private String specialty;
    private String totalStaff;


    public String getId() {
        return id;
    }
    public void setRestaurantId(String id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public String getSpecialty() {
        return specialty;
    }

    public void setSpecialty(String specialty) {
        this.specialty = specialty;
    }

    public String getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(String totalStaff) {
        this.totalStaff = totalStaff;
    }


    public Restaurant(String id, String restaurantName, String restaurantAddress, String specialty, String totalStaff) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.specialty = specialty;
        this.totalStaff = totalStaff;
    }

}

