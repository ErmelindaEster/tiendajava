package com.example.demo.Repository;


import com.example.demo.Models.Producto; //crud del modelo Producto
import org.springframework.data.jpa.repository.JpaRepository; //libreria para hacer la conexion
import java.util.List;
//integer por el ID
public interface ProductoRepository extends JpaRepository <Producto, Integer> {
   //producto activo
   List<com.example.demo.Models.Producto>findByEstadotrue();   
}

