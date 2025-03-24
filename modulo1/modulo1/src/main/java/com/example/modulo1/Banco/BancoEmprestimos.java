package com.example.modulo1.Banco;

import com.example.modulo1.Model.Cliente;
import com.example.modulo1.Model.Emprestimo;
import com.example.modulo1.Model.Livro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BancoEmprestimos {

    private List<Emprestimo> emprestimos;

    public BancoEmprestimos() {
        this.emprestimos = new ArrayList<>(); // Inicializa a lista de empréstimos
    }

    public void inserir(Emprestimo emprestimo) {
        emprestimos.add(emprestimo); // Adiciona um novo empréstimo à lista
    }

    public Livro encontrarUm(LocalDate inicioEmprestimo) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getDataInicio().equals(inicioEmprestimo)) {
                return emprestimo.getLivro(); // Retorna o livro associado ao empréstimo
            }
        }
        return null; // Retorna null se nenhum empréstimo for encontrado
    }

    public List<Emprestimo> encontrarTodos() {
        return new ArrayList<>(emprestimos); // Retorna uma nova lista com todos os empréstimos
    }

    public boolean atualizar(Emprestimo emprestimoAtualizado) {
        for (int i = 0; i < emprestimos.size(); i++) {
            if (emprestimos.get(i).getDataInicio().equals(emprestimoAtualizado.getDataInicio())) {
                emprestimos.set(i, emprestimoAtualizado); // Atualiza o empréstimo existente
                return true; // Retorna verdadeiro se a atualização for bem-sucedida
            }
        }
        return false; // Retorna falso se nenhum empréstimo foi atualizado
    }

    public boolean deletar(LocalDate inicioEmprestimo) {
        return emprestimos.removeIf(emprestimo -> emprestimo.getDataInicio().equals(inicioEmprestimo)); // Remove o empréstimo se encontrado
    }

    public List<Emprestimo> findAll() {
        return emprestimos; // Retorna a lista de todos os empréstimos
    }

    public void adicionarLivro(String idEmprestimo, Livro livro) {
        // Método ainda não implementado
    }

    public void excluir(String idEmprestimo) {
        // Método ainda não implementado
    }

    public void atualizarDataFim(String idEmprestimo, LocalDate novaDataFim) {
        // Método ainda não implementado
    }

    public void atualizarCliente(String idEmprestimo, Cliente cliente) {
        // Método ainda não implementado
    }

    public List<Emprestimo> findByDataFim(LocalDate dataFim) {
        return emprestimos; // Retorna a lista de empréstimos, mas não filtra pela data de fim
    }
}
