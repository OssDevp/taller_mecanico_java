package tallermecanico.controller;

import tallermecanico.DAO.ClienteDAO;
import tallermecanico.view.ClienteView;

public class ClienteController {
    private ClienteView vista;
    private ClienteDAO clienteDAO;

    public ClienteController(ClienteView vista, ClienteDAO clienteDAO) {
        this.vista = vista;
        this.clienteDAO = clienteDAO;


    }

    public void guardar() {
    }

    public void borrar() {

    }

    public void buscarPorCedula() {

    }

    public void nuevo() {
    }


}
