package sistema_chamados.internal.cliente.service;

import jakarta.transaction.Transactional;
import sistema_chamados.internal.cliente.dto.CriarClienteRequest;
import sistema_chamados.internal.cliente.dto.CriarClienteResponse;
import sistema_chamados.internal.cliente.entity.ClienteEntity;
import sistema_chamados.internal.cliente.mapper.ClienteMapper;
import sistema_chamados.internal.cliente.repository.ClienteRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class ClienteService {

    private final ClienteRepository clienteRepository;
    @Transactional
    public CriarClienteResponse criarCliente(CriarClienteRequest request) {
        ClienteEntity clienteEntity = ClienteMapper.converteParaEntidade(request);
        clienteRepository.save(clienteEntity);
        return ClienteMapper.converterParaReposta(clienteEntity);
    }
}
