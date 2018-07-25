package com.praktyka.database.service;

import com.praktyka.database.model.Projektor;
import com.praktyka.database.model.Sala;
import com.praktyka.database.repository.ProjektorRepository;
import com.praktyka.database.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ProjektorService {

    @Autowired
    private ProjektorRepository projektorRepository;

    @Autowired
    private SalaRepository salaRepository;

    public Projektor findById (int id){return projektorRepository.getOne(id);}

    public List <Projektor> findAll(){return projektorRepository.findAll();}

    public List <Projektor> findAllBySalaId(int salaId){return projektorRepository.findAllBySala(salaRepository.getOne(salaId));}

    public List<Projektor> findAllByModel(String model){return projektorRepository.findAllByModel(model);}

    public Projektor findByNumerSeryjny(String numerSeryjny){return projektorRepository.findByNumerSeryjny(numerSeryjny);}

    @Transactional
    public void addProjektor (Projektor projektor){ projektorRepository.save(projektor);}
}