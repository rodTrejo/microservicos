package com.formacionbdi.springboot.app.commons.usuarios.models.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "roles")
public class Role implements Serializable {

    private static final long serialVersionUID = 4467531611801172710L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, length = 30)
    private String nombre;

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
}
