package com.praktyka.database;

import com.praktyka.database.model.Audio;
import com.praktyka.database.repository.AudioRepository;
import com.praktyka.database.repository.LampaRepository;
import com.praktyka.database.repository.ProjektorRepository;
import com.praktyka.database.repository.SalaRepository;
import com.praktyka.database.service.AudioService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.domain.Specification;

import java.util.Date;
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
    @Autowired
    private ProjektorRepository projektorRepository;
    @Autowired
    private AudioService audioService;

	public static void main(String[] args) {
		SpringApplication.run(DatabaseApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

	    logger.info("lista audio o sali id 1 -> {}", audioRepository.findAllBySala(salaRepository.getOne(1)));
        logger.info("lista audio o typie mikrofon -> {}", audioRepository.findAllByTyp("mikrofon"));
        logger.info("lista lamp o czasie pracy > 1 -> {}", lampaRepository.findAllByCzasPracyGreaterThan(1));
        logger.info("lista lamp danego projektora i sprawne -> {}" ,
                lampaRepository.findAllByProjektorAndSprawna(projektorRepository.getOne(1),true));
        logger.info("lista lamp danego o dacie kontroli wiekszej niz dzisiaj -> {}",
                lampaRepository.findAllByDataKontroliGreaterThan(new Date()));
      //  logger.info("dodanie audio let's try xD -> {}",
       //         audioRepository.save(new Audio("mikrofon","no i opis", salaRepository.getOne(1))));
      //  audioRepository.save(new Audio("mikrofon","no i opis"));
       // audioService.addAudio(new Audio("typ","opis"),1);
       // audioRepository.save(new Audio("typ","opis"));
      //  audioService.addAudio("typ","opis");
	}
}
