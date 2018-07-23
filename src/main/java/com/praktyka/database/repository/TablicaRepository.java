package com.praktyka.database.repository;

import com.praktyka.database.model.Tablica;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TablicaRepository extends JpaRepository <Tablica, Integer> {
}
