# Projeto Final - Lista de Tarefas com Spring Boot

Este projeto é uma API REST completa desenvolvida para gerenciar uma lista de tarefas, construída como requisito de avaliação para o curso de Análise e Desenvolvimento de Sistemas (ADS) no Senac.

**Professora:** Marcileide Cardoso de Souza

## 🛠️ Tecnologias e Ferramentas Utilizadas
* **Java**
* **Spring Boot** (Web, Data JPA, Validation)
* **H2 Database** (Banco de dados em memória para testes rápidos)
* **Maven** (Gerenciador de dependências)
* **Thunder Client / Postman** (Para testes dos endpoints)

## ⚙️ Funcionalidades Implementadas
O projeto contempla um CRUD completo e atende tanto aos requisitos obrigatórios quanto aos opcionais:
- [x] **Criar uma tarefa:** Cadastro com título e descrição (validação inclusa para não permitir campos em branco).
- [x] **Listar todas as tarefas:** Retorna todas as tarefas salvas no banco de dados.
- [x] **Atualizar tarefa:** Permite editar a descrição ou marcar a tarefa como concluída.
- [x] **Excluir tarefa:** Remove uma tarefa específica do sistema utilizando o ID.
- [x] **Contagem de tarefas concluídas (Opcional):** Rota customizada que retorna a quantidade de tarefas finalizadas via DTO.

## 🚀 Como Executar o Projeto

1. Baixe ou clone este repositório na sua máquina local.
2. Abra a pasta do projeto na sua IDE de preferência (VS Code, IntelliJ IDEA, etc.).
3. Aguarde o Maven baixar todas as dependências automaticamente.
4. Execute a aplicação através da classe principal `ListatarefasApplication.java`.
5. A API estará disponível no endereço local `http://localhost:8080`.

## 📍 Endpoints da API

Abaixo estão mapeadas as rotas que podem ser testadas no Thunder Client ou Postman:

| Método HTTP | Endpoint | Descrição da Ação |
| :--- | :--- | :--- |
| **GET** | `/tarefas` | Retorna a lista de todas as tarefas cadastradas. |
| **POST** | `/tarefas` | Cria uma nova tarefa a partir dos dados enviados no corpo da requisição. |
| **PUT** | `/tarefas/{id}` | Atualiza os dados ou o status de uma tarefa existente com base no seu ID. |
| **DELETE**| `/tarefas/{id}` | Remove uma tarefa específica do sistema com base no seu ID. |
| **GET** | `/tarefas/resumo`| Retorna o total de tarefas marcadas como concluídas através de um DTO. |

### 📦 Exemplo de JSON para Envio (POST e PUT)
```json
{
  "titulo": "Finalizar projeto de ADS",
  "descricao": "Testar todas as rotas da API no Thunder Client",
  "concluida": false
}
