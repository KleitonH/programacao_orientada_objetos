package com.ulbra.poo.ap2.kleiton_ap2;

import com.ulbra.poo.ap2.kleiton_ap2.models.Client;
import com.ulbra.poo.ap2.kleiton_ap2.repositories.ClientRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class KleitonAp2Application {
	final
	ClientRepository clientRepository;

	public KleitonAp2Application(ClientRepository clientRepository){
		this.clientRepository = clientRepository;
	}
	public static void main(String[] args) {
		SpringApplication.run(KleitonAp2Application.class, args);
	}

	@PostConstruct
	void fillMyList(){
		clientRepository
				.setClients(new Client(1, "Bryan", 21, "Gardener" )
		);

		clientRepository
				.setClients(new Client(2, "Bob", 24, "Teacher" )
		);

		clientRepository
				.setClients(new Client(3, "Susie", 19, "Designer" )
		);

		clientRepository
				.setClients(new Client(4, "Amanda", 27, "Stylist" )
		);
	}
}
