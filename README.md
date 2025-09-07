# README - Sistema de Processamento de Pagamentos e Notificações em Java

Este documento serve como uma descrição detalhada do projeto Java que implementa um sistema básico de processamento de pagamentos e envio de notificações. O projeto é estruturado em pacotes que organizam as classes de entidades, interfaces e implementações específicas.

## Estrutura de Arquivos e Classes

### Pacote `entities`

Este pacote contém as classes que representam entidades do sistema, como métodos de pagamento, notificações, e utilidades gerais.

#### Classe `CreditCard`

Representa um cartão de crédito com um número associado.

- Construtor padrão.
- Construtor que aceita um número de cartão como argumento.
- Método `getCardNumber()` que retorna o número do cartão.

#### Classe `CreditCardProcessor`

Implementa a interface `PaymentProcessor` para processar pagamentos feitos com `CreditCard`.

- Método `processPayment(CreditCard payment)` exibe uma mensagem indicando que o pagamento com o cartão de crédito especificado está sendo processado.

#### Classe `Email`

Representa um email com um endereço.

- Construtor que aceita um endereço de email como argumento.

#### Classe `EmailNotifier`

Implementa a interface `Notifier` para enviar notificações via email.

- Método `send(Email message)` exibe uma mensagem indicando que um email está sendo enviado para o endereço especificado.

#### Classe `MemoryRepository`

Representa um repositório em memória que pode armazenar qualquer tipo de objeto.

- Método `save(T obj)` adiciona um objeto ao repositório.
- Método `findAll()` retorna uma lista imutável de todos os objetos armazenados.

#### Classe `Numeros`

Representa um container para um valor inteiro.

- Construtores padrão e parametrizado.
- Métodos getter e setter para o valor inteiro.

#### Classe `Pix`

Representa um método de pagamento via PIX com uma chave associada.

- Construtor que aceita uma chave PIX como argumento.

#### Classe `PixProcessor`

Implementa a interface `PaymentProcessor` para processar pagamentos feitos via PIX.

- Método `processPayment(Pix payment)` exibe uma mensagem indicando que o pagamento com a chave PIX especificada está sendo processado.

### Pacote `interfaces`

Contém as interfaces genéricas que definem as funcionalidades básicas de processamento de pagamentos e envio de notificações.

#### Interface `PaymentProcessor`

Define um método genérico `processPayment(T payment)` para processar um pagamento de algum tipo.

#### Interface `Notifier`

Define um método genérico `send(T message)` para enviar uma notificação de algum tipo.

#### Interface `Repository`

Define métodos genéricos para armazenar (`save(T obj)`) e recuperar (`findAll()`) objetos em um repositório.

## Utilização

O sistema é projetado para ser flexível e extensível, permitindo a adição de novos métodos de pagamento e notificações com facilidade, graças às interfaces genéricas e à abstração utilizada nas implementações.

### Exemplos de Uso

- **Processamento de Pagamento com Cartão de Crédito**:
  ```java
  CreditCard card = new CreditCard("1234 5678 9101 1121");
  CreditCardProcessor processor = new CreditCardProcessor();
  processor.processPayment(card);
  ```

- **Envio de Notificações por Email**:
  ```java
  Email email = new Email("usuario@example.com");
  EmailNotifier notifier = new EmailNotifier();
  notifier.send(email);
  ```

- **Armazenamento de Dados em Repositório em Memória**:
  ```java
  MemoryRepository<String> repository = new MemoryRepository<>();
  repository.save("Dados");
  List<String> allData = repository.findAll();
  ```

## Conclusão

Este projeto demonstra um sistema básico mas eficiente de processamento de pagamentos e envio de notificações em Java, utilizando boas práticas de programação como o uso de interfaces e injeção de dependência para facilitar a manutenção e expansão futura do código.