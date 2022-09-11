/*
# Programa: Classificação de triângulo
*/

package Extra;

import java.util.Scanner;

public class EX_01 
{
    public static void main(String[] args) 
    {
        // Variaveis
        int j = 0;
        double vetor[] = new double[3];
        String lista[] = {"A", "B", "C"};
          
        // Instanciacao
        Scanner ent = new Scanner(System.in);
        
        // Estrutura de repeticao
        for(int i = 0; i < 3; i++)
        {
            System.out.print("# Lado [" + lista[i] + "]: ");
            vetor[i] = ent.nextDouble();
        }
        System.out.println("");
        
        // Estrutura de decisao
        if(existencia_triangulo(vetor, lista, j))
        {
            System.out.println(class_triangulo(vetor, j)); 
        }
        
        else
        {
            System.out.println("Nao pode formar triangulo");
        }
    }
    
    // Funcao: Existencia de triangulo
    static boolean existencia_triangulo(double vetor[], String lista[], int j)
    {
        // Variaveiss
        boolean regra_1, regra_2, regra_3;

        // Calculos booleanos
        regra_1 = vetor[j] < vetor[j+1] + vetor[j+2];
        regra_2 = vetor[j+1] < vetor[j] + vetor[j+1];
        regra_3 = vetor[j+2] < vetor[j] + vetor[j+2];
        
        return regra_1 && regra_2 && regra_3;
    }
    
    // Funcao: Classificacao de triangulo
    static String class_triangulo(double vetor[], int j)
    {   
        // Variaveis
        double a = vetor[j];
        double b = vetor[j+1];
        double c = vetor[j+2];
        
        // Estrutura de decisao
        if(a == b && b == c)
        {
            return "Triangulo equilatero";            
        }
        
        else if(a != b && b != c && c != a)
        {
            return "Triangulo escaleno";
        }
        
        else
        {
            return "Triangulo isosceles";
        }        
    }
}
