package com.praktyka.database.repository;

import com.praktyka.database.model.Projektor;
import com.praktyka.database.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProjektorRepository extends JpaRepository <Projektor, Integer> {
    List<Projektor> findAllBySala(Sala sala);
    List<Projektor> findAllByModel(String model);
    Projektor findByNumerSeryjny(String numerSeryjny);
}
