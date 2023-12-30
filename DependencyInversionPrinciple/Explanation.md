# Princípio da Inversão de Dependência (Dependency Inversion Principle - DIP):

- Este princípio propõe que módulos de alto nível não devem depender de módulos de baixo nível. Ambos devem depender de abstrações. Além disso, abstrações não devem depender de detalhes, mas detalhes devem depender de abstrações. Em termos simples, a dependência deve ser invertida, com a introdução de interfaces ou abstrações que desacoplam componentes do sistema.

```java
// Violando DIP
class Lampada {
    void ligar() {
        // implementação
    }
}

class Interruptor {
    Lampada lampada;

    void acionar() {
        lampada.ligar();
    }
}

// Respeitando DIP
interface Dispositivo {
    void ligar();
}

class Lampada implements Dispositivo {
    @Override
    public void ligar() {
        // implementação
    }
}

class Interruptor {
    Dispositivo dispositivo;

    void acionar() {
        dispositivo.ligar();
    }
}
```

O Princípio da Inversão de Dependência (Dependency Inversion Principle - DIP) é um dos cinco princípios do S.O.L.I.D. e foi introduzido por Robert C. Martin. Este princípio sugere duas diretrizes principais: módulos de alto nível não devem depender de módulos de baixo nível, ambos devem depender de abstrações; e abstrações não devem depender de detalhes, mas detalhes devem depender de abstrações. Em resumo, a dependência deve ser invertida, com a introdução de interfaces ou abstrações que desacoplam componentes do sistema.

### Detalhamento do DIP:

1. **Dependência em Abstrações:**
   - Classes de alto nível (ou módulos) devem depender de abstrações (interfaces ou classes abstratas) em vez de depender de implementações concretas. Isso permite maior flexibilidade, pois as implementações podem ser substituídas sem afetar as classes de alto nível.

2. **Abstrações Não Dependem de Detalhes:**
   - As abstrações (interfaces ou classes abstratas) não devem depender de detalhes de implementação. Em outras palavras, o código que usa interfaces não deve ser afetado por alterações internas nas classes concretas que implementam essas interfaces.

3. **Exemplo Prático:**
   - Considere um sistema de notificação com classes `NotificadorEmail` e `NotificadorSMS`. Se as classes de alto nível dependerem diretamente das implementações concretas, isso violaria o DIP. Em vez disso, podemos introduzir uma interface comum `Notificador` que ambas as implementações seguem.

```java
// Violando DIP
class Cliente {
    NotificadorEmail notificador = new NotificadorEmail();

    void realizarCompra() {
        // lógica da compra
        notificador.notificar(); // dependência direta da implementação concreta
    }
}

// Respeitando DIP
interface Notificador {
    void notificar();
}

class NotificadorEmail implements Notificador {
    @Override
    public void notificar() {
        // lógica de notificação por e-mail
    }
}

class NotificadorSMS implements Notificador {
    @Override
    public void notificar() {
        // lógica de notificação por SMS
    }
}

class Cliente {
    Notificador notificador;

    Cliente(Notificador notificador) {
        this.notificador = notificador;
    }

    void realizarCompra() {
        // lógica da compra
        notificador.notificar(); // dependência de abstração
    }
}
```

4. **Benefícios do DIP:**
   - Maior flexibilidade na substituição de implementações concretas.
   - Menor acoplamento entre componentes do sistema.
   - Facilita a manutenção e evolução do código.

O DIP contribui para a criação de sistemas mais modularizados e flexíveis, onde as mudanças em uma parte do sistema têm menos impacto em outras partes. Isso promove a escalabilidade e a manutenção eficiente do código ao longo do tempo.

_____

Here is an example of applying the Dependency Inversion Principle in Java: [^1]

We'll create an interface to represent the dependency:

```java
interface PaymentProcessor {
  void processPayment(Order order);
}
```

Then create a concrete implementation of that interface:

```java
class PaymentService implements PaymentProcessor {

  public void processPayment(Order order) {
    // payment processing logic
  }

}
```

Our client class will depend on the interface rather than the concrete implementation:

```java
class OrderService {

  private PaymentProcessor paymentProcessor;

  public OrderService(PaymentProcessor paymentProcessor) {
    this.paymentProcessor = paymentProcessor; 
  }

  public void placeOrder(Order order) {
    // order placement logic
    paymentProcessor.processPayment(order);
  }

}
```

When creating an instance of OrderService, we pass in the concrete PaymentService: [^2]

```java
PaymentProcessor paymentProcessor = new PaymentService();
OrderService orderService = new OrderService(paymentProcessor);
```

This allows OrderService to remain decoupled from the specific payment processing implementation. We've inverted the dependency by having the client depend on abstractions rather than concretions. Let me know if any part needs more explanation!

Sources:

[^1]: [Dependency Injection, Dependency Inversion, and the Inversion of Control…](https://medium.com/@christopher.jamescooke/dependency-injection-dependency-inversion-and-the-inversion-of-control-15fa34851d97)

[^2]: [Exploring the Dependency Inversion Principle 🚀](https://levelup.gitconnected.com/exploring-the-dependency-inversion-principle-b075466c220f)

