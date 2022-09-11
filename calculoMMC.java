package Tarefas_4;

import java.util.Scanner;

public class z 
{
    public static void main(String[] args) 
    {
        // Variaveis
        int maior, d1, d2;
        
        // Instanciacao
        Scanner ent = new Scanner(System.in);
        
        // Entrada de dados
        System.out.print("# N1: ");
        d1 = ent.nextInt();
        
        System.out.print("# N2: ");
        d2 = ent.nextInt();
        
        if (d1 > d2)
        {
            maior = d1;      
        }
        
        else
        {
            maior = d2;
        }
        
        // Vetores
        int vet_1 [] = new int[maior];
        int vet_2 [] = new int[maior];
        
        calculo_MMC(vet_1, vet_2, d1, d2);
    }
        
    private static void calculo_MMC(int[] vet_1, int[] vet_2, int d1, int d2) 
    {
        for (int i = 0; i < vet_2.length; i++) 
        {
            vet_1[i] = (i+1) * d1;
            //System.out.println(vet_1[i]);
        }

        for (int i = 0; i < vet_2.length; i++) 
        {
            vet_2[i] = (i+1) * d2;
            //System.out.println(vet_2[i]);
        }
        
        for (int i = 0; i < vet_2.length; i++)
        {
            for (int j = 0; j < vet_2.length; j++) 
            {
                if (vet_1[i] == vet_2[j])
                {
                    System.out.printf("\n-> MMC entre %d e %d: %d \n", d1, d2, vet_1[i]);
                    System.exit(0);
                }
            }
        }
    }
}
