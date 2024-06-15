package org.samtech.backendproveedores.dto;

public class ProveedoresDto {
    private Long id;
    private String nombre;
    private String razonsocial;
    private String direccion;

    public ProveedoresDto(Long id, String nombre, String razonsocial, String direccion) {
        this.id = id;
        this.nombre = nombre;
        this.razonsocial = razonsocial;
        this.direccion = direccion;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRazonsocial() {
        return razonsocial;
    }

    public void setRazonsocial(String razonsocial) {
        this.razonsocial = razonsocial;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
