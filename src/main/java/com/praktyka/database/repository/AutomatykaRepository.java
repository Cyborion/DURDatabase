package com.praktyka.database.repository;

import com.praktyka.database.model.Automatyka;
import com.praktyka.database.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AutomatykaRepository extends JpaRepository <Automatyka, Integer> {
    List<Automatyka> findAllByNazwa(String nazwa);
    List<AutomatykaRepository> findAllBySala(Sala sala);
}
