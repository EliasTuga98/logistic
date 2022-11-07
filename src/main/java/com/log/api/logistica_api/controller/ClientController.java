package com.log.api.logistica_api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.log.api.logistica_api.model.Client;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClientController {

    @GetMapping("/client")
    public List<Client> list(){
        Client client = new Client(1l,"Alfa","alfa@omega.com","777");


        return Arrays.asList(client);
    }

}
