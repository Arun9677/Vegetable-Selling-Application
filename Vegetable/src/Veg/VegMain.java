package Veg;

import java.util.Iterator;
import java.util.Scanner;

public class VegMain {

	public static void main(String[] args) {
		
		int items;
		System.out.println("Enter total items");
		Scanner sc=new Scanner(System.in);
		items=sc.nextInt();
		int id[]=new int[items];
		String veg[]=new String[items];
		int price[]=new int[items];
		int qty[]=new int[items];
		System.out.println();
		System.out.println("Enter stocks");
		int k=1;
		for(int i=0;i<items;i++)
		{
			System.out.println("List "+k++);
			id[i]=i+1;
			System.out.println("veg");
			veg[i]=sc.next();
			System.out.println("price");
			price[i]=sc.nextInt();
			System.out.println("Quantitiy");
			qty[i]=sc.nextInt();			
		}
		
		System.out.println();
		System.out.println("stocks are");
		System.out.println();
		
		for(int j=0;j<items;j++)
		{
			System.out.println("Id = "+id[j]+" Veg = "+veg[j]+" price = "+price[j]+" qty = "+qty[j]);
		}
		
		System.out.println("Customer entered ");
		//String name=sc.next(); 
		System.out.println("Total item to purchase");
		int itemch;
		itemch=sc.nextInt();
		int total=0;
		int cstpur[]=new int[itemch];
		int id1[]=new int[itemch];
		int qty1[]=new int[itemch];
		for(int a=0;a<itemch;a++)
		{
		int idch;
		System.out.println("Enter id");
		idch=sc.nextInt();
		id1[a]=idch;
		int qtych;
		System.out.println("Enter quantity");
		qtych=sc.nextInt();
		qty[idch-1]=qty[idch-1]-qtych;
		qty1[a]=qtych;
		total=total+price[idch-1]*qtych;
		}
		System.out.println("Purchase");
		for(int b=0;b<itemch;b++)
		{
			int c = id1[b]-1;
			System.out.println("Id = "+id1[b]+" Veg = "+veg[c]+" price = "+price[c]+" qty = "+qty1[b]);
		}
		System.out.println("You purchased for = "+total);
		
		System.out.println("Remaining stock");
		for(int j=0;j<items;j++)
		{
			System.out.println("Id = "+id[j]+" Veg = "+veg[j]+" price = "+price[j]+" qty = "+qty[j]);
		}
		
		
	}

}
