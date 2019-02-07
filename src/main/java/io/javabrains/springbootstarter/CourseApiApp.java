package io.javabrains.springbootstarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;


@SpringBootApplication
@ComponentScan(basePackages = "controllers" )
@ComponentScan(basePackages = "model")
@ComponentScan(basePackages = "repositories")

@EnableJpaRepositories("repositories")
@EntityScan("model")

public class CourseApiApp {

    public static void main(String[] args){
        SpringApplication.run(CourseApiApp.class, args);


    }


}
