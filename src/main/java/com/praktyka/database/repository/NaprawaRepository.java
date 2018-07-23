package com.praktyka.database.repository;

import com.praktyka.database.model.Naprawa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NaprawaRepository extends JpaRepository <Naprawa, Integer> {
}
