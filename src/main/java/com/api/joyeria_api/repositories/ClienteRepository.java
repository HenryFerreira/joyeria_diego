package com.api.joyeria_api.repositories;

import com.api.joyeria_api.models.Cliente;
import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

public interface ClienteRepository extends ReactiveMongoRepository<Cliente, String> {
}
