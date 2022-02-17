package controller;


import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import model.NameOwner;

@RestController
@RequestMapping("/NameOwner")
public class NameOwnerController 
{   
	
	@GetMapping
	public List<NameOwner>listar() 
	{
		
	}
	
	

}
