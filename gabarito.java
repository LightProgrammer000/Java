/*
Gabarito:
1   A
2   B
3   A
4   C
5   D
6   E
7   A
8   B
9   C
10  E 

/   1   2   3   4   5   6   7   8   9   10
1   A   B   C   D   A   B   E   C   C   A
2   E   D   C   E   D   A   A   B   C   E
3   A   A   D   C   C   E   E   E   D   C
 */

package Tarefas_3;

import java.util.Scanner;

public class EX_04 
{
    public static void main(String[] args) 
    {
        int acertos = 0;
        int linha = 10, coluna = 10;
        char matriz[][] = new char [linha][coluna];
        
        char gab[] = {'A', 'B', 'C', 'D', 'E', 'A', 'B', 'C', 'D', 'E'};

        Scanner ent = new Scanner(System.in);

        for (int i = 0; i < linha; i++) 
        {
            System.out.printf("\n# Caderno de respostas do aluno %d\n", i+1);
            
            for (int j = 0; j < coluna; j++)
            {
                System.out.printf("\n Questao %d \n* a \n* b \n* c \n* d \n* e \nOpc: ", j+1);
                matriz[i][j] = ent.next().toUpperCase().charAt(0);
            }

            System.out.println("\n------------------------------------------------------------ ");
        }

        System.out.println("\n================================================================ ");
        for (int i = 0; i < linha; i++) 
        {
            acertos = 0;
            System.out.printf("\n# Caderno de respostas do aluno %d\n", i+1);

            for (int j = 0; j < coluna; j++) 
            {
                System.out.printf("\n# Questao %d: %c", j+1, matriz[i][j]);
                
                if (gab[j] == matriz[i][j])
                {
                    acertos++;
                }
            }

            System.out.printf("\n# Resultado: %d", acertos);
            System.out.println("\n------------------------------------------------------------ ");
        }
    }
}
