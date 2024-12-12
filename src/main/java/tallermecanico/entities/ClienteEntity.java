package tallermecanico.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "Clientes")
public class ClienteEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_cliente", nullable = false)
    private Integer id;

    @Column(name = "nombre", nullable = false, length = 100)
    private String nombre;

    @Column(name = "telefono", length = 15)
    private String telefono;

    @Column(name = "correo", length = 100)
    private String correo;

    @Lob
    @Column(name = "direccion")
    private String direccion;

    @OneToMany(mappedBy = "idCliente")
    private Set<FacturaEntity> facturas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idCliente")
    private Set<OrdenEntity> ordenes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idCliente")
    private Set<VehiculoEntity> vehiculos = new LinkedHashSet<>();

}