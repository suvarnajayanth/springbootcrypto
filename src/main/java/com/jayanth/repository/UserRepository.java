package com.jayanth.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jayanth.model.User;

/**
 * @author jayanth suvarna
 * Date :: 20/may/2021
 *
 */
public interface UserRepository extends JpaRepository<User, Long>{

}
