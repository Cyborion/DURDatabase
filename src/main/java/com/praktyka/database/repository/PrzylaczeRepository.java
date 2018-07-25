package com.praktyka.database.repository;

import com.praktyka.database.model.Przylacze;
import com.praktyka.database.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrzylaczeRepository extends JpaRepository <Przylacze, Integer> {
    List<Przylacze> findAllByNazwa(String nazwa);
    List<Przylacze> findAllBySala(Sala sala);
}
