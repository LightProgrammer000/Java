package B_Conexao_DAL;
 
// Java [Sql]
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.DriverManager;
 
// Classe
public class Conexao_Java_Mysql 
{
    // Método Conexão [Com Retorno]: Reponsável pelo Estabelecimento de Conexão com Banco de Dados 
    // Connection: Framework de Conexão [Conjunto de Comandos] | conector(): Nome do Método
    public static Connection conector() 
    {        
        // Tentativa de Estabeler Conexão com Banco de Dados
        try
        {
            // Variáveis
            String driver = "com.mysql.jdbc.Driver";// Tipo de Banco de Dados
            String url = "jdbc:mysql://localhost:3306/dbinfox";// Caminho do Banco de Dados
            String user = "root";// Autenticação: Usuário [phpmyadmin]
            String password = "root";// Autenticação: Senha [phpmyadmin]
            Connection conexao;
 
            Class.forName(driver);// Executar o Arquivo do Driver
            conexao = DriverManager.getConnection( url, user, password );// Interface
  
            return (conexao);
        }
    
        catch (ClassNotFoundException | SQLException e)
        {
            // Análise de Erro
            System.err.println(e);
 
            return (null);   
        }
    }
}
