package com.kodilla.patterns.strategy.social;

public class SnapchatPublisher implements SocialPublisher{
    @Override
    public String Share() {
        return "This message was posted on Snapchat";
    }
}
