package tallermecanico.controller;

import tallermecanico.DAO.ClienteDAO;
import tallermecanico.entities.ClienteEntity;
import tallermecanico.view.ClienteView;

public class ClienteController {
    private ClienteDAO clienteDAO;
    ClienteEntity cliente;

    public ClienteController() {

    }

    public String guardar(String nombre, String telefono, String direccion, String correo, String cedula) {
        clienteDAO = new ClienteDAO();
        cliente = new ClienteEntity();

        cliente.setNombre(nombre);
        cliente.setTelefono(telefono);
        cliente.setDireccion(direccion);
        cliente.setCorreo(correo);
        cliente.setCedula(cedula);

        if (!ExisteCliente(cliente.getCedula())) {
            throw new IllegalArgumentException("El cliente ya existe");
        }
        try {
            clienteDAO.guardar(cliente);
            return "Cliente guardado";
        } catch (Exception e) {
            throw new RuntimeException("Error al guardar el cliente");
        }
    }

    public void borrar() {

    }

    public ClienteEntity buscarPorCedula(String cedula) {
        if (!ExisteCliente(cedula)) {
            throw new IllegalArgumentException("El cliente no existe");
        }
        clienteDAO = new ClienteDAO();
        cliente = clienteDAO.obtenerPorCedula(cedula);
        return cliente;
    }

    public void nuevo() {
    }

    public boolean ExisteCliente(String cedula) {
        clienteDAO = new ClienteDAO();
        cliente = clienteDAO.obtenerPorCedula(cedula);
        return cliente != null;
    }

}
