package com.praktyka.database.repository;

import com.praktyka.database.model.Audio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AudioRepository extends JpaRepository <Audio, Integer> {
}
