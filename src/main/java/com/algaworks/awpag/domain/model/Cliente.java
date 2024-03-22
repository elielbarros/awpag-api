package com.algaworks.awpag.domain.model;

import jakarta.persistence.*;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Entity
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
public class Cliente {
    @EqualsAndHashCode.Include
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Usar a forma nativa do banco de dados para ID
    private Long id;
    private String nome;
    private String email;
    @Column(name = "fone")
    private String telefone;
}
