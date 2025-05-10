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