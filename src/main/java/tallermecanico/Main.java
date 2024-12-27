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
        MenuView menu = new MenuView();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);

    }
}
