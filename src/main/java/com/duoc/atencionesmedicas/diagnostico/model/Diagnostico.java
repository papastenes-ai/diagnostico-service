package com.duoc.atencionesmedicas.diagnostico.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "diagnosticos")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Diagnostico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDiagnostico;

    @Column(nullable = false)
    private String descripcion;

    @Column(nullable = false)
    private String tratamiento;

    @Column(nullable = false)
    private String fechaDiagnostico;

    @Column(nullable = false)
    private Integer atencionId;
}