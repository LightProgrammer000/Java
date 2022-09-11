package PEX_002;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Ex_12 
{
    public static void main(String args[])
    {
        int Novaidade;
        int anodenascimento;
        
        Scanner ponte = new Scanner(System.in);
        
        System.out.print("# Digite seu ano de nascimento: ");
        anodenascimento = ponte.nextInt();

        Novaidade =  ano_atual() - anodenascimento + 10;
        System.out.println("# Idade do usuário daqui a 10 anos será: " + Novaidade);
    }

    private static int ano_atual()
    {
        //DateFormat fmt = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        DateFormat fmt = new SimpleDateFormat("yyyy");
        Date date = new Date();

        return Integer.parseInt(fmt.format(date));
    }
}
