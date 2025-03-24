package com.example.modulo1.View;

import com.example.modulo1.Controller.LivroController;
import com.example.modulo1.Model.Livro;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livros")
public class LivroView {
    private final LivroController livroController; // construtor de de classe livroview

    public LivroView(LivroController livroController) {
        this.livroController = livroController; // inicializa o controlador de livros
    }

    @GetMapping
    public List<Livro> getAllLivros() {
        return livroController.pegartodosOsLivros(); // retorna a lista de todos os livros
    }

    @PostMapping
    public String postNovoLivro(@RequestBody Livro livro) {
        livroController.inserirNoBanco(livro); // insere um novo livro no banco de dados
        return "Livro registrado com sucesso!"; // mensagem de sucesso
    }

    @PutMapping("/{id}")
    public String putLivro(@PathVariable Long id, @RequestBody Livro livro) {
        livroController.atualizarLivro(id, livro); // atualiza o livro existente no banco de dados
        return "Livro atualizado com sucesso!"; // mensagem de sucesso
    }

    @DeleteMapping("/{id}")
    public String deleteLivro(@PathVariable Long id) {
        livroController.removerLivro(id); // remove o livro do banco de dados
        return "Livro removido com sucesso!"; // mensagem de sucesso
    }
}
