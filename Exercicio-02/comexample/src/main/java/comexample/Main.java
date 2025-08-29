package comexample;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.*;

public class Main 
{
	public static Product produtos()
	{
		String name;
		int id;
		String email;
		Scanner sc = new Scanner(System.in);
		id = sc.nextInt();
		name = sc.nextLine();
		email = sc.nextLine();
		
		Product produtos = new Product(id, name, email);
		
		return produtos;
	}

	public static void main ( String [] args )
	{
		DAO dao = new DAO();
		String name = "postgres";
		String url = "jdbc:postgresql:Meubanco" ;
		String password = "988739002Gc.";
		
		try 
		{
			Connection conexao = DriverManager.getConnection(url, name, password);
			//dao.inserir(conexao, produtos());
			//dao.excluir(conexao, produtos());
			//dao.atualizar(conexao, produtos());
			//dao.listar(conexao);
			System.out.println(conexao);
		}
		
		catch (SQLException e  )
		{
			System.out.println(e.getMessage());
		}
	}
}