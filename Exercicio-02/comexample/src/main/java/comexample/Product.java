package comexample;

public class Product 
{
	private int id;
	private String name;
	private String email; 
	
	public Product(int id, String name, String email)
	{
		this.id = id;
		this.name = name;
		this.email = email;
	}

	public Product() 
	{
		this.id = -1;
		this.name = "";
		this.email = "";
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) 
	{
		this.email = email;
	}
}