package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.BuyPredictor;

public class User {
    private String name;
    protected SocialPublisher publisher;
    public User(String name) {
        this.name = name;
    }
    public void sharePost() {

    }

    public void setPublisher(SocialPublisher publisher) {
        this.publisher = publisher;
    }

    public String getName() {
        return name;
    }
}
