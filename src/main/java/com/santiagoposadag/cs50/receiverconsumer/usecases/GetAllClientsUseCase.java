package com.santiagoposadag.cs50.receiverconsumer.usecases;

import com.santiagoposadag.cs50.receiverconsumer.dto.ClientDto;
import com.santiagoposadag.cs50.receiverconsumer.helpers.CryptoCurrencyMappers;
import com.santiagoposadag.cs50.receiverconsumer.repository.ClientRepository;
import org.springframework.stereotype.Service;
import org.springframework.validation.annotation.Validated;
import reactor.core.publisher.Flux;

import java.util.function.Supplier;
@Service
@Validated
public class GetAllClientsUseCase implements Supplier<Flux<ClientDto>> {

    private ClientRepository repository;
    private CryptoCurrencyMappers mapper;

    public GetAllClientsUseCase(ClientRepository repository, CryptoCurrencyMappers mapper) {
        this.repository = repository;
        this.mapper = mapper;
    }

    @Override
    public Flux<ClientDto> get() {
        return repository.findAll().map(mapper.fromEntityToDTO());
    }
}
