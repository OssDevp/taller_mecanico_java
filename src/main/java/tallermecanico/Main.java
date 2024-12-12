package tallermecanico;


import tallermecanico.DAO.CargoDAO;
import tallermecanico.DAO.ClienteDAO;
import tallermecanico.entities.CargoEntity;
import tallermecanico.entities.ClienteEntity;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        ClienteEntity cliente = new ClienteEntity();
        cliente.setNombre("Juan Perez");
        cliente.setTelefono("1234567890");
        cliente.setCorreo("juanperes@gmail.com");
        cliente.setDireccion("Calle 123, Colonia Ejemplo");

//        ClienteDAO clienteDAO = new ClienteDAO();
//        clienteDAO.guardar(cliente);

        CargoEntity cargo = new CargoEntity();
        cargo.setDescripcion("Mecanico");
        cargo.setSueldo(new BigDecimal("1000000.00"));

        CargoDAO cargoDAO = new CargoDAO();
        cargoDAO.guardar(cargo);

    }
}
