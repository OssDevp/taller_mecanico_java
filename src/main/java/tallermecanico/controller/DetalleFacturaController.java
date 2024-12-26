package tallermecanico.controller;

import tallermecanico.DAO.DetalleFacturaDAO;
import tallermecanico.entities.DetalleFacturaEntity;

import java.util.List;

public class DetalleFacturaController {
    private DetalleFacturaDAO detalleFacturaDAO;

    public DetalleFacturaController() {}

    public void registrarDetalle(DetalleFacturaEntity detalleFactura) {
        detalleFacturaDAO = new DetalleFacturaDAO();
        try {
            detalleFacturaDAO.guardar(detalleFactura);
        } catch (Exception e) {
            throw new RuntimeException("Error al registrar Factura");
        }
    }

    public List<DetalleFacturaEntity> obtenerDetalles() {
        detalleFacturaDAO = new DetalleFacturaDAO();
        try {
            return detalleFacturaDAO.obtenerTodos();
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener detalleFacturas");
        }
    }

    public DetalleFacturaEntity obtenerDetalle(String id) {
        detalleFacturaDAO = new DetalleFacturaDAO();
        DetalleFacturaEntity detalleFactura = detalleFacturaDAO.obtenerPorId(Long.valueOf(id));
        if (detalleFactura == null) {
            throw new RuntimeException("El detalle de factura no se encuentra registrado");
        }
        return detalleFactura;
    }

    public void actualizarDetalle(DetalleFacturaEntity detalleFactura) {
        detalleFacturaDAO = new DetalleFacturaDAO();
        if (detalleFacturaDAO.obtenerPorId(Long.valueOf(detalleFactura.getId())) == null) {
            throw new RuntimeException("El detalle de Factura no se encuentra registrado");
        }
        try {
            detalleFacturaDAO.actualizar(detalleFactura);
        } catch (Exception e) {
            throw new RuntimeException("Error al actualizar detalle de Factura");
        }
    }

    public void eliminarDetalle(String id) {
        detalleFacturaDAO = new DetalleFacturaDAO();
        if (detalleFacturaDAO.obtenerPorId(Long.valueOf(id)) == null) {
            throw new RuntimeException("El detalle de Factura no se encuentra registrado");
        }
        try {
            detalleFacturaDAO.eliminar(Long.valueOf(id));
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar detalle de Factura");
        }
    }
}
