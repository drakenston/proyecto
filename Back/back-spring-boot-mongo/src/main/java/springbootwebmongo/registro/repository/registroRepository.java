package springbootwebmongo.registro.repository;

import org.springframework.data.mongodb.repository.Query;
import springbootwebmongo.registro.domain.factura;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface registroRepository extends PagingAndSortingRepository<factura, String>{

    @Query("{'name': ?0}")
    factura findByName(final String name);

}
