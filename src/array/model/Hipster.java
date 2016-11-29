package array.model;

public class Hipster
{

	private String name;
	
	public Hipster(String name)
	{
		this.name = name;
	}
	
	public String toString()
	{
		String description = "My name is " + name;
		description += ", and her/his/xyr hster rank is: " + hipsterRank;
		
		return description; 
	}

	public void calculatehipsterRank()
	{
		hipsterRank = (int) (Math.random() * 10)
	}

	public void calculateHipsterRank(int scale)
	{
		hipsterRank = (int) (Math.random() * scale);
	}

	public void calculateHipsterRank(int scale, int shit)
	{
		
	}
}
