package Tarefas_1;

public class EX_12_1 
{
    public static void main(String[] args) 
    {
        String lista [] = {"a", "b", "c", "d", "e", "f", "g", "h"};
        
        for (int i = 0; i < lista.length ; i++) 
        {
            System.out.println("");
            
            for (int j = i; j >= 0 ; j--)
            {
                System.out.print(lista[j]);  
            }   
        }
        System.out.println("");
    }
}
