package comexample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DAO 
{
	public void inserir (Connection conexao, Product pessoa)
	{
		String sql = "INSERT INTO pessoa (id, nome, email) VALUES (?, ?, ?)";
		
		try
		{
			PreparedStatement trocar = conexao.prepareStatement(sql);
			trocar.setInt(1, pessoa.getId());
			trocar.setString(2, pessoa.getName());
			trocar.setString(3, pessoa.getEmail());
			trocar.executeUpdate();
		}

		catch (SQLException a)
		{
			System.out.println(a.getMessage());
		}
	}
	
	public void excluir (Connection conexao, Product pessoa)
	{
		String sql = "DELETE FROM pessoa WHERE id = ?";
		
		try
		{
			PreparedStatement exclua = conexao.prepareStatement(sql);
			exclua.setInt(1, pessoa.getId());
		    int rowsDeleted = exclua.executeUpdate();
		    System.out.println("Registros deletados: " + rowsDeleted);
		}
		catch (SQLException b)
		{
			System.out.println(b.getMessage());
		}
	}
	
	public void atualizar (Connection conexao, Product pessoa)
	{
		 String sql = "UPDATE pessoa SET nome = ?, email = ? WHERE id = ?";
		 
		 try 
		 {
			 PreparedStatement update = conexao.prepareStatement(sql);
			 update.setString(1, pessoa.getName());
		     update.setString(2, pessoa.getEmail());
		     update.setInt(3, pessoa.getId());
		     update.executeUpdate();
		 }
		 catch (SQLException c)
		 {
			 System.out.println(c.getMessage());
		 }
	}
	
	public void listar ( Connection conexao)
	{
		List<Product> lista = new ArrayList<>();
		String sql = "SELECT * FROM pessoa";
		
		try 
		{
			PreparedStatement listar = conexao.prepareStatement(sql);
			ResultSet rs = listar.executeQuery();
			
			while (rs.next()) 
			{
	            Product pessoal = new Product();
	            pessoal.setId(rs.getInt("id"));
	            pessoal.setName(rs.getString("nome"));
	            pessoal.setEmail(rs.getString("email"));
	            lista.add(pessoal);
	        }
			printLista(lista);
		}
		
		catch (SQLException d)
		{
			System.out.println(d.getMessage());
		}
	}
	
	public static void printLista (List<Product> lista)
	{
		for (int i = 0; i < lista.size(); i++)
		{
			Product newPessoa = lista.get(i);
			System.out.println("id: " 	 + newPessoa.getId());
			System.out.println("Name: "  + newPessoa.getName());
			System.out.println("Email: " + newPessoa.getEmail());
		}
		
	}
	
}
