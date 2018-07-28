package com.praktyka.database.service;

import com.praktyka.database.model.Zlacze;
import com.praktyka.database.repository.SalaRepository;
import com.praktyka.database.repository.ZlaczeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class ZlaczeService {

    @Autowired
    private ZlaczeRepository zlaczeRepository;

    @Autowired
    private SalaRepository salaRepository;

    public Zlacze findById(int id){return zlaczeRepository.getOne(id);}

    public List <Zlacze> findAll(){return zlaczeRepository.findAll();}

    public List <Zlacze> findAllBySalaId(int salaId){return zlaczeRepository.findAllBySala(salaRepository.getOne(salaId));}

    public List <Zlacze> findAllByNazwa(String nazwa){return zlaczeRepository.findAllByNazwa(nazwa);}

    @Transactional

    public void addZlacze(Zlacze zlacze){
        zlaczeRepository.save(zlacze);
    }

    public void deleteZlacze(Zlacze zlacze){
        zlaczeRepository.delete(zlacze);
    }
}
