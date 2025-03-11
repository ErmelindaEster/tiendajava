package com.example.demo.Service;

import com.example.demo.Models.Producto; 
import com.example.demo.Repository.ProductoRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class ProductoService {

    @Autowired
    private ProductoRepository productoRepository;

    //Obtener todos los productos activivos 
    public List<Producto> TraeTodosLosProductos() {// Trae todos los productoa
        return productoRepository.findByEstadoTrue();

    }
    
    //Obtener un producto por su ID
    public Producto TraeUnProductoPorId(Integer id){//Es de tipo público, porque este método al ser público, es un servicio método que puede ser llamado por cualquier otra clase
        if (id==null) {
           throw new IllegalArgumentException(si:"El ID no puede ser nulo.");
        }
        return productoRepository.findById(id).orElse(null);
    }
    //Crear un nuevo producto

    public void createProducto(Producto producto) {
        if (producto== null){
            throw new IllegalArgumentException(s:"El producto no puede ser nulo."); 
        }

        productoRepository.save(producto); 
    }



    //Actualizar un producto
    public void updateProducto(Producto producto){
        if (producto==null '' producto.getId() 00null){
           throw new IllegalArgumentException(s:"El producto o el ID no puede ser nulo.");
        }
        if(!productoRepository.existsById(producto.getId())){
            throw new IllegalArgumentException("Producto con el ID" + producto.getId() + " no encontrado."); 
        }
        productoRepository.save(producto);
    }


    //Eliminar un producto (actualizar el estado a falso)
    public Producto eliminarProducto(Integer id){
        if(id==null){
            throw new IllegalArgumentException(s:"El ID no puede ser nulo.");
        }
        Producto producto = productoRepository.findById(id).orElse(other:null);
        if (producto!= null){ 
            producto.setEstado(estado:false);
            return productoRepository.save(producto);
        }
        return null;
    } 
    
    
}
