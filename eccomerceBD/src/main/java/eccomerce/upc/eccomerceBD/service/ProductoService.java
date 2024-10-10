package eccomerce.upc.eccomerceBD.service;

import eccomerce.upc.eccomerceBD.model.Producto;
import eccomerce.upc.eccomerceBD.repository.ProductoDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ProductoService {

    @Autowired
    private ProductoDAO productoDAO;

    public List<Producto> obtenerTodosLosProductos() {
        return productoDAO.listProductos();
    }

    public Producto obtenerProductoPorId(String id) {
        return productoDAO.read(id);
    }

    public void guardarProducto(Producto producto) {
        productoDAO.create(producto);
    }

    public void eliminarProducto(String id) {
        productoDAO.delete(id);
    }
}
