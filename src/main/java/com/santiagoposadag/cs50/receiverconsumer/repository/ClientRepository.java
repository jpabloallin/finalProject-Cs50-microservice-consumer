package com.santiagoposadag.cs50.receiverconsumer.repository;

import com.santiagoposadag.cs50.receiverconsumer.collections.Client;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClientRepository extends ReactiveCrudRepository<Client, String> {
}
