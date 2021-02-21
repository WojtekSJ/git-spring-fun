package com.kodilla.patterns.strategy.social;

import com.kodilla.patterns.strategy.CorporateCustomer;
import com.kodilla.patterns.strategy.Customer;
import com.kodilla.patterns.strategy.IndividualCustomer;
import com.kodilla.patterns.strategy.IndividualYoungCustomer;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTestSuite {
    @Test
    void testDefaultSharingStrategies() {
        //Given
        Millenials milenials = new Millenials("Rocznik 2000");
        YGeneration ygeneration = new YGeneration("Pokolenie Y");
        ZGeneration zGeneration = new ZGeneration("Pokolenie Z");
        //When
        String messageMillenials = milenials.publisher.Share();
        String messageYgeneration = ygeneration.publisher.Share();
        String messageZGeneration = zGeneration.publisher.Share();
        System.out.println(milenials.getName() + " wykonal akcje -> " + messageMillenials);
        System.out.println(ygeneration.getName() + " wykonal akcje -> " + messageYgeneration);
        System.out.println(zGeneration.getName() + " wykonal akcje -> " + messageZGeneration);
        //Then
        assertEquals("This message was posted on Facebook", messageMillenials);
        assertEquals("This message was posted on Snapchat", messageYgeneration);
        assertEquals("This message was posted on Twitter", messageZGeneration);
    }
    @Test
    void testIndividualSharingStrategy() {
        //Given
        Millenials milenials = new Millenials("Rocznik 2000");
        //When
        String messageMillenials = milenials.publisher.Share();
        System.out.println("First " + milenials.getName() + " should do -> " + messageMillenials);
        milenials.setPublisher(new SnapchatPublisher());
        messageMillenials = milenials.publisher.Share();
        System.out.println("Then it was chnged to snapchat, so: " + milenials.getName() + " wykonal akcje -> " + messageMillenials);
        //Then
        assertEquals("This message was posted on Snapchat", messageMillenials);
    }


}
