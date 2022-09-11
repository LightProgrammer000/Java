package Extra;

// Bibliotecas
import java.util.Scanner;

public class EX_04 
{
    public static void main(String[] args) 
    {
        // Variaveis
        int saque, valor, soma = 0;

        // Variaveis: Quantidade de notas
        int qtd_nota_1 = 100;// R$ 100
        int qtd_nota_5 = 100;// R$ 5000
        int qtd_nota_10 = 100;// R$ 1.000
        int qtd_nota_20 = 100;// R$ 2.000
        int qtd_nota_50 = 100;// R$ 5.000
        int qtd_nota_100 = 100;// R$ 10.000

        // Instanciacao
        Scanner ent = new Scanner(System.in);

        // Calculo
        soma = qtd_nota_1 * 1 + qtd_nota_5 * 5 + qtd_nota_10 * 10 +
               qtd_nota_20 * 20 + qtd_nota_50 * 50 + qtd_nota_100 * 100;

        // Entrada de dados
        System.out.print("\n# Saque [valor maximo -> R$ " + soma + "]: ");
        saque = ent.nextInt();

        // Estrutura em loop: Protecao de dados
        while (saque > 18600) 
        {
            // Entrada de dados
            System.out.print("\n# Saque [valor maximo -> R$ " + soma + "]: ");
            saque = ent.nextInt();
        }
        
        // Estrutura de repeticao
        while (saque > 0)
        {
            if (saque % 100 == 0 && qtd_nota_100 > 0)
            {
                saque -= 100;
                qtd_nota_100--;
            }

            else if (saque % 50 == 0 && qtd_nota_50 > 0)
            {
                saque -= 50;
                qtd_nota_50--;
            }

            else if (saque % 20 == 0 && qtd_nota_20 > 0)
            {
                saque -= 20;
                qtd_nota_20--;
            }

            else if (saque % 10 == 0 && qtd_nota_10 > 0)
            {
                saque -= 10;
                qtd_nota_10--;
            }

            else if (saque % 5 == 0 && qtd_nota_5 > 0)
            {
                saque -= 5;
                qtd_nota_5--;
            }

            else if (saque % 1 == 0 && qtd_nota_1 > 0)
            {
                saque -= 1;
                qtd_nota_1--;
            }
            
            System.out.println(saque);
        }

        System.out.println("\n --------------- RELATORIO --------------- ");
        System.out.println(" # Notas [R$ 1,00] : " + qtd_nota_1 + " notas restantes");
        System.out.println(" # Notas [R$ 5,00]: " + qtd_nota_5 + " notas restantes");
        System.out.println(" # Notas [R$ 10,00]: " + qtd_nota_10 + " notas restantes");
        System.out.println(" # Notas [R$ 50,00]: " + qtd_nota_50 + " notas restantes");
        System.out.println(" # Notas [R$ 100,00]: " + qtd_nota_100 + " notas restantes");
        System.out.println(" ------------------------------------------- ");
    }
}
