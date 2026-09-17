package sistema_chamados.internal.cliente.mapper;

import sistema_chamados.internal.cliente.dto.CriarClienteRequest;
import sistema_chamados.internal.cliente.dto.CriarClienteResponse;
import sistema_chamados.internal.cliente.entity.ClienteEntity;

public final class ClienteMapper {
    public ClienteMapper(){
    }
    public static ClienteEntity converteParaEntidade( CriarClienteRequest request){
        return new ClienteEntity(
                request.nome(),
                request.cpf(),
                request.email()
        );
    }
    public static CriarClienteResponse converterParaReposta( ClienteEntity cliente){
        return new CriarClienteResponse(
                cliente.getNome(),
                cliente.getEmail()
        );
    }
}
