package tallermecanico.controller;

import tallermecanico.DAO.EmpleadoDAO;
import tallermecanico.entities.EmpleadoEntity;

import java.util.List;

public class EmpleadoController {
    private EmpleadoDAO empleadoDAO;

    public EmpleadoController() {}

    // REGISTRAR EMPLEADO
    public void registrarEmpleado(EmpleadoEntity empleado) {
        empleadoDAO = new EmpleadoDAO();

        EmpleadoEntity empleadoExiste = empleadoDAO.obtenerPorCedula(empleado.getCedula());

        if (empleadoExiste != null) {
            try {
                actualizarEmpleado(empleado);
            } catch (Exception e) {
                throw new RuntimeException("Problema al editar empleado");
            }
        } else {
            try {
                empleadoDAO.guardar(empleado);
            } catch (Exception e) {
                throw new RuntimeException("Error al registrar empleado");
            }
        }

    }

    // OBTENER EMPLEADO
    public EmpleadoEntity obtenerEmpleado(String cedula) {
        empleadoDAO = new EmpleadoDAO();

        EmpleadoEntity empleado = empleadoDAO.obtenerPorCedula(cedula);
        if (empleado == null) {
            throw new RuntimeException("El empleado no se encuentra registrado");
        }

        return empleado;
    }

    // OBTENER EMPLEADOS
    public List<EmpleadoEntity> obtenerEmpleados() {
        empleadoDAO = new EmpleadoDAO();

        try {
            return empleadoDAO.obtenerTodos();
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener empleados");
        }
    }

    // ACTUALIZAR EMPLEADO
    public void actualizarEmpleado(EmpleadoEntity empleado) {
        empleadoDAO = new EmpleadoDAO();

        EmpleadoEntity empleadoExiste = empleadoDAO.obtenerPorCedula(empleado.getCedula());
        if (empleadoExiste == null) {
            throw new RuntimeException("El empleado no se encuentra registrado");
        }

        try {
            empleadoDAO.actualizar(empleado);
        } catch (Exception e) {
            throw new RuntimeException("Error al actualizar empleado");
        }
    }

    // ELIMINAR EMPlEADO
    public void eliminarEmpleado(String cedula) {
        empleadoDAO = new EmpleadoDAO();

        EmpleadoEntity empleadoExiste = empleadoDAO.obtenerPorCedula(cedula);
        if (empleadoExiste == null) {
            throw new RuntimeException("El empleado no se encuentra registrado");
        }

        try {
            empleadoDAO.eliminar(Long.valueOf(empleadoExiste.getId()));
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar empleado");
        }
    }
}
