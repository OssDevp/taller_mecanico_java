package tallermecanico.controller;

import tallermecanico.DAO.ProductoDAO;
import tallermecanico.entities.ProductoEntity;

import java.util.List;

public class ProductoController {
    private ProductoDAO productoDAO;

    public ProductoController() {}

    public void registrarProducto(ProductoEntity producto) {
        productoDAO = new ProductoDAO();
        try {
            productoDAO.guardar(producto);
        } catch (Exception e) {
            throw new RuntimeException("Error al registrar producto");
        }
    }

    public List<ProductoEntity> obtenerProductos() {
        productoDAO = new ProductoDAO();
        try {
            return productoDAO.obtenerTodos();
        } catch (Exception e) {
            throw new RuntimeException("Error al obtener productos");
        }
    }

    public ProductoEntity obtenerProducto(String id) {
        productoDAO = new ProductoDAO();
        ProductoEntity producto = productoDAO.obtenerPorId(Long.valueOf(id));
        if (producto == null) {
            throw new RuntimeException("El producto no se encuentra registrado");
        }
        return producto;
    }

    public void actualizarProducto(ProductoEntity producto) {
        productoDAO = new ProductoDAO();
        if (productoDAO.obtenerPorId(Long.valueOf(producto.getId())) == null) {
            throw new RuntimeException("La producto no se encuentra registrada");
        }
        try {
            productoDAO.actualizar(producto);
        } catch (Exception e) {
            throw new RuntimeException("Error al actualizar producto");
        }
    }

    public void eliminarProducto(String id) {
        productoDAO = new ProductoDAO();
        if (productoDAO.obtenerPorId(Long.valueOf(id)) == null) {
            throw new RuntimeException("La producto no se encuentra registrada");
        }
        try {
            productoDAO.eliminar(Long.valueOf(id));
        } catch (Exception e) {
            throw new RuntimeException("Error al eliminar producto");
        }
    }
}
