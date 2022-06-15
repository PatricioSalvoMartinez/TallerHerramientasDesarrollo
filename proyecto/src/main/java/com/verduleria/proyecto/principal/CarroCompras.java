package com.verduleria.proyecto.principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class CarroCompras {
	

	 private String Productos;
	    private int Cantidad;
	  

	    //Constructor con el mismo nombre de la clase
	    public CarroCompras(){}

	    //Métodos de la clase
	    public void metodo1()
	    {
	      
	    }

	    public String metodo2()
	    {
	        return "metodo2";
	    }
	

}
