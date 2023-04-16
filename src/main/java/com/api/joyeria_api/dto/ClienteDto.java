package com.api.joyeria_api.dto;

public class ClienteDto {
    private String id;
    private String nombre;
    private String telefono;
    private String detalle;
    private String hora_atencion;

    public ClienteDto() {
    }

    public ClienteDto(String id, String nombre, String telefono, String detalle, String hora_atencion) {
        this.id = id;
        this.nombre = nombre;
        this.telefono = telefono;
        this.detalle = detalle;
        this.hora_atencion = hora_atencion;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDetalle() {
        return detalle;
    }

    public void setDetalle(String detalle) {
        this.detalle = detalle;
    }

    public String getHora_atencion() {
        return hora_atencion;
    }

    public void setHora_atencion(String hora_atencion) {
        this.hora_atencion = hora_atencion;
    }
}
