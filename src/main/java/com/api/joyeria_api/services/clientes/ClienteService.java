package com.api.joyeria_api.services.clientes;

import com.api.joyeria_api.models.Cliente;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface ClienteService {
    Mono<Cliente> save(Cliente cliente);

    Flux<Cliente> findAll();

    Mono<Cliente> update(String id, Cliente cliente);

    Mono<Cliente> delete(String id);
}
