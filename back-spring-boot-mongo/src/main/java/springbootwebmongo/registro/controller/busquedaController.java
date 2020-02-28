package springbootwebmongo.registro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;
import springbootwebmongo.registro.domain.factura;
import springbootwebmongo.registro.repository.registroRepository;

@RestController
@RequestMapping("/factura")
public class busquedaController {
    @Autowired
    private registroRepository regRepository;

    @GetMapping()
    private Mono<Page<factura>> getAllRegistros(
            @RequestParam(name = "page", defaultValue = "0") Integer page,
            @RequestParam(name = "size", defaultValue = "10") Integer size) {
        return Mono.just(regRepository.findAll(PageRequest.of(page,size)));

    }
}
