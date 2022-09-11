package Aulas_Console;

import java.util.Scanner;

// PROGRAMA JOKENPO
public class Programa_09 
{
    public static void main( String args [] )
    {
        int jogador;
        int computador;
        
        Scanner ent = new Scanner( System.in );
        
        System.out.println("\n Escolha os número correspondentes " + " \n" + " 1 - pedra " + " \n" + " 2 - papel " + " \n" + " 3 - tesoura " + " \n ");
        System.out.print(" - Resp.: ");
        jogador = ent.nextInt();
        
        // MÉTODO VICIADO
        switch(jogador)
        {
            case 1:
                System.out.println(" Jogador : pedra ");
                System.out.println(" Máquina : papel ");
                System.out.println(" Máquina Wins");
                break;
                
            case 2:
                System.out.println(" Jogador : papel ");
                System.out.println(" Máquina : tesoura ");
                System.out.println(" Máquina Wins");
                break;
                
            case 3:
                System.out.println(" Jogador : tesoura  ");
                System.out.println(" Máquina : pedra ");
                System.out.println(" Máquina Wins");
                break;
                
            default:
                System.out.println(" Opção Inválida ");
                break;
        }  
        
        System.out.println();
        System.out.println("-------------------------");
        
        // MÉTODO HONESTO
        
        // JOGADOR
        System.out.println(" Escolha os número correspondentes " + " \n" + " 1 - Pedra " + " \n" + " 2 - Papel " + " \n" + " 3 - Tesoura " + " \n ");
        System.out.print(" - Resp.: ");
        jogador = ent.nextInt();
        
        switch(jogador)
        {
            case 1:
                System.out.println(" Jogador: pedra "); 
                break;

            case 2:
                System.out.println(" Jogador: papel ");
                break;

            case 3:
                System.out.println(" Jogador: tesoura ");
                break;
                
            default:
                System.out.println(" Opção Inválida "); 
                break;
        }
        
        // COMPUTADOR
        computador = (int) ( Math.random() * 3 + 1 );
         
        switch (computador)
        {
            case 1:
                System.out.println(" Computador: pedra ");
                break;
                
            case 2:
                System.out.println(" Computador: papel ");
                break;
                
            case 3:
                System.out.println(" Computador: tesoura ");
                break;
        }
        
        // RESULTADO
        switch (jogador)
        {
            // JOGADOR - PEDRA
            case 1: 
                switch (computador)
                {
                    case 1:
                        System.out.println(" EMPATE "); // PEDRA
                        break;
                        
                    case 2:
                        System.out.println(" COMPUTADOR VENCE "); // PAPEL
                        break;
                        
                    default:
                        System.out.println(" JOGADOR VENCE "); // TESOURA
                        break;
                }

                break;
         
            // JOGADOR - PAPEL
            case 2:
                switch (computador)
                {
                    case 1:
                        System.out.println(" JOGADOR VENCE "); // PEDRA
                        break;
                        
                    case 2:
                        System.out.println(" EMPATE "); // PAPEL
                        break;
                        
                    default:
                        System.out.println(" COMPUTADOR VENCE "); // TESOURA
                        break;
                }

                break;
        
            // JOGADOR - TESOURA
            case 3:
                switch (computador)
                {
                    case 1:
                        System.out.println(" COMPUTADOR VENCE "); // pedra
                        break;
                        
                    case 2:
                        System.out.println(" JOGADOR VENCE "); // papel
                        break;
                        
                    default:
                        System.out.println(" EMPATE "); // tesoura
                        break;
                }
                
                break;
                
            // NENHUM CASO 
            default:
                System.out.println(" JOGADOR NÃO JOGOU NADA !!");
                break;
        }
    }
}
