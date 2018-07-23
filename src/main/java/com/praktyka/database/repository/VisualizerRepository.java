package com.praktyka.database.repository;

import com.praktyka.database.model.Visualizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisualizerRepository extends JpaRepository <Visualizer, Integer> {
}
