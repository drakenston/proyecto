package com.springbootmongodb.factura;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.Date;
import java.util.List;

@RepositoryRestController
public interface RegistroRepository extends MongoRepository<Registro, String> {


    List<Registro> findByOrderId(String firstName);

    List<Registro> findByRegion(String region);

    List<Registro> findByOrderDate(Date fecha);

}
