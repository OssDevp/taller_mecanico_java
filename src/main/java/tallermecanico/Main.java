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

//        ClienteEntity cliente = new ClienteEntity();
//        cliente.setCedula("123450");
//        cliente.setNombre("Javier");
//        cliente.setDireccion("Calle 1");
//        cliente.setTelefono("1234567890");
//        cliente.setCorreo("juan@correo.com");
//
//        ClienteController clienteController = new ClienteController();
//        clienteController.registrarCliente(cliente);
    }
}
