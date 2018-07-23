package com.praktyka.database.repository;

import com.praktyka.database.model.Zlacze;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ZlaczeRepository extends JpaRepository <Zlacze, Integer> {
}
