package com.kodilla.patterns.factory.tasks;


public class TaskFactory {
    public static final String Driving = "DRIVING";
    public static final String Painting = "PAINTING";
    public static final String Shoping = "SHOPING";

    public final Task makeTask(final String tasks) {

        switch (tasks) {
            case Driving:
                return new DrivingTask("Driving action");
            case Painting:
                return new PaintingTask("Paint something");
            case Shoping:
                return new ShoppingTask("Buy something");
            default:
                return null;
        }

    }



}
