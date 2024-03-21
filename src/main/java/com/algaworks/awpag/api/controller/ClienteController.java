package com.algaworks.awpag.api.controller;

import com.algaworks.awpag.domain.model.Cliente;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class ClienteController {

    @GetMapping("/clientes")
    public List<Cliente> listar() {
        Cliente cliente1 = Cliente.builder().id(1L).nome("John Doe").email("jdoe@email.com").telefone("01234567890").build();
        Cliente cliente2 = Cliente.builder().id(1L).nome("Mary Doe").email("mdoe@email.com").telefone("09876543210").build();

        return Arrays.asList(cliente1, cliente2);
    }

}
