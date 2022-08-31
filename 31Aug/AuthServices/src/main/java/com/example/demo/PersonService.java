package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PersonService {
    
    @Autowired
    PersonRepository personRepository;
    
    RestTemplate restTemplate = new RestTemplate(); // to exchange information
        
   
    public void addPerson(PersonEntity pe){
        personRepository.save(pe);
    }
}


