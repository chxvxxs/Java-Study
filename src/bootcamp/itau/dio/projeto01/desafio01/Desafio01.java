package bootcamp.itau.dio.projeto01.desafio01;

//Criar um programa que leia uma unica palavra e verifique se ela e exatamente igual a DEPOSITO, SAQUE ou TRANSFERENCIA. Se for igual a uma dessas opcoes, a operacao deve ser considerada valida. Caso contrario, ela deve ser considerada invalida. A comparacao deve respeitar exatamente os caracteres informados, incluindo letras maiusculas e minusculas. Assim, deposito e DEPOSITO devem ser tratados como valores diferentes. O problema foi pensado para praticar fundamentos de Java, como leitura de entrada, uso de strings, comparacao de texto e estruturas condicionais, mas a solucao pode ser implementada em qualquer linguagem usando apenas recursos padrao.

import java.util.Scanner;

public class Desafio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        boolean operationValid = false;
        if (word.equals("DEPOSITO") || word.equals("SAQUE") || word.equals("TRANSFERENCIA")) {
            operationValid = true;
        } else {
            operationValid = false;
        }
        System.out.println(operationValid ? "VALID" : "INVALID");

        sc.close();
    }
}
