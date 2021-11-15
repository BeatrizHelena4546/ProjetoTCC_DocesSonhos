package acessoDados;

import java.sql.Connection;
import java.sql.DriverManager;
import com.mysql.jdbc.Driver;


/**
 *
 * @author Alunos
 */
public class moduloConexao {
    public static Connection connector;
    
         public static Connection connector(){
            java.sql.Connection conexao = null;
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/bddocessonhos";
            String user = "root";
            String password = "";
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url, user, password);
            return conexao;
            
        }catch (Exception e){
            System.out.println("Conexão Falhou: "+e); 
            return null;
        }
    }
}
