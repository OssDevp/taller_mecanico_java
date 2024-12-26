package tallermecanico;

 
import tallermecanico.DAO.CargoDAO;
import tallermecanico.DAO.ClienteDAO;
import tallermecanico.DAO.EmpleadoDAO;
import tallermecanico.controller.ClienteController;
import tallermecanico.entities.CargoEntity;
import tallermecanico.entities.ClienteEntity;
import tallermecanico.entities.EmpleadoEntity;
import tallermecanico.view.MenuView;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        MenuView menu = new MenuView();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);

//        CargoEntity cargo = new CargoEntity();
//        cargo.setDescripcion("Mecanico");
//        cargo.setSueldo(new BigDecimal(1000));

//        CargoDAO cargoDAO = new CargoDAO();
//        cargo = cargoDAO.obtenerPorDescripcion("Mecanico");
//
//        EmpleadoEntity empleado = new EmpleadoEntity();
//
//        EmpleadoDAO empleadoDAO = new EmpleadoDAO();
//        empleado = empleadoDAO.obtenerPorCedula("16789");
//        System.out.println(empleado.toString());


    }
}
