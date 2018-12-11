package org.sid.controller;
import services.UserService;
import java.io.IOException;
import java.util.List;

import org.sid.model.User;
import org.sid.model.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;
@EnableWebMvc
@RestController
public class RegisterController {
	@Autowired UserRepository userRepository ;
	
	@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:9000" }, maxAge = 6000)
	@RequestMapping(value="/users" , method=RequestMethod.GET)
	public List<User> listUser() {
		return userRepository.findAll() ;
	}
	@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:9000" }, maxAge = 36000)
	/*@RequestMapping(value="/users" , method=RequestMethod.POST)*/
	@RequestMapping(value="/users" , headers = ("content-type=multipart/*"), method = RequestMethod.POST
	/* , consumes = MediaType.MULTIPART_FORM_DATA_VALUE ,produces = { "application/json" }*/
	)
	public User save(
			// @RequestPart("files") MultipartFile f  ,
			@RequestPart ("user") String u) 
			throws JsonParseException, JsonMappingException, IOException{
		User user = new ObjectMapper().readValue(u, User.class) ;
		//user.setLogo(f.getBytes());
		return userRepository.save(user);
	
		}
	
	@CrossOrigin(origins = { "http://localhost:4200", "http://localhost:9000" }, maxAge = 6000)
	@DeleteMapping(path ={"/users/{id}"})
    public void delete(@PathVariable("id") Long id) {
         userRepository.deleteById(id);
    }
}
