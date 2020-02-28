package springbootwebmongo.registro.repository;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;
import org.springframework.stereotype.Repository;
import springbootwebmongo.registro.domain.factura;

@Repository
public interface ReactiveRegistroRepository extends ReactiveMongoRepository<factura, String> {
    @Query("{'name': ?0}")
    factura findByName(final String name);
}
