package com.praktyka.database.repository;

import com.praktyka.database.model.Sala;
import com.praktyka.database.model.Zlacze;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ZlaczeRepository extends JpaRepository <Zlacze, Integer> {
    List<Zlacze> findAllByNazwa(String nazwa);
    List<Zlacze> findAllBySala(Sala sala);
}
