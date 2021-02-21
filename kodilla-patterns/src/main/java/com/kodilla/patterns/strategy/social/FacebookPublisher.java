package com.kodilla.patterns.strategy.social;

public class FacebookPublisher implements SocialPublisher{
    @Override
    public String Share() {
        return "This message was posted on Facebook";
    }
}
