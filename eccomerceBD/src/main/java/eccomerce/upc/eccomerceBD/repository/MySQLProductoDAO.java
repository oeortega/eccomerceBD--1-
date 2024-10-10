package eccomerce.upc.eccomerceBD.repository;


import eccomerce.upc.eccomerceBD.model.Producto;

import java.util.ArrayList;
import java.util.List;

public class MySQLProductoDAO implements ProductoDAO {
    private List<Producto> productos = new ArrayList<>();

    @Override
    public void create(Producto producto) {
        productos.add(producto);
    }

    @Override
    public Producto read(String id) {
        return productos.stream().filter(p -> p.getId().equals(id)).findFirst().orElse(null);
    }

    @Override
    public void update(Producto producto) {
        Producto prodExistente = read(producto.getId());
        if (prodExistente != null) {
            prodExistente.setDescripcion(producto.getDescripcion());
            prodExistente.setPrecio(producto.getPrecio());
        }
    }

    @Override
    public void delete(String id) {
        productos.removeIf(p -> p.getId().equals(id));
    }

    @Override
    public List<Producto> listProductos() {
        return productos;
    }
}

