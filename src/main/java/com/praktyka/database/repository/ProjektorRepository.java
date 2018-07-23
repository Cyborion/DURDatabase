package com.praktyka.database.repository;

import com.praktyka.database.model.Projektor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjektorRepository extends JpaRepository <Projektor, Integer> {
}
