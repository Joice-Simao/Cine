package org.example;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        int linha = 0,coluna = 0, fileira = 0, poltrona = 0, opcao;

        System.out.println("\u001b[7m              Cine Joy                  \u001b[m");
        System.out.println("\u001b[3mTrazendo alegria para você e sua família!\n\u001b[m");

        String [][] cinema = new String[11][11];
        cinema [0][0] = " ";
        cinema [0][1] = " 1";
        cinema [0][2] = "2";
        cinema [0][3] = "3";
        cinema [0][4] = "4";
        cinema [0][5] = "5";
        cinema [0][6] = "6";
        cinema [0][7] = "7";
        cinema [0][8] = "8";
        cinema [0][9] = "9";
        cinema [0][10] = "10";

        cinema [0][0] = " ";
        cinema [1][0] = " 1";
        cinema [2][0] = " 2";
        cinema [3][0] = " 3";
        cinema [4][0] = " 4";
        cinema [5][0] = " 5";
        cinema [6][0] = " 6";
        cinema [7][0] = " 7";
        cinema [8][0] = " 8";
        cinema [9][0] = " 9";
        cinema [10][0] = "10";

        for(linha = 1; linha < 11; linha++){
            for(coluna = 1; coluna < 11; coluna++){
                cinema [linha][coluna] = "";
            }
        }

        for(linha = 1; linha < 11; linha++){
            for(coluna = 1; coluna < 11; coluna++){
                cinema [linha][coluna] = "O";
            }
        }

        do {
            System.out.println("1 - Reservar poltrona");
            System.out.println("2 - Layout do cinema (veja os lugares disponíveis)");
            System.out.println("3 - Sair");
            opcao = scanner.nextInt();

                switch (opcao) {
                    case 1:
                        System.out.print("Informe o número da fileira : ");
                        fileira = scanner.nextInt();
                        System.out.print("Qual é o número poltrona ?");
                        poltrona = scanner.nextInt();

                        if (cinema[fileira][poltrona] == "O") {
                            cinema[fileira][poltrona] = "X";
                            System.out.println("\u001b[35mPoltrona reservada\u001b[m");
                        } else
                            System.out.println("\u001b[35mPoltrona já ocupada\u001b[m");
                        break;

                    case 2:
                        for (linha = 0; linha < 11; linha++) {
                            for (coluna = 0; coluna < 11; coluna++) {
                                if (cinema[linha][coluna] == "O") {
                                    System.out.print(" \u001b[32m" + cinema[linha][coluna] + "\u001b[m ");

                                }else if(cinema[linha][coluna] == "X" ) {
                                    System.out.print(" \u001b[31m" + cinema[linha][coluna] + "\u001b[m ");

                                }else
                                    System.out.print(" \u001b[33m" + cinema[linha][coluna] + "\u001b[m ");
                            }
                            System.out.println(" ");
                        }
                }

        }while (opcao != 3) ;
    }
}