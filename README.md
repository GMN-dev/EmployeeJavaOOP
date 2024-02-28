# Sistema de Pagamento de Funcionários

![image](https://github.com/GMN-dev/EmployeeJavaOOP/assets/84913052/3130de83-f35a-4a91-8641-524b1d993fa1)


Este é um sistema simples em Java para calcular pagamentos de funcionários e terceirizados.

## Objetivo

O objetivo deste sistema é fornecer uma ferramenta para calcular os pagamentos de funcionários, permitindo a inclusão de funcionários terceirizados que possuem uma taxa adicional. Ele visa demonstrar conceitos básicos de programação orientada a objetos em Java, incluindo herança, polimorfismo e encapsulamento.

## Conceitos de Java e POO Utilizados

- **Classes e Objetos:** O sistema é construído com base em classes como `Employee` e `OutsourceEmployee`, representando os funcionários e funcionários terceirizados, respectivamente.
- **Herança:** A classe `OutsourceEmployee` herda os atributos e métodos da classe `Employee`, demonstrando o conceito de herança em Java.
- **Polimorfismo:** O polimorfismo é demonstrado ao percorrer a lista de funcionários e chamar o método `payment()` para cada um, independentemente de ser um funcionário regular ou terceirizado.
- **Encapsulamento:** Os atributos das classes são encapsulados usando modificadores de acesso, garantindo o acesso controlado aos dados.

## Requisitos do Sistema

- JDK (Java Development Kit)
- IDE Java (Eclipse, IntelliJ IDEA, NetBeans, etc.)

## Executando o Sistema

1. Clone ou baixe o repositório em sua máquina local.
2. Abra o projeto em sua IDE Java.
3. Compile e execute o arquivo `Main.java`.
4. Siga as instruções fornecidas no console para inserir os detalhes dos funcionários.
5. Após inserir os dados, o sistema calculará os pagamentos e exibirá os resultados no console.

## Detalhes de Implementação

O sistema consiste em duas classes principais:

- `Employee`: Representa um funcionário regular com nome, horas trabalhadas e valor por hora.
- `OutsourceEmployee`: Representa um funcionário terceirizado que herda os atributos de `Employee` e possui uma taxa adicional.

O programa solicitará ao usuário que insira o número de funcionários e, em seguida, os detalhes de cada funcionário. Para funcionários terceirizados, uma taxa adicional será solicitada.

## Exemplo de Utilização

Ao executar o programa, o usuário é solicitado a inserir o número de funcionários. Em seguida, ele é solicitado a inserir os detalhes de cada funcionário, incluindo se é terceirizado ou não. Após inserir os detalhes, o sistema calcula os pagamentos e os exibe no console.

<br><br><br>

# Employee Payment System

This is a simple Java system to calculate payments for regular and outsourced employees.

## Objective

The objective of this system is to provide a tool to calculate employee payments, allowing the inclusion of outsourced employees who have an additional fee. It aims to demonstrate basic concepts of object-oriented programming (OOP) in Java, including inheritance, polymorphism, and encapsulation.

## Java and OOP Concepts Used

- **Classes and Objects:** The system is built based on classes such as `Employee` and `OutsourceEmployee`, representing regular and outsourced employees, respectively.
- **Inheritance:** The `OutsourceEmployee` class inherits attributes and methods from the `Employee` class, demonstrating the concept of inheritance in Java.
- **Polymorphism:** Polymorphism is demonstrated by iterating through the list of employees and calling the `payment()` method for each one, regardless of whether they are regular or outsourced employees.
- **Encapsulation:** Class attributes are encapsulated using access modifiers, ensuring controlled access to data.

## System Requirements

- JDK (Java Development Kit)
- Java IDE (Eclipse, IntelliJ IDEA, NetBeans, etc.)

## Running the System

1. Clone or download the repository to your local machine.
2. Open the project in your Java IDE.
3. Compile and run the `Main.java` file.
4. Follow the instructions provided in the console to input employee details.
5. After entering the details, the system will calculate payments and display the results in the console.

## Implementation Details

The system consists of two main classes:

- `Employee`: Represents a regular employee with name, hours worked, and hourly rate.
- `OutsourceEmployee`: Represents an outsourced employee that inherits attributes from `Employee` and has an additional fee.

The program will prompt the user to input the number of employees and then the details of each employee. For outsourced employees, an additional fee will be requested.

## Example Usage

Upon running the program, the user is prompted to input the number of employees. Subsequently, they are asked to input details for each employee, including whether they are outsourced or not. After entering the details, the system calculates payments and displays them in the console.


