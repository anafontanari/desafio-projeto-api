package spring_boot.desafio_projeto.clientregistration.factory;

import spring_boot.desafio_projeto.clientregistration.model.Cliente;

public class ClienteFactory {
    public static Cliente createCliente(String nome, String cpf, String dataNascimento) {
        Cliente cliente = new Cliente();
        cliente.setNome(nome);
        cliente.setCpf(cpf);
        cliente.setDataNascimento(dataNascimento);
        return cliente;
    }
}

