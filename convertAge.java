package Tarefas_console;

// Bibliotecas
import java.util.Scanner;

public class EX_11
{
    public static void main(String[] args) 
    {
        // Variaveis
        double ano_nas, ano_atl;
        double id_ano, id_mes, id_dia, id_sem;
        
        // Instanciacao 
        Scanner ent = new Scanner(System.in);
        
        // Dados        
        System.out.print("# Ano de nascimento: ");
        ano_nas = ent.nextDouble();
        
        System.out.print("# Ano atual: ");
        ano_atl = ent.nextDouble();
                
        // Calculo
        id_ano = (ano_atl - ano_nas);
        id_mes = id_ano * 12;
        id_sem = id_ano * 52;
        id_dia = id_ano * 365;
        
        // Saida de dados
        System.out.println("\n------------------------------");
        System.out.printf("* Idade: %.0f ano(s)\n", id_ano);
        System.out.printf("* Idade: %.0f mes(es)\n", id_mes);
        System.out.printf("* Idade: %.0f semana(s)\n", id_sem);
        System.out.printf("* Idade: %.0f dias(s)\n", id_dia);
        System.out.println("------------------------------");
    }
}
