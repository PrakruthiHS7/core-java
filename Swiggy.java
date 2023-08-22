class Swiggy
{
  public static double search(String foodName)
  {
	  double price = 0.0;
      System.out.println("invoked search : foodName(String)");
  
  if(foodName == "pizza")
  {
      price = 110.0;
	  return price;
  }
  if(foodName == "Veg Biriyani")
  {
	  price=250.4;
	  return price;
  }
  if (foodName=="Burger")
  {
	  price= 150.00;
	  return price;
  }
  if(foodName == "Rolls")
  {
	   price =177.6;
	   return price;
  }
  if(foodName =="Sandwich")
  {   price= 149.90;
      return price;
  }
  if (foodName =="Biriyani")
  {
	   price =199.6;
	   return price;
  }
  if(foodName =="Pastry")
  {
	  price =99.89;
	  return price;
  }
  if (foodName == "Momos")
  {   price =70.90;
      return price;
  }
  if (foodName =="Pav Bhaji")
  {   price = 120.90;
      return price;
  }
  if (foodName =="Pasta")
  {   price = 120.89;
      return price;
  }
  if (foodName=="Cakes")
  {   price = 80.87;
      return price;
  }
  if(foodName=="Shakes")
  {    price= 50.00;
       return price;
  }	  
  if (foodName=="Shawarma")
  {    price =110.90;
       return price;
  }
  if(foodName=="KFC Chiken")
  {    price=400.00;
       return price;
  }
  if(foodName=="Noodles")
  {  price=89.90;
      return price;
  }
  if(foodName=="Salad")
  {   price =56.50;
      return price;
  }
  if(foodName=="Masala Dosa")
  {   price =60.00;
       return price;
  }
  if(foodName=="samosas")
  {   price= 30.00;
      return price;
  }
  if(foodName== "Orange juice")
  {    price=45.00;
       return price;
  }
  if(foodName=="cheese garlic bread")
  {   price=35.00;
      return price;
  }
  if (foodName=="Dal Fry")
  {    price =60.90;
       return price;
  }
 if( foodName=="paneer Butter Masala")
 {    price =77.80;
      return price;
 }
 if(foodName=="Jeera rice")
 {    price= 99.00;
      return price;
 }
 if(foodName=="Curd rice")
 {   
      price=50.00;
	  return price;
 }
 if(foodName=="Dal Makhani")
 {    
      price=79.80;
      return price;	  

 }
  if(foodName=="Fried Rice")
  {    price= 60.76;
      return price;
  }
  
  if(foodName=="Egg rice")
  {    price= 65.00;
      return price;
  }
  if(foodName == "Chiken kabab")
  {    price= 99.50;
      return price;
  }
  
  if(foodName=="Veg Manchurian")
  {    price= 50.90;
      return price;
  }
  
  if(foodName=="Tawa Roti Butter")
  {    price= 70.90;
      return price;
  }
  if(foodName=="Motton Biriyani")
  {    price= 95.90;
      return price;
  }
  
  if(foodName=="White Pasta")
  {    price= 45.80;
      return price;
  }
  
  if(foodName=="Khadai paneer")
  {    price= 99.70;
      return price;
  }
  
  if(foodName == "Farmer market Pizza")
  {    price=280.8;
      return price;
  }
  
  if(foodName=="Paneer cigar Role")
  {    price=105.00;
      return price;
  }
  
  if(foodName == "Red pasta")
  {    price= 80.00;
      return price;
  }
  
  if(foodName == "onion samosas")
  {    price= 50.00;
      return price;
  }
  
  if(foodName=="Cheese corn ball")
  {    price= 90.00;
      return price;
  }
  
  if(foodName == "benne DOsa")
  {    price=60.00;
      return price;
  }
  
  if(foodName=="Vada pav")
  {    price=50.50;
      return price;
  }
  
  if(foodName == "puri")
  {    price= 55.0;
      return price;
  }
  
  if(foodName == "Egg Burji")
  {    price=42.90;
      return price;
  }
  
  if(foodName == "Boneless Chicken Curry")
  {    
      price=120.0;	

      return price;
  }
  
  if(foodName=="Omlette")
  {    price=25.00;
      return price;
  }
  
  
  if(foodName=="Chapatti")
  {    price=60.00;
      return price;
  }
  
  if(foodName=="Litchi Coconut Milkshake")
  {    price=79.90;
      return price;
  }
  
 if(foodName=="IceCream")
  {    price=47.90;
      return price;
  }
  if(foodName=="chiken fry")
  {    price= 70.90;
      return price;
  }
  if(foodName== "Pepper chiken")
  {    price=80.00;
      return price;
  }
  if(foodName == "Egg roast")
  {    price=40.00;
      return price;
  }
   
  if(foodName == "tandoori chiken")
  {    price=90.00;
      return price;
  }
 
  System.out.println("end of search");
      return price;
  }
  

  public static double search(String foodName, int quantity)
  {
	  double price = 0.0;
      System.out.println("invoked search : foodName(String),quantity(int)");
  
  if(foodName == "pizza")
  {
      price = 110.0 * quantity;
	  return price;
  }
  if(foodName == "Veg Biriyani")
  {
	  price=250.4*quantity;
	  return price;
  }
  if (foodName=="Burger")
  {
	  price= 150.00*quantity;
	  return price;
  }
  if(foodName == "Rolls")
  {
	   price =177.6*quantity;
	   return price;
  }
  if(foodName =="Sandwich")
  {   price= 149.90*quantity;
      return price;
  }
  if (foodName =="Biriyani")
  {
	   price =199.6*quantity;
	   return price;
  }
  if(foodName =="Pastry")
  {
	  price =99.89*quantity;
	  return price;
  }
  if (foodName == "Momos")
  {   price =70.90*quantity;
      return price;
  }
  if (foodName =="Pav Bhaji")
  {   price = 120.90*quantity;
      return price;
  }
  if (foodName =="Pasta")
  {   price = 120.89*quantity;
      return price;
  }
  if (foodName=="Cakes")
  {   price = 80.87*quantity;
      return price;
  }
  if(foodName=="Shakes")
  {    price= 50.00*quantity;
       return price;
  }	  
  if (foodName=="Shawarma")
  {    price =110.90*quantity;
       return price;
  }
  if(foodName=="KFC Chiken")
  {    price=400.00*quantity;
       return price;
  }
  if(foodName=="Noodles")
  {  price=89.90*quantity;
      return price;
  }
  if(foodName=="Salad")
  {   price =56.50*quantity;
      return price;
  }
  if(foodName=="Masala Dosa")
  {   price =60.80*quantity;
       return price;
  }
  if(foodName=="samosas")
  {   price= 30.00*quantity;
      return price;
  }
  if(foodName== "Orange juice")
  {    price=45.00*quantity;
       return price;
  }
  if(foodName=="cheese garlic bread")
  {   price=35.00*quantity;
      return price;
  }
  if (foodName=="Dal Fry")
  {    price =60.90*quantity;
       return price;
  }
 if( foodName=="paneer Butter Masala")
 {    price =77.80*quantity;
      return price;
 }
 if(foodName=="Jeera rice")
 {    price= 99.9*quantity;
      return price;
 }
 if(foodName=="Curd rice")
 {   
      price=50.00*quantity;
	  return price;
 }
 if(foodName=="Dal Makhani")
 {    
      price=79.80*quantity;
      return price;	  

 }
  if(foodName=="Fried Rice")
  {    price= 60.76*quantity;
      return price;
  }
  
  if(foodName=="Egg rice")
  {    price= 65.00*quantity;
      return price;
  }
  if(foodName == "Chiken kabab")
  {    price= 99.50*quantity;
      return price;
  }
  
  if(foodName=="Veg Manchurian")
  {    price= 50.90*quantity;
      return price;
  }
  
  if(foodName=="Tawa Roti Butter")
  {    price= 70.90*quantity;
      return price;
  }
  if(foodName=="Motton Biriyani")
  {    price= 95.90*quantity;
      return price;
  }
  
  if(foodName=="White Pasta")
  {    price= 45.80*quantity;
      return price;
  }
  
  if(foodName=="Khadai paneer")
  {    price= 99.70*quantity;
      return price;
  }
  
  if(foodName == "Farmer market Pizza")
  {    price=280.8*quantity;
      return price;
  }
  
  if(foodName=="Paneer cigar Role")
  {    price=105.00*quantity;
      return price;
  }
  
  if(foodName == "Red pasta")
  {    price= 80.00*quantity;
      return price;
  }
  
  if(foodName == "onion samosas")
  {    price= 50.00*quantity;
      return price;
  }
  
  if(foodName=="Cheese corn ball")
  {    price= 90.00*quantity;
      return price;
  }
  
  if(foodName == "benne DOsa")
  {    price=60.00*quantity;
      return price;
  }
  
  if(foodName=="Vada pav")
  {    price=50.50*quantity;
      return price;
  }
  
  if(foodName == "puri")
  {    price= 55.09*quantity;
      return price;
  }
  
  if(foodName == "Egg Burji")
  {    price=42.90*quantity;
      return price;
  }
  
  if(foodName == "Boneless Chicken Curry")
  {    price=120.0*quantity;	

      return price;
  }
  
  if(foodName=="Omlette")
  {    price=25.00*quantity;
      return price;
  }
  
  
  if(foodName=="Chapatti")
  {    price=60.00*quantity;
      return price;
  }
  
  if(foodName=="Litchi Coconut Milkshake")
  {    price=79.90*quantity;
      return price;
  }
  
 if(foodName=="IceCream")
  {    price=47.90*quantity;
      return price;
  }
  if(foodName=="chiken fry")
  {    price= 70.90*quantity;
      return price;
  }
  if(foodName== "Pepper chiken")
  {    price=80.00*quantity;
      return price;
  }
   
  if(foodName == "Egg roast")
  {    price=40.00*quantity;
      return price;
  }
   
  if(foodName == "tandoori chiken")
  {    price=90.00*quantity;
      return price;
  }
 
  System.out.println("end of search");
      return price;
  
  }
}