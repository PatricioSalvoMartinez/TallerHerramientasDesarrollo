package com.verduleria.proyecto.principal;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class IndexController {

	@GetMapping("/")
	@ResponseBody
    public String helloWorld() {
        return "Hello World!";
    }
}
