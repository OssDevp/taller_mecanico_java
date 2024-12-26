package tallermecanico.controller;

import tallermecanico.DAO.ClienteDAO;
import tallermecanico.entities.ClienteEntity;
import tallermecanico.view.ClienteView;

import java.util.List;

public class ClienteController {
    private ClienteDAO clienteDAO;

    public ClienteController() {}

    public void registrarCliente(ClienteEntity cliente) {
        clienteDAO = new ClienteDAO();
        if (clienteDAO.obtenerPorCedula(cliente.getCedula()) != null) {
            throw new RuntimeException("El cliente ya se encuentra registrado");
        }
        try {
            clienteDAO.guardar(cliente);
        } catch (Exception e) {
            throw new RuntimeException("Error al registrar cliente");
        }
    }

    public List<ClienteEntity> obtenerClientes() {
        clienteDAO = new ClienteDAO();
        try {
            return clienteDAO.obtenerTodos();
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener clientes");
        }
    }

    public ClienteEntity obtenerCliente(String cedula) {
        clienteDAO = new ClienteDAO();
        ClienteEntity cliente = clienteDAO.obtenerPorCedula(cedula);
        if (cliente == null) {
            throw new RuntimeException("El cliente no se encuentra registrado");
        }
        return cliente;
    }

    public void actualizarCliente(ClienteEntity cliente) {
        clienteDAO = new ClienteDAO();
        if (clienteDAO.obtenerPorCedula(cliente.getCedula()) == null) {
            throw new RuntimeException("El cliente no se encuentra registrado");
        }
        try {
            clienteDAO.actualizar(cliente);
        } catch (Exception e) {
            throw new RuntimeException("Error al actualizar cliente");
        }
    }

    public void eliminarCliente(String cedula) {
        clienteDAO = new ClienteDAO();
        if (clienteDAO.obtenerPorCedula(cedula) == null) {
            throw new RuntimeException("El cliente no se encuentra registrado");
        }
        try {
            clienteDAO.eliminar(Long.valueOf(cedula));
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar cliente");
        }
    }
}
