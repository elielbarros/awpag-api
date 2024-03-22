package com.algaworks.awpag.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
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

    @NotBlank // Nao pode ser nulo | Nao pode ser uma string vazia | Nao podoe ser uma string com um espaço
    @Size(max = 60)
    private String nome;

    @NotBlank
    @Size(max = 255)
    @Email
    private String email;

    @NotBlank
    @Size(max = 20)
    @Column(name = "fone")
    private String telefone;
}
