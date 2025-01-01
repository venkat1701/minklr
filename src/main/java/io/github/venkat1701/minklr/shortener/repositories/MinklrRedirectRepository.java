package io.github.venkat1701.minklr.shortener.repositories;

import io.github.venkat1701.minklr.shortener.entities.MinklrRedirect;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MinklrRedirectRepository extends JpaRepository<MinklrRedirect, Long> {

    boolean existsByAlias(String alias);

    Optional<MinklrRedirect> findByAlias(String alias);
}
