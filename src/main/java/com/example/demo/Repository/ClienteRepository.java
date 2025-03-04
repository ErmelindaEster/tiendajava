package com.example.demo.Repository;


import com.example.demo.Models.Cliente; //crud del modelo cliente
import org.springframework.data.jpa.repository.jpaRepository; //libreria para hacer la conexion
import java.util.List;
//integer por el ID
public interface ClienteRepository extends JpaRepository<Cliente, Integer> {
//producto activo
List<com.example.demo.Models.Cliente>findByEstadotrue();
}
