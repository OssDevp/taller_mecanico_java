package tallermecanico;

 
import tallermecanico.DAO.ClienteDAO;
import tallermecanico.controller.ClienteController;
import tallermecanico.entities.ClienteEntity;
import tallermecanico.view.MenuView;

public class Main {
    public static void main(String[] args) {
        MenuView menu = new MenuView();
        menu.setVisible(true);
        menu.setLocationRelativeTo(null);
    }
}
