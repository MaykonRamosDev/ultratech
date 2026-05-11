# ULTRATECH Backend

API REST feita com Spring Boot, Java 21 e Maven para o front-end React/Vite da ULTRATECH.

## Tecnologias

- Java 21
- Spring Boot 3.3.16
- Maven
- Spring Web
- Bean Validation
- Spring Data JPA
- H2 Database em memória

## Como rodar

```bash
cd ultratech-backend
mvn spring-boot:run
```

A API ficará disponível em:

```text
http://localhost:8080
```

O console do H2 ficará em:

```text
http://localhost:8080/h2-console
```

Dados de conexão do H2:

```text
JDBC URL: jdbc:h2:mem:ultratechdb
User: sa
Password: deixe vazio
```

## Endpoints

### Status da API

```http
GET /api/status
```

### Listar serviços

```http
GET /api/servicos
```

### Enviar contato/orçamento

```http
POST /api/contatos
Content-Type: application/json

{
  "nome": "Cliente Teste",
  "email": "cliente@email.com",
  "telefone": "62999999999",
  "mensagem": "Preciso de orçamento para instalação de câmeras."
}
```

### Listar contatos recebidos

```http
GET /api/contatos
```

## CORS

O backend já está liberado para o front rodando em:

```text
http://localhost:5173
http://127.0.0.1:5173
```

Caso seu front rode em outra porta, altere a propriedade abaixo em `src/main/resources/application.properties`:

```properties
app.cors.allowed-origins=http://localhost:5173,http://127.0.0.1:5173
```

## Integração sugerida no React

Troque o formulário atual por um `form` com `onSubmit` chamando `fetch("http://localhost:8080/api/contatos")`. Um exemplo pronto está no arquivo `frontend-integration/App.jsx` deste pacote.
