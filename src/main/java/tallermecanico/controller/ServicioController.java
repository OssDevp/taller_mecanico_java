package tallermecanico.controller;

import tallermecanico.DAO.ServicioDAO;
import tallermecanico.entities.ServicioEntity;

import java.util.List;

public class ServicioController {
    private ServicioDAO servicioDAO;

    public ServicioController() {}

    public void guardarServicio(ServicioEntity servicio) {

        servicioDAO = new ServicioDAO();

        try {
            if (servicioDAO.obtenerPorId(servicio.getId()) != null) {
                servicioDAO.actualizar(servicio);
            } else {
                servicioDAO.guardar(servicio);
            }
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
        ServicioEntity servicio = servicioDAO.obtenerPorId(Integer.valueOf(id));
        if (servicio == null) {
            throw new RuntimeException("El servicio no se encuentra registrado");
        }
        return servicio;
    }

    public ServicioEntity obtenerServicioPorNombre(String nombre) {
        servicioDAO = new ServicioDAO();
        ServicioEntity servicio = servicioDAO.obtenerPorNombre(nombre);
        if (servicio == null) {
            throw new RuntimeException("El servicio no se encuentra registrado");
        }
        return servicio;
    }

    public void eliminarServicio(String id) {
        servicioDAO = new ServicioDAO();
        if (servicioDAO.obtenerPorId(Integer.valueOf(id)) == null) {
            throw new RuntimeException("La servicio no se encuentra registrada");
        }
        try {
            servicioDAO.eliminar(Integer.valueOf(id));
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar servicio");
        }
    }
}
