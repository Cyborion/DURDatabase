package com.praktyka.database;

import com.praktyka.database.model.Audio;
import com.praktyka.database.repository.AudioRepository;
import com.praktyka.database.repository.LampaRepository;
import com.praktyka.database.repository.SalaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.domain.Specification;

import java.util.List;

@SpringBootApplication
public class DatabaseApplication implements CommandLineRunner {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private AudioRepository audioRepository;
    @Autowired
    private SalaRepository salaRepository;
    @Autowired
    private LampaRepository lampaRepository;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	    logger.info("lista audio o sali id 1 -> {}", audioRepository.findAllBySala(salaRepository.getOne(1)));
        logger.info("lista audio o typie mikrofon -> {}", audioRepository.findAllByTyp("mikrofon"));
        logger.info("lista lamp o czasie pracy > 1 -> {}", lampaRepository.findAllByCzasPracyGreaterThan(1));

	}
}
