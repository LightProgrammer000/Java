package PXTI_002;

import java.util.*;

public class Datas 
{
    public static void main(String[] args) 
    {
        // Instanciacao
        Date agora = new Date();
        Date data = new Date(1_000_000_000_000L);
        Calendar c = Calendar.getInstance();// Gregorian Calendar
        Calendar c1 = Calendar.getInstance();

        int hora = c1.get((Calendar.HOUR_OF_DAY));

        //
        System.out.println("\n------------------------------------------------");
        System.out.println("01 de JAN 1970: " + System.currentTimeMillis());
        System.out.println("Hoje: " + agora);
        System.out.println("Data (referente): " + data);

        data.getTime();
        data.setTime(1_000_000_000_000L);
        System.out.println("Comparacao: " + data.compareTo(agora));// -1, 0, 1

        //
        System.out.println("\n------------------------------------------------");
        c.set(1980, Calendar.FEBRUARY, 12);
        System.out.println("Data: " + c.getTime());
        System.out.println("Ano: " + c.get(Calendar.YEAR));// Ano
        System.out.println("Mes: " + c.get(Calendar.MONTH));// Mes 0-11  
        System.out.println("Dia: " + c.get(Calendar.DAY_OF_MONTH));// Dia do mês
        
        //
        System.out.println("\n------------------------------------------------");
        c.set(Calendar.YEAR, 1972);// Altera o ano
        c.set(Calendar.MONTH, Calendar.MARCH);// Altera o mês
        c.set(Calendar.DAY_OF_MONTH, 25);// Altera o dia
        System.out.println("Data: " + c.getTime());
        
        //
        System.out.println("\n------------------------------------------------");
        c.clear(Calendar.MINUTE);
        c.clear(Calendar.SECOND);
        System.out.println("Data: " + c.getTime());
        
        //
        System.out.println("\n------------------------------------------------");
        c.add(Calendar.DAY_OF_MONTH, -1);
        c.add(Calendar.YEAR, -1);
        System.out.println("Data: " + c.getTime());
        
        //
        System.out.println("\n------------------------------------------------");
        c.roll(Calendar.DAY_OF_MONTH, -20);
        System.out.println("Data: " + c.getTime());
        
        // Saudação com bom dia,boa tarde,ou boa noite
        System.out.println("\n------------------------------------------------");

        if (hora <= 12) 
        {
            System.out.println("# Bom dia");
        } 

        else if (hora > 12 && hora < 18) 
        {
            System.out.println("# Boa Tarde");
        } 

        else 
        {
            System.out.println("# Boa Noite");
        }
    }
}
