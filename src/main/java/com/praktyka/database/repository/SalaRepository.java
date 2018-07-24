package com.praktyka.database.repository;

import com.praktyka.database.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SalaRepository extends JpaRepository <Sala, Integer> {
    List<Sala> findAllByBudynek(String budynek);
    Sala findBySalaId(int salaId);
}
