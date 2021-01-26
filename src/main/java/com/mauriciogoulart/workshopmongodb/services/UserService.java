package com.mauriciogoulart.workshopmongodb.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mauriciogoulart.workshopmongodb.domain.User;
import com.mauriciogoulart.workshopmongodb.repository.UserRepository;

@Service //diz para o Spring que essa classe é um serviço.
public class UserService {
	
	@Autowired //instancia automaticamente a classe 
	private UserRepository repo;
	
	public List<User> findAll(){
		
		return repo.findAll();
		
	}
	
	
}
