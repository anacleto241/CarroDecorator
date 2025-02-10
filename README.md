# 🚗 Projeto: Personalização de Carro com Padrão Decorator

## 📌 Sobre o Projeto
Este projeto demonstra a utilização do **Padrão de Projeto Decorator** em Java, aplicado ao contexto de personalização de um carro. Ele permite adicionar opcionais como **Ar-Condicionado**, **Rodas de Liga Leve** e **Direção Hidráulica** de forma flexível e dinâmica, sem modificar diretamente a classe base do carro.

## 🎯 Objetivo
- Demonstrar o funcionamento do **Padrão Decorator** na prática.
- Permitir a adição de funcionalidades sem modificar o código base.
- Mostrar como objetos podem ser decorados dinamicamente.

## 🛠️ Tecnologias Utilizadas
- **Java**
- **Paradigma Orientado a Objetos**
- **Padrão de Projeto Decorator**

## 📂 Estrutura do Projeto
```
/car-decorator
│── src
│   ├── Carro.java               # Interface para os carros
│   ├── CarroBasico.java         # Implementação de um carro simples
│   ├── CarroDecorator.java      # Classe abstrata para os decoradores
│   ├── ArCondicionado.java      # Decorador para Ar-Condicionado
│   ├── RodasLigaLeve.java       # Decorador para Rodas de Liga Leve
│   ├── DirecaoHidraulica.java   # Decorador para Direção Hidraulica
│   ├── CarroDecoratorDemo.java  # Classe principal (main) para testes
│
└── README.md                    # Documentação do projeto
```

## 📌 Como Funciona?
Cada acessório (“decorador”) **envolve** o carro base, adicionando novas funcionalidades sem modificar diretamente a implementação original.

## 🎯 Benefícios do Padrão Decorator
✅ **Flexibilidade:** Permite adicionar funcionalidades de forma dinâmica.  
✅ **Reutilização de Código:** Evita a criação de diversas subclasses para cada variação de carro.  
✅ **Segue o Princípio Aberto-Fechado (OCP):** O código está aberto para extensão, mas fechado para modificação.  

## 📌 Licença
Este projeto está sob a licença MIT - veja o arquivo [LICENSE](LICENSE) para mais detalhes.

## 👨‍💻 Autor
* [Fabrício Anacleto Ferreira](https://github.com/anacleto241)

