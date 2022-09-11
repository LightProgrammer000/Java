/*
 * Jogo da Velha
    
    ---------------------------------------------------------
        1   2   3           1   2   3           1   2   3     
    1   X               1       X           1           X
    2   X               2       X           2           X
    3   X               3       X           3           X
    ---------------------------------------------------------

    ---------------------------------------------------------
        1   2   3           1   2   3           1   2   3     
    1   X   X   X       1                   1           
    2                   2   X   X   X       2           
    3                   3                   3   X   X   X
    ---------------------------------------------------------

    ---------------------------------------------------------
        1   2   3           1   2   3           
    1   X               1           X             
    2       X           2       X                   
    3           X       3   X                       
    ---------------------------------------------------------
 */
package Tarefas_Jogos;

// Bibliotecas
import java.util.Scanner;

public class Jogo_da_Velha 
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
        // Variavel de controle
        int contagem_jogadas = 0;
        char vencedor = 'A';
        char jogador = 'X';

        // Variaveis: Matriz Tabuleiro
        int linha, coluna;
        char tabuleiro [][] = new char[3][3];

        // Instanciacao
        Scanner ent = new Scanner(System.in);

        // Chamada de metodo: Inicializando vetor com '*'
        iniciar_tabuleiro(tabuleiro);
        exibir_tabuleiro(tabuleiro);

        // Estrutura de repeticao: Jogadas do jogador
        while (vencedor != 'X' && vencedor != 'O') 
        {
            System.out.printf("\n# Vez do jogador \"%c\"\n\n", jogador);

            System.out.print("# Linha: ");
            linha = ent.nextInt();

            System.out.print("# Coluna: ");
            coluna = ent.nextInt();

            // Estrutura de decisao: 'Linha e Coluna' entre '1 e 3'
            if ( (linha >= 1 && linha <= 3) && (coluna >= 1 && coluna <= 3) ) 
            {
                // Linha: 0, 1, 2 <<==>> Coluna: 0, 1, 2
                tabuleiro[linha - 1][coluna - 1] = jogador;
                
                // Estruturas de decisao: 
                if (contagem_jogadas == 9)
                {
                    System.out.println("\n Empatou");
                    vencedor = 'E';
                }

                else
                {
                    // Estrutura de decisao: Troca de jogador
                    if (jogador == 'X')
                    {
                        jogador = 'O';
                    }

                    else
                    {
                        jogador = 'X';
                    }    
                    
                    // Chamda de metodo: Mostrar tabuleiro
                    exibir_tabuleiro(tabuleiro);
                }

                // Analise de resultado
                vencedor = analise_resultado(tabuleiro);

                // Incremento: Contagem de jogadas
                contagem_jogadas++;
            }   

            else
            {
                System.out.println("\n# Posicao nao existe");
            }
        }
        
        System.out.println("\n -------------------------");
        System.out.println(" # Vencedor: " + vencedor);
        System.out.println(" -------------------------");
    }

    // Metodo: Exibir tabuleiro
    private static void exibir_tabuleiro(char tabuleiro[][]) 
    {
        System.out.println("\n ========== Tabuleiro ========== \n");
        for (int i = 0; i < tabuleiro.length; i++)
        {
            for (int j = 0; j < tabuleiro[i].length; j++) 
            {
                System.out.print("\t" + tabuleiro[i][j]);
            }

            System.out.println("\n");
        }

        System.out.println(" ===============================");
    }

    // Metodo: Iniciando tabuleiro
    private static void iniciar_tabuleiro(char tabuleiro[][]) 
    {
        for (int i = 0; i < tabuleiro.length; i++) 
        {
            for (int j = 0; j < tabuleiro[i].length; j++) 
            {
                tabuleiro[i][j] = '*';
            }
        }
    }

    // Metodo: Analisando o vencesor
    private static char analise_resultado(char tabuleiro[][])
    {
        // Estrutura de repeticao
        for (int i = 0; i < tabuleiro.length; i++)
        {
            // Estrutura de decisao: Linha
            if ( (tabuleiro[i][0] == tabuleiro[i][1]) && (tabuleiro[i][1] == tabuleiro[i][2]) )
            {
                return tabuleiro[i][0];
            }
            
            // Estrutura de decisao: Coluna
            else if ( (tabuleiro[0][i] == tabuleiro[1][i]) && (tabuleiro[1][i] == tabuleiro[2][i]) )
            {
                return tabuleiro[0][i];
            }
        }
        
        // Estrutura de decisao: Diagonal principal
        if ( (tabuleiro[0][0] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][2]) )
        {
            return tabuleiro[0][0];
        }
        
        // Estrutura de decisao: Diagonal secundaria
        else if ( (tabuleiro[0][2] == tabuleiro[1][1]) && (tabuleiro[1][1] == tabuleiro[2][0]) )
        {
            return tabuleiro[0][2];
        }

        return 0;

    }
}
