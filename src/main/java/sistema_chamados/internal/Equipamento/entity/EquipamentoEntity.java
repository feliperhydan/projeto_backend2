package sistema_chamados.internal.Equipamento.entity;

import lombok.*;
import sistema_chamados.internal.Cliente.entity.ClienteEntity;
import jakarta.persistence.*;

@Entity
@Table(name = "equipamentos")
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class EquipamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String tipo;

    @Column(nullable = false, length = 50)
    private String marca;

    @Column(nullable = false, length = 50)
    private String modelo;

    @Column(nullable = false, unique = true, length = 150)
    private String numeroSerie;

    @ManyToOne
    @JoinColumn(name = "cliente_id", nullable = false)
    private ClienteEntity clienteEntity;

    public EquipamentoEntity(String tipo, String marca, String modelo, String numeroSerie) {
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.numeroSerie = numeroSerie;
    }

    public void alterarModelo(String modelo){
        this.modelo = modelo;
    }
    public void alterarMarca(String marca){
        this.marca = marca;
    }
    public void alterarTipo(String tipo){
        this.tipo = tipo;
    }
}