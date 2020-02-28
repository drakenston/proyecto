package springbootwebmongo.registro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;
import springbootwebmongo.registro.domain.factura;
import springbootwebmongo.registro.repository.ReactiveRegistroRepository;

import javax.validation.Valid;

@RestController
@RequestMapping("/factura")
public class registroController {

    @Autowired
    private ReactiveRegistroRepository reactiveMongoRepository;


    @PostMapping
    private Mono<ResponseEntity<factura>> add(@Valid @RequestBody factura bloque) {
        return reactiveMongoRepository.save(bloque)
                .map(ResponseEntity::ok)
                .defaultIfEmpty(ResponseEntity.notFound().build());
    }
    @GetMapping("/{id}")
    public Mono<factura> getById(@PathVariable(value = "id") String id) {
        return reactiveMongoRepository.findById(id);
    }

    @PutMapping("/{id}")
    public Mono<factura> updateById(@PathVariable(value = "id") String id,
                                                         @Valid @RequestBody factura bloque) {
        return reactiveMongoRepository.findById(id)
                .flatMap(existingfactura -> {

                    existingfactura.OrderId=bloque.OrderId;
                    existingfactura.Region=bloque.Region;
                    existingfactura.Country=bloque.Country;
                    existingfactura.ItemType=bloque.ItemType;
                    existingfactura.SaleChannel=bloque.SaleChannel;
                    existingfactura.OrderDate=bloque.OrderDate;
                    existingfactura.ShipDate=bloque.ShipDate;
                    existingfactura.OrderPriority=bloque.OrderPriority;
                    existingfactura.UnitsSold=bloque.UnitsSold;
                    existingfactura.UnitsPrice=bloque.UnitsPrice;
                    existingfactura.UnitsCost=bloque.UnitsCost;
                    existingfactura.TotalRevenue=bloque.TotalRevenue;
                    existingfactura.TotalCost=bloque.TotalCost;
                    existingfactura.TotalProfit=bloque.TotalProfit;
                    return reactiveMongoRepository.save(existingfactura);
                });

    }

    @DeleteMapping("/{_id}")
    public Mono<ResponseEntity<factura>> delete(@PathVariable(value = "_id") String id) {

        return reactiveMongoRepository.findById(id)
                .flatMap(bloque ->
                        reactiveMongoRepository.delete(bloque)
                                .then(
                                        Mono.just(
                                                new ResponseEntity<factura>(bloque, HttpStatus.OK)))
                )
                .defaultIfEmpty(new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }


}
