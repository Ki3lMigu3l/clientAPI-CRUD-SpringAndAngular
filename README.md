# Documentação da API de Cadastro de Clientes

## Introdução

Bem-vindo à documentação da API de Cadastro de Clientes, um projeto que utiliza Spring Boot e Angular. Esta API foi desenvolvida com o objetivo de realizar operações CRUD (Create, Read, Update, Delete) para cadastro de clientes utilizando essas duas tecnologias.

## Tecnologias Utilizadas

- **Backend:**
  - Spring Boot: Framework Java para desenvolvimento de aplicativos web e serviços RESTful.
  - MySQL: Sistema de gerenciamento de banco de dados relacional para persistência de dados.

- **Frontend:**
  - Angular: Framework TypeScript/JavaScript para construção de interfaces de usuário.

## Endpoints da API

### 1. Listar Todos os Clientes

**Endpoint:** `/clientes`  
**Método:** `GET`  
**Descrição:** Retorna uma lista de todos os clientes cadastrados.

### 2. Cadastrar Novo Cliente

**Endpoint:** `/clientes`  
**Método:** `POST`  
**Descrição:** Cadastra um novo cliente. O corpo da requisição deve conter os dados do cliente.

Exemplo de corpo da requisição:
```json
{
  "nome": "João Silva",
  "idade": 20,
  "cidade": "Belo Jardim"
}
