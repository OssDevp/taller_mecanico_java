package tallermecanico.controller;

import tallermecanico.DAO.CargoDAO;
import tallermecanico.entities.CargoEntity;

import java.util.List;

public class CargoController {

    public CargoController() {}

    // Guardar un cargo y agregar lazy loading con empleado
    public void guardarCargo(CargoEntity cargo) {
        CargoDAO cargoDAO = new CargoDAO();
        cargoDAO.guardar(cargo);
    }

    // Obtener un cargo por su descripcion
    public CargoEntity obtenerCargo(String descripcion) {
        CargoDAO cargoDAO = new CargoDAO();
        return cargoDAO.obtenerPorDescripcion(descripcion);
    }

    // obtener todos los cargos
    public List<CargoEntity> obtenerTodos() {
        CargoDAO cargoDAO = new CargoDAO();
        return cargoDAO.obtenerTodos();
    }

    // Actualizar un cargo
    public void actualizarCargo(CargoEntity cargo) {
        CargoDAO cargoDAO = new CargoDAO();
        if (cargoDAO.obtenerPorId(Long.valueOf(cargo.getId())) == null) {
            throw new IllegalArgumentException("El cargo no existe");
        }
        cargoDAO.guardar(cargo);
    }

    // Eliminar un cargo
    public void eliminarCargo(String descripcion) {
        CargoDAO cargoDAO = new CargoDAO();
        try {
            CargoEntity cargo = cargoDAO.obtenerPorDescripcion(descripcion);
            if (cargo == null) {
                throw new IllegalArgumentException("El cargo no existe");
            }
            cargoDAO.eliminar(Long.valueOf(cargo.getId()));
        } catch (Exception e) {
            throw new IllegalArgumentException("El cargo no existe");
        }

    }
}

