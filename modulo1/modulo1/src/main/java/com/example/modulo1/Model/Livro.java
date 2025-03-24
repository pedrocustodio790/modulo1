package com.example.modulo1.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Livro {
    private String id; // Identificador único do livro
    private String nome; // Nome do livro
    private String autor; // Autor do livro
    private String genero; // Gênero literário do livro

    public Object getIdLivro() {
        return id; // Retorna o identificador do livro
    }
}
