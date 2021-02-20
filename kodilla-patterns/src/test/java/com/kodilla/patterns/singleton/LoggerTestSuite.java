package com.kodilla.patterns.singleton;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class LoggerTestSuite {
    private Logger logger = Logger.INSTANCE;
    private Logger logger2 = Logger.INSTANCE;
    @Test
    void testGetLog() {
        //Given
        String message = "Zapis do loga";
        //When
        logger.log(message);

        //Then
        assertEquals("Zapis do loga", logger.getLastLog());
        assertEquals("Zapis do loga", logger2.getLastLog());
    }


}


