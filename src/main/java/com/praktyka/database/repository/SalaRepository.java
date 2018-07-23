package com.praktyka.database.repository;

import com.praktyka.database.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SalaRepository extends JpaRepository <Sala, Integer> {
}
