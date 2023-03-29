package com.projetoweb.userwander.repositories;

import com.projetoweb.userwander.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

}
