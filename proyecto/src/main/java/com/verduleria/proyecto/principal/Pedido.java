package com.verduleria.proyecto.principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class Pedido {

	 private String detallePedido;
	    private String nombre;
	    private String apellido;
	    private String direccion;
	    private String pais;
	    private String ciudad;

	    //Constructor con el mismo nombre de la clase
	    public Pedido(){}

	
	    public void NuevoPedido()
	    {
	       
	    }

	    public String ModificarPedido()
	    {
	        return "metodo2";
	    }
	
	
}
