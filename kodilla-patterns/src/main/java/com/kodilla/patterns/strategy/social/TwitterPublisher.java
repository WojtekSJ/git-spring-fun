package com.kodilla.patterns.strategy.social;

public class TwitterPublisher implements SocialPublisher{
    @Override
    public String Share() {
        return "This message was posted on Twitter";
    }
}
