package Veg;

import java.util.HashMap;
import java.util.Map;

public class VegMap {

	public static void main(String[] args) 
	{
		
		Map<Integer, VegCollection> ob=new HashMap();
		
		VegCollection ob1=new VegCollection(1, 100, "Tomato", 30);
		VegCollection ob2=new VegCollection(2, 100, "Onion", 50);
		VegCollection ob3=new VegCollection(3, 80, "Potato", 40);
		VegCollection ob4=new VegCollection(4, 50, "Brinjal", 40);
		VegCollection ob5=new VegCollection(5, 30, "Beans", 80);
		
		ob.put(1, ob1);
		ob.put(2, ob2);
		ob.put(3, ob3);
		ob.put(4, ob4);
		ob.put(5, ob5);
		
		for(Map.Entry<Integer, VegCollection> entry:ob.entrySet())
		{
			VegCollection vc=entry.getValue();
			System.out.print(vc.id+" ");
			System.out.print(vc.Name+" ");
			System.out.print(vc.quantity+" ");
			System.out.print(vc.price+" ");
			System.out.println();
			
		}
		
	}

}
