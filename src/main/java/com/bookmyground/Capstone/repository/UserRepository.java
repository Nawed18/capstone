package com.bookmyground.Capstone.repository;

import com.bookmyground.Capstone.Entity.System_user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<System_user.User, Long> {
}
