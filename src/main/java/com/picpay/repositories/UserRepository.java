package com.picpay.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.picpay.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    
    Optional<User> findeUserByDocument(String document);

    Optional<User> findeUserById(Long id);
}
