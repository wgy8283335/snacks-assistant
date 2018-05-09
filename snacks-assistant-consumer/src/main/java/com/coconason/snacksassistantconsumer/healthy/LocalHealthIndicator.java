package com.coconason.snacksassistantconsumer.healthy;

import com.coconason.snacksassistantconsumer.controller.UserInfoController;
import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.boot.actuate.health.Status;
import org.springframework.stereotype.Component;

@Component
public class LocalHealthIndicator implements HealthIndicator {

    public Health health() {
        if(UserInfoController.canVisitDb) {
            return new Health.Builder(Status.UP).build();
        } else {
            return new Health.Builder(Status.DOWN).build();
        }
    }

}
