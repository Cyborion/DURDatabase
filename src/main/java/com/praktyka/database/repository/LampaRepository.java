package com.praktyka.database.repository;

import com.praktyka.database.model.Lampa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface LampaRepository extends JpaRepository <Lampa, Integer> {
    List<Lampa> findAllByCzasPracyGreaterThan(int czasPracy);
}
