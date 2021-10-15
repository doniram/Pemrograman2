package com.example.data;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    CommandLineRunner initDatabase(DataRepository repository) {
        return args -> {
            log.info("Preloading" + repository.save(new Data(10002583L, "Donny","Tangerang",
            "HOD", "Human Resources ", "0.5 %", 6300000L )));
            log.info("Preloading" + repository.save(new Data(10007525L, "Baresi","Tangerang",
            "Operator", "Produksi ", "0 %", 4300000L )));
            log.info("Preloading" + repository.save(new Data(1234567L, "Ragil","Tangerang",
            "Supervisor", "Produksi ", "0 %", 4700000L )));
            log.info("Preloading" + repository.save(new Data(1234567L, "Dimo Kamp","Tangerang",
            "Supervisor", "Quality Control ", "0 %", 4700000L )));
            log.info("Preloading" + repository.save(new Data(1234567L, "Priambodo","Tangerang",
            "Operator", "Quality Control ", "0 %", 4300000L )));
        };
    }
}
