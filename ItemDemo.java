

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Item{
	Integer itemId;
	String itemName;
	Item(int itemId, String itemName){
		this.itemId = itemId;
		this.itemName = itemName;
	}
	
	public Integer getId(){
		return this.itemId;
	}
	
	public String getName(){
		return this.itemName;
	}
	
	@Override
	public String toString()	
	{
		return this.itemId+ " " +this.itemName;
	}
	
	@Override
	public boolean equals(Object o)	
	{
		if(o instanceof Item){ 
			Item temp = (Item)o;
			
			if(this.itemId.equals(temp.itemId) && this.itemName.equals(temp.itemName)){
				return true;
			}
		}
		return false;
	}
}

class idSort implements Comparator<Item>	
{  	 
	public int compare(Item i1, Item i2){
		return i1.getId().compareTo(i2.getId());
	}
}

class nameSort implements Comparator<Item> 
{
	public int compare(Item i1, Item i2){
		return i1.getName().compareTo(i2.getName());
	}
}

public class ItemDemo {
	public static void main(String args[]){
		
		Scanner sc = new Scanner(System.in);

		ArrayList<Item> inv = new ArrayList<Item>();	
		
		while(true) 
		{
		System.out.println("***********************************");
		System.out.println("Please enter your choice (1-4)");
		System.out.println("1. Add Item");
		System.out.println("2. Display ");
		System.out.println("3. Remove");
		System.out.println("4. Exit");
		System.out.println("***********************************");
		
		int choice = sc.nextInt();
		if(choice == 1){
			System.out.println("Enter item id and item name separated by space.");
			int itemId = sc.nextInt();
			String itemName = sc.next();
			Item ob = new Item(itemId, itemName);
			if(!inv.contains(ob))
			{	
				inv.add(ob);
			}
		}
		
		else if(choice == 2) 	
		{
			idSort is = new idSort();
			Collections.sort(inv, is);
			System.out.println("id sorted list : " + inv);
			
			nameSort ns = new nameSort();
			Collections.sort(inv, ns);
			System.out.println("Name sorted list : " + inv);
		}
		
		else if(choice == 3)	
		{
			System.out.println("Enter item to be removed");
			System.out.println("Enter item id and item name separated by space.");
			int itemId = sc.nextInt();
			String itemName = sc.next();
			Item ob2 = new Item(itemId, itemName);
			if(inv.contains(ob2))
				inv.remove(ob2);
			else
				System.out.println("Item not found");
		}
		else if(choice == 4) // Exit 
			break;
		else
			System.out.println("Invalid choice");
		}
	}	

}
