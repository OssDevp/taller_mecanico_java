package tallermecanico;


import tallermecanico.DAO.CargoDAO;
import tallermecanico.DAO.ClienteDAO;
import tallermecanico.DAO.ServicioDAO;
import tallermecanico.DAO.VehiculoDAO;
import tallermecanico.entities.CargoEntity;
import tallermecanico.entities.ClienteEntity;
import tallermecanico.entities.ServicioEntity;
import tallermecanico.entities.VehiculoEntity;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        ClienteEntity cliente = new ClienteEntity();
        cliente.setNombre("fabrizio");
        cliente.setTelefono("1234567890");
        cliente.setCorreo("juanperes@gmail.com");
        cliente.setDireccion("Calle 123, Colonia Ejemplo");



//        CargoEntity cargo = new CargoEntity();
//        cargo.setDescripcion("Mecanico");
//        cargo.setSueldo(new BigDecimal("1000000.00"));

//        CargoDAO cargoDAO = new CargoDAO();
//        cargoDAO.guardar(cargo);

//        ServicioEntity servicio = new ServicioEntity();
//        servicio.setNombre("servicio");
//        servicio.setDescripcion("servicio");
//        servicio.setCosto(new BigDecimal("23333.00"));
//
//        ServicioDAO servicioDAO = new ServicioDAO();
//        servicioDAO.guardar(servicio);


        ClienteDAO clienteDAO = new ClienteDAO();
        ClienteEntity cliente1 = clienteDAO.obtenerPorId(1L);

        VehiculoEntity vehiculo = new VehiculoEntity();
        vehiculo.setMarca("fjak");
        vehiculo.setModelo("Ford");
        vehiculo.setPlaca("Ford");
        vehiculo.setColor("kalf");
        vehiculo.setAnio(2012);
        vehiculo.setIdCliente(cliente1);

        VehiculoDAO vehiculoDAO = new VehiculoDAO();
        vehiculoDAO.guardar(vehiculo);
    }
}
