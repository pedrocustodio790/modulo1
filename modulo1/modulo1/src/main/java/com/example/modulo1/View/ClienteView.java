package com.example.modulo1.View;

import com.example.modulo1.Controller.ClienteController;
import com.example.modulo1.Model.Cliente;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteView {
    private final ClienteController clienteController;

    @GetMapping
    public List<Cliente> getAllClientes() {
        // Chama o método que retorna todos os clientes do controlador
        return (List<Cliente>) (List<Cliente>) clienteController.pegartodosOsClientes();
    }

    @PostMapping
    public String postNovoCliente(@RequestBody Cliente cliente) {
        // Insere um novo cliente no banco de dados através do controlador
        clienteController.inserirNoBanco(cliente);
        return "Cliente registrado com sucesso!";
    }

    @PutMapping("/{id}")
    public String putCliente(@PathVariable Long id, @RequestBody Cliente cliente) {
        // Atualiza as informações do cliente existente no banco de dados
        clienteController.atualizarCliente(id, cliente);
        return "Cliente atualizado com sucesso!";
    }

    @DeleteMapping("/{id}")
    public String deleteCliente(@PathVariable Long id) {
        // Remove o cliente do banco de dados com base no ID fornecido
        clienteController.removerCliente(id);
        return "Cliente removido com sucesso!";
    }
}
