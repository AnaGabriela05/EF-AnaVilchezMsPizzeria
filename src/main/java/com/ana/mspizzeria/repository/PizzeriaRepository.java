package com.ana.mspizzeria.repository;

import com.ana.mspizzeria.model.Pizzeria;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PizzeriaRepository extends JpaRepository<Pizzeria, Integer> {

}

