package com.parcialII.parcial2.service;

import com.parcialII.parcial2.entities.Movement;

import java.util.List;

public interface MovementService {
    public List<Movement> findAll();
    public Movement findById(Long id);
    public void createMovement(Movement movement);
    public void modifyMovement(Long id,Movement movement);
    public void deleteMovement(Long id);
}
