package com.example.desafioSpring.desafioSpring.repositories;

import com.example.desafioSpring.desafioSpring.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {

}
