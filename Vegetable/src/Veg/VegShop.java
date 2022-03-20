package Veg;
import java.util.*;
public class VegShop {

	public static void main(String[] args) {
		
		Scanner fru= new Scanner(System.in);
		System.out.println("id");
		Integer id =fru.nextInt();
		System.out.println("quantity");
		int quantity= fru.nextInt();
		System.out.println("Description");
		String desc= fru.next();
		System.out.println("Cost");
		Integer cost =fru.nextInt();
		System.out.println("Please select item to purchase ");
		int idc=fru.nextInt();
		System.out.println(quantity+"  "+desc+"  "+cost);


	}

}
