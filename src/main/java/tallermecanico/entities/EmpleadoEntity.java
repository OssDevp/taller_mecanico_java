package tallermecanico.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

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
    private CargoEntity cargo;

    @Lob
    @Column(name = "habilidades")
    private String habilidades;

    @OneToMany(mappedBy = "empleado")
    private List<OrdenEntity> ordenes = new ArrayList<>();

    @Column(name = "cedula", nullable = false, length = 45)
    private String cedula;

    public String getDescripcionCargo() {
        return cargo != null ? cargo.getDescripcion() : null;
    }

    @Override
    public String toString() {
        return "EmpleadoEntity{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", cargo=" + cargo.getDescripcion() +
                ", habilidades='" + habilidades + '\'' +
                ", cedula='" + cedula + '\'' +
                '}';
    }
}