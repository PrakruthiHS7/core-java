class Grubhub
{
  public static double search(String foodName)
  {
	  double price = 0.0;
      System.out.println("invoked search : foodName(String)");
  
  if(foodName == "Cheese toast")
  {
      price = 210.0;
	  return price;
  }
  if(foodName == "Chineesegarlic bread")
  {
	  price=250.4;
	  return price;
  }
  if (foodName=="Mashroom chilly dry")
  {
	  price= 250.00;
	  return price;
  }
  if(foodName == "chillipotato")
  {
	   price =177.6;
	   return price;
  }
  if(foodName =="paneer chilly dry")
  {   price= 149.90;
      return price;
  }
  if (foodName =="paneer manchurian dry")
  {
	   price =199.6;
	   return price;
  }
  if(foodName =="cheese beel")
  {
	  price =79.89;
	  return price;
  }
  if (foodName == "mashrrom chilly gravy")
  {   price =110.90;
      return price;
  }
  if (foodName =="cheese toast")
  {   price = 120.90;
      return price;
  }
  if (foodName =="plain maggie")
  {   price = 120.89;
      return price;
  }
  if (foodName=="masala maggie")
  {   price = 80.87;
      return price;
  }
  if(foodName=="hakka noodles")
  {    price= 50.00;
       return price;
  }	  
  if (foodName=="veg chowmein")
  {    price =110.90;
       return price;
  }
  if(foodName=="schezwan noodles ")
  {    price=199.00;
       return price;
  }
  if(foodName=="paneer noodles")
  {  price=89.90;
      return price;
  }
  if(foodName==" chilly potato")
  {   price =56.50;
      return price;
  }
  if(foodName=="manchuriandry")
  {   price =60.80;
       return price;
  }
  if(foodName=="namprik Chiken ")
  {   price= 200.00;
      return price;
  }
  if(foodName==" tabasco Chiken")
  {    price=105.00;
       return price;
  }
  if(foodName=="Hunan Chiken")
  {   price=35.00;
      return price;
  }
  if (foodName=="Bitter masala ")
  {    price =60.90;
       return price;
  }
 if( foodName=="Hot garlic Chiken")
 {    price =77.80;
      return price;
 }
 if(foodName=="Black bean Chiken ")
 {    price= 99.9;
      return price;
 }
 if(foodName=="Chilly Chiken")
 {   
      price=100.00;
	  return price;
 }
 if(foodName=="Fish machurian")
 {    
      price=79.80;
      return price;	  

 }
  if(foodName==" Chilly")
  {    price= 90.76;
      return price;
  }
  
  if(foodName=="Hot bean")
  {    price= 95.00;
      return price;
  }
  if(foodName==" veg bail source")
  {    price=99.50;
      return price;
  }
  
  if(foodName=="roasted noodels")
  {    price= 150.90;
      return price;
  }
  
  if(foodName=="leefu noodles")
  {    price= 120.90;
      return price;
  }
  if(foodName=="thukapa")
  {    price= 145.90;
      return price;
  }
  
  if(foodName=="roasted fried rice")
  {    price= 155.80;
      return price;
  }
  
  if(foodName=="Chillygarlic fried rice")
  {    price= 99.70;
      return price;
  }
  
  if(foodName == "burnt garlic fried rice")
  {    price=280.8;
      return price;
  }
  
  if(foodName=="Tomato rice")
  {    price=105.00;
      return price;
  }
  
  if(foodName == "Dim sum")
  {    price= 80.00;
      return price;
  }
  
  if(foodName == "Nasi Goreng")
  {    price= 120.00;
      return price;
  }
  
  if(foodName=="Flovoured Special Fried rice")
  {    price= 199.00;
      return price;
  }
  
  if(foodName == "Chef's special friedrice")
  {    price=190.00;
      return price;
  }
  
  if(foodName=="Egg noodles masala")
  {    price=50.50;
      return price;
  }
  
  if(foodName == "Prawn machurian")
  {    price= 55.09;
      return price;
  }
  
  if(foodName == "paneerin source")
  {    price=234.90;
      return price;
  }
  
  if(foodName == "Beef fry")
  {    price=320.0;	

      return price;
  }
  
  if(foodName=="mashrromin souce")
  {    price=85.00;
      return price;
  }
  
  
  if(foodName=="fish chilly")
  {    price=160.00;
      return price;
  }
  
  if(foodName=="Prawn chilly")
  {    price=179.90;
      return price;
  }
  
 if(foodName=="paneerin sause")
  {    price=47.90;
      return price;
  }
  if(foodName=="fish machurian ")
  {    price= 270.90;
      return price;
  }
  
  
  
  if(foodName== " Veg ball in sause")
  {    price=919.00;
      return price;
  }
   
  if(foodName== "pad thai noodels")
  {    price=210.00;
      return price;
  }
   
  if(foodName== " mee Goreng")
  {    price=360.00;
      return price;
  }
 
  System.out.println("end of search");
      return price;
  
  }
  
  public static double search(String foodName,int quantity)
  {
	  double price = 0.0;
      System.out.println("invoked search : foodName(String),quantity(int)");
  
  if(foodName == "Cheese toast")
  {
      price = 210.0*quantity;
	  return price;
  }
  if(foodName == "Chineesegarlic bread")
  {
	  price=250.4*quantity;
	  return price;
  }
  if (foodName=="Mashroom chilly dry")
  {
	  price= 250.00*quantity;
	  return price;
  }
  if(foodName == "chillipotato")
  {
	   price =177.6*quantity;
	   return price;
  }
  if(foodName =="paneer chilly dry")
  {   price= 149.90*quantity;
      return price;
  }
  if (foodName =="paneer manchurian dry")
  {
	   price =199.6*quantity;
	   return price;
  }
  if(foodName =="cheese beel")
  {
	  price =79.89*quantity;
	  return price;
  }
  if (foodName == "mashrrom chilly gravy")
  {   price =110.90*quantity;
      return price;
  }
  if (foodName =="cheese toast")
  {   price = 120.90*quantity;
      return price;
  }
  if (foodName =="plain maggie")
  {   price = 120.89*quantity;
      return price;
  }
  if (foodName=="masala maggie")
  {   price = 80.87*quantity;
      return price;
  }
  if(foodName=="hakka noodles")
  {    price= 50.00*quantity;
       return price;
  }	  
  if (foodName=="veg chowmein")
  {    price =110.90*quantity;
       return price;
  }
  if(foodName=="schezwan noodles ")
  {    price=199.00*quantity;
       return price;
  }
  if(foodName=="paneer noodles")
  {  price=89.90*quantity;
      return price;
  }
  if(foodName==" chilly potato")
  {   price =56.50*quantity;
      return price;
  }
  if(foodName=="manchuriandry")
  {   price =60.80*quantity;
       return price;
  }
  if(foodName=="namprik Chiken ")
  {   price= 200.00*quantity;
      return price;
  }
  if(foodName==" tabasco Chiken")
  {    price=105.00*quantity;
       return price;
  }
  if(foodName=="Hunan Chiken")
  {   price=35.00*quantity;
      return price;
  }
  if (foodName=="Bitter masala ")
  {    price =60.90*quantity;
       return price;
  }
 if( foodName=="Hot garlic Chiken")
 {    price =77.80*quantity;
      return price;
 }
 if(foodName=="Black bean Chiken ")
 {    price= 99.9*quantity;
      return price;
 }
 if(foodName=="Chilly Chiken")
 {   
      price=100.00*quantity;
	  return price;
 }
 if(foodName=="Fish machurian")
 {    
      price=79.80*quantity;
      return price;	  

 }
  if(foodName==" Chilly")
  {    price= 90.76*quantity;
      return price;
  }
  
  if(foodName=="Hot bean")
  {    price= 95.00*quantity;
      return price;
  }
  if(foodName==" veg bail source")
  {    price=99.50*quantity;
      return price;
  }
  
  if(foodName=="roasted noodels")
  {    price= 150.90*quantity;
      return price;
  }
  
  if(foodName=="leefu noodles")
  {    price= 120.90*quantity;
      return price;
  }
  if(foodName=="thukapa")
  {    price= 145.90*quantity;
      return price;
  }
  
  if(foodName=="roasted fried rice")
  {    price= 155.80*quantity;
      return price;
  }
  
  if(foodName=="Chillygarlic fried rice")
  {    price= 99.70*quantity;
      return price;
  }
  
  if(foodName == "burnt garlic fried rice")
  {    price=280.8*quantity;
      return price;
  }
  
  if(foodName=="Tomato rice")
  {    price=105.00*quantity;
      return price;
  }
  
  if(foodName == "Dim sum")
  {    price= 80.00*quantity;
      return price;
  }
  
  if(foodName == "Nasi Goreng")
  {    price= 120.00*quantity;
      return price;
  }
  
  if(foodName=="Flovoured Special Fried rice")
  {    price= 199.00*quantity;
      return price;
  }
  
  if(foodName == "Chef's special friedrice")
  {    price=190.00*quantity;
      return price;
  }
  
  if(foodName=="Egg noodles masala")
  {    price=50.50*quantity;
      return price;
  }
  
  if(foodName == "Prawn machurian")
  {    price= 55.09*quantity;
      return price;
  }
  
  if(foodName == "paneerin source")
  {    price=234.90*quantity;
      return price;
  }
  
  if(foodName == "Beef fry")
  {    price=320.0*quantity;	

      return price;
  }
  
  if(foodName=="mashrromin souce")
  {    price=85.00*quantity;
      return price;
  }
  
  
  if(foodName=="fish chilly")
  {    price=160.00*quantity;
      return price;
  }
  
  if(foodName=="Prawn chilly")
  {    price=179.90*quantity;
      return price;
  }
  
 if(foodName=="paneerin sause")
  {    price=47.90*quantity;
      return price;
  }
  if(foodName=="fish machurian ")
  {    price= 270.90*quantity;
      return price;
  }
  
  
  
  if(foodName== " Veg ball in sause")
  {    price=919.00*quantity;
      return price;
  }
   
  if(foodName== "pad thai noodels")
  {    price=210.00*quantity;
      return price;
  }
   
  if(foodName== " mee Goreng")
  {    price=360.00*quantity;
      return price;
  }
 
  System.out.println("end of search");
      return price;
  
  }
}
