package tallermecanico;

 
import tallermecanico.DAO.CargoDAO;
import tallermecanico.DAO.ClienteDAO;
import tallermecanico.DAO.EmpleadoDAO;
import tallermecanico.controller.ClienteController;
import tallermecanico.controller.ServicioController;
import tallermecanico.entities.*;
import tallermecanico.controller.DetalleFacturaController;
import tallermecanico.view.MenuView;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//        MenuView menu = new MenuView();
//        menu.setVisible(true);
//        menu.setLocationRelativeTo(null);

        // agregar servicio entity
        ServicioEntity servicio = new ServicioEntity();
//        servicio.setNombre("Cambio de aceite");
//        servicio.setDescripcion("Cambio de aceite y filtro");
//        servicio.setCosto(new BigDecimal(100));
        ServicioController servicioController = new ServicioController();
//        servicioController.registrarServicio(servicio);

        // eliminar servicio
//        servicioController.eliminarServicio("1");

        // actualizar servicio
        servicio.setId(2);
        servicio.setNombre("Cambio de rueda");
        servicio.setDescripcion("Cambio de rueda pinchada");
        servicio.setCosto(new BigDecimal(30000));
        servicioController.actualizarServicio(servicio);


    }
}
