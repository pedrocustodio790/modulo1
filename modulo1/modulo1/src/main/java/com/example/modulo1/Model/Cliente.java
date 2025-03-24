package com.example.modulo1.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Gera automaticamente os métodos getters, setters, toString, equals e hashCode
@NoArgsConstructor // Gera um construtor sem parâmetros
@AllArgsConstructor // Gera um construtor com todos os parâmetros
public class Cliente {
    private String id; // Identificador único do cliente
    private String nome; // Nome completo do cliente
    private String cpf; // CPF do cliente
    private String telefone; // Número de telefone do cliente
    private String email; // Endereço de e-mail do cliente
}
