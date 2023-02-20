package com.movieapplication.moviecatalogservice.models;

import java.util.List;

public class UserRating {

    public UserRating() {
    }

    public List<Rating> getUserRating() {
        return userRating;
    }

    public void setUserRating(List<Rating> userRating) {
        this.userRating = userRating;
    }

    private List<Rating> userRating;

}
