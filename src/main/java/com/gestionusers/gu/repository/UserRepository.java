package com.gestionusers.gu.repository;

import com.gestionusers.gu.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository  extends JpaRepository<User, Integer> {

    @Query("select u from User u")
    List<User> findUsers();
}
