# Projeto Final - Lista de Tarefas com Spring Boot

[cite_start]Este projeto é uma API REST desenvolvida para gerenciar uma lista de tarefas [cite: 10][cite_start], construída como requisito de avaliação do curso de Análise e Desenvolvimento de Sistemas (Senac)[cite: 1, 5].

[cite_start]**Professora:** Marcileide Cardoso de Souza [cite: 6]

## 🛠️ Tecnologias e Ferramentas Utilizadas
* **Java** * **Spring Boot** (Web, Data JPA, Validation)
* **H2 Database** (Banco de dados em memória)
* **Maven**
* [cite_start]**Thunder Client / Postman** (Para testes de API) [cite: 36]

## ⚙️ Funcionalidades Implementadas
[cite_start]O projeto contempla um CRUD completo[cite: 36], além de funcionalidades extras:
- [x] [cite_start]Criar uma nova tarefa (com validação para não permitir título em branco)[cite: 12, 16].
- [x] [cite_start]Listar todas as tarefas cadastradas[cite: 13].
- [x] [cite_start]Atualizar os dados de uma tarefa (descrição ou status de conclusão)[cite: 14].
- [x] [cite_start]Excluir uma tarefa pelo ID[cite: 15].
- [x] [cite_start]Rota adicional para contagem de tarefas concluídas utilizando DTO[cite: 17].

## 🚀 Como Executar o Projeto

1. Clone este repositório em sua máquina local.
2. Abra a pasta do projeto na sua IDE de preferência (VS Code, IntelliJ, etc.).
3. Aguarde o Maven baixar as dependências do projeto.
4. [cite_start]Execute o arquivo `ListatarefasApplication.java`[cite: 27].
5. A API estará rodando localmente na porta `8080`. O banco de dados H2 é inicializado automaticamente.

## 📍 Endpoints da API

[cite_start]Abaixo estão as rotas disponíveis para teste[cite: 31]:

| Método HTTP | Endpoint | Descrição |
| :--- | :--- | :--- |
| **GET** | `/tarefas` | [cite_start]Retorna a lista de todas as tarefas cadastradas[cite: 32]. |
| **POST** | `/tarefas` | [cite_start]Cria uma nova tarefa a partir dos dados enviados no formato JSON[cite: 32]. |
| **PUT** | `/tarefas/{id}` | [cite_start]Atualiza os dados de uma tarefa existente com base no seu ID[cite: 32]. |
| **DELETE**| `/tarefas/{id}` | [cite_start]Remove uma tarefa específica do sistema com base no seu ID[cite: 32]. |
| **GET** | `/tarefas/resumo`| Retorna a contagem total de tarefas que já foram marcadas como concluídas. |

### Exemplo de Payload (POST e PUT)
```json
{
  "titulo": "Estudar Spring Boot",
  "descricao": "Revisar anotações de persistência de dados",
  "concluida": false
}
