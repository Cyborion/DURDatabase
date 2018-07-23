package com.praktyka.database.repository;

import com.praktyka.database.model.Lampa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LampaRepository extends JpaRepository <Lampa, Integer> {
}
