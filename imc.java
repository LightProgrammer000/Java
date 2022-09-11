package LISTAB_03;
import javax.swing.JOptionPane;
import static java.lang.Math.pow;

public class Trabalho_IMC_Perfeito
{
    public static void main ( String args[] )
    {
        int i1;
        String a,i,S,n;
        double p1,a1,IMC;
             
        JOptionPane.showMessageDialog(null," PROGRAMA " + " \n " + " DO " + " \n " + " CÁLCULO DO IMC " + " \n " + " ( ÍNDICE DE MASSA CORPÓREA ) ");
        JOptionPane.showMessageDialog(null," REGRA : " + " \n " + " TER 6 ANOS OU MAIS ");

        n = JOptionPane.showInputDialog(null," DIGITE SEU NOME : ");
        JOptionPane.showMessageDialog (null," BEM VINDO " + " \n " + n );
        
        p1 = Double.parseDouble(JOptionPane.showInputDialog(null," DIGITE SEU PESO EM QUILOGRAMAS : " + " \n " + " ( Se precisar usar vírgula, utilize o ponto por favor, Exemplo : 100.28 ) "));
        a1 = Double.parseDouble(JOptionPane.showInputDialog (null," DIGITE SUA ALTURA EM METROS : " + " \n " + " ( Se precisar usar vírgula, utilize o ponto por favor, Exemplo : 1.90 ) "));
        i1 = Integer.parseInt(JOptionPane.showInputDialog(null," DIGITE SUA IDADE : "));
        
        IMC = ( p1 ) / ( pow( a1, 2) );

        // Tabela para Adultos ( maiores de 16 anos ) de Ambos os Sexos
        if ( i1 >= 16)
        {
            adulto_maior_16_masc_fem(IMC, n, i1);
        }    
        
        // Tabela para Jovens ( menores de 16 anos ) de ambos os sexos
        if ( i1 <= 15 )
        {
           S = JOptionPane.showInputDialog(null," SELECIONE A LETRA CORRESPONDENTE AO SEU SEXO : " + " \n " + " m ( masculino )" + " \n " + " OU " + " \n " + " f ( feminino ) " );

           // Tabela para Jovens ( menores de 16 anos ) do sexo masculino
           jovens_men_16_masc(IMC, n, i1, S);
           jovens_men_16_fem(IMC, n, i1, S);
        }
    }
    
    private static void adulto_maior_16_masc_fem(double IMC, String n, int i1) 
    {
        if ( IMC < 17.0 )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : Muito abaixo do peso " );
        }

