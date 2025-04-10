# 🎬 MovieDiary

MovieDiary é uma aplicação full stack para organização e acompanhamento de filmes assistidos, categorizados por serviço de streaming.  
O projeto tem como objetivo explorar boas práticas de desenvolvimento web com backend em Java (Spring Boot) e frontend em Angular.

---

## 📌 Funcionalidades

- Cadastro de categorias de filmes
- Cadastro de plataformas de streaming
- Associação de filmes a categorias e plataformas (em andamento)
- Listagem, criação, atualização e exclusão (CRUD) das entidades
- Interface web responsiva (em desenvolvimento)

---

## 🧱 Tecnologias Utilizadas

### Backend
- Java 17
- Spring Boot 3
- Spring Data JPA
- Hibernate
- PostgreSQL (via Docker Compose)
- Lombok
- Flyway (migração de banco de dados)
- JUnit 5 (testes unitários – em breve)
- Swagger/OpenAPI (em breve)

### Frontend (planejado)
- Angular
- TypeScript
- Angular Material
- RxJS
- HTML5 + SCSS

---

## 📁 Estrutura do Projeto

```
moviediary/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── com/moviediary/
│   │   │       ├── controllers/
│   │   │       ├── entities/
│   │   │       ├── repositories/
│   │   │       └── services/
│   └── resources/
│       └── application.properties
├── docker-compose.yml
├── pom.xml
└── README.md
```

---

## 🔌 Documentação da API

A documentação da API REST será gerada automaticamente com Swagger/OpenAPI nas próximas versões.

---

## 🚧 Status do Projeto

- [x] CRUD de Categorias
- [x] CRUD de Streamings
- [ ] CRUD de Filmes (em desenvolvimento)
- [ ] Relacionamentos entre entidades
- [ ] Autenticação JWT (planejado)
- [ ] Frontend Angular (em desenvolvimento)
- [ ] Deploy (Render / Railway)

---

## 🛠 Como Executar Localmente

### Pré-requisitos

- Java 17+
- Maven 3.8+
- Docker e Docker Compose

### Passos

1. Clone o repositório:
```bash
git clone https://github.com/ReaperCord/moviediary.git
cd moviediary
```

2. Suba o PostgreSQL com Docker Compose:
```bash
docker-compose up -d
```

3. Execute a aplicação:
```bash
./mvnw spring-boot:run
```

> O banco de dados será automaticamente migrado via Flyway.

---

## 🤝 Contribuições

Este projeto está em desenvolvimento e aberto a sugestões e melhorias.  
Sinta-se à vontade para abrir issues ou enviar pull requests.

---

## 📄 Licença

Este projeto está licenciado sob a licença MIT. Consulte o arquivo `LICENSE` para mais detalhes.
