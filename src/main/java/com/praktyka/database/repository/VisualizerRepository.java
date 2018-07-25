package com.praktyka.database.repository;

import com.praktyka.database.model.Sala;
import com.praktyka.database.model.Visualizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisualizerRepository extends JpaRepository <Visualizer, Integer> {
    List<Visualizer> findAllByModel(String model);
    List<Visualizer> findAllBySala(Sala sala);
}
