package com.kodilla.patterns2.facade.api;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class WatcherOrder {
   private static final Logger LOGGER2 = LoggerFactory.getLogger(WatcherOrder.class);
    /*@Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public void logEvent() {
        LOGGER.info("Process Order is under scan");
    }*/
       @Before("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))"
               +"&& args(order, userId) && target(object)")
    public void logEvent(OrderDto order, Long userId, Object object) {
           //LOGGER2.info("Process Order is under scan");
        LOGGER2.info("Class: " + object.getClass().getName() + ", Args: " + order.toString() + " userId: " + userId);

       }
    @Around("execution(* com.kodilla.patterns2.facade.api.OrderFacade.processOrder(..))")
    public Object measureTime(final ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        Object result;
        try {
            long begin = System.currentTimeMillis();                  // [1]
            result = proceedingJoinPoint.proceed();
            long end = System.currentTimeMillis();                    // [2]
            LOGGER2.info("Time consumed " + (end - begin) + "[ms]");   // [3]
        } catch (Throwable throwable) {
            LOGGER2.error(throwable.getMessage());               // [4]
            throw throwable;
        }
        return result;
    }
}
