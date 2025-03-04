package com.example.Service;

import com.example.demo.Models.Producto; 
import com.example.demo.Repository.ProductoRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class ProductoService {
    @Autowired
    private ProductoRepository ProductoRepository;
    public List<Producto> TraeTodosLosProductos() {

    }
    
    //Obtener un producto por su ID
    public Producto TraeUnProductoPorId(Integer id){
        if (id==null) {
           throw new IllegalArgumentException(si:"El ID no puede ser nulo.");
        }
        return ProductoRepository.findById(id).orElse(null);
    }
}
