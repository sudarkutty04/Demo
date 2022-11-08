package com.sudar.util;
import java.util.*;


public  class Foodprice {
	
		private HashMap<String,Float> Food=new HashMap<String,Float>();
		
	
		public HashMap<String, Float> getFoodMap() {
			// TODO Auto-generated method stub
			Food.put("Parota", (float) 10); 
			Food.put("Veg_Fried_Rice", (float) 50); 
			Food.put("Egg_Fried_Rice", (float) 60); 
			Food.put("Chicken_Fried_Rice", (float) 70);
			Food.put("Veg_Meals", (float) 90);
			Food.put("Non_Veg_Meals", (float) 150);
			Food.put("Chappati", (float) 15);
			Food.put("Dhosa", (float) 10);
			Food.put("Idly", (float) 6);
			Food.put("Pongal", (float) 50);
			return Food;
		}
	

}
