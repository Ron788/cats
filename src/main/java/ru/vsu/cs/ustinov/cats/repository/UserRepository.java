package ru.vsu.cs.ustinov.cats.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.vsu.cs.ustinov.cats.model.User;

import java.util.Optional;

/**
 * Как по мне это магия, как-нибудь на досуге надо будет попытаться понять как это вообще работает, наверное.
 */
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    boolean existsByUsername(String username);
}
