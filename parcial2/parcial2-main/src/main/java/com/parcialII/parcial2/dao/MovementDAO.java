package com.parcialII.parcial2.dao;

import com.parcialII.parcial2.entities.Movement;
import org.springframework.data.repository.CrudRepository;

public interface MovementDAO extends CrudRepository<Movement, Long> {
}
