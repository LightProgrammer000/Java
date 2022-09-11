package Extra;

import java.util.Scanner;

public class EX_22 
{
    public static void main(String[] args) 
    {
        // Variaveis
        double val, seg, min, hor, dia, mes; 
        double ano, dec, sec, mil;
        double rest_min, rest_hor, rest_dia, rest_mes;
        double rest_ano, rest_dec, rest_sec, rest_mil;
        
        // Instanciacao
        Scanner ent = new Scanner(System.in);
        
        // Dados
        System.out.print("\n# Segundos: ");
        val = ent.nextDouble();

        dec = val / (3600 * 24 * 365 * 10); // 1 decada = 315360000 seg
        rest_dec = val % (3600 * 24 * 365 * 10);
        
        ano = rest_dec / (3600 * 24 * 365); // 1 ano = 31536000 seg
        rest_ano = rest_dec % (3600 * 24 * 365);
        
        mes = rest_ano / (3600 * 24 * 30);
        rest_mes = rest_ano % (3600 * 24 * 30);
        
        dia = rest_mes / (3600 * 24 );
        rest_dia = rest_mes % (3600 * 24);
        
        hor = rest_dia / 3600;
        rest_hor = rest_dia % 3600;
        
        min = rest_hor / 60;
        rest_min = rest_hor % 60;
        
        seg = rest_min;
        
        relatorio(dec, ano, mes, dia, hor, min, seg);
    }
    
    private static void relatorio(double dec, double ano, double mes, double dia,
                                  double hor, double min, double seg)
    {
        // Apresentacao
        System.out.println("\n------------------------");  
        System.out.println("* Decadas: " + (long) dec);
        System.out.println("* Anos: " + (long) ano);
        System.out.println("* Meses: " + (long) mes);
        System.out.println("* Dias: " + (long) dia);
        System.out.println("* Horas: " + (long) hor);
        System.out.println("* Minutos: " + (long) min);
        System.out.println("* Segundos: " + (long) seg);
        System.out.println("------------------------");
    }
}
