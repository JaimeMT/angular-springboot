package com.sinflo.ejemplo01.Controller;

import com.sinflo.ejemplo01.Model.Persona;
import com.sinflo.ejemplo01.Repository.PersonaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
@RequestMapping("/personas")
public class Controller {

     @Autowired
     PersonaRepository personaRepository;


     @GetMapping
     public List<Persona> listar(){
         return personaRepository.findAll();
     }

     @PostMapping
     public Persona addPersona(@RequestBody Persona persona){
          return personaRepository.save(persona);
     }

     @GetMapping("/{id}")
     public Optional<Persona> listarId(@PathVariable("id") int id){
          return personaRepository.findById(id);
     }

     @PutMapping("/{id}")
     public Persona editar(@RequestBody Persona persona, @PathVariable("id") int id){
          persona.setId(id);
          return personaRepository.save(persona);
     }

     @DeleteMapping("/{id}")
     public void deletePersona(@PathVariable("id") int id){

          personaRepository.deleteById(id);

     }


}
