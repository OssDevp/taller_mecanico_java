package tallermecanico.controller;

import tallermecanico.DAO.ProveedorDAO;
import tallermecanico.entities.ProveedorEntity;

import java.util.List;

public class ProveedorController {
    private ProveedorDAO proveedorDAO;

    public ProveedorController() {}

    public void registrarProveedor(ProveedorEntity proveedor) {
        proveedorDAO = new ProveedorDAO();
        try {
            proveedorDAO.guardar(proveedor);
        } catch (Exception e) {
            throw new RuntimeException("Error al registrar proveedor");
        }
    }

    public List<ProveedorEntity> obtenerProveedores() {
        proveedorDAO = new ProveedorDAO();
        try {
            return proveedorDAO.obtenerTodos();
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener proveedores");
        }
    }

    public ProveedorEntity obtenerProveedor(String id) {
        proveedorDAO = new ProveedorDAO();
        ProveedorEntity proveedor = proveedorDAO.obtenerPorId(Long.valueOf(id));
        if (proveedor == null) {
            throw new RuntimeException("El proveedor no se encuentra registrado");
        }
        return proveedor;
    }

    public void actualizarProveedor(ProveedorEntity proveedor) {
        proveedorDAO = new ProveedorDAO();
        if (proveedorDAO.obtenerPorId(Long.valueOf(proveedor.getId())) == null) {
            throw new RuntimeException("La proveedor no se encuentra registrada");
        }
        try {
            proveedorDAO.actualizar(proveedor);
        } catch (Exception e) {
            throw new RuntimeException("Error al actualizar proveedor");
        }
    }

    public void eliminarProveedor(String id) {
        proveedorDAO = new ProveedorDAO();
        if (proveedorDAO.obtenerPorId(Long.valueOf(id)) == null) {
            throw new RuntimeException("La proveedor no se encuentra registrada");
        }
        try {
            proveedorDAO.eliminar(Long.valueOf(id));
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar proveedor");
        }
    }
}
