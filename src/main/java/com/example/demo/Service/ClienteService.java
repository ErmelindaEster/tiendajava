package com.example.demo.Service;

import com.example.demo.Models.Cliente; 
import com.example.demo.Repository.ClienteRepository; 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service

public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    //Obtener todos los productos activivos 
    public List<Cliente> TraeTodosLosCliente() {// Trae todos los productoa
        return clienteRepository.findByEstadoTrue();

    }
    
    //Obtener un producto por su ID
    public Cliente TraeUnProductoPorId(Integer id){//Es de tipo público, porque este método al ser público, es un servicio método que puede ser llamado por cualquier otra clase
        if (id==null) {
           throw new IllegalArgumentException(si:"El ID no puede ser nulo.");
        }
        return clienteRepository.findById(id).orElse(null);
    }
    //Crear un nuevo producto

    public void createProducto(Cliente producto) {
        if (producto== null){
            throw new IllegalArgumentException(s:"El cliente no puede ser nulo."); 
        }

        clienteRepository.save(clienteRepository); 
    }



    //Actualizar un producto
    public void updateCliente(Cliente producto){
        if (cliente=null '' producto.getId() 00null){
           throw new IllegalArgumentException(s:"El cliente o el ID no puede ser nulo.");
        }
        if(!clienteRepository.existsById(cliente.getId())){
            throw new IllegalArgumentException("Cliente con el ID" + cliente.getId() + " no encontrado."); 
        }
        clienteRepository.save(cliente);
    }


    //Eliminar un producto (actualizar el estado a falso)
    public Cliente eliminarProducto(Integer id){
        if(id==null){
            throw new IllegalArgumentException(s:"El ID no puede ser nulo.");
        }
        Cliente cliente = clienteRepository.findById(id).orElse(other:null);
        if (cliente!= null){ 
            cliente.setEstado(estado:false);
            return clienteRepository.save(cliente);
        }
        return null;
    } 
    
    
}