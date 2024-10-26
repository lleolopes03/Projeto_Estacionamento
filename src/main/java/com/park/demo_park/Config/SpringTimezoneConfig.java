package com.park.demo_park.Config;

import jakarta.annotation.PostConstruct;
import org.springframework.context.annotation.Configuration;

import java.util.TimeZone;
@Configuration
public class SpringTimezoneConfig {
   @PostConstruct
    public void timezoneceConfig(){
       TimeZone.setDefault(TimeZone.getTimeZone("America/Sao_Paulo"));

    }


}
