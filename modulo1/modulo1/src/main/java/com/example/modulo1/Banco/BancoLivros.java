package com.example.modulo1.Banco;

import com.example.modulo1.Model.Livro;
import java.util.ArrayList;
import java.util.List;

public class BancoLivros {
    private List<Livro> livros; // Lista que armazena os livros

    public BancoLivros() {
        this.livros = new ArrayList<>(); // Inicializa a lista de livros
    }

    public static List<Livro> findAllEmprestimo() {
        return findAllEmprestimo(); // Chama o método para encontrar todos os empréstimos
    }

    public void inserir(Livro livro) {
        livros.add(livro); // Adiciona um livro à lista
    }

    public Livro encontrarUm(String idLivro) {
        for (Livro livro : livros) {
            if (livro.getIdLivro().equals(idLivro)) {
                return livro; // Retorna o livro se o ID corresponder
            }
        }
        return null; // Retorna null se o livro não for encontrado
    }

    public List<Livro> encontrarTodos() {
        return new ArrayList<>(livros); // Retorna uma nova lista com todos os livros
    }

    public boolean atualizar(Livro livro) {
        for (int i = 0; i < livros.size(); i++) {
            if (livros.get(i).getIdLivro().equals(livro.getIdLivro())) {
                livros.set(i, livro); // Atualiza o livro na lista
                return true; // Retorna true se a atualização for bem-sucedida
            }
        }
        return false; // Retorna false se o livro não for encontrado para atualização
    }

    public boolean deletar(String idLivro) {
        return livros.removeIf(livro -> livro.getIdLivro().equals(idLivro)); // Remove o livro se o ID corresponder
    }

    public List<Livro> findAll() {
        return livros; // Retorna a lista de todos os livros
    }

    public void excluir(String idLivro) {
        // Método para excluir um livro, ainda não implementado
    }
}
