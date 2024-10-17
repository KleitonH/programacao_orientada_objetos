package com.ulbra.poo.ap2.kleiton_ap2.controllers;

import com.ulbra.poo.ap2.kleiton_ap2.models.Client;
import com.ulbra.poo.ap2.kleiton_ap2.services.SearchClientService;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ClientController {

    final SearchClientService service;

    public ClientController(SearchClientService service){
        this.service = service;
    }

    @GetMapping("/clients")
    public List<Client> getClients() {
        return service.searchingClients();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> delete(@PathVariable("id") Long id){
        Optional<Product> existingProduct = this.productService.findById(id);
        if(existingProduct.isPresent()){
            this.productService.delete(existingProduct.get());
            return ResponseEntity.ok().build();
        }
        return ResponseEntity.notFound().build();
    }


}
