package br.edu.utfpr.tac.agroapi1.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.edu.utfpr.tac.agroapi1.model.Area;

@Repository
public interface AreaRepository extends JpaRepository<Area, UUID>{
    
}
