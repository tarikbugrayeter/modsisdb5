package com.example.modsisdb4.Repository;

import com.example.modsisdb4.modsisdb4.SatinAlim;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SatinAlimRepository extends JpaRepository<SatinAlim,Long> {
    List<SatinAlim> findById(int id);
}
