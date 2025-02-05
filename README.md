# 📚 Escola CRUD API

Bem-vindo ao projeto **Escola CRUD API**! Este é um sistema simples para gerenciar alunos em uma escola, permitindo operações CRUD (Create, Read, Update, Delete) em uma tabela de alunos.

## 🚀 Funcionalidades
- Criar novos alunos.
- Listar todos os alunos.
- Atualizar informações de alunos existentes.
- Deletar alunos.

## 🛠️ Tecnologias Utilizadas
- **Java 17**
- **Spring Boot 3**
- **PostgreSQL**
- **Hibernate**
- **JPA** (Java Persistence API) para mapeamento objeto-relacional

## 📋 Pré-requisitos
Antes de começar, certifique-se de ter instalado:
- **Java 17** ou superior.
- **Maven** para gerenciar dependências.
- **PostgreSQL** para o banco de dados.

## ⚙️ Configuração de Variáveis de Ambiente
Para configurar as variáveis de ambiente no IntelliJ IDEA:
1. Clique em **Run/Debug Configurations** no canto superior direito.
2. Clique em **Edit Configurations...**.
3. No campo **Environment Variables**, adicione as seguintes variáveis:
   - `DB_HOST`: Host do banco de dados (exemplo: `localhost`).
   - `DB_PORT`: Porta do banco de dados (exemplo: `5432`).
   - `DB_NAME`: Nome do banco de dados (exemplo: `escola`).
   - `DB_USERNAME`: Nome de usuário do banco de dados.
   - `DB_PASSWORD`: Senha do banco de dados.

Exemplo de configuração:
```
DB_HOST=localhost
DB_PORT=5432
DB_NAME=escola
DB_USERNAME=seu_usuario
DB_PASSWORD=sua_senha
```

## 🛠️ Instalação
Siga os passos abaixo para configurar o projeto localmente:

1. Clone o repositório:
   ```bash
   git clone https://github.com/eloiza-souza/escolaCRUD
   cd escolaCRUD
   ```

2. Instale as dependências do projeto:
   ```bash
   mvn clean install
   ```

3. Configure o banco de dados:
   - Crie um banco de dados chamado `escola` no PostgreSQL.
   - Certifique-se de que as variáveis de ambiente estão configuradas corretamente.

## ▶️ Executando o Projeto
Para rodar o projeto, execute o seguinte comando:
```bash
mvn spring-boot:run
```

O servidor será iniciado em: [http://localhost:8080](http://localhost:8080)

## 🧪 Testando os Endpoints
Use ferramentas como **Postman** ou **cURL** para testar os endpoints da API.

### Endpoints Disponíveis
- **GET** `/alunos`: Lista todos os alunos.
- **POST** `/alunos`: Adiciona um novo aluno.
  - Exemplo de payload:
    ```json
    {
      "name": "João",
      "age": 20
    }
    ```
- **PUT** `/alunos/{id}`: Atualiza um aluno existente.
  - Exemplo de payload:
    ```json
    {
      "name": "João Silva",
      "age": 21
    }
    ```
- **DELETE** `/alunos/{id}`: Remove um aluno pelo ID.

## 🖼️ Exemplo de Resposta
Exemplo de resposta para o endpoint **GET** `/alunos`:
```json
[
  {
    "id": 1,
    "name": "João",
    "age": 20
  },
  {
    "id": 2,
    "name": "Maria",
    "age": 22
  }
]
```

## 🐛 Problemas Conhecidos
- Certifique-se de que o banco de dados está rodando antes de iniciar a aplicação.
- Verifique se as variáveis de ambiente estão configuradas corretamente.

## 💡 Dicas
- Use o comando abaixo para criar a tabela `alunos` no banco de dados, caso necessário:
  ```sql
  CREATE TABLE alunos (
      id BIGSERIAL PRIMARY KEY,
      name VARCHAR(255) NOT NULL,
      age INT NOT NULL
  );
  ```

## 🤝 Contribuições
Contribuições são bem-vindas! Siga os passos abaixo para contribuir:
1. Faça um fork do repositório.
2. Crie uma branch para sua feature:
   ```bash
   git checkout -b minha-feature
   ```
3. Faça o commit das suas alterações:
   ```bash
   git commit -m "Adiciona minha nova feature"
   ```
4. Envie suas alterações:
   ```bash
   git push origin minha-feature
   ```
5. Abra um Pull Request.

## 📞 Contato
Caso tenha dúvidas, entre em contato:
- **Email:** eloiza.souza@zup.com

---
Desenvolvido com ❤️ por [Eloiza](https://github.com/eloiza.souza).
