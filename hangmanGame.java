/*
 * Jogo da Forca
 */

package Tarefas_Jogos;

// Bibliotecas
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Jogo_da_Forca 
{
    public static void main(String[] args) 
    {
        try
        {
            jogar();                        
        }

        catch (Exception e)
        {
            //System.err.println(e);            
        }
    }

    // Metodo: Programa principal
    private static void jogar() 
    {
        // Variaveis
        char letra;
        int erro = 0;

        // Variaveis: vetores
        char palavra [] = sorteio_Palavra();// Sorteando palavra e colocando no vetor
        char tabuleiro [] = iniciar_Tabuleiro(palavra); // Inicializando o tabuleiro

        // Instanciacao
        Scanner ent = new Scanner(System.in);

        while (erro < 8 && !Arrays.equals(tabuleiro, palavra))
        {
            // Chamada de metodo
            exibir_Tabuleiro(tabuleiro);

            // Entrada de dados
            System.out.print("\n Informe a letra: ");
            letra = ent.next().toUpperCase().charAt(0);
            System.out.println("\n*----------------------------*");

            if ( acertou(letra, palavra) )
            {
                atualizando_tabuleiro(letra, palavra, tabuleiro);
            }

            else
            {
                System.out.println("* Erro: " + (++erro) + "\n");
            }
        }

        // Estrutura de decisao: Analise de acertos
        if (erro == 8)
        {
            System.out.println("\n***********************");
            System.out.println("# Errou");
            palavra_sorteada(palavra);
            System.out.println("\n***********************");
        }

        else
        {
            System.out.println("\n***********************");
            System.out.println("# Acertou");
            System.out.println("***********************");
        }
    }

    // Funcao: Sorteio da palavra
    private static char[] sorteio_Palavra() 
    {
        // Variaveis locais
        int num_sorteio_palavra;

        // Instanciacao
        Random rd = new Random();

        // Numero para sorteio da palavra: 1 a 10
        num_sorteio_palavra = (rd.nextInt(10) + 1);

        // Estrutura de escolha
        switch (num_sorteio_palavra)
        {
            case 1:
                return new char[] {'U', 'V', 'A'};

            case 2:
                return new char[] {'B','A','N','A','N','A'};

            case 3:
                return new char[] {'A','B','A','C','A','X','I'};

            case 4:
                return new char[] {'M','A','N','G','A'};

            case 5:
                return new char[] {'M','A','R','A','C','U','J','A'};

            case 6:
                return new char[] {'L','A','R','A','N','J','A'};

            case 7:
                return new char[] {'M','O','R','A','N','G','O'};

            case 8:
                return new char[] {'L','I','M','A','O'};

            case 9:
                return new char[] {'A','C','E','R','O','L','A'};

            case 10:
                return new char[] {'C','A','Q','U','I'};
        }
        /*
        case A:
            char palavra_1 [] = {'T', 'E', 'S', 'T', 'E'};
            return palavra_1;

        case B:
            return new char[] {'T', 'E', 'S', 'T', 'E'};
        */

        return null;
    }

    // Metodo: Palavra sorteada
    private static void palavra_sorteada(char palavra[])
    {
        System.out.print("* Palavra: ");

        for (int i = 0; i < palavra.length; i++)
        {
            System.out.print(palavra[i]);        
        }
    }

    // Metodo: Exibir tabuleiro
    private static void exibir_Tabuleiro(char tabuleiro[]) 
    {
        for (int i = 0; i < tabuleiro.length; i++) 
        {
            System.out.print("  " + tabuleiro[i]);            
        }
        
        System.out.println("");
    }

    // Funcao: Montagem do tabuleiro com o tamanho da palavra sorteada
    private static char[] iniciar_Tabuleiro(char palavra[]) 
    {
        // Variaveis locais
        char aux[] = new char[palavra.length];
        
        for (int i = 0; i < palavra.length; i++) 
        {
            aux[i] = '-';
        }

        return aux;
    }

    // Funcao: Acerto de palavra a letra
    private static boolean acertou(char letra, char palavra[]) 
    {
        // Estrutura de repeticao
        for (int i = 0; i < palavra.length; i++) 
        {
            if (letra == palavra[i])
            {
                return true;
            }
        }

        return false;
    }

    // Metodo: Atualizando do tabuleiro
    private static void atualizando_tabuleiro(char letra, char palavra[], char tabuleiro[]) 
    {
        for (int i = 0; i < tabuleiro.length; i++) 
        {
            if (letra == palavra[i]) 
            {
                tabuleiro[i] = letra;                                
            }
        }
    }
}
