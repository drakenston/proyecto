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

    @PutMapping("/{id}")
    Registro replacePerson(@RequestBody Registro registro, @PathVariable String id) {

        return repository.findById(id)
                .map(registro1 -> {
                    registro1.OrderId=registro.OrderId;
                    registro1.Region=registro.Region;
                    registro1.Country=registro.Country;
                    registro1.ItemType=registro.ItemType;
                    registro1.SaleChannel=registro.SaleChannel;
                    registro1.OrderDate=registro.OrderDate;
                    registro1.ShipDate=registro.ShipDate;
                    registro1.OrderPriority=registro.OrderPriority;
                    registro1.UnitsSold=registro.UnitsSold;
                    registro1.UnitsPrice=registro.UnitsPrice;
                    registro1.UnitsCost=registro.UnitsCost;
                    registro1.TotalRevenue=registro.TotalRevenue;
                    registro1.TotalCost=registro.TotalCost;
                    registro1.TotalProfit=registro.TotalProfit;
                    return repository.save(registro1);
                })
                .orElseGet(() -> {
                    registro.set_id(id);
                    return repository.save(registro);
                });
    }

    @DeleteMapping("/{id}")
    Registro deleteRegistro(@PathVariable String id) {

        Optional<Registro> customer = repository.findById(id);
        repository.deleteById(id);
        return customer.get();

    }

}
