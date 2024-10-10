package eccomerce.upc.eccomerceBD.repository;

import eccomerce.upc.eccomerceBD.model.Producto;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class OracleProductoDAO implements ProductoDAO {
    private Map<String, Producto> productos = new HashMap<>();

    @Override
    public void create(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public Producto read(String id) {
        return productos.get(id);
    }

    @Override
    public void update(Producto producto) {
        productos.put(producto.getId(), producto);
    }

    @Override
    public void delete(String id) {
        productos.remove(id);
    }

    @Override
    public List<Producto> listProductos() {
        return productos.values().stream().collect(Collectors.toList());
    }
}
