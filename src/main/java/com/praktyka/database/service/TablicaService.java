package com.praktyka.database.service;

import com.praktyka.database.model.Tablica;
import com.praktyka.database.repository.SalaRepository;
import com.praktyka.database.repository.TablicaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class TablicaService {

    @Autowired
    private TablicaRepository tablicaRepository;

    @Autowired
    private SalaRepository salaRepository;

    public Tablica findById(int id){return tablicaRepository.getOne(id);}

    public List <Tablica> findAll(){return tablicaRepository.findAll();}

    public List <Tablica> findAllBySalaId(int salaId){return tablicaRepository.findAllBySala(salaRepository.getOne(salaId));}

    public List <Tablica> findAllByModel(String model){return tablicaRepository.findAllByModel(model);}

    @Transactional
    public void addTablica(Tablica tablica){
        tablicaRepository.save(tablica);
    }

}