package org.samtech.backendproveedores.services;

import org.samtech.backendproveedores.entities.DatosdelSistema;
import org.samtech.backendproveedores.repositories.DatosdelsistemaRepository;
import org.springframework.stereotype.Service;

@Service
public class DatosdelsistemaService {

    DatosdelsistemaRepository datosdelsistemaRepository;

    public DatosdelsistemaService(DatosdelsistemaRepository datosdelsistemaRepository) {
        this.datosdelsistemaRepository = datosdelsistemaRepository;
    }

    public Iterable<DatosdelSistema> getAll() {
        return this.datosdelsistemaRepository.findAll();
    }
}
