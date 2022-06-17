package com.santiagoposadag.cs50.receiverconsumer.usecases;

import com.google.gson.Gson;
import com.santiagoposadag.cs50.receiverconsumer.collections.Client;
import com.santiagoposadag.cs50.receiverconsumer.repository.ClientRepository;
import org.springframework.stereotype.Component;

@Component
public class ReceiveFromClientCreateQueueUseCase {
    private final Gson gson = new Gson();
    private final ClientRepository repository;

    public ReceiveFromClientCreateQueueUseCase(ClientRepository repository) {
        this.repository = repository;
    }

    public void receiveMessage(String message){
        System.out.println(message);
        Client client = gson.fromJson(message, Client.class);
        repository.save(client).subscribe();
    }
}
