package com.verduleria.proyecto.principal;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Producto {
     
	 private int ID;
	 private String nombreProducto;
	    private int precioProducto;
	    private int SKU;
	    private String categoria;
	    

	    
	    public Producto(){}

	    //Métodos de la clase

	    //Método para obtener precio del producto
	    public int getPrecioProducto()
	    {
	        return precioProducto;
	    }

	    //Método para establecer precio produto
	    public void setPrecioProducto(int nuevoPrecioProducto)
	    {
	        precioProducto = nuevoPrecioProducto;
	    }

	    //Método para obtener el nombre del producto
	    public String getNombre(String nombre)
	    {
	        return nombre;
	    }
	
}
