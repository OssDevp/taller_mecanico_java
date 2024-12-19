package tallermecanico.controller;

import tallermecanico.DAO.ClienteDAO;
import tallermecanico.view.ClienteView;

public class ClienteController {
    private ClienteView vista;
    private ClienteDAO clienteDAO;

    public ClienteController(ClienteView vista, ClienteDAO clienteDAO) {
        this.vista = vista;
        this.clienteDAO = clienteDAO;

        this.vista.addBtnGuardarListener(e -> guardar());
        this.vista.addBtnEliminarListener(e -> borrar());
        this.vista.addBtnBuscarListener(e -> buscarPorCedula());
        this.vista.addBtnNuevoListener(e -> nuevo());
    }

    public void guardar() {
        String nombre = vista.getNombre();
        String cedula = vista.getCedula();
        String telefono = vista.getTelefono();
        String correo = vista.getCorreo();
        String direccion = vista.getDireccion();

        if (nombre.isEmpty() || cedula.isEmpty() || telefono.isEmpty() || correo.isEmpty() || direccion.isEmpty()) {
            vista.mostrarMensajeError("Completar todos los campos");
        }
    }

    public void borrar() {

    }

    public void buscarPorCedula() {

    }

    public void nuevo() {
        vista.limpiarCampos();
    }


}
