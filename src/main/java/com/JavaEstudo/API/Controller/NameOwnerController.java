package com.JavaEstudo.API.Controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/NameOwner")

public class NameOwnerController 

{   @GetMapping
	public String teste() 
	{
		return "Olá, testando!";
	}
	
	

}
