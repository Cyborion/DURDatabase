package com.praktyka.database.repository;

import com.praktyka.database.model.Wyposazenie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WyposazenieRepository extends JpaRepository<Wyposazenie,Integer> {
}
