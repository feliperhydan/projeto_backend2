package sistema_chamados.internal.cliente.dto;

public record CriarClienteRequest
        (String nome,
         String cpf,
         String email) {
}