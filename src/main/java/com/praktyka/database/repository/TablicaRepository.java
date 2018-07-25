package com.praktyka.database.repository;

import com.praktyka.database.model.Sala;
import com.praktyka.database.model.Tablica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TablicaRepository extends JpaRepository <Tablica, Integer> {
    List<Tablica> findAllByModel(String model);
    List<Tablica> findAllBySala(Sala sala);
}
