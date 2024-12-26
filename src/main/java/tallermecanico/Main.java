package tallermecanico;

 
import tallermecanico.DAO.CargoDAO;
import tallermecanico.DAO.ClienteDAO;
import tallermecanico.DAO.EmpleadoDAO;
import tallermecanico.controller.ClienteController;
import tallermecanico.entities.CargoEntity;
import tallermecanico.entities.ClienteEntity;
import tallermecanico.entities.EmpleadoEntity;
import tallermecanico.controller.DetalleFacturaController;
import tallermecanico.entities.DetalleFacturaEntity;
import tallermecanico.entities.FacturaEntity;
import tallermecanico.view.MenuView;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
//        MenuView menu = new MenuView();
//        menu.setVisible(true);
//        menu.setLocationRelativeTo(null);

        DetalleFacturaController detalleController = new DetalleFacturaController();
        DetalleFacturaEntity detalle = new DetalleFacturaEntity();
        FacturaEntity factura = new FacturaEntity();
        factura.

        detalle.setCantidad(2);
        detalle.setSubtotal(new BigDecimal(1000));

        System.out.println(detalle);


    }
}
