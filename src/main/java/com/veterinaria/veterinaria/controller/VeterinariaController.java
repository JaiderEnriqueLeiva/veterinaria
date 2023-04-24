package com.veterinaria.veterinaria.controller;

import com.veterinaria.veterinaria.model.Mascota;
import com.veterinaria.veterinaria.service.VeterinariaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/veterinaria")
@AllArgsConstructor
public class VeterinariaController {

    private final VeterinariaService veterinariaService;

    @GetMapping("/health")
    public String getUsers() {
        return "Miau Miau Vivo <3";
    }

    @GetMapping
    public List<Mascota> getAllPets() {
        return veterinariaService.readAllPets();
    }

    @PostMapping
    public void addPet(@RequestBody Mascota mascota) {
        veterinariaService.createPet(mascota);
    }

    @GetMapping("/{id}")
    public Optional<Mascota> getUserById(@PathVariable int id) {
        return veterinariaService.readPetById(id);
    }

    @PutMapping
    public void updatePets(@RequestBody Mascota mascota) {
        veterinariaService.updatePet(mascota);
    }

    @DeleteMapping("/{id}")
    public void deletePet(@PathVariable int id) {
        veterinariaService.deletePet(id);
    }

}
