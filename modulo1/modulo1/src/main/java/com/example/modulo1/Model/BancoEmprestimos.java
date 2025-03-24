package com.example.modulo1.Model;

import com.example.modulo1.Model.Cliente;
import com.example.modulo1.Model.Emprestimo;
import com.example.modulo1.Model.Livro;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BancoEmprestimos {

    private List<Emprestimo> emprestimos;

    public BancoEmprestimos() {
        this.emprestimos = new ArrayList<>();
    }

    public void inserir(Emprestimo emprestimo) {
        if (emprestimo != null) {
            emprestimos.add(emprestimo);
        }
    }

    public Optional<Livro> encontrarUm(LocalDate inicioEmprestimo) {
        return emprestimos.stream()
                .filter(emprestimo -> emprestimo.getDataInicio().equals(inicioEmprestimo))
                .map(Emprestimo::getLivro)
                .findFirst();
    }

    public List<Emprestimo> encontrarTodos() {
        return new ArrayList<>(emprestimos);
    }

    public boolean atualizar(Emprestimo emprestimoAtualizado) {
        if (emprestimoAtualizado == null) {
            return false;
        }
        for (int i = 0; i < emprestimos.size(); i++) {
            if (emprestimos.get(i).getDataInicio().equals(emprestimoAtualizado.getDataInicio())) {
                emprestimos.set(i, emprestimoAtualizado);
                return true;
            }
        }
        return false;
    }

    public boolean deletar(LocalDate inicioEmprestimo) {
        return emprestimos.removeIf(emprestimo -> emprestimo.getDataInicio().equals(inicioEmprestimo));
    }

    public List<Emprestimo> findAll() {
        return new ArrayList<>(emprestimos);
    }

    public void adicionarLivro(String idEmprestimo, Livro livro) {
        // Implementation of adding a book to an existing loan
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId().equals(idEmprestimo)) {
                emprestimo.setLivro(livro);
                return;
            }
        }
    }

    public boolean excluir(String idEmprestimo) {
        return emprestimos.removeIf(emprestimo -> emprestimo.getId().equals(idEmprestimo));
    }

    public boolean atualizarDataFim(String idEmprestimo, LocalDate novaDataFim) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId().equals(idEmprestimo)) {
                emprestimo.setDataFim(novaDataFim);
                return true;
            }
        }
        return false;
    }

    public boolean atualizarCliente(String idEmprestimo, Cliente cliente) {
        for (Emprestimo emprestimo : emprestimos) {
            if (emprestimo.getId().equals(idEmprestimo)) {
                emprestimo.setCliente(cliente);
                return true;
            }
        }
        return false;
    }

    public List<Emprestimo> findByDataFim(LocalDate dataFim) {
        return emprestimos.stream()
                .filter(emprestimo -> emprestimo.getDataFim().equals(dataFim))
                .toList();
    }
}
