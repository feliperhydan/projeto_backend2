package sistema_chamados.internal.Cliente.service;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import sistema_chamados.internal.Cliente.dto.ClienteRequest;
import sistema_chamados.internal.Cliente.entity.ClienteEntity;
import sistema_chamados.internal.Cliente.repository.ClienteRepository;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;

    public ClienteEntity cadastrar(ClienteRequest request) {

        if (clienteRepository.existsByCpf(request.cpf())) {
            throw new IllegalArgumentException("CPF já cadastrado");
        }

        if (clienteRepository.existsByEmail(request.email())) {
            throw new IllegalArgumentException("Email já cadastrado");
        }

        ClienteEntity cliente = new ClienteEntity(
                request.nome(),
                request.cpf(),
                request.email()
        );

        return clienteRepository.save(cliente);
    }
}