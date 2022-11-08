package com.sudar.main;




import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

import com.sudar.util.Bill;



public class Billing {
	
	
public static void main(String args[]) {
	int Bill_NO;
	AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
	
	 LocalDateTime current = LocalDateTime.now();
	 DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
	 String formatted = current.format(formatter);
	Scanner select= new Scanner(System.in);
	int choise;
	do {
		System.out.println("1.Insert food and prices");
		 System.out.println("2.Insert Bill");
		 System.out.println("3.Search Bill");
		 System.out.println("4.Show Bill");
		 System.out.println("5.Exit");
		 choise=select.nextInt();
		 
		switch(choise) {
		 case 1:
			 Bill.Insertfood();
			 break;
		 case 2:
			 System.out.println("Date: " + formatted);
			 
				Bill_NO = ID_GENERATOR.getAndIncrement();
					 
					 System.out.println("Bill No:" +Bill_NO);
			Bill.Insert();
			 
				 break;	
		 case 3:
			 Bill.SearchBill();
			 break;
		 case 4:
			 Bill.ShowBill(); 
			 break;
		 case 5:
			 System.exit(0);
			 break;
		}
			 
				
			
				 
				 
				 
				 
			 
		 
}while(choise!=0);
}
}
