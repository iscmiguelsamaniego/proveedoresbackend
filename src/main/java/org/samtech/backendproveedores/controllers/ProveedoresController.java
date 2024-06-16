package org.samtech.backendproveedores.controllers;

import org.samtech.backendproveedores.dto.ProveedoresDto;
import org.samtech.backendproveedores.dto.ResponseDto;
import org.samtech.backendproveedores.entities.Proveedores;
import org.samtech.backendproveedores.services.ProveedoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.HttpServerErrorException;

import static org.samtech.backendproveedores.utils.Constants.*;

@RestController
@RequestMapping("/proveedores")
public class ProveedoresController {

    @Autowired
    ProveedoresService proveedoresService;

    @PostMapping("/create")
    @ResponseStatus(HttpStatus.CREATED)
    public Proveedores create(@RequestBody ProveedoresDto proveedoresDto) {
        return proveedoresService.create(proveedoresDto)
                .orElseThrow(() -> new HttpServerErrorException
                        (HttpStatus.BAD_REQUEST, error_to_create));
    }

    @PostMapping("/delete")
    @ResponseStatus(HttpStatus.OK)
    public ResponseDto delete(@RequestBody ProveedoresDto proveedoresDto) {
        proveedoresService.deleteBy(proveedoresDto.getId())
                .orElseThrow(() -> new HttpServerErrorException
                        (HttpStatus.BAD_REQUEST, error_to_delete));

        return new ResponseDto(sucess_to_delete);
    }

    @GetMapping("/getAll")
    public Iterable<Proveedores> get() {
        return proveedoresService.getAll();
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.OK)
    public Proveedores update(@RequestBody ProveedoresDto proveedoresDto) {

        return proveedoresService.update(proveedoresDto)
                .orElseThrow(() -> new HttpServerErrorException
                        (HttpStatus.BAD_REQUEST, not_found));
    }
}
