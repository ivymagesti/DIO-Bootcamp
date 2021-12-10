package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner ler = new Scanner (System.in);
        int tentativas = 0;
        int limiteTentativas;
        int resposta;
        System.out.println("Informe o número de tentativas: ");
        limiteTentativas = ler.nextInt();

        while (tentativas < limiteTentativas) {
            System.out.println("quanto é 5+5: ");
            resposta = ler.nextInt();
            if (resposta != 10) {
                System.out.println("Resposta errada");
                tentativas++;
                    if (tentativas == limiteTentativas){
                        System.out.println("Limite de tentativas atingido");
                        break;
                    }
            } else {
                System.out.println("Resposta correta");
                break;
            }

        }
    }
    }
