package javaday2;
import java.util.Scanner;
public class array1 {
	static int ind;
	static Scanner scan=new Scanner(System.in);
	public static void add(int[] week)
	{
		int index=0;
		while(index<week.length)
		{
			System.out.println("Enter the milage:");
			week[index]=scan.nextInt();index++;
		}
	}
	public static void traverse(int[] kitkat)
	{
		if(ind>=kitkat.length){return;}
		else {System.out.println(kitkat[ind]);ind++;}traverse(kitkat);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] milage=new int[15];
		array1.add(milage);array1.ind=0;
		array1.traverse(milage);
		
	}

}
