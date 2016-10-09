package com.siva.profiles;
import java.util.Arrays;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by sivateja on 10/9/16.
 */
@SpringBootApplication
public class ProfilesApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(ProfilesApplication
                .class, args);

    }

}
