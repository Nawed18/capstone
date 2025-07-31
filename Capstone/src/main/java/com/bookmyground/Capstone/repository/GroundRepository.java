package com.bookmyground.Capstone.repository;

import com.bookmyground.Capstone.Entity.Ground;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroundRepository extends JpaRepository<Ground, Long> {
    List<Ground> findByLocationAndAvailableTrue(String location);
}
