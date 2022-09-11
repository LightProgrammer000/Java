/*
//////       Provas
Alunos  1   2   3   4   5

1       3   4   6   8   9
2       9   5   6   7   8
3       3   4   6   8   1
4       6   3   6   7   8
5       9   8   1   2   4
6       2   5   6   8   9
7       1   2   3   4   5
8       1   5   7   8   9
9       4   8   9   0   1
11      5   7   9   0   9
12      5   7   9   0   9
13      5   7   9   0   9
14      5   7   9   0   9
15      5   7   9   0   9
*/
package Tarefas_3;

import java.util.Scanner;

public class EX_05 
{
    public static void main(String[] args) 
    {
        // Variaveis
        int num = 0;
        int soma = 0;
        
        // Matriz
        int linha = 15;
        int coluna = 5;
        double nota_matriz [][] = new double [linha][coluna];
        
        // Vetor
        double aluno_med [] = new double [linha];
        String aluno_result [] = new String [linha];
        
        // Vetor: Lista
        String lista_nome[] = {"A", "B", "C", "D", "E", 
                               "F", "G", "H", "I", "J", 
                               "K", "L", "M", "N", "O"};

        String list_aprov[] = {"Aprovado", 
                               "Recuperacao", 
                               "Reprovado"};

        // Instanciacao
        Scanner ent = new Scanner(System.in);
        
        // Estrutura de repeticao: Populacao da matriz
        System.out.println("---------------- Alunos ----------------");
        for (int i = 0; i < linha; i++)
        {
            soma = 0;
            System.out.printf("\n* %d) Aluno: %s\n", (i+1), lista_nome[i]);

            for (int j = 0; j < coluna; j++)
            {
                System.out.printf("# Nota da Prova [%d]: ", j+1);
                nota_matriz[i][j] = ent.nextDouble();
                
                soma += nota_matriz[i][j];
            }
            
            // Calculo: Media dos alunos
            aluno_med[i] = (double) soma / coluna;
            
            // Estruturas de decisao: Resultado da aprovacao
            if (aluno_med[i] >= 7) 
            {
                aluno_result[i] = list_aprov[0];
            }

            else if (aluno_med[i] > 2 && aluno_med[i] < 7) 
            {
                aluno_result[i] = list_aprov[1];                
            }
            
            else
            {
                aluno_result[i] = list_aprov[2];
            }
        }

        // Estrutura de repeticao: Exibicao da matriz
        System.out.println("\n--------------------------------------------------");
        System.out.println("---------------- Notas das Provas ----------------");
        System.out.println("--------------------------------------------------\n");
        
        for (int i = 0; i < linha; i++)
        {
            System.out.printf("=> Aluno %s", lista_nome[i]);
            
            for (int j = 0; j < coluna; j++) 
            {
                System.out.printf("\n# Nota da Prova [%d]: %.2f", j+1, nota_matriz[i][j]);
            }
            
            System.out.printf("\n# Media geral: %.2f", aluno_med[i]);
            System.out.printf("\n# Resultado: %s \n\n", aluno_result[i]);
        }
    }
}
