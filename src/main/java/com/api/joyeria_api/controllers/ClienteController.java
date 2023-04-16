package com.api.joyeria_api.controllers;

import com.api.joyeria_api.models.Cliente;
import com.api.joyeria_api.services.clientes.IClienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@CrossOrigin(origins = "*")
@RestController
public class ClienteController {

    @Autowired
    IClienteService service;

    @PostMapping("/cliente")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Cliente> save(@RequestBody Cliente cliente) {
        return this.service.save(cliente);
    }
    @GetMapping("/cliente/get")
    @ResponseStatus(HttpStatus.CREATED)
    private Mono<Cliente> saveGet(@RequestBody Cliente cliente) {
        return this.service.save(cliente);
    }

    @GetMapping(value = "/clientes")
    private Flux<Cliente> findAll() {
        return this.service.findAll();
    }

    @PutMapping("/cliente/{id}")
    private Mono<ResponseEntity<Cliente>> update(@PathVariable("id") String id, @RequestBody Cliente cliente) {
        return this.service.update(id, cliente)
                .flatMap(cliente1 -> Mono.just(ResponseEntity.ok(cliente1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }

    @DeleteMapping("/cliente/{id}")
    private Mono<ResponseEntity<Cliente>> delete(@PathVariable("id") String id) {
        return this.service.delete(id)
                .flatMap(cliente1 -> Mono.just(ResponseEntity.ok(cliente1)))
                .switchIfEmpty(Mono.just(ResponseEntity.notFound().build()));
    }
}
