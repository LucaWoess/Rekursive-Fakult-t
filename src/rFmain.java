public class rFmain 
{
	
	public static void main(String[] args) 
	{
		for(int i=0;i<20;i++)
		{
			System.out.println("Fakultät von ("+i+"): "+fakultaet(i));
		}
	}

	public static int fakultaet(int i)
	{
		if(i==1) {return 1;}
		return fakultaet(i-1)*i;
	}
}
