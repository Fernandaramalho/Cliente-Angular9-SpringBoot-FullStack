package io.github.fernandaramalho.clientes;

import io.github.fernandaramalho.clientes.model.entity.Cliente;
import io.github.fernandaramalho.clientes.model.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import javax.websocket.ClientEndpoint;

@SpringBootApplication
public class ClientesApplication {


    public static void main(String[] args) {

        SpringApplication.run(ClientesApplication.class, args);
    }
}
