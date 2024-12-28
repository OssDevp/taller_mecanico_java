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

    @Column(name = "telefono", length = 25)
    private String telefono;

    @Column(name = "correo", length = 100)
    private String correo;

    @Lob
    @Column(name = "direccion")
    private String direccion;

    @Column(name = "cedula", nullable = false, length = 45)
    private String cedula;

    @OneToMany(mappedBy = "idCliente", cascade = CascadeType.ALL)
    private Set<FacturaEntity> facturas = new LinkedHashSet<>();

    @OneToMany(mappedBy = "idCliente", cascade = CascadeType.ALL)
    private Set<OrdenEntity> ordenes = new LinkedHashSet<>();

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private Set<VehiculoEntity> vehiculos = new LinkedHashSet<>();

}