package com.praktyka.database.service;

import com.praktyka.database.model.Audio;
import com.praktyka.database.repository.AudioRepository;
import com.praktyka.database.repository.SalaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AudioService {

    @Autowired
    private AudioRepository audioRepository;
    @Autowired
    private SalaRepository salaRepository;

    public Audio findById(int id){
        return audioRepository.getOne(id);
    }

    public List <Audio> findAllByTyp(String Typ){
        return audioRepository.findAllByTyp(Typ);
    }

    public List <Audio> findAll(){
        return audioRepository.findAll();
    }

    public List <Audio> findAllBySalaId(int salaId){
        return audioRepository.findAllBySala(salaRepository.getOne(salaId));
    }

}
