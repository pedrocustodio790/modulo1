package com.example.modulo1.Controller;

import com.example.modulo1.Banco.BancoCliente;
import com.example.modulo1.Model.Cliente;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    private final BancoCliente bancoCliente;

    // Construtor que inicializa o BancoCliente
    public ClienteController(BancoCliente bancoCliente) {
        this.bancoCliente = bancoCliente;
    }

    @PostMapping
    public String inserirCliente(@RequestBody Cliente cliente) {
        bancoCliente.inserir(cliente); // Insere o cliente no banco de dados
        return "Cliente registrado com sucesso!";
    }

    @GetMapping
    public List<Cliente> listarTodosOsClientes() {
        return bancoCliente.findAll(); // Retorna a lista de todos os clientes
    }

    @PutMapping("/{id}")
    public String atualizarCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        bancoCliente.atualizar(id, cliente); // Atualiza os dados do cliente no banco
        return "Cliente atualizado com sucesso!";
    }

    @DeleteMapping("/{id}")
    public String removerCliente(@PathVariable Long id) {
        bancoCliente.remover(id); // Remove o cliente do banco de dados
        return "Cliente removido com sucesso!";
    }

    public BancoCliente pegartodosOsClientes() {
        return bancoCliente; // Retorna a instância do BancoCliente
    }

    public void inserirNoBanco(Cliente cliente) {
        // Método vazio para inserir cliente no banco
    }
}
