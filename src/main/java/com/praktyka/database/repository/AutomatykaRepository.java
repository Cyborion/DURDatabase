package com.praktyka.database.repository;

import com.praktyka.database.model.Automatyka;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AutomatykaRepository extends JpaRepository <Automatyka, Integer> {
}
