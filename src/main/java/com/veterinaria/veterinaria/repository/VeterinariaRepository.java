package com.veterinaria.veterinaria.repository;

import com.veterinaria.veterinaria.model.Mascota;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface VeterinariaRepository extends JpaRepository<Mascota, Integer> {

    @Override
    Mascota save(Mascota mascota);

    @Override
    List<Mascota> findAll();

    @Override
    Optional<Mascota> findById(Integer id);

    @Override
    void delete(Mascota entity);
}
