package com.upskilling.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.upskilling.springboot.entity.User;


public interface UserRepository extends JpaRepository<User, Long> {

}
