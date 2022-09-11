package Aulas_Console;

import java.util.Random;
import java.util.Scanner;

public class AX_Programa_10 
{
    static Random rd = new Random();
    static Scanner ent = new Scanner (System.in);

    public static void main(String[] args) 
    {
        try 
        {
            while (true) 
            {
                jogar();   
            }
        }
        
        catch (Exception e)
        {
            System.err.println(e);
        }
    }

    private static void jogar()
    {
        int jogador;
        int computador = 0;

        resultado(escolha_jogador(),escolha_computador());
    }

    private static int escolha_jogador() 
    {
        while (true)
        {
            // JOGADOR
            System.out.println("\n Escolha os número correspondentes " + " \n" + " 1 - pedra " + " \n" + " 2 - papel " + " \n" + " 3 - tesoura " + " \n ");
            System.out.print("# Opc: ");
            int opc = ent.nextInt();

            if (!(opc > 0 && opc < 4)) 
            {
                continue;
            }

            switch (opc)
            {
                case 1:
                   System.out.println("\n Jogador: pedra "); 
                   break;

               case 2:
                   System.out.println("\n Jogador: papel ");
                   break;

               case 3:
                   System.out.println("\n Jogador: tesoura ");
                   break;

               default:
                   System.out.println("\n Opção Inválida "); 
                   break;
            }

            return opc;
        }
    }
    
    private static int escolha_computador()
    {
        int computador = rd.nextInt(3) + 1;
       
        // COMPUTADOR
        switch (computador)
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

        return computador;
    }

    private static void resultado(int jogador, int computador)
    {
        // RESULTADOS
        if ( jogador != computador )
        {
            if( (jogador == 1 && computador == 3) || (jogador == 2 && computador == 1) || (jogador == 3 && computador == 2) )
            {
                System.out.println(" RESULTADO: JOGADOR VENCE ");
            }

            else
            {
                System.out.println(" RESULTADO: COMPUTADOR VENCE ");
            }
        }

        else
        {
            System.out.println(" RESULTADO: EMPATE "); 
        }
    }    
}
