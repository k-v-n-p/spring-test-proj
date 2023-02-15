package com.kvnp.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.kvnp.demo.entities.User;

public interface UserRepository extends CrudRepository<User, Integer> {
	
}
