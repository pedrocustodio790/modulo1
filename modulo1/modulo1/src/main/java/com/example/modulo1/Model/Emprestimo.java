package com.example.modulo1.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Emprestimo {
    private String id;
    private LocalDate dataInicio;
    private LocalDate dataFim;
    // Método para obter a lista de livros
    @Getter
    private List<Livro> livros;
    private Cliente cliente;

    // Método para adicionar um livro à lista de empréstimos
    public void adicionarLivro(Livro livro) {
        // Adiciona o livro à lista de empréstimos
        this.livros.add(livro);
    }

    // Método para remover um livro da lista de empréstimos
    public void removerLivro(Livro livro) {
        // Remove o livro da lista de empréstimos
        this.livros.remove(livro);
    }

    public Livro getLivro() {
        return (Livro) livros;
    }

    public void setLivro(Livro livro) {

    }
}
