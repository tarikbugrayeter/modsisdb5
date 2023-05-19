package com.example.modsisdb4.Repository;

import com.example.modsisdb4.modsisdb4.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OptionalRepository extends JpaRepository<Optional,Long> {
}
