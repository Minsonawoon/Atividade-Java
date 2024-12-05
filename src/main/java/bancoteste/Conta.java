package bancoteste;

import java.util.Random;
import java.util.Scanner;

public class Conta {
    int numero_conta;
    String titular_conta;
    double saldo;
    double valor_juros;

    Scanner entrada = new Scanner(System.in);

    public Conta(String nome_titular, double saldo_inicial) {
        this.titular_conta = nome_titular;
        this.saldo = saldo_inicial;

        Random gerador_numero = new Random();
        numero_conta = gerador_numero.nextInt(1000); //gerador randomico de números
    }

    public void VerSaldo() {
        System.out.println("O número da conta é: " + numero_conta);
        System.out.println("O nome do titular é: " + titular_conta);
        System.out.println("O saldo da conta é: " + saldo);
    }

    public void Saque(double valor_saque) {
        if(saldo >= valor_saque) {
            saldo = saldo - valor_saque;
            System.out.println("Seu saldo atual é de: " + saldo);
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void Deposito(double valor_deposito) {
        if(valor_deposito <= 0) {
            System.out.println("Depósito inválido!");
        } else {
            saldo = saldo + valor_deposito;
            System.out.println("Seu saldo atual é de: " + saldo);
        }
    }

    public void Emprestimo(double valor_emprestimo) {
        double taxa_juros = 0.08;

        if(valor_emprestimo > saldo) {
            System.out.println("Empréstimo negado!");
        } else if (valor_emprestimo <= 0) {
            System.out.println("Valor inválido!");
        } else {
            double valor_juros = valor_emprestimo * (1 + taxa_juros);
            saldo = saldo + valor_emprestimo;
            System.out.println("Empréstimo aprovado de: " + valor_emprestimo);
            System.out.println("Valor a pagar com juros: " + valor_juros);
            System.out.println("O seu saldo atual é de: " + saldo);
        }
    }

    public void Boleto(double pagamento) {
        if (pagamento <= 0) {
            System.out.println("Pagamento inválido!");
        } else if (pagamento <= valor_juros) {
            valor_juros -= pagamento;
            System.out.println("Pagamento parcial efetuado.");
            System.out.println("Valor restante do empréstimo: " + valor_juros);
        } else {
            System.out.println("Pagamento inválido! Valor maior que o empréstimo.");
        }
    }

    public void Iniciar() {
        int opcao;
        do {
            Exibir_menu();
            opcao = entrada.nextInt();
            Escolher_funcao(opcao);
        } while (opcao != 6);
    }

    public void Exibir_menu() {
        System.out.println("Bem-vindo ao banco da Melchinha");
        System.out.println("Escolha sua opção");
        System.out.println("1 - ver saldo");
        System.out.println("2 - sacar");
        System.out.println("3 - depositar");
        System.out.println("4 - empréstimo");
        System.out.println("5 - pagar com boleto");
        System.out.println("6 - finalizar");
    }

    public void Escolher_funcao(int opcao) {
        double saque;
        double deposito;
        double emprestimo;
        double pagamento;

        switch (opcao) {
            case 1:
                VerSaldo();
                break;
            case 2:
                System.out.println("Digite o valor a ser sacado: ");
                saque = entrada.nextDouble();
                Saque(saque);
                break;
            case 3:
                System.out.println("Digite o valor a ser depositado: ");
                deposito = entrada.nextDouble();
                Deposito(deposito);
                break;
            case 4:
                System.out.println("Digite o valor do empréstimo requerido: ");
                emprestimo = entrada.nextDouble();
                Emprestimo(emprestimo);
                break;
            case 5:
                System.out.println("Digite o quanto você quer pagar do seu empréstimo com boleto: ");
                pagamento = entrada.nextDouble();
                Boleto(pagamento);
                break;
            case 6:
                System.out.println("Operação Finalizada!");
                break;
            default:
                System.out.println("Opção inválida!");
        }
    }

}
