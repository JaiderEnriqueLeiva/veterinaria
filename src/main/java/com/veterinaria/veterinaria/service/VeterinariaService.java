package com.veterinaria.veterinaria.service;

import com.veterinaria.veterinaria.model.Mascota;
import com.veterinaria.veterinaria.repository.VeterinariaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VeterinariaService {

    private final VeterinariaRepository veterinariaRepository;

    public List<Mascota> readAllPets() {
        return veterinariaRepository.findAll();
    }

    public void createPet(Mascota mascota) {
        System.out.println(veterinariaRepository.save(mascota));
    }

    public Optional<Mascota> readPetById(int id) {
        return veterinariaRepository.findById(id);
    }

    public void updatePet(Mascota mascota){
        Optional<Mascota> getUserById = readPetById(mascota.getId());

        if (getUserById.isPresent()) {
            Mascota.MascotaBuilder usuarioBuilder = Mascota.builder();
            usuarioBuilder.id(getUserById.get().getId())
                    .nombre(mascota.getNombre());
            veterinariaRepository.save(usuarioBuilder.build());
        }
    }

    public void deletePet(int id) {
        var getUserById = readPetById(id);
        getUserById.ifPresent(veterinariaRepository::delete);
    }

}
