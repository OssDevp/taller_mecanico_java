package tallermecanico.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
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

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<FacturaEntity> facturas = new ArrayList<>();

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<OrdenEntity> ordenes = new ArrayList<>();

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<VehiculoEntity> vehiculos = new ArrayList<>();

}