package com.ulbra.poo.ap2.kleiton_ap2.controllers;

import com.ulbra.poo.ap2.kleiton_ap2.models.Client;
import com.ulbra.poo.ap2.kleiton_ap2.services.SearchClientService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ClientController {

    final SearchClientService service;

    public ClientController(SearchClientService service){
        this.service = service;
    }

    @GetMapping("/clients")
    public List<Client> getClients(@RequestParam(required = false) Integer age) {
        if (age != null) {
            return service.getClientsAge(age);
        }
        return service.getClients();
    }

    @GetMapping("/clients/{id}")
    public Client getClientsId(@PathVariable int id) {
        return service.getClientsId(id);
    }

    @DeleteMapping("/clients/{id}")
    public void deleteClients(@PathVariable int id) {
        service.deleteClients(id);
    }

    @PostMapping("/clients/{id}/{name}/{age}/{profession}")
    public void setClients(@PathVariable int id, @PathVariable String name, @PathVariable int age, @PathVariable String profession) {
        Client client = new Client(id, name, age, profession);
        service.setClients(client);
    }

    @PutMapping("/clients/{id}/{name}/{age}/{profession}")
    public void updateClients(@PathVariable int id, @PathVariable String name, @PathVariable int age, @PathVariable String profession) {
        service.updateClients(id, name, age, profession);
    }





}
