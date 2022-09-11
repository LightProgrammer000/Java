package Tarefas_3;

public class EX_03 
{
    public static void main(String[] args)
    {
        // Variaveis
        int linha = 5, coluna = 5;
        int matriz [][] = new int[linha][coluna];
        
        System.out.println("\t---------------------------------- ");
        
        System.out.printf("\t---------------------------------- "
                + "\n\n\t# Soma da diagonal secundária: %.2f \n\n", 
                soma_diagonal_secundaria(linha, coluna, matriz));
    }

    private static double soma_diagonal_secundaria(int linha, int coluna, int[][] matriz) 
    {
        // Variaveis internas
        int a = 0;
        int soma = 0;
        int dia_sec[] = new int[linha];
        
        for (int i = 0; i < linha; i++)
        {
            for (int j = 0; j < coluna; j++) 
            {
                matriz[i][j] = ++a;
                System.out.print("\t" + matriz[i][j]);
                
                if ( (i + j)  == (linha - 1) )
                {
                    dia_sec[i] = matriz[i][j];
                }
            }

            System.out.println("");
        }

        for (int i = 0; i < linha; i++)
        {
            soma += dia_sec[i];
        }
        
        return soma;
    }
}
