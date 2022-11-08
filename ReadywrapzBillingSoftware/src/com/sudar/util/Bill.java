package com.sudar.util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;



public class Bill  {
	static int item , quantity,overall;
	static float sum = 0,cgst,sgst,Total;
	static float subtotal;
	static char choise = '\0';
	 static String key;
	static int Bill_NO;
	static ArrayList<Bill> BillDetails= new ArrayList<Bill>();
	static ArrayList<Bill> Amounttotal= new ArrayList<Bill>();
	static Bill obj;
	static Bill obj1;
	private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	static Foodprice x= new Foodprice();

	 static LocalDateTime current = LocalDateTime.now();
	 static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 static String formatted = current.format(formatter);
	 
	public static void Insertfood() {
		 HashMap<String,Float> Food=x.getFoodMap();
		 Scanner s= new Scanner(System.in);
		 Scanner s1= new Scanner(System.in);
		 
		 System.out.print("Enter Food:");
		 String food=s.next();
		 System.out.print("Enter rate:");
	 Float rate=s1.nextFloat();
	 Food.put(food,rate);
	}
public static  void Insert() {

	
		 HashMap<String,Float> Food=x.getFoodMap();
		
		 
		 
		 
		 
			 Scanner s= new Scanner(System.in);
			 Scanner s1= new Scanner(System.in);
			 char choice;
			do   
             {  
			 
				
				System.out.println("Enter the no of items");
				item=s.nextInt();
				for(int i=1;i<=item;i++) {
				 System.out.println(""+Food);
			 System.out.println("Enter the items");
			 key=s1.next();
			 
			 
			 
			 System.out.println("Quantity");
			quantity=s.nextInt();
			 
			 
			sum=(Food.get(key))*quantity;
			 System.out.println(key+"           "+quantity+ ":" +"               "+sum );
			 
			 subtotal=sum;
				System.out.println("Sub Total                                    :"+subtotal);
				
			 
				}
				
			
			 
			 boolean flag=Food.containsKey(key);
			 if(flag==true) {	 
				 
					
					
				
				 
					Amounttotal.add(obj1);
				 
				 cgst=(subtotal*5)/100;
				 sgst=(subtotal*5)/100;
				 Total=subtotal+cgst+sgst; 
					 
					 
					 
				 				 
				 
				 
					 
					System.out.println("cgst                                         :"+cgst);
					
					System.out.println("Sgst                                         :"+sgst);
					
					System.out.println("Total                                        :"+Total);
					
				 
				
			 }	
			 System.out.print("Want to add more items? (y or n): ");  
             
             choice = s.next().charAt(0);  
               
             s.nextLine();
             }   
             while (choice == 'y' || choice == 'Y');  
				
			 
				
		
					
			
			 
			 
		
	}

public static void SearchBill() {
	HashMap<String,Float> Food=x.getFoodMap();
	
	Scanner s= new Scanner(System.in);
	System.out.println("Enter the Bill No to search:");
	int Bill_No=s.nextInt();
	for(Bill eachBill:BillDetails) {
		if(Bill_No==eachBill.Bill_NO) {
			 System.out.println("Date: " + formatted);
			 System.out.println("Bill No:" +Bill_NO);
			 System.out.println(key+"           "+quantity+ ":" +"               "+ (Food.get(key))*quantity);
			 
				System.out.println("Sub Total                                    :"+sum);
				
				System.out.println("cgst                                         :"+cgst);
				
				System.out.println("Sgst                                         :"+sgst);
				
				System.out.println("Total                                        :"+Total);
		}
	}
	
	}


public static void ShowBill() {
	// TODO Auto-generated method stub
	HashMap<String,Float> Food=x.getFoodMap();
	for(Bill eachBill:BillDetails) {
		 System.out.println("Date: " + formatted);
		 System.out.println("Bill No:" +Bill_NO);
			 System.out.println(key+"           "+quantity+ ":" +"               "+ (Food.get(key))*quantity);
			 
				System.out.println("Sub Total                                    :"+sum);
				
				System.out.println("cgst                                         :"+cgst);
				
				System.out.println("Sgst                                         :"+sgst);
				
				System.out.println("Total                                        :"+Total);
		
	}
}
}

