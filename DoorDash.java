class DoorDash
{
  public static double search(String foodName)
  {
	  double price = 0.0;
      System.out.println("invoked search : foodName(String)");
  
  if(foodName == "Chowmein")
  {
      price = 218.0;
	  return price;
  }
  if(foodName == "Rice")
  {
	  price=150.40;
	  return price;
  }
  if (foodName=="Salami")
  {
	  price= 140.00;
	  return price;
  }
  if(foodName == "Spanak opita")
  {
	   price =177.6;
	   return price;
  }
  if(foodName =="Sugar")
  {   price= 89.90;
      return price;
  }
  if (foodName =="Soybeans curry")
  {
	   price =199.6;
	   return price;
  }
  if(foodName =="Sukiy aki")
  {
	  price =60.89;
	  return price;
  }
  if (foodName == "Sorbet")
  {   price =70.90;
      return price;
  }
  if (foodName =="Spanghetti")
  {   price = 120.90;
      return price;
  }
  if (foodName =="Squash")
  {   price = 120.89;
      return price;
  }
  if (foodName=="Dairyday icecream")
  {   price = 80.87;
      return price;
  }
  if(foodName=="Dill")
  {    price= 50.00;
       return price;
  }	  
  if (foodName=="Dumplings")
  {    price =110.90;
       return price;
  }
  if(foodName=="Doughnuts")
  {    price=320.00;
       return price;
  }
  if(foodName=="Noodles gobi")
  {  price=89.90;
      return price;
  }
  if(foodName=="Durian")
  {   price =56.50;
      return price;
  }
  if(foodName=="French Fries")
  {   price =60.80;
       return price;
  }
  if(foodName=="Frank furtuers")
  {   price= 30.00;
      return price;
  }
  if(foodName==" fruit cakes")
  {    price=45.00;
       return price;
  }
  if(foodName=="Fungi")
  {   price=35.00;
      return price;
  }
  if (foodName=="Falafel")
  {    price =60.90;
       return price;
  }
 if( foodName=="Hamburger")
 {    price =77.80;
      return price;
 }
 if(foodName=="cheese")
 {    price= 99.9;
      return price;
 }
 if(foodName=="Donut")
 {   
      price=30.00;
	  return price;
 }
 if(foodName=="BreadOmlet")
 {    
      price=79.80;
      return price;	  

 }
  if(foodName=="Fried Rice gobi")
  {    price= 60.76;
      return price;
  }
  
  if(foodName==" rice bath")
  {    price= 75.00;
      return price;
  }
  if(foodName==" mint Kabab")
  {    price=99.50;
      return price;
  }
  
  if(foodName=="Butter Masala")
  {    price= 50.90;
      return price;
  }
  
  if(foodName=="pancake")
  {    price= 70.90;
      return price;
  }
  if(foodName=="Ham")
  {    price= 95.90;
      return price;
  }
  
  if(foodName=="steak")
  {    price= 45.80;
      return price;
  }
  
  if(foodName=="tuna steak")
  {    price= 99.70;
      return price;
  }
  
  if(foodName == "porridge")
  {    price=180.8;
      return price;
  }
  
  if(foodName=="Hot dog")
  {    price=105.00;
      return price;
  }
  
  if(foodName == "ketchup")
  {    price= 80.00;
      return price;
  }
  
  if(foodName == "Jam")
  {    price= 50.00;
      return price;
  }
  
  if(foodName=="Shrimp")
  {    price= 70.00;
      return price;
  }
  
  if(foodName == "Veggie Burger")
  {    price=60.00;
      return price;
  }
  
  if(foodName=="chiken Patty")
  {    price=50.50;
      return price;
  }
  
  if(foodName == "club sandwich")
  {    price= 55.09;
      return price;
  }
  
  if(foodName == "Egg masala")
  {    price=42.90;
      return price;
  }
  
  if(foodName == "crepes")
  {    price=120.0;	

      return price;
  }
  
  if(foodName=="fried chiken")
  {    price=95.00;
      return price;
  }
  
  
  if(foodName=="chiken nuggets")
  {    price=60.00;
      return price;
  }
  
  if(foodName=="open-face sandwich")
  {    price=99.90;
      return price;
  }
  
 if(foodName=="Corn chips")
  {    price=47.90;
      return price;
  }
  if(foodName=="Maggie")
  {    price= 70.90;
      return price;
  }
  
  
  
  if(foodName== " Pepper chiken")
  {    price=100.00;
      return price;
  }
   
  if(foodName== "Muffin")
  {    price=45.00;
      return price;
  }
   
  if(foodName== "Bacon")
  {    price=50.00;
      return price;
  }
 
  System.out.println("end of search");
      return price;
  }
  public static double search(String foodName,int quantity)
  {
	  double price = 0.0;
      System.out.println("invoked search : foodName(String),quantity(int)");
  
  if(foodName == "Chowmein")
  {
      price = 218.0*quantity;
	  return price;
  }
  if(foodName == "Rice")
  {
	  price=150.40*quantity;
	  return price;
  }
  if (foodName=="Salami")
  {
	  price= 140.00*quantity;
	  return price;
  }
  if(foodName == "Spanak opita")
  {
	   price =177.6*quantity;
	   return price;
  }
  if(foodName =="Sugar")
  {   price= 89.90*quantity;
      return price;
  }
  if (foodName =="Soybeans curry")
  {
	   price =199.6*quantity;
	   return price;
  }
  if(foodName =="Sukiy aki")
  {
	  price =60.89*quantity;
	  return price;
  }
  if (foodName == "Sorbet")
  {   price =70.90*quantity;
      return price;
  }
  if (foodName =="Spanghetti")
  {   price = 120.90*quantity;
      return price;
  }
  if (foodName =="Squash")
  {   price = 120.89*quantity;
      return price;
  }
  if (foodName=="Dairyday icecream")
  {   price = 80.87*quantity;
      return price;
  }
  if(foodName=="Dill")
  {    price= 50.00*quantity;
       return price;
  }	  
  if (foodName=="Dumplings")
  {    price =110.90*quantity;
       return price;
  }
  if(foodName=="Doughnuts")
  {    price=320.00*quantity;
       return price;
  }
  if(foodName=="Noodles gobi")
  {  price=89.90*quantity;
      return price;
  }
  if(foodName=="Durian")
  {   price =56.50*quantity;
      return price;
  }
  if(foodName=="French Fries")
  {   price =60.80*quantity;
       return price;
  }
  if(foodName=="Frank furtuers")
  {   price= 30.00*quantity;
      return price;
  }
  if(foodName==" fruit cakes")
  {    price=45.00*quantity;
       return price;
  }
  if(foodName=="Fungi")
  {   price=35.00*quantity;
      return price;
  }
  if (foodName=="Falafel")
  {    price =60.90*quantity;
       return price;
  }
 if( foodName=="Hamburger")
 {    price =77.80*quantity;
      return price;
 }
 if(foodName=="cheese")
 {    price= 99.9*quantity;
      return price;
 }
 if(foodName=="Donut")
 {   
      price=30.00*quantity;
	  return price;
 }
 if(foodName=="BreadOmlet")
 {    
      price=79.80*quantity;
      return price;	  

 }
  if(foodName=="Fried Rice gobi")
  {    price= 60.76*quantity;
      return price;
  }
  
  if(foodName==" rice bath")
  {    price= 75.00*quantity;
      return price;
  }
  if(foodName==" mint Kabab")
  {    price=99.50*quantity;
      return price;
  }
  
  if(foodName=="Butter Masala")
  {    price= 50.90*quantity;
      return price;
  }
  
  if(foodName=="pancake")
  {    price= 70.90*quantity;
      return price;
  }
  if(foodName=="Ham")
  {    price= 95.90*quantity;
      return price;
  }
  
  if(foodName=="steak")
  {    price= 45.80*quantity;
      return price;
  }
  
  if(foodName=="tuna steak")
  {    price= 99.70*quantity;
      return price;
  }
  
  if(foodName == "porridge")
  {    price=180.8*quantity;
      return price;
  }
  
  if(foodName=="Hot dog")
  {    price=105.00*quantity;
      return price;
  }
  
  if(foodName == "ketchup")
  {    price= 80.00*quantity;
      return price;
  }
  
  if(foodName == "Jam")
  {    price= 50.00*quantity;
      return price;
  }
  
  if(foodName=="Shrimp")
  {    price= 70.00*quantity;
      return price;
  }
  
  if(foodName == "Veggie Burger")
  {    price=60.00*quantity;
      return price;
  }
  
  if(foodName=="chiken Patty")
  {    price=50.50*quantity;
      return price;
  }
  
  if(foodName == "club sandwich")
  {    price= 55.09*quantity;
      return price;
  }
  
  if(foodName == "Egg masala")
  {    price=42.90*quantity;
      return price;
  }
  
  if(foodName == "crepes")
  {    price=120.0*quantity;	

      return price;
  }
  
  if(foodName=="fried chiken")
  {    price=95.00*quantity;
      return price;
  }
  if(foodName=="chiken nuggets")
  {    price=60.00*quantity;
      return price;
  }
  
  if(foodName=="open-face sandwich")
  {    price=99.90*quantity;
      return price;
  }
  
 if(foodName=="Corn chips")
  {    price=47.90*quantity;
      return price;
  }
  if(foodName=="Maggie")
  {    price= 70.90*quantity;
      return price;
  }
  if(foodName== " Pepper chiken")
  {    price=100.00*quantity;
      return price;
  }
   
  if(foodName== "Muffin")
  {    price=45.00*quantity;
      return price;
  }
   
  if(foodName== "Bacon")
  {    price=50.00*quantity;
      return price;
  }
  System.out.println("end of search");
      return price; 
  }
}
  
