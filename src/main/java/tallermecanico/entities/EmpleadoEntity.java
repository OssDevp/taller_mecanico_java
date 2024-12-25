package tallermecanico.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Empleados")
public class EmpleadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_empleado", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_cargo")
    private CargoEntity idCargo;

    @Lob
    @Column(name = "habilidades")
    private String habilidades;

    @OneToMany(mappedBy = "idEmpleado")
    private Set<OrdenEntity> ordenes = new LinkedHashSet<>();

    @Column(name = "cedula", nullable = false, length = 45)
    private String cedula;

}