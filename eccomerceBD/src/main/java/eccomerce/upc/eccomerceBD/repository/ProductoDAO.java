package eccomerce.upc.eccomerceBD.repository;


import eccomerce.upc.eccomerceBD.model.Producto;

import java.util.List;

public interface ProductoDAO {
    void create(Producto producto);
    Producto read(String id);
    void update(Producto producto);
    void delete(String id);
    List<Producto> listProductos();
}

