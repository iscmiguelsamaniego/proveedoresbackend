package org.samtech.backendproveedores.controllers;

import org.samtech.backendproveedores.entities.DatosdelSistema;
import org.samtech.backendproveedores.entities.Proveedores;
import org.samtech.backendproveedores.services.DatosdelsistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/datosdelsistema")
public class DatosdelSistemaController {
    @Autowired
    DatosdelsistemaService datosdelsistemaService;

    @GetMapping("/getAll")
    public Iterable<DatosdelSistema> get() {
        return datosdelsistemaService.getAll();
    }
}
