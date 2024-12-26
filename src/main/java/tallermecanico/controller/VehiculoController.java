package tallermecanico.controller;

import tallermecanico.DAO.VehiculoDAO;
import tallermecanico.entities.VehiculoEntity;

import java.util.List;

public class VehiculoController {
    private VehiculoDAO vehiculoDAO;

    public VehiculoController() {}

    public void registrarVehiculo(VehiculoEntity vehiculo) {
        vehiculoDAO = new VehiculoDAO();
        if (vehiculoDAO.obtenerPorPlaca(vehiculo.getPlaca()) != null) {
            throw new RuntimeException("El vehiculo ya se encuentra registrado");
        }
        try {
            vehiculoDAO.guardar(vehiculo);
        } catch (Exception e) {
            throw new RuntimeException("Error al registrar vehiculo");
        }
    }

    public List<VehiculoEntity> obtenerVehiculos() {
        vehiculoDAO = new VehiculoDAO();
        try {
            return vehiculoDAO.obtenerTodos();
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener vehiculos");
        }
    }

    public VehiculoEntity obtenerVehiculo(String placa) {
        vehiculoDAO = new VehiculoDAO();
        VehiculoEntity vehiculo = vehiculoDAO.obtenerPorPlaca(placa);
        if (vehiculo == null) {
            throw new RuntimeException("El vehiculo no se encuentra registrado");
        }
        return vehiculo;
    }

    public void actualizarVehiculo(VehiculoEntity vehiculo) {
        vehiculoDAO = new VehiculoDAO();
        if (vehiculoDAO.obtenerPorPlaca(vehiculo.getPlaca()) == null) {
            throw new RuntimeException("El vehiculo no se encuentra registrado");
        }
        try {
            vehiculoDAO.actualizar(vehiculo);
        } catch (Exception e) {
            throw new RuntimeException("Error al actualizar vehiculo");
        }
    }

    public void eliminarVehiculo(String placa) {
        vehiculoDAO = new VehiculoDAO();
        if (vehiculoDAO.obtenerPorPlaca(placa) == null) {
            throw new RuntimeException("El vehiculo no se encuentra registrado");
        }
        try {
            vehiculoDAO.eliminarPorPlaca(placa);
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar vehiculo");
        }
    }
}
