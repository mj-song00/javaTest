package com.sparta.domain.users.repository;

import com.sparta.domain.users.entity.Users;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface UsersRepository extends JpaRepository<Users, Long> {

    Optional<Users> findByEmail(@NotBlank @Email String email);

    Optional<Users> findByNickname(@NotBlank String nickname);
}
