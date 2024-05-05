package com.parcialII.parcial2.dao;

import com.parcialII.parcial2.entities.User;
import org.springframework.data.repository.CrudRepository;

public interface UserDAO extends CrudRepository<User, Long> {
}
