package javaday2;

public class trapezium {
	public static void main(String[] args)
	{
		int z=1;
		for(int i=1;i<=4;i++)
		{
			for(int k=0;k<i-1;k++)
			{
				System.out.print("  ");
				
			}
			for(int j=1;j<=4-i;j++)
			{
				System.out.print(z+"*");
				z++;
			}
			System.out.println();
		}
	}
}
