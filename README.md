### Integrantes

- Alberto Rubinho – RM 99706

- Ana Beatriz Bento – RM 552536

- Angelo Pelluci – RM 98310

- Ruan Guedes – RM 551096

### Link do Deploy
https://lojabrinquedos-production-afde.up.railway.app

### Link do Fork com o Deploy

https://github.com/AlbertoRP11/LojaBrinquedosJava

# LojaBrinquedosJava

Este é um projeto de demonstração desenvolvido em Java usando Spring Boot para a criação de uma API RESTful que gerencia uma loja de brinquedos. O projeto inclui operações CRUD (Create, Read, Update, Delete) para gerenciar os brinquedos disponíveis na loja.

## Tecnologias Utilizadas
![image](https://github.com/user-attachments/assets/fece59a3-c156-40fb-a3ad-65455a42d0c3)
- Java 21
- Spring Boot 3.3.3
- Spring Data JPA
- IntelliJ IDEA (IDE utilizada para desenvolvimento)
- Maven (para gerenciamento de dependências)

## Estrutura do Projeto
O projeto está organizado da seguinte forma:
```
LojaBrinquedo/
│
├── src/
│  └── main/
│      ├── java/
│      │     └── com//example/LojaBrinquedo/
│      │               ├── Controller/
│      │               │   └── BrinquedoController.java
│      │               ├── Model/
│      │               │   └── Brinquedo.java
│      │               ├── Repository/
│      │               │   └── BrinquedoRepository.java
│      │               └── Service/
│      │                   └── BrinquedoService.java
│      └── resources/
│          └── application.properties
└── pom.xml
```

- Entidade Brinquedo:
A classe Brinquedo.java define a entidade Brinquedo, que representa os brinquedos disponíveis na loja.

- Controller:
A classe BrinquedoController.java expõe os endpoints da API para realizar as operações CRUD.

- Repository:
A interface BrinquedoRepository.java estende JpaRepository e fornece métodos para manipular a entidade Brinquedo no banco de dados.

- Service:
A classe BrinquedoService.java implementa a lógica de negócios da aplicação, utilizando o BrinquedoRepository para interagir com o banco de dados.

## Endpoints da API CRUD

- GET /brinquedos: Retorna a lista de todos os brinquedos.
- POST /brinquedos: Cria um novo brinquedo.
- PUT /brinquedos/{id}: Atualiza um brinquedo existente.
- DELETE /brinquedos/{id}: Remove um brinquedo existente.

# Exemplos de Requisições
## Criar um Brinquedo
  
Requisição:

```http 
POST /Brinquedos
```

Corpo:

```json 
{
  "nome": "Buzz Luz",
  "tipo": "Boneco",
  "classificação": "Brinquedo Toy Story",
  "tamanho": "medio",
  "preco": 95.0
}
```

Resposta:

![image](https://github.com/user-attachments/assets/bfba0769-b69b-4621-a737-cd12eb632195)


## Listar Brinquedos
  
Requisição:

```http
GET /Brinquedos
```

Resposta:

![image](https://github.com/user-attachments/assets/458915f1-e1d5-4baf-89b7-794cd80040eb)


## Listar Brinquedos por ID
  
Requisição:

```http
GET /Brinquedos/1
```

Resposta:

![image](https://github.com/user-attachments/assets/51e85bb0-f08c-4464-9755-23ca9a874d31)


## Deletar Brinquedos por ID

Requisição:

```http
DELETE /Brinquedos/5
```

Resposta:

![image](https://github.com/user-attachments/assets/d2471831-12f6-4746-8f3f-1be63d80cbfe)

## Alterar Brinquedos por ID

Requisição:

```http
PUT /Brinquedos/5
```

Resposta:

![image](https://github.com/user-attachments/assets/f32eb9bc-918c-42d1-a8e8-2346bb0cb204)
