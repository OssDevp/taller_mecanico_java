package tallermecanico.controller;

import tallermecanico.DAO.FacturaDAO;
import tallermecanico.entities.FacturaEntity;

import java.util.List;

public class FacturaController {
    private FacturaDAO facturaDAO;

    public FacturaController() {}

    public void registrarFactura(FacturaEntity factura) {
        facturaDAO = new FacturaDAO();
        if (facturaDAO.obtenerPorId(Long.valueOf(factura.getId())) != null) {
            throw new RuntimeException("La factura ya se encuentra registrada");
        }
        try {
            facturaDAO.guardar(factura);
        } catch (Exception e) {
            throw new RuntimeException("Error al registrar factura");
        }
    }

    public List<FacturaEntity> obtenerFacturas() {
        facturaDAO = new FacturaDAO();
        try {
            return facturaDAO.obtenerTodos();
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener facturas");
        }
    }

    public FacturaEntity obtenerFactura(String id) {
        facturaDAO = new FacturaDAO();
        FacturaEntity factura = facturaDAO.obtenerPorId(Long.valueOf(id));
        if (factura == null) {
            throw new RuntimeException("El factura no se encuentra registrado");
        }
        return factura;
    }

    public void actualizarFactura(FacturaEntity factura) {
        facturaDAO = new FacturaDAO();
        if (facturaDAO.obtenerPorId(Long.valueOf(factura.getId())) == null) {
            throw new RuntimeException("La factura no se encuentra registrada");
        }
        try {
            facturaDAO.actualizar(factura);
        } catch (Exception e) {
            throw new RuntimeException("Error al actualizar factura");
        }
    }

    public void eliminarFactura(String id) {
        facturaDAO = new FacturaDAO();
        if (facturaDAO.obtenerPorId(Long.valueOf(id)) == null) {
            throw new RuntimeException("La factura no se encuentra registrada");
        }
        try {
            facturaDAO.eliminar(Long.valueOf(id));
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar factura");
        }
    }
}
