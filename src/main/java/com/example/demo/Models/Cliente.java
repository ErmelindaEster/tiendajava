package com.example.demo.Models;

public class Cliente {
    private Integer id;
    private String nombre;
    private String apellido;
    private String direccion;
    private String telefono;
    private String email;
    private String ciudad;
    private String provincia; 
    private String pais; 
    private String metodopago;
    private Boolean activo;
    private String notas;
    private String categoria;
    private double saldo; 

     //Constructor vacío o sin parametros
     public Cliente(){

     }
 
 //Constructor con parametros
 public Cliente(Integer id, String nombre, String apellido, String direccion, String telefono, String email, String ciudad, String provincia, String pais, String metodopago, Boolean activo, String notas, String categoria, double saldo){
     this.id= id;
     this.nombre= nombre;
     this.apellido= apellido;
     this.direccion= direccion;
     this.telefono= telefono; 
     this.email= email;
     this.ciudad= ciudad;
     this.provincia=provincia;
     this.pais= pais;
     this.metodopago= metodopago;
     this.activo= activo;
     this.notas= notas;
     this.categoria= categoria;
     this. saldo= saldo; 
  }
      //getters y setters
    public Integer getId(){return id;
    }
    public void setId(int id){this.id = id;
    }
    public String getNombre(){return nombre;
    }
    public void setNombre(String nombre){this.nombre = nombre;
    }
    public String getApellido(){return apellido;
    }
    public void setApellido(String apellido){this.apellido = apellido;
    }
     public String getDireccion(){return direccion;
    }
    public void setDireccion(String direccion){this.direccion = direccion;
    }
    public String getTelefono(){return telefono;
    }
    public void setTelefono(String telefono){this.telefono = telefono;
    }
    public String getEmail(){return email;
    }
    public void setEmail(String email){this.email = email;
    }
    public String getCiudad(){return ciudad;
    }
    public void setCiudad(String ciudad){this.ciudad = ciudad;
    }
    public String getProvincia(){return provincia;
    }
    public void setProvincia(String provincia){this.provincia = provincia;
    }
    public String getPais(){return pais;
    }
    public void setPais(String pais){this.pais = pais;
    }
    public String getMetodopago(){return metodopago;
    }
    public void setMetodopago(String metodopago){this.metodopago = metodopago;
    }
    public Boolean getActivo(){return activo;
    }
    public void setActivo(Boolean activo){this.activo = activo;
    }
    public String getNotas(){return notas;
    }
    public void setNotas(String notas){this.notas= notas;
    }
    public String getCategoria(){return categoria;
    }
    public void setCategoria(String categoria){this.categoria = categoria;
    }
    public double getSaldo(){return saldo;
    }
    public void setSaldo(double saldo){this.saldo = saldo;
    }   
}