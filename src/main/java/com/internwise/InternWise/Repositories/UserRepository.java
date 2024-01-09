package com.internwise.InternWise.Repositories;


import com.internwise.InternWise.Entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    Optional<User> findByEmail(String email) ;

    Boolean existsByUsername(String username);

    Boolean existsByEmail(String email);
}