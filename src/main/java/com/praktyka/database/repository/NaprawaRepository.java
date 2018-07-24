package com.praktyka.database.repository;

import com.praktyka.database.model.Naprawa;
import com.praktyka.database.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface NaprawaRepository extends JpaRepository <Naprawa, Integer> {
    List<Naprawa> findAllByDataNaprawyGreaterThan(Date dataNaprawy);
    List<Naprawa> findAllByDataNaprawyLessThan(Date dataNaprawy);
    List<Naprawa> findAllBySala(Sala sala);
}
