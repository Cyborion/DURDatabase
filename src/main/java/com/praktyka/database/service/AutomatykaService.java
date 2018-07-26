package com.praktyka.database.service;

import com.praktyka.database.model.Automatyka;
import com.praktyka.database.repository.AutomatykaRepository;
import com.praktyka.database.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class AutomatykaService {

    @Autowired
    private AutomatykaRepository automatykaRepository;

    @Autowired
    private SalaRepository salaRepository;

    public Automatyka findById(int id) {return automatykaRepository.getOne(id);}

    public List<Automatyka> findAll() {return automatykaRepository.findAll();}

    public List <Automatyka> findAllBySalaId(int salaId){
        return automatykaRepository.findAllBySala(salaRepository.getOne(salaId));
    }
    @Transactional
    public void addAutomatyka(Automatyka automatyka){
        automatykaRepository.save(automatyka);
    }
}
