package spring_boot.desafio_projeto.clientregistration.shell;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.shell.standard.*;

import spring_boot.desafio_projeto.clientregistration.factory.ClienteFactory;
import spring_boot.desafio_projeto.clientregistration.model.Cliente;
import spring_boot.desafio_projeto.clientregistration.service.ClienteService;

@ShellComponent
public class ClienteCommands {
    @Autowired
    private ClienteService clienteService;

    @ShellMethod("Cadastrar novo cliente")
    public String cadastrarCliente(@ShellOption String nome, @ShellOption String cpf, @ShellOption String dataNascimento) {
        Cliente cliente = ClienteFactory.createCliente(nome, cpf, dataNascimento);
        clienteService.save(cliente);
        return "Cliente cadastrado com sucesso!";
    }
}
