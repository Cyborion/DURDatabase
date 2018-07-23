package com.praktyka.database.repository;

import com.praktyka.database.model.Przylacze;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PrzylaczeRepository extends JpaRepository <Przylacze, Integer> {
}
