package sistema_chamados.internal.Cliente.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sistema_chamados.internal.Cliente.entity.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity, Long> {

    boolean existsByCpf(String cpf);

    boolean existsByEmail(String email);
}