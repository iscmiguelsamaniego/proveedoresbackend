package org.samtech.backendproveedores.services;

import org.samtech.backendproveedores.dto.ProveedoresDto;
import org.samtech.backendproveedores.entities.Proveedores;
import org.samtech.backendproveedores.repositories.ProveedoresRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProveedoresService {

    ProveedoresRepository proveedoresRepository;

    public ProveedoresService(ProveedoresRepository proveedoresRepository) {
        this.proveedoresRepository = proveedoresRepository;
    }

    public Optional<Proveedores> create(ProveedoresDto paramProveedor) {

        Optional<Proveedores> proveedores = Optional.empty();

        boolean isDuplicate = false;

        Iterable<Proveedores> proveedoresList = proveedoresRepository.findAll();

        for (Proveedores proveedoresFound : proveedoresList) {
            if (proveedoresFound.getNombre().equals(paramProveedor.getNombre()) &&
                    proveedoresFound.getRazonsocial().equals(paramProveedor.getRazonsocial()) &&
                    proveedoresFound.getDireccion().equals(paramProveedor.getDireccion())) {
                isDuplicate = true;
                break;
            }
        }

        if (!isDuplicate) {
            Proveedores proveedor = new Proveedores();
            proveedor.setId(paramProveedor.getId());
            proveedor.setNombre(paramProveedor.getNombre());
            proveedor.setRazonsocial(paramProveedor.getRazonsocial());
            proveedor.setDireccion(paramProveedor.getDireccion());

            proveedores = Optional.of(proveedoresRepository.save(proveedor));
        }

        return proveedores;
    }

    public Optional<Proveedores> deleteBy(long paramId) {
        Optional<Proveedores> proveedores = proveedoresRepository.findById(paramId);
        proveedores.ifPresent(value -> proveedoresRepository.delete(value));

        return proveedores;
    }

    public Iterable<Proveedores> getAll() {
        return this.proveedoresRepository.findAll();
    }

    public Optional<Proveedores> update(ProveedoresDto paramProveedor) {

        Optional<Proveedores> proveedores = Optional.empty();

        if(proveedoresRepository.findById(paramProveedor.getId()).isPresent()){
            Proveedores proveedor = proveedoresRepository.findById(paramProveedor.getId()).get();
            proveedor.setId(paramProveedor.getId());
            proveedor.setNombre(paramProveedor.getNombre());
            proveedor.setRazonsocial(paramProveedor.getRazonsocial());
            proveedor.setDireccion(paramProveedor.getDireccion());

            proveedores = Optional.of(proveedoresRepository.save(proveedor));
        }

        return proveedores;
    }
}
