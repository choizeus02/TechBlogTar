package com.choizeus.techblogtar.Repository;

import com.choizeus.techblogtar.Domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface UserRepository extends JpaRepository<Users, Long> {
    Optional<Users> findByEmail(@Param("email") String email);

}
