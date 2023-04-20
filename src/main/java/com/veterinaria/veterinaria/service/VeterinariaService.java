package com.veterinaria.veterinaria.service;

import com.veterinaria.veterinaria.model.Mascota;
import com.veterinaria.veterinaria.repository.VeterinariaRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class VeterinariaService {


    private final VeterinariaRepository veterinariaRepository;

    public List<Mascota> readAllUser() {
        return veterinariaRepository.findAll();
    }

    public void createUser(Mascota mascota) {
        System.out.println(veterinariaRepository.save(mascota));
    }

    public Optional<Mascota> readUserById(int id) {
        return veterinariaRepository.findById(id);
    }

    public void updateUser(Mascota mascota){
        Optional<Mascota> getUserById = readUserById(mascota.getId());

        if (getUserById.isPresent()) {
            Mascota.MascotaBuilder usuarioBuilder = Mascota.builder();
            usuarioBuilder.id(getUserById.get().getId())
                    .nombre(mascota.getNombre());
            veterinariaRepository.save(usuarioBuilder.build());
        }
    }

    public void deleteUser(int id) {
        var getUserById = readUserById(id);
        getUserById.ifPresent(veterinariaRepository::delete);
    }


}
