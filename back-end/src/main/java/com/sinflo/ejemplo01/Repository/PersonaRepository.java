package com.sinflo.ejemplo01.Repository;

import com.sinflo.ejemplo01.Model.Persona;
import org.springframework.data.jpa.repository.JpaRepository;



public interface PersonaRepository extends JpaRepository<Persona, Integer> {
}
