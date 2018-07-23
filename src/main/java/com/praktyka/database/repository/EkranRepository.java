package com.praktyka.database.repository;

import com.praktyka.database.model.Ekran;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EkranRepository extends JpaRepository <Ekran, Integer> {
}
