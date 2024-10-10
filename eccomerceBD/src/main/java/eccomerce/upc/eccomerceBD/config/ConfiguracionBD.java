package eccomerce.upc.eccomerceBD.config;

import eccomerce.upc.eccomerceBD.repository.MySQLProductoDAO;
import eccomerce.upc.eccomerceBD.repository.OracleProductoDAO;
import eccomerce.upc.eccomerceBD.repository.ProductoDAO;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionBD {

    @Bean
    public ProductoDAO productoDAO() {
        String motorBD = "MySQL"; // Cambiar a "Oracle" según la necesidad

        if (motorBD.equals("MySQL")) {
            return new MySQLProductoDAO();
        } else if (motorBD.equals("Oracle")) {
            return new OracleProductoDAO();
        }

        return null;
    }
}

