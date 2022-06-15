package com.verduleria.proyecto.principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller

public class ValidarRegistroUsuario {

	private int Id;
	 private String Usuario;
	   
	    private String Clave;
	    

	    //Constructor con el mismo nombre de la clase
	    public ValidarRegistroUsuario(){}

	    //Métodos de la clase
	    public void crearUsuario()
	    {
	        //Método vacío
	    }

	    public String borrarUsuario()
	    {
	        return "usuarioborrado";
	    }
	

}
