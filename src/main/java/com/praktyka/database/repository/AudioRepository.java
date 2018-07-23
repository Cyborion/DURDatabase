package com.praktyka.database.repository;

import com.praktyka.database.model.Audio;
import com.praktyka.database.model.Sala;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AudioRepository extends JpaRepository <Audio, Integer>, JpaSpecificationExecutor<Audio> {
    List<Audio> findAllByTyp(String typ);
    List<Audio> findAllBySala(Sala sala);
}
