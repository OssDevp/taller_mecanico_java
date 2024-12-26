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

    // Eliminar un cargo
    public void eliminarCargo(Long id) {
        CargoDAO cargoDAO = new CargoDAO();
        if (cargoDAO.obtenerPorId(id) == null) {
            throw new IllegalArgumentException("El cargo no existe");
        }
        cargoDAO.eliminar(id);
    }
}

