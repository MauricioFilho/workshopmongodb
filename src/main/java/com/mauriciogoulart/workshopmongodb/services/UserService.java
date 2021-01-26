package com.mauriciogoulart.workshopmongodb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mauriciogoulart.workshopmongodb.domain.User;
import com.mauriciogoulart.workshopmongodb.dto.UserDTO;
import com.mauriciogoulart.workshopmongodb.repository.UserRepository;
import com.mauriciogoulart.workshopmongodb.services.exception.ObjectNotFindException;


@Service //diz para o Spring que essa classe é um serviço.
public class UserService {
	
	@Autowired //instancia automaticamente a classe 
	private UserRepository repo;
	
	public List<User> findAll(){
		
		return repo.findAll();
		
	}
	
	public User findById(String id) {
		Optional<User> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFindException("Objeto não encontrado"));
		}
	
	public User insert(User obj) {
		
		return repo.insert(obj);
	}
	
	public void delete (String id) {
		
		findById(id);
		repo.deleteById(id);
		
	}
	
	public User fromDTO (UserDTO objDto) {
		
		return new User(objDto.getId(), objDto.getName(), objDto.getEmail());
		
	}
	
	
	
}
