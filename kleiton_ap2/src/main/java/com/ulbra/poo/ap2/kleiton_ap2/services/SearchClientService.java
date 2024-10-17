package com.ulbra.poo.ap2.kleiton_ap2.services;

import com.ulbra.poo.ap2.kleiton_ap2.models.Client;
import com.ulbra.poo.ap2.kleiton_ap2.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchClientService {

    final
    ClientRepository clientRepository;

    public SearchClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }
    public List<Client> searchingClients() {
        return clientRepository.getClients();
    }
}
