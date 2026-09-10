package sistema_chamados.internal.Cliente.controller;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sistema_chamados.internal.Cliente.dto.ClienteRequest;
import sistema_chamados.internal.Cliente.entity.ClienteEntity;
import sistema_chamados.internal.Cliente.service.ClienteService;

@RestController
@RequestMapping("/clientes")
@RequiredArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @PostMapping
    public ResponseEntity<ClienteEntity> cadastrar(
            @Valid @RequestBody ClienteRequest request
    ) {

        ClienteEntity cliente = clienteService.cadastrar(request);

        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body(cliente);
    }
}