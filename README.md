# desafio-projeto-publicando-api-nuvem-springBoot
Repositório criado para o desenvolvimento do desafio de projeto - Publicando Sua API REST na Nuvem Usando Spring Boot 3, Java 17 e Railway - do Bootcamp Santander 2024 pela DIO.


## Tecnologias utilizadas:
 - **Java 17**: Utilizaremos a versão LTS mais recente do Java para tirar vantagem das últimas inovações que essa linguagem robusta e amplamente utilizada oferece;
 - **Spring Boot 3**: Trabalharemos com a mais nova versão do Spring Boot, que maximiza a produtividade do desenvolvedor por meio de sua poderosa premissa de autoconfiguração;
 - **Spring Data JPA**: Exploraremos como essa ferramenta pode simplificar nossa camada de acesso aos dados, facilitando a integração com bancos de dados SQL;
 - **OpenAPI (Swagger)**: Vamos criar uma documentação de API eficaz e fácil de entender usando a OpenAPI (Swagger), perfeitamente alinhada com a alta produtividade que o Spring Boot oferece;
 - **Railway**: facilita o deploy e monitoramento de nossas soluções na nuvem, além de oferecer diversos bancos de dados como serviço e pipelines de CI/CD.


## Objetivo

Realizar cadastro de usuário.

## Diagrama de Classes

```mermaid
classDiagram
    class Cliente {
        Long id
        String nome
        String cpf
        LocalDate dataNascimento
        +getId()
        +setId(Long id)
        +getNome()
        +setNome(String nome)
        +getCpf()
        +setCpf(String cpf)
        +getDataNascimento()
        +setDataNascimento(LocalDate dataNascimento)
    }

    class Endereco {
        Long id
        String rua
        String numero
        String bairro
        String cidade
        String estado
        String cep
        +getId()
        +setId(Long id)
        +getRua()
        +setRua(String rua)
        +getNumero()
        +setNumero(String numero)
        +getBairro()
        +setBairro(String bairro)
        +getCidade()
        +setCidade(String cidade)
        +getEstado()
        +setEstado(String estado)
        +getCep()
        +setCep(String cep)
    }

    class Telefone {
        Long id
        String numero
        +getId()
        +setId(Long id)
        +getNumero()
        +setNumero(String numero)
    }

    class Email {
        Long id
        String endereco
        +getId()
        +setId(Long id)
        +getEndereco()
        +setEndereco(String endereco)
    }

    class ClienteRepository {
        +save(Cliente cliente)
        +findById(Long id)
        +findAll()
        +deleteById(Long id)
    }

    class EnderecoRepository {
        +save(Endereco endereco)
        +findById(Long id)
        +findAll()
        +deleteById(Long id)
    }

    class TelefoneRepository {
        +save(Telefone telefone)
        +findById(Long id)
        +findAll()
        +deleteById(Long id)
    }

    class EmailRepository {
        +save(Email email)
        +findById(Long id)
        +findAll()
        +deleteById(Long id)
    }

    class ClienteService {
        ClienteRepository clienteRepository
        +salvarCliente(Cliente cliente)
        +buscarClientePorId(Long id)
        +buscarTodosClientes()
        +deletarCliente(Long id)
    }

    class ClienteController {
        ClienteService clienteService
        +criarCliente(Cliente cliente)
        +buscarCliente(Long id)
        +listarClientes()
        +deletarCliente(Long id)
    }

    Cliente "1" -- "1" Endereco
    Cliente "1" -- "1..*" Telefone
    Cliente "1" -- "1..*" Email
    ClienteRepository --|> JpaRepository
    EnderecoRepository --|> JpaRepository
    TelefoneRepository --|> JpaRepository
    EmailRepository --|> JpaRepository
    ClienteService --> ClienteRepository
    ClienteController --> ClienteService
```


