package tallermecanico.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.math.BigDecimal;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Cargos")
public class CargoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cargo", nullable = false)
    private Integer id;

    @Column(name = "descripcion", nullable = false, length = 100)
    private String descripcion;

    @Column(name = "sueldo", precision = 10, scale = 2)
    private BigDecimal sueldo;

    @OneToMany(mappedBy = "cargo", cascade = CascadeType.ALL) // Cambiado "idCargo" a "cargo"
    private Set<EmpleadoEntity> empleados = new LinkedHashSet<>();

}