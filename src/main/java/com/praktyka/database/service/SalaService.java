package com.praktyka.database.service;

import com.praktyka.database.model.Sala;
import com.praktyka.database.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class SalaService {

    @Autowired
    SalaRepository salaRepository;

    public List<Sala> findAll(){
        return salaRepository.findAll();
    }

    public List<Sala> findAllByBudynek(String budynek){
        return salaRepository.findAllByBudynek(budynek);
    }

    public Sala findById(int id){
        return salaRepository.getOne(id);
    }

    @Transactional
    public void saveSala(Sala sala){
        salaRepository.save(sala);
    }

}
