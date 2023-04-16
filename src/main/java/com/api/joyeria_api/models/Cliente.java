package com.api.joyeria_api.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Objects;
import java.util.UUID;

@Document
public class Cliente {
    @Id
    private String id = UUID.randomUUID().toString();
    private String nombre;
    private String telefono;
    private String detalle;
    private String hora_atencion;

    public Cliente() {
    }

    public Cliente(String id, String nombre, String telefono, String detalle, String hora_atencion) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id) && Objects.equals(nombre, cliente.nombre) && Objects.equals(telefono, cliente.telefono) && Objects.equals(detalle, cliente.detalle) && Objects.equals(hora_atencion, cliente.hora_atencion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombre, telefono, detalle, hora_atencion);
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "id='" + id + '\'' +
                ", nombre='" + nombre + '\'' +
                ", telefono='" + telefono + '\'' +
                ", detalle='" + detalle + '\'' +
                ", hora_atencion='" + hora_atencion + '\'' +
                '}';
    }
}
