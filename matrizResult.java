package Tarefas_3;

public class EX_01 
{
    public static void main(String[] args) 
    {
        int linha = 6, coluna = 4;
        int matriz [][] = new int[6][4];

        System.out.println(" --------------------------------------------- ");
        matriz_resultante(linha, coluna, matriz);

        System.out.println(" ============================================= ");
        exibir_matriz(linha, coluna, matriz);
        System.out.println(" --------------------------------------------- ");
    }

    // Metodo: Matriz resultante
    private static void matriz_resultante(int linha, int coluna, int [][] matriz)
    {
        // Variaveis
        int maior = 0;
        int vet[] = new int[linha];
        
        // Estrutura de repeticao: Populando matriz
        for (int i = 0; i < linha; i++) 
        {
            for (int j = 0; j < 4; j++)
            {
                matriz[i][j] = (i + j);
                System.out.print("\t" + matriz[i][j]);

            // Estrutura de decisao: Aceitar em primeiro lugar a variavel 'maior'
            if ( i == 0 || maior < matriz[i][j])
            {
                maior = matriz[i][j];
            }
        }
            // Atribuindo valor 'maior' para o vetor
            vet[i] = maior;
            System.out.println("");
        }

        // Estrutura de repeticao: Matriz resultante
        for (int i = 0; i < linha; i++) 
        {
            for (int j = 0; j < coluna; j++) 
            {
                matriz[i][j] = matriz[i][j] * vet[i];              
            }
        }
    }

    // Metodo: Exibindo matriz
    private static void exibir_matriz(int linha, int coluna, int [][] matriz)
    {
        for (int i = 0; i < linha; i++) 
        {
            for (int j = 0; j < coluna; j++) 
            {
                System.out.print("\t" + matriz[i][j]);              
            }

            System.out.println("");
        }
    }
}
