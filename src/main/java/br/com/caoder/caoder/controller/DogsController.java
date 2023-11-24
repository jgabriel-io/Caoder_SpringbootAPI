package br.com.caoder.caoder.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.caoder.caoder.model.Dog;
import br.com.caoder.caoder.repository.DogsRepository;

@RestController
@RequestMapping("/dogs")
public class DogsController {

    @Autowired
    private DogsRepository dogRepository;

    @PostMapping("/cadastrar") // Rota para cadastrar um cachorro
    public ResponseEntity<Dog> cadastrarDog(@RequestBody Dog dog) {
        Dog novoDog = dogRepository.save(dog);
        return ResponseEntity.ok(novoDog);
    }

    @GetMapping("/{id}") // Rota para buscar um cachorro por ID
    public ResponseEntity<Dog> buscarDogPorId(@PathVariable Long id) {
        Optional<Dog> dog = dogRepository.findById(id);
        if (dog.isPresent()) {
            return ResponseEntity.ok(dog.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @GetMapping("/listar") // Rota para listar todos os cachorros
    public ResponseEntity<List<Dog>> listarDogs() {
        List<Dog> dogs = dogRepository.findAll();
        return ResponseEntity.ok(dogs);
    }
}
