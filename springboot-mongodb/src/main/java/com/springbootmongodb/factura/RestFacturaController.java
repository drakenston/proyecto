package com.springbootmongodb.factura;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/factura")
public class RestFacturaController {

    @Autowired
    private RegistroRepository repository;

    @GetMapping
    List<Registro> all() {
        return repository.findAll();
    }

    @PostMapping
    Registro newRegistro(@Valid @RequestBody Registro bloque) {
        return repository.save(bloque);
    }

    @GetMapping("/{id}")
    Registro one(@PathVariable String id) {

        return repository.findById(id)
                .orElseThrow(() -> new RegistroNotFoundException(id));
    }

    /*@PutMapping("/{id}")
    Person replacePerson(@RequestBody Person person, @PathVariable String id) {

        return repository.findById(id)
                .map(person1 -> {
                    person1.setFirstName(person.getFirstName());
                    person1.setSecondName(person.getSecondName());
                    person1.setAddress(person.getAddress());
                    person1.setDateOfBirth(person.getDateOfBirth());
                    person1.setHobbies(person.getHobbies());
                    return repository.save(person1);
                })
                .orElseGet(() -> {
                    person.setId(id);
                    return repository.save(person);
                });
    }*/

    @DeleteMapping("/{id}")
    Registro deleteRegistro(@PathVariable String id) {

        Optional<Registro> customer = repository.findById(id);
        repository.deleteById(id);
        return customer.get();

    }

}
