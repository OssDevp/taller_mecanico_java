package tallermecanico.controller;

import tallermecanico.DAO.ServicioDAO;
import tallermecanico.entities.ServicioEntity;

import java.util.List;

public class ServicioController {
    private ServicioDAO servicioDAO;

    public ServicioController() {}

    public void registrarServicio(ServicioEntity servicio) {
        servicioDAO = new ServicioDAO();
        try {
            servicioDAO.guardar(servicio);
        } catch (Exception e) {
            throw new RuntimeException("Error al registrar servicio");
        }
    }

    public List<ServicioEntity> obtenerServicios() {
        servicioDAO = new ServicioDAO();
        try {
            return servicioDAO.obtenerTodos();
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener servicios");
        }
    }

    public ServicioEntity obtenerServicio(String id) {
        servicioDAO = new ServicioDAO();
        ServicioEntity servicio = servicioDAO.obtenerPorId(Long.valueOf(id));
        if (servicio == null) {
            throw new RuntimeException("El servicio no se encuentra registrado");
        }
        return servicio;
    }

    public void actualizarServicio(ServicioEntity servicio) {
        servicioDAO = new ServicioDAO();
        if (servicioDAO.obtenerPorId(Long.valueOf(servicio.getId())) == null) {
            throw new RuntimeException("El servicio no se encuentra registrado");
        }
        try {
            servicioDAO.actualizar(servicio);
        } catch (Exception e) {
            throw new RuntimeException("Error al actualizar servicio");
        }
    }

    public void eliminarServicio(String id) {
        servicioDAO = new ServicioDAO();
        if (servicioDAO.obtenerPorId(Long.valueOf(id)) == null) {
            throw new RuntimeException("La servicio no se encuentra registrada");
        }
        try {
            servicioDAO.eliminar(Long.valueOf(id));
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar servicio");
        }
    }
}
