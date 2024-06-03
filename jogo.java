package jogo;

import java.util.Random;
import java.util.Scanner;
public class jogo {
    public static void main(String[] args) {
        Random random = new Random();
        int dado1 = 0;
        int dado2 = 0;
        int especiais=0;
        int especiais2=0;
        dado1= random.nextInt(6)+1;
        dado2= random.nextInt(6)+1;
        int[]azar={3, 5, 7, 9, 13, 15, 19, 22, 27,30};
        int[]sorte= {2, 4, 8, 11, 14, 16, 18, 21, 24, 29};
        int soma1= 0;
        int soma2=0;



        int jogadores = 1, numero, numero2;

        while ((jogadores != 0) && (dado1 < 31) && (dado2 < 31)) {
            Scanner leia = new Scanner(System.in);
            System.out.println("Bem vindo a floresta de Eldória");
            System.out.println("De quem é vez?");
            System.out.println("1- Willow");
            System.out.println("2- Finnegan");
            jogadores = leia.nextInt();
        switch (jogadores){
        case 1:
        System.out.println("5- Insira o numero cinco para rolar o dado");
        numero = leia.nextInt();
        if (numero == 5) {
            dado1 = random.nextInt(6)+1;
            System.out.println("Seu dado é " + dado1);
            soma1+= especiais;
            especiais+=dado1;
            System.out.println("sua posicao  inicial é "+especiais);



        }if (especiais == azar[0]||especiais == azar[1]||especiais == azar[2]||especiais == azar[3]||especiais == azar[4]||especiais == azar[5]||especiais ==azar[6]||especiais == azar[7]||especiais == azar[8]||especiais == azar[9]){
             especiais= especiais-2;
            System.out.println("sua posição final da rodada é "+ especiais);
        }if(especiais == sorte[0]||especiais == sorte[1]||especiais == sorte[2]||especiais == sorte[3]||especiais == sorte[4]||especiais == sorte[5]||especiais ==sorte[6]||especiais == sorte[7]||especiais == sorte[8]||especiais == sorte[9]){
            especiais= especiais + 2;
            System.out.println("sua posição final da rodada é "+ especiais);

        }if(especiais>=31){
            System.out.println("Paabéns Willow ganhou!!!!");
        }

        break;
        case 2:
            System.out.println("5- Insira o numero cinco para rolar o dado");
            numero = leia.nextInt();
            if (numero == 5) {
                dado2 = random.nextInt(6)+1;
                System.out.println("Seu dado é " + dado2);
                soma2+= especiais2;
                especiais2+=dado2;
                System.out.println( "sua posicao  inicial é "+especiais2);



            }if (especiais2 == azar[0]||especiais2 == azar[1]||especiais2 == azar[2]||especiais2 == azar[3]||especiais2 == azar[4]||especiais2 == azar[5]||especiais2 ==azar[6]||especiais2 == azar[7]||especiais2 == azar[8]||especiais2 == azar[9]){
            especiais2= especiais2-2;
            System.out.println("sua posição final da rodada é "+ especiais2);
        }if(especiais2 == sorte[0]||especiais2 == sorte[1]||especiais2 == sorte[2]||especiais2 == sorte[3]||especiais2 == sorte[4]||especiais2 == sorte[5]||especiais2 ==sorte[6]||especiais2 == sorte[7]||especiais2 == sorte[8]||especiais2 == sorte[9]){
            especiais2= especiais2 + 2;
            System.out.println("sua posição final da rodada é "+ especiais2);

        }if(especiais2>=31){
            System.out.println("Paabéns Finnegan ganhou!!!!");
        }

            break;

    }
}







    }
}

