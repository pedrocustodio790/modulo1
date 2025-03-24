package com.example.modulo1.Banco;

import com.example.modulo1.Model.Cliente;

import java.util.ArrayList;
import java.util.List;

public class BancoCliente {
    private final List<Cliente> clientes;

    public BancoCliente() {
        this.clientes = new ArrayList<>();
    }

    public void inserir(Cliente cliente) {
        // Adiciona um novo cliente à lista de clientes
        clientes.add(cliente);
    }

    public Cliente encontrarPorCpf(String cpf) {
        // Filtra a lista de clientes para encontrar um cliente pelo CPF
        return clientes.stream()
                .filter(cliente -> cliente.getCpf().equals(cpf))
                .findFirst()
                .orElse(null);
    }

    public List<Cliente> encontrarTodos() {
        // Retorna uma nova lista contendo todos os clientes
        return new ArrayList<>(clientes);
    }

    public boolean atualizar(Long id, Cliente cliente) {
        // Atualiza um cliente existente na lista com base no CPF
        for (int i = 0; i < clientes.size(); i++) {
            if (clientes.get(i).getCpf().equals(cliente.getCpf())) {
                clientes.set(i, cliente);
                return true;
            }
        }
        return false;
    }

    public boolean deletar(String cpf) {
        // Remove um cliente da lista com base no CPF
        return clientes.removeIf(cliente -> cliente.getCpf().equals(cpf));
    }

    public List<Cliente> findAll() {
        // Retorna uma nova lista contendo todos os clientes
        return new ArrayList<>(clientes);
    }

    public void remover(Long id) {
        // Implementar lógica de remoção se necessário
    }
}
