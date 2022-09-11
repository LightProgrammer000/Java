package Aulas_Console;

import java.util.Scanner;

public class Programa_10 
{
    public static void main(String[] args) 
    {
        int joga;
        int computa = 0;
        
        // MÉTODO HONESTO
        
        Scanner ent = new Scanner ( System.in );
        
        // JOGADOR
        System.out.println(" Escolha os número correspondentes " + " \n" + " 1 - pedra " + " \n" + " 2 - papel " + " \n" + " 3 - tesoura " + " \n ");
        joga = ent.nextInt();
        
        switch( joga )
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
        
        // VALIDAÇÃO DA PARTIDA
        if( joga <= 3 && joga > 0 )
        {
            // COMPUTADOR
            computa = ( int ) ( Math.random() * 3 + 1 );
            
            switch ( computa )
            {
                case 1:
                    System.out.println(" Computador: pedra ");
                    break;
                
                case 2:
                    System.out.println(" Computador: papel ");
                    break;
                
                default:
                    System.out.println(" Computador: tesoura ");
                    break;
            }
            
            // RESULTADOS
            if ( joga != computa )
            {
                if( joga == 1 && computa == 3 || joga == 2 && computa == 1 || joga == 3 && computa == 2 )
                {
                    System.out.println(" JOGADOR VENCE ");
                }
                
                else
                {
                    System.out.println(" COMPUTADOR VENCE ");
                }
            }
            
            else
            {
                System.out.println(" EMPATE "); 
            }
        }
        
        else
        {
            System.out.println("PARTIDA INVÁLIDA");
        }
    }
}
