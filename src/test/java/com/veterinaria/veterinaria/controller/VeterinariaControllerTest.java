package com.veterinaria.veterinaria.controller;


import com.veterinaria.veterinaria.model.Mascota;
import com.veterinaria.veterinaria.service.VeterinariaService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;


public class VeterinariaControllerTest {


    public static final String MASCOTA_TEST = "mascotaTest";


    @Mock
    private VeterinariaService veterinariaService;

    @InjectMocks
    private VeterinariaController veterinariaController;


    @BeforeEach
    void setUp(){
        MockitoAnnotations.initMocks(this);
    }

    @Test
    void shouldReturnBusiness(){
        when(veterinariaService.readAllPets())
                .thenReturn(
                        List.of(Mascota.builder().nombre(MASCOTA_TEST).build()));
        var response = veterinariaController.getAllPets();
        assertEquals(response.get(0).getNombre(), MASCOTA_TEST);
    }


}