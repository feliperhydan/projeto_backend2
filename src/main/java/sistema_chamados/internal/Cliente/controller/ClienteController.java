package sistema_chamados.internal.cliente.controller;

import sistema_chamados.internal.cliente.dto.CriarClienteRequest;
import sistema_chamados.internal.cliente.dto.CriarClienteResponse;
import sistema_chamados.internal.cliente.service.ClienteService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<CriarClienteResponse> criar(@Valid @RequestBody CriarClienteRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).
                body(this.clienteService.criarCliente(request));
    }
}
