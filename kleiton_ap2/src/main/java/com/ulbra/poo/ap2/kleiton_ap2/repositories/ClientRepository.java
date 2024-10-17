package com.ulbra.poo.ap2.kleiton_ap2.repositories;

import com.ulbra.poo.ap2.kleiton_ap2.models.Client;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class ClientRepository {
    private List<Client> clients = new ArrayList<>();
    public List<Client> getClients() {
        return clients;
    }

    public void setClients(Client client){
        this.clients.add(client);
    }

    public void deleteClient(Client client){
        int index = this.indexOf(client);
        this.clients.remove(index);
    }

    private int indexOf(Client client) {
        int index = 0;
        for (Client p:this.clients) {
            if(Objects.equals(client.getId(), p.getId()))
                return index;
            index++;
        }
        return -1;
    }
}