        else if ( ( IMC >= 17.0 ) && ( IMC <= 18.49 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : Abaixo do peso " );
        }

        else if ( ( IMC >= 18.5 ) && ( IMC <= 24.99 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : Peso normal " );
        }

        else if ( ( IMC >= 25.0 ) && ( IMC <= 29.99 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : Acima do peso " );
        }

        else if ( ( IMC >= 30.0 ) && ( IMC <= 34.99 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : Obesidade I " );
        }

        else if ( ( IMC >= 35.0 ) && ( IMC <= 39.99) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : Obesidade II ( Severa ) " );
        }

        else if ( IMC >= 40.0 )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : Obesidade III ( Mórbida ) " );
        }
    }

    private static void jovens_men_16_masc(double IMC, String n, int i1, String S)
    {
        // Idade de 6 anos
        if ( ( S.equals("m") ) && ( i1 == 6 ) && ( IMC >=0 && IMC < 14.5 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 6 ) && ( IMC == 14.5 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 6 ) && ( IMC > 14.5 ) && ( IMC <= 16.6) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 6 ) && ( IMC > 16.6 ) && ( IMC <= 18.0 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 6 ) && ( IMC > 18.0 ) )
        {
             JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }

        // Idade de 7 anos
        else if ( ( S.equals("m") ) && ( i1 == 7 ) && ( IMC >=0 && IMC < 15.0 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 7 ) && ( IMC == 15.0 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 7 ) && ( IMC > 15.0 ) && ( IMC <= 17.3 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 7 ) && ( IMC > 17.3 ) && ( IMC <= 19.1 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 7 ) && ( IMC > 19.1 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }

        // Idade de 8 anos
        else if ( ( S.equals("m") ) && ( i1 == 8 ) && ( IMC >=0 && IMC < 15.6 ) ) 
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 8 ) && ( IMC == 15.6 ) ) 
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 8 ) && ( IMC > 15.6 ) && ( IMC <= 16.7 ) ) 
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 8 ) && ( IMC > 16.7 ) && ( IMC <= 20.3 )  ) 
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 8 ) && ( IMC > 20.3 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }

        // Idade de 9 anos
        else if ( ( S.equals("m") ) && ( i1 == 9 ) && ( IMC >=0 && IMC < 16.1 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 9 ) && ( IMC == 16.1 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 9 ) && ( IMC > 16.1 ) && ( IMC <= 18.8 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 9 ) & ( IMC > 18.8 ) && ( IMC <= 21.4 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 9 ) && ( IMC > 21.4 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }

        // Idade de 10 anos
        else if ( ( S.equals("m") ) && ( i1 == 10 ) && ( IMC >=0 && IMC < 16.7 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 10 ) && ( IMC == 16.7 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 10 ) && ( IMC > 16.7 ) && ( IMC <= 19.6 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 10 ) && ( IMC > 19.6 ) && ( IMC <= 22.5 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE SOBREPESO E OBESIDADE ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 10 ) && ( IMC > 22.5 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }

        // Idade de 11 anos
        else if ( ( S.equals("m") ) && ( i1 == 11 ) && ( IMC >=0 && IMC < 17.2 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 11 ) && ( IMC == 17.2 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 11 ) && ( IMC > 17.2 ) && ( IMC <= 20.3 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 11 ) && ( IMC > 20.3 ) && ( IMC <= 20.3 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 11 ) && ( IMC > 23.7 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }

        // Idade de 12 anos
        else if ( ( S.equals("m") ) && ( i1 == 12 ) && ( IMC >=0 && IMC < 17.8 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 12 ) && ( IMC == 17.8 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 12 ) && ( IMC > 17.8 ) && ( IMC <= 21.1 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 12 ) && ( IMC > 21.1 ) && ( IMC <= 24.8 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 12 ) && ( IMC > 24.8 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }

        // Idade de 13 anos
        else if ( ( S.equals("m") ) && ( i1 == 13 ) && ( IMC >=0 && IMC < 18.5 ) ) 
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 13 ) && ( IMC ==  18.5 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 13 ) && ( IMC >  18.5 ) && ( IMC <= 21.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 13 ) && ( IMC > 21.9 ) && ( IMC <= 25.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 13 ) && ( IMC > 25.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }

        // Idade de 14 anos
        else if ( ( S.equals("m") ) && ( i1 == 14 ) && ( IMC >=0 && IMC < 19.2 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 14 ) && ( IMC ==  19.2 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 14 ) && ( IMC >  19.2 ) && ( IMC <= 22.7 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 14 ) && ( IMC > 22.7 ) && ( IMC <= 26.9 ) ) 
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 14 ) && ( IMC > 26.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }

        // Idade de 15 anos
        else if ( ( S.equals("m") ) && ( i1 == 15 ) && ( IMC >=0 && IMC < 19.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 15 ) && ( IMC == 19.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 15 ) && ( IMC > 19.9 ) && ( IMC <= 23.6 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 15 ) && ( IMC > 23.6 ) && ( IMC <= 27.7 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("m") ) && ( i1 == 15 ) && ( IMC > 27.7 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }    
    }

    private static void jovens_men_16_fem(double IMC, String n, int i1, String S) 
    {
        // Tabela para Jovens ( menores de 16 anos ) do sexo feminino

        // Idade de 6 anos
        if ( ( S.equals("f") ) && ( i1 == 6 ) && ( IMC >=0 && IMC < 14.3 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 6 ) && ( IMC == 14.3 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 6 ) && ( IMC > 14.3 ) && ( IMC <= 16.1 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 6 ) && ( IMC > 16.1 ) && ( IMC <= 17.4 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 6 ) && ( IMC > 17.4 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }

        // Idade de 7 anos
        else if ( ( S.equals("f") ) && ( i1 == 7 ) && ( IMC >=0 & IMC < 14.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 7 ) && ( IMC == 14.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 7 ) && ( IMC > 14.9 ) && ( IMC <= 17.1 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 7 ) && ( IMC > 17.1 ) && ( IMC <= 18.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 7 ) && ( IMC > 18.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }

        // Idade de 8 anos
        else if ( ( S.equals("f") ) && ( i1 == 8 ) && ( IMC >=0 && IMC < 15.6 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 8 ) && ( IMC == 15.6 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 8 ) && ( IMC > 15.6 ) && ( IMC <= 18.1 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 8 ) && ( IMC > 18.1 ) && ( IMC <= 20.3 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 8 ) && ( IMC > 20.3 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }

        // Idade de 9 anos
        else if ( ( S.equals("f") ) && ( i1 == 9 ) && ( IMC >=0 && IMC < 16.3 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 9 ) && ( IMC == 16.3 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 9 ) && ( IMC > 16.3 ) && ( IMC <= 19.1 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 9 ) && ( IMC > 19.1 ) && ( IMC <= 21.7 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 9 ) && ( IMC > 21.7 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        } 

        // Idade de 10 anos
        else if ( ( S.equals("f") ) && ( i1 == 10 ) && ( IMC >=0 && IMC < 17.0 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 10 ) && ( IMC == 17.0 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 10 ) && ( IMC > 17.0 ) && ( IMC <= 20.1 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 10 ) && ( IMC > 20.1 ) && ( IMC <= 23.2 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 10 ) && ( IMC > 23.2 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }     

        // Idade de 11 anos
        else if ( ( S.equals("f") ) && ( i1 == 11 ) && ( IMC >=0 && IMC < 17.6 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 11 ) && ( IMC == 17.6 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 11 ) && ( IMC > 17.6 ) && ( IMC <= 21.1 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 11 ) && ( IMC > 21.1 ) && ( IMC <= 24.5 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 11 ) && ( IMC > 24.5 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }   

        // Idade de 12 anos
        else if ( ( S.equals("f") ) && ( i1 == 12 ) && ( IMC >=0 && IMC < 18.3 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 12 ) && ( IMC == 18.3 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 12 ) && ( IMC > 18.3 ) && ( IMC <= 22.1 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 12 ) && ( IMC > 22.1 ) && ( IMC <= 25.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 12 ) && ( IMC > 25.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }   

        // Idade de 13 anos
        else if ( ( S.equals("f") ) && ( i1 == 13 ) && ( IMC >=0 && IMC < 18.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 13 ) && ( IMC == 18.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 13 ) && ( IMC > 18.9 ) && ( IMC <= 23.0 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 13 ) && ( IMC > 23.0 ) && ( IMC <= 27.7 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 13 ) && ( IMC > 27.7 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }   

        // Idade de 14 anos
        else if ( ( S.equals("f") ) && ( i1 == 14 ) && ( IMC >=0 && IMC < 19.3 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 14 ) && ( IMC == 19.3 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 14 ) && ( IMC > 19.3 ) && ( IMC <= 23.8 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 14 ) && ( IMC > 23.8 ) && ( IMC <= 27.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 14 ) && ( IMC > 27.9 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }   

        // Idade de 15 anos
        else if ( ( S.equals("f") ) && ( i1 == 14 ) && ( IMC >=0 && IMC < 19.6 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ABAIXO DO NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 14 ) && ( IMC == 19.6 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : NORMAL ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 14 ) && ( IMC > 19.6 ) && ( IMC <= 24.2 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : ENTRE NORMAL E SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 14 ) && ( IMC > 24.2 ) && ( IMC <= 28.8 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : SOBREPESO ");
        }

        else if ( ( S.equals("f") ) && ( i1 == 14 ) && ( IMC > 28.8 ) )
        {
            JOptionPane.showMessageDialog(null," NOME : " +n+ " \n " + " IDADE : " +i1+ " \n " + " RESULTADO : " +IMC+ " \n " + " SITUAÇÃO : OBESIDADE ");
        }
    }
}
