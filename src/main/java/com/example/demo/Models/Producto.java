package com.example.demo.Models;

public class Producto {
    private Integer id;
    private String nombre;
    private String vencimiento;
    private String marca;
    private String descripcion;
    private double precio;
    private double peso;
    private String calidad; 
    private String categoria; 
    private int cantidad;
    private Boolean estado;

    //Constructor vacío o sin parametros
    public Producto(){

    }

//Constructor con parametros
public Producto(Integer id, String nombre, String vencimiento, String marca, String descripcion, double precio, double peso, String calidad, String categoria,int cantidad, Boolean estado){
    this.id= id;
    this.nombre= nombre;
    this.vencimiento= vencimiento;
    this.marca= marca;
    this.descripcion= descripcion; 
    this.precio= precio;
    this.peso= peso;
    this.calidad=calidad;
    this.categoria= categoria;
    this.cantidad=cantidad;
    this.estado= estado;
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
    public String getVencimiento(){return vencimiento;
    }
    public void setVencimiento(String vencimiento){this.vencimiento = vencimiento;
    }
    public String getMarca(){return marca; 
    }
    public void setMarca(String marca){this.marca=marca; 
    }
    public double getPrecio(){return precio; 
    }
    public void setPrecio(double precio){this.precio=precio;
     }
     public double getPeso(){return peso; }
     public void setPeso(double peso){this.peso=peso;
     }
     public String getCalidad(){return calidad; }
     public void setCalidad(String calidad){this.calidad=calidad; 
    }
    public String getCategoria(){return categoria; }
    public void setCategoria(String categoria){this.categoria=categoria; 
    }
    public int getiCantidad(){return cantidad; }
    public void setCantidad(int cantidad){this.cantidad=cantidad; 
    }
    public Boolean getEstado(){return estado; }
    public void setEstado(Boolean estado){this.estado=estado; 
    }

}
