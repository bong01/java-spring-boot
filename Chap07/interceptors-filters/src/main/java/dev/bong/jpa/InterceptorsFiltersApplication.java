package dev.bong.jpa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class InterceptorsFiltersApplication {

    public static void main(String[] args) {
        SpringApplication.run(InterceptorsFiltersApplication.class, args);
    }

}
