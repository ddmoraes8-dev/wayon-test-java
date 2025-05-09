# 💸 Sistema de Agendamento de Transferências Financeiras

Este projeto é uma aplicação full stack para agendamento de transferências financeiras. Ele inclui:

* **API REST com Java 11 e Spring Boot:** Backend robusto para gerenciar a lógica de negócios e a persistência de dados.
* **Banco de dados H2 (em memória):** Banco de dados leve e fácil de configurar para desenvolvimento e testes.
* **Frontend Angular:** Interface de usuário moderna e reativa para interação com o sistema.
* **Cálculo dinâmico de taxas:** Aplicação de diferentes taxas com base na antecedência da data de transferência.
* **Uso de DTOs e ModelMapper:** Transferência eficiente de dados entre camadas e mapeamento automático de objetos.
* **Tratamento de exceções com mensagens amigáveis:** Respostas claras e informativas para erros na API.

## 🚀 Tecnologias Utilizadas

### Backend (Spring Boot)

* Java 11
* Spring Boot
* Spring Data JPA
* H2 Database
* ModelMapper
* Maven

### Frontend (Angular)

* Angular 16+
* Angular Forms
* HttpClient
* Tailwind CSS (opcional para estilização rápida)

## 📐 Regras de Negócio

Ao agendar uma transferência, o usuário deve informar:

* Conta de origem
* Conta de destino
* Valor da transferência
* Data da transferência desejada

O sistema calcula a taxa de transferência dinamicamente com base no número de dias entre a data atual e a data da transferência agendada, conforme a seguinte tabela:

| Dias (de - até) | Taxa fixa (R$) | Taxa percentual (%) |
| --------------- | -------------- | ------------------- |
| 0 - 0           | 3,00           | 2,5%                |
| 1 - 10          | 12,00          | 0%                  |
| 11 - 20         | 0,00           | 8,2%                |
| 21 - 30         | 0,00           | 6,9%                |
| 31 - 40         | 0,00           | 4,7%                |
| 41 - 50         | 0,00           | 1,7%                |

## 🛠️ Como executar o projeto

### Backend

1.  **Clone o projeto:**
    ```bash
    git clone [https://github.com/ddmoraes8-dev/wayon-test-java](https://github.com/ddmoraes8-dev/wayon-test-java)
    cd [nome do diretório do backend]
    ```

2.  **Certifique-se de ter o Java 11 e o Maven instalados em sua máquina.** Você pode verificar as versões com os seguintes comandos:
    ```bash
    java -version
    mvn -version
    ```

3.  **Execute a aplicação Spring Boot:**
    Navegue até o diretório raiz do projeto backend (onde se encontra o arquivo `pom.xml`) e execute o seguinte comando no seu terminal:
    ```bash
    mvn spring-boot:run
    ```
    Isso irá baixar as dependências necessárias e iniciar o servidor backend. Por padrão, a API estará disponível em `http://localhost:8080`. Você poderá ver logs no seu terminal indicando que a aplicação foi iniciada.

### Frontend

1.  **Navegue até o diretório do frontend:**
    ```bash
    cd [nome do diretório do frontend]
    ```

2.  **Certifique-se de ter o Node.js e o npm (ou yarn/pnpm) instalados.** Você pode verificar as versões com os seguintes comandos:
    ```bash
    node -v
    npm -v
    # ou
    yarn --version
    # ou
    pnpm --version
    ```

3.  **Instale as dependências do projeto Angular:**
    Execute o seguinte comando no seu terminal dentro do diretório do frontend:
    ```bash
    npm install
    # ou usando yarn:
    yarn install
    # ou usando pnpm:
    pnpm install
    ```
    Este comando irá baixar todas as bibliotecas e dependências necessárias para o projeto Angular.

4.  **Execute a aplicação Angular:**
    Após a instalação das dependências, execute o seguinte comando para iniciar o servidor de desenvolvimento do Angular:
    ```bash
    ng serve -o
    # ou usando yarn:
    yarn start
    # ou usando pnpm:
    pnpm start
    ```
    O flag `-o` (ou `--open`) abrirá automaticamente a aplicação no seu navegador, geralmente em `http://localhost:4200`. O Angular CLI irá compilar a aplicação e servir os arquivos. Quaisquer alterações que você fizer no código serão automaticamente recompiladas e o navegador será atualizado.

Com o backend em execução na porta 8080 e o frontend rodando na porta 4200, você poderá interagir com o sistema de agendamento de transferências financeiras através da interface web. Certifique-se de que ambas as aplicações estejam em execução simultaneamente para o funcionamento correto.