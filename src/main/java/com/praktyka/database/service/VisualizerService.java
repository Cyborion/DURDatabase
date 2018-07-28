package com.praktyka.database.service;

import com.praktyka.database.model.Visualizer;
import com.praktyka.database.repository.SalaRepository;
import com.praktyka.database.repository.VisualizerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
public class VisualizerService{

    @Autowired
    private VisualizerRepository visualizerRepository;

    @Autowired
    private SalaRepository salaRepository;

    public Visualizer findById(int id){return visualizerRepository.getOne(id);}

    public List <Visualizer> findAll(){return visualizerRepository.findAll();}

    public List <Visualizer> findAllBySalaId(int salaId){return visualizerRepository.findAllBySala(salaRepository.getOne(salaId));}

    public List <Visualizer> findAllByModel(String model){return visualizerRepository.findAllByModel(model);}

    @Transactional
    public void addVisualizer(Visualizer visualizer){
        visualizerRepository.save(visualizer);
    }

    public void deleteVisualizer(Visualizer visualizer){
        visualizerRepository.delete(visualizer);
    }

}
