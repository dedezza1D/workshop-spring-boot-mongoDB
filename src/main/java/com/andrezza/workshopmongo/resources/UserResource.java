package com.andrezza.workshopmongo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.andrezza.workshopmongo.domain.User;

@RestController
@RequestMapping(value="/users")
public class UserResource {
 
	@RequestMapping(method=RequestMethod.GET)
	public ResponseEntity< List<User>> findAll(){
		User Maria = new User("1", "Maria Brown", "maria@gmail.com");
		User Alex = new User("2", "Alex Silva", "alex@gmail.com");
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(Maria, Alex));
		return ResponseEntity.ok().body(list);
	}
	
}
