package com.example.modulo1.View;

import com.example.modulo1.Controller.EmprestimoController;
import com.example.modulo1.Model.Emprestimo;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emprestimos")
public class EmprestimoView {
    private final EmprestimoController emprestimoController;

    // Construtor que inicializa o controlador de empréstimos
    public EmprestimoView(EmprestimoController emprestimoController) {
        this.emprestimoController = emprestimoController;
    }

    @GetMapping
    public List<Emprestimo> getAllEmprestimos() {
        // Retorna a lista de todos os empréstimos
        return emprestimoController.pegartodosOsEmprestimos();
    }

    @PostMapping
    public String postNovoEmprestimo(@RequestBody Emprestimo emprestimo) {
        // Insere um novo empréstimo no banco de dados
        emprestimoController.inserirNoBanco(emprestimo);
        return "Empréstimo registrado com sucesso!";
    }

    @PutMapping("/{id}")
    public String putEmprestimo(@PathVariable Long id, @RequestBody Emprestimo emprestimo) {
        // Atualiza um empréstimo existente com base no ID fornecido
        emprestimoController.atualizarEmprestimo(id, emprestimo);
        return "Empréstimo atualizado com sucesso!";
    }

    @DeleteMapping("/{id}")
    public String deleteEmprestimo(@PathVariable Long id) {
        // Remove um empréstimo com base no ID fornecido
        emprestimoController.removerEmprestimo(id);
        return "Empréstimo removido com sucesso!";
    }
}
