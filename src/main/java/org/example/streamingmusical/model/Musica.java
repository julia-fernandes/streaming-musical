package org.example.streamingmusical.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
@Table(name = "TBMUSICA")
public class Musica {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Campo obrigarório.")
    private String nome;

    @NotBlank(message = "Campo obrigarório.")
    private String artista;

    @NotNull(message = "Campo obrigarório.")
    private Float duracao;

    @NotNull(message = "Campo obrigarório.")
    private Integer lancamento;

    public Musica(){}
}
