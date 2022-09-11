package Extra;

// Bibliotecas
import java.util.Scanner;
import java.text.NumberFormat;

public class EX_09 
{
    // Instanciacao
    static Scanner ent = new Scanner(System.in);

    public static void main(String[] args) 
    {
        try
        {
            // Chamada de metodo
            exec();
        } 

        catch (Exception e) 
        {
            System.err.println("\n *********** Invalido *********** ");
        }
    }

    // Metodo: Principal
    private static void exec()
    {
        while(true)
        {
            // Estrutura em escolha
            switch (menu())
            {
                case 1:
                    imposto();
                    break;

                case 2:
                    novo_salario();
                    break;

                case 3:
                    classificacao();
                    break;

                case 4:
                    System.exit(0);

                default:
                    break;   
            }
        }
    }

    // Funcao: Menu
    private static int menu()
    {
        // Variaveis
        int opc;

        // Entrada de dados
        System.out.println("\n ========== Menu ========== ");
        System.out.println(" [1] Imposto");
        System.out.println(" [2] Novo salario");
        System.out.println(" [3] Classificacao");
        System.out.println(" [4] Finalizar o programa");
        System.out.print(" # Opc: ");
        opc = ent.nextInt();

        // Estrutura de repeticao
        while ( !(opc >= 1 && opc <= 4) ) 
        {
            System.out.println("\n **** Opcao invalida ****");
            System.out.println(" ========== Menu ========== ");
            System.out.println(" [1] Imposto");
            System.out.println(" [2] Novo salario");
            System.out.println(" [3] Classificacao");
            System.out.println(" [4] Finalizar o programa");
            System.out.print(" # Opc: ");
            opc = ent.nextInt();
        }

        return opc;
    }

    // Metodo: Imposto
    private static void imposto() 
    {
        // Variaveis
        double sal;

        // Entrada de dados
        System.out.println("\n ------------- Imposto ------------- ");
        System.out.print(" # Salario: ");
        sal = ent.nextDouble();

        // Estrutura de decisao
        if (sal > 0 && sal < 1000)
        {
            System.out.print(" # Valor do imposto: " + NumberFormat.getCurrencyInstance().format(sal * 0.05));
        }

        else if (sal >= 1000 && sal <= 3000)
        {
            System.out.print(" # Valor do imposto: " + NumberFormat.getCurrencyInstance().format(sal * 0.10));
        }

        else if (sal > 3000)
        {
            System.out.print(" # Valor do imposto: " + NumberFormat.getCurrencyInstance().format(sal * 0.15));
        }

        else
        {
            System.out.print(" # Valor do imposto: R$ 0,00");
        }

        System.out.println(""); 
    }

    // Metodo: Novo Salario
    private static void novo_salario()
    {
        // Variaveis
        double sal;

        // Entrada de dados
        System.out.println("\n ------------- Novo Salario ------------- ");
        System.out.print(" # Salario: ");
        sal = ent.nextDouble();

        // Estrutura de decisao
        if (sal >= 0 && sal < 1350)
        {
            System.out.print(" # Valor do novo salario: " + NumberFormat.getCurrencyInstance().format(sal + 300));
        }

        else if (sal >= 1350 && sal < 2250)
        {
            System.out.print(" # Valor do novo salario: " + NumberFormat.getCurrencyInstance().format(sal + 225));
        }

        else if (sal >= 2250 && sal <= 4500)
        {
            System.out.print(" # Valor do novo salario: " + NumberFormat.getCurrencyInstance().format(sal + 150));
        }

        else if (sal > 4500)
        {
            System.out.print(" # Valor do novo salario: " + NumberFormat.getCurrencyInstance().format(sal + 45));
        }

        else
        {
            System.out.print(" # Valor do novo salario: R$ 0,00");
        }

        System.out.println("");
    }

    // Metodo: Classificacao
    private static void classificacao() 
    {
        // Variaveis
        double sal;

        // Entrada de dados
        System.out.println("\n ------------- Classificacao ------------- ");
        System.out.print(" # Salario: ");
        sal = ent.nextDouble();

        // Estrutura de decisaos
        if (sal >= 0 && sal <= 1500)
        {
            System.out.println(" # Classificacao: Mal remunerado");
        }

        else if (sal >= 1500)
        {
            System.out.println(" # Classificacao: Bem remunerado");
        }

        else
        {
            System.out.println(" # Classificacao: Nenhuma");
        }
    }
}
