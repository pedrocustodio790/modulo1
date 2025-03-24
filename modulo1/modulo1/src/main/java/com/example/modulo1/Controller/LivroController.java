package com.example.modulo1.Controller;

import com.example.modulo1.Banco.BancoLivros;
import com.example.modulo1.Model.Livro;
import lombok.RequiredArgsConstructor;

import java.util.List;

@RequiredArgsConstructor
public class LivroController {
    private final BancoLivros bancoLivros;

    // Método para inserir um livro no banco de dados
    public void inserirNoBanco(Livro livro) {
        bancoLivros.inserir(livro);
    }

    // Método para recuperar todos os livros do banco de dados
    public List<Livro> pegarTodosOsLivros() {
        return bancoLivros.findAll();
    }

    // Método para atualizar um livro existente no banco de dados
    public void atualizarLivro(Long id, Livro livro) {
        bancoLivros.atualizar(livro);
    }

    // Método para excluir um livro do banco de dados
    public void excluirLivro(String id) {
        bancoLivros.excluir(id);
    }

    // Método para pegar todos os livros (observação: pode haver erro de implementação)
    public List<Livro> pegartodosOsLivros() {
        return (List<Livro>) bancoLivros;
    }

    // Método vazio para remover um livro, ainda não implementado
    public void removerLivro(Long id) {
    }
}
