package tallermecanico.controller;

import tallermecanico.DAO.OrdenDAO;
import tallermecanico.entities.OrdenEntity;

import java.util.List;

public class OrdenController {
    private OrdenDAO ordenDAO;

    public OrdenController() {}

    public void registrarOrden(OrdenEntity orden) {
        ordenDAO = new OrdenDAO();
        if (ordenDAO.obtenerPorId(Long.valueOf(orden.getId())) != null) {
            throw new RuntimeException("La orden ya se encuentra registrada");
        }
        try {
            ordenDAO.guardar(orden);
        } catch (Exception e) {
            throw new RuntimeException("Error al registrar orden");
        }
    }

    public List<OrdenEntity> obtenerOrden() {
        ordenDAO = new OrdenDAO();
        try {
            return ordenDAO.obtenerTodos();
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener ordens");
        }
    }

    public OrdenEntity obtenerOrden(String id) {
        ordenDAO = new OrdenDAO();
        OrdenEntity orden = ordenDAO.obtenerPorId(Long.valueOf(id));
        if (orden == null) {
            throw new RuntimeException("El orden no se encuentra registrado");
        }
        return orden;
    }

    public void actualizarOrden(OrdenEntity orden) {
        ordenDAO = new OrdenDAO();
        if (ordenDAO.obtenerPorId(Long.valueOf(orden.getId())) == null) {
            throw new RuntimeException("La orden no se encuentra registrada");
        }
        try {
            ordenDAO.actualizar(orden);
        } catch (Exception e) {
            throw new RuntimeException("Error al actualizar orden");
        }
    }

    public void eliminarOrden(String id) {
        ordenDAO = new OrdenDAO();
        if (ordenDAO.obtenerPorId(Long.valueOf(id)) == null) {
            throw new RuntimeException("La orden no se encuentra registrada");
        }
        try {
            ordenDAO.eliminar(Long.valueOf(id));
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar orden");
        }
    }
}
