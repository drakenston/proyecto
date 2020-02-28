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
    Registro putRegistro(@Valid @RequestBody Registro bloqueOld, @PathVariable String id) {

        return repository.findById(id)
                .map(bloqueNew -> {
                    bloqueNew.orderId = bloqueOld.orderId;
                    bloqueNew.region= bloqueOld.region;
                    bloqueNew.country= bloqueOld.country;
                    bloqueNew.itemType= bloqueOld.itemType;
                    bloqueNew.saleChannel= bloqueOld.saleChannel;
                    bloqueNew.orderDate= bloqueOld.orderDate;
                    bloqueNew.shipDate= bloqueOld.shipDate;
                    bloqueNew.orderPriority= bloqueOld.orderPriority;
                    bloqueNew.unitsSold= bloqueOld.unitsSold;
                    bloqueNew.unitsPrice= bloqueOld.unitsPrice;
                    bloqueNew.unitsCost= bloqueOld.unitsCost;
                    bloqueNew.totalRevenue= bloqueOld.totalRevenue;
                    bloqueNew.totalCost = bloqueOld.totalCost;
                    bloqueNew.totalProfit = bloqueOld.totalProfit;
                    return repository.save(bloqueOld);
                })
                .orElseGet(() -> {
                    bloqueOld._id=id;
                    return repository.save(bloqueOld);
                });
    }

    @DeleteMapping("/{id}")
    Registro deleteRegistro(@PathVariable String id) {

        Optional<Registro> customer = repository.findById(id);
        repository.deleteById(id);
        return customer.get();

    }

}
