package com.ulbra.poo.ap2.kleiton_ap2.repositories;

import com.ulbra.poo.ap2.kleiton_ap2.models.Client;
import org.springframework.stereotype.Repository;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Repository
public class ClientRepository {
    private List<Client> clients = new ArrayList<>();

    public List<Client> getClients() {
        return clients;
    }

    public Client getClientsId(int id) {
        Client encontrado = clients.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
        if (encontrado != null) {
            int index = clients.indexOf(encontrado);
            if (index != -1) {
                encontrado = clients.get(index);
            }
        } else if (encontrado == null) {
            throw new IllegalArgumentException("Cliente não encontrado com o ID: " + id);
        }
        return encontrado;
    }

    public List<Client> getClientsAge(int age) {
        List<Client> encontrado = clients.stream()
                .filter(item -> item.getAge() == age)
                .collect(Collectors.toList());

        if (encontrado.isEmpty()) {
            throw new IllegalArgumentException("Nenhum cliente encontrado com a idade: " + age);
        }

        return encontrado;
    }

    public void setClients(Client client) {
        this.clients.add(client);
    }

    public Client deleteClients(int id) {
        Client encontrado = clients.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
        if (encontrado != null) {
            int index = clients.indexOf(encontrado);
            if (index != -1) {
                clients.remove(index);
            }
        } else if (encontrado == null) {
            throw new IllegalArgumentException("Cliente não encontrado com o ID: " + id);
        }
        return encontrado;
    }

    public Client updateClients(int id, String name, int age, String profession) {
        Client encontrado = clients.stream()
                .filter(item -> item.getId() == id)
                .findFirst()
                .orElse(null);
        if (encontrado != null) {
            encontrado.setName(name);
            encontrado.setAge(age);
            encontrado.setProfession(profession);
        }
            return encontrado;

    }

}
