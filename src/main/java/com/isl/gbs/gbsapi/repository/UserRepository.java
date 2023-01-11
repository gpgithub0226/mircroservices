package com.isl.gbs.gbsapi.repository;


import com.isl.gbs.gbsapi.enitity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
    User findByUserName(String username);
}
