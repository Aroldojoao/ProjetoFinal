package controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import model.NameOwner;

@RestController
@RequestMapping("/NameOwner")
public class NameOwnerController 
{   
	@Autowired
	private repository.NameOwnerRepository NameOwnerRepository;
	
	@GetMapping
	public List<NameOwner>listar() 
	{
		return NameOwnerRepository.findAll();
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public NameOwner add(@RequestBody NameOwner nameOwner) 
	{
		return NameOwnerRepository.save(nameOwner);
	}
	
	

}
