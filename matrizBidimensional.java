package Aulas_Console;

public class BA_Programa_13 
{
    public static void main( String args [] ) 
    {
        // ATRIBUTOS
        
        /*             COLUNA[0]   COLUNA[1]      COLUNA[2]
        LINHA [0] -    JOSÉ        91234-1234     professorjoseassis@gmail.com
        LINHA [1] -    Bill        2222-2222      bill@outlook.com
        LINHA [2] -    Linus       9999-9999      tux@linux.com
        */
        String [][] agenda = new String [][] { { "José", "91234-1234", "professorjoseassis@gmail.com"}, 
                                               { "Bill", "2222-2222", "bill@outlook.com" },
                                                { "Linus", "9999-9999", "tux@linux.com" } } ;                          
        
        // Percorre linhas
        for ( int i = 0; i < agenda.length ; i ++ )
        {
            System.out.println("-------------------");
            
            // Percorre colunas
            for ( int j = 0; j < agenda.length ; j ++ )
            {
                System.out.println( agenda [i][j] );
            }
        }
        
        System.out.println("===============================" + " \n" + "===============================");
        
        // Percorre todas as linhas e expõe todos os resultados linha a linha
        for ( String [] agenda1 : agenda)
        {
            System.out.println("-------------------");
            
            for ( int j = 0; j < agenda.length; j++ ) 
            {
                System.out.println( agenda1[j] );
            }
        }
    }
}
