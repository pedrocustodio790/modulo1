package com.example.modulo1.Controller;

import com.example.modulo1.Banco.BancoEmprestimos;
import com.example.modulo1.Model.Cliente;
import com.example.modulo1.Model.Emprestimo;
import com.example.modulo1.Model.Livro;
import lombok.RequiredArgsConstructor;

import java.time.LocalDate;
import java.util.List;

@RequiredArgsConstructor
public class EmprestimoController {
    private final BancoEmprestimos bancoEmprestimos;

    // registra emprestimos
    public void registrarEmprestimo(Emprestimo emprestimo) {
        bancoEmprestimos.inserir(emprestimo);
    }

    public List<Emprestimo> consultarEmprestimos() {
        return bancoEmprestimos.encontrarTodos();
    }
       //adiciona livros ao emprestimo
    public void adicionarLivroAoEmprestimo(String idEmprestimo, Livro livro) {
        bancoEmprestimos.adicionarLivro(idEmprestimo, livro);
    }
        // atualiza datafim
    public void atualizarDataFim(String idEmprestimo, LocalDate novaDataFim) {
        bancoEmprestimos.atualizarDataFim(idEmprestimo, novaDataFim);
    }
    //atualiza dados dos clientes
    public void atualizarDadosCliente(String idEmprestimo, Cliente cliente) {
        bancoEmprestimos.atualizarCliente(idEmprestimo, cliente);
    }
    //exclui emprestimo
    public void excluirEmprestimo(String idEmprestimo) {
        bancoEmprestimos.deletar(LocalDate.parse(idEmprestimo));
    }
    // consulta fim do emprestimo
    public List<Emprestimo> consultarPorDataFim(LocalDate dataFim) {
        return bancoEmprestimos.findByDataFim(dataFim);
    }

    public void inserirNoBanco(Emprestimo emprestimo) {

    }

    public List<Emprestimo> pegartodosOsEmprestimos() {
        return consultarEmprestimos();
    }

    public void atualizarEmprestimo(Long id, Emprestimo emprestimo) {

    }

    public void removerEmprestimo(Long id) {

    }
}
