package org.samtech.backendproveedores.repositories;

import org.samtech.backendproveedores.dto.DatosdelSistemaDto;
import org.samtech.backendproveedores.entities.DatosdelSistema;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface DatosdelsistemaRepository extends CrudRepository<DatosdelSistema, Long> {

    Optional<DatosdelSistema> findById(Long id);
}
