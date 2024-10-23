package com.ulbra.poo.ap2.kleiton_ap2.services;

import com.ulbra.poo.ap2.kleiton_ap2.models.Client;
import com.ulbra.poo.ap2.kleiton_ap2.repositories.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SearchClientService {

    final ClientRepository clientRepository;

    public SearchClientService(ClientRepository clientRepository){
        this.clientRepository = clientRepository;
    }

    public List<Client> getClients() {
        return clientRepository.getClients();
    }

    public Client getClientsId(int id){
        return clientRepository.getClientsId(id);
    }

    public List<Client> getClientsAge(int age){
        return clientRepository.getClientsAge(age);
    }

    public void setClients(Client client) {
        clientRepository.setClients(client);
    }

    public void deleteClients(int id){
        clientRepository.deleteClients(id);
    }

    public void updateClients(int id, String name, int age, String profession) {
        Client updatedClient = clientRepository.updateClients(id, name, age, profession);
        if (updatedClient == null) {
            throw new IllegalArgumentException("Cliente não encontrado com o ID: " + id);
        }
    }

}
