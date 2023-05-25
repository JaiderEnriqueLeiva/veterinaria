package com.veterinaria.veterinaria.repository;

import com.veterinaria.veterinaria.model.LogueoUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface LoginUserRepository extends JpaRepository<LogueoUser,Integer> {




}
