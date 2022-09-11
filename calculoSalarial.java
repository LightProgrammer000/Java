package Tarefas_1;

// Bibliotecas
import java.util.Scanner;
import java.text.DecimalFormat;

public class EX_09 
{
    public static void main(String[] args) 
    {
        // Apresentacao
        System.out.println("# Programa EX_09");

        try 
        {
            // Execucao de programa
            exec_program();
        } 

        catch (Exception e) 
        {
            //System.err.println(e);
        }
    }

    // Metodo: Programa
    private static void exec_program()
    {
        // Estrutura em escolha
        switch(menu())
        {
            case 1:

                // Metodo
                novo_salario(salario());
                break;

            case 2:

                // Metodo
                ferias(salario());
                break;

            case 3:

                // Metodo
                decimo_terceiro(salario(), mes());
                break;

            case 4:

                // Saida de programa
                System.exit(0);
                break;

            default:
                break;
        }
    }

    // Metodo: Calculo de novo salario
    private static void novo_salario(double salario) 
    {
        // Variavel
        double novo_salario;

        // Instanciacao
        DecimalFormat decimal = new DecimalFormat("R$ ###,###,###,##0.00");

        // Chamada de funcao
        novo_salario = tabela_salarial(salario);

        // Relatorio
        System.out.println("\n---------- RELATORIO ----------");
        System.out.println("# Salario: " + decimal.format(salario) );
        System.out.println("# Novo Salario: " + decimal.format(novo_salario));
        System.out.println("----------------------------------");
    }

    // Metodo: Calculo do decimo terceiro
    private static void decimo_terceiro(double salario, int mes)
    {
        // Instanciacao
        DecimalFormat decimal = new DecimalFormat("R$ ###,###,###,##0.00");

        // Relatorio
        System.out.println("\n---------- RELATORIO ----------");
        System.out.println("# Salario: " + decimal.format(salario));
        System.out.println("# Ferias: " + decimal.format(salario * mes/12)); 
        System.out.println("----------------------------------");  
    }

    // Funcao: Menu
    private static int menu()
    {
        // Instanciacao
        Scanner ent = new Scanner(System.in);

        // Apresentacao
        System.out.println("\n---------- Menu ----------");
        System.out.println("* [1] Novo salario");
        System.out.println("* [2] Ferias ");
        System.out.println("* [3] Decimo terceiro ");
        System.out.println("* [4] Sair ");
        System.out.println("---------------------------------");
        System.out.print("* Opc: ");

        return ent.nextInt();
    }

    // Funcao: Leitura de salario
    private static double salario() 
    {
        // Variavel
        double salario;

        // Instanciacao
        Scanner ent = new Scanner(System.in);

        // Entrada de dados
        System.out.print("\n# Salario: R$ ");

        return ent.nextDouble();
    }

    // Funcao: Tabela salarial 
    private static double tabela_salarial(double salario)
    {
        // Estrutura de decisao
        if (salario > 0 && salario <= 1000)
        {
            salario = salario * (1.15);            
        }

        else if (salario > 1000.01 && salario <= 3000.00)
        {
            salario = salario * (1.10);            
        }

        else if (salario > 3000.00)
        {
            salario = salario * (1.05);            
        }

        return salario;
    }

    // Funcao: Ferias
    private static void ferias(double salario)
    {
        // Instanciacao
        DecimalFormat decimal = new DecimalFormat("R$ ###,###,###,##0.00");

        // Relatorio
        System.out.println("\n---------- RELATORIO ----------");
        System.out.println("# Salario: " + decimal.format(salario));
        System.out.println("# Ferias: " + decimal.format(salario * (4.0/3.0)));
        System.out.println("----------------------------------");        
    }

    // Funcao: Leitura de meses
    private static int mes() 
    {
        // Variavel
        int mes;
        int i = 0;

        // Instanciacao
        Scanner ent = new Scanner(System.in);

        // Entrada de dados
        System.out.print("\n# Meses: ");
        mes = ent.nextInt();

        while (mes < 0 || mes > 12) 
        {
            ++i;
            System.out.printf("\n# Mes (Erro[%d]: Mes entre 0 e 12): ", i);
            mes = ent.nextInt();
        }

        return mes;
    }
}
