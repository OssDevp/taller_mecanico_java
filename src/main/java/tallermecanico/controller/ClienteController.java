package tallermecanico.controller;

import tallermecanico.DAO.ClienteDAO;
import tallermecanico.entities.ClienteEntity;

import java.util.List;

public class ClienteController {
    private ClienteDAO clienteDAO;

    public ClienteController(){}

    public void registrarCliente(ClienteEntity cliente) {
        clienteDAO = new ClienteDAO();
        if (clienteDAO.obtenerPorCedula(cliente.getCedula()) != null) {
            throw new RuntimeException("Ya existe un cliente con la cédula ingresada");
        }
        try {
            clienteDAO.guardar(cliente);
        } catch (Exception e) {
            throw new RuntimeException("Error al guardar el cliente", e);
        }
    }

    public ClienteEntity obtenerClientePorCedula(String cedula) {
        try {
            clienteDAO = new ClienteDAO();
            return clienteDAO.obtenerPorCedula(cedula);
        } catch (Exception e) {
            return null;
        }
    }

    public List<ClienteEntity> obtenerTodosLosClientes() {
        try {
            clienteDAO = new ClienteDAO();
            return clienteDAO.obtenerTodos();
        } catch (Exception e) {
            return null;
        }
    }

    public void EliminarCliente(ClienteEntity cliente) {
        if (clienteDAO.obtenerPorCedula(cliente.getCedula()) == null) {
            throw new RuntimeException("Ya existe un cliente con la cédula ingresada");
        }
        try {
            clienteDAO = new ClienteDAO();
            clienteDAO.eliminar(cliente.getId().longValue());
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar el cliente", e);
        }
    }
}
