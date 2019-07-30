package javaday2;
import java.util.Scanner;
public class Bus {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int i=0,j=0,amount,total=0;
		int a[]= {700,500,800,450};
		int t[]=new int[4];
		while(i<4)
		{
			j=0;
			while(j<7)
			{
				System.out.println("Enter the amount for"+i+1+"bus");
				amount=scan.nextInt();
				if(amount>=a[i])
				{
					t[i]+=a[i];
				}
				else
				{
					System.out.println("Seat cannot be given");
				}
				j++;
			}
			System.out.println("Bus "+i+1+" total amount is"+t[i]);
			i++;
		}
		System.out.println("total bus collection amount is ");
		for(i=0;i<4;i++)
		{
			total+=t[i];
		}
		System.out.println(total);

	}

}
