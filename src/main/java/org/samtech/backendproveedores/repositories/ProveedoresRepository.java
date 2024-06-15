package org.samtech.backendproveedores.repositories;

import org.samtech.backendproveedores.entities.Proveedores;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface ProveedoresRepository extends CrudRepository<Proveedores, Long> {

    @Override
    Optional<Proveedores> findById(Long id);
}
