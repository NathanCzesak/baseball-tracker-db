package com.practice.baseballtrackerdb;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BaseballPlayerRepository extends JpaRepository<BaseballPlayer, Long> {
}
