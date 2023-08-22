class UberEats
{
  public static double search(String foodName)
  {
	  double price = 0.0;
      System.out.println("invoked search : foodName(String)");
  
  if(foodName == "vada pav")
  {
      price = 110;
	  return price;
  }
  if(foodName == "Mutton Biriyani")
  {
	  price=250;
	  return price;
  }
  if (foodName=="sawarma")
  {
	  price= 150;
	  return price;
  }
  if(foodName == "Rolls")
  {
	   price =177;
	   return price;
  }
  if(foodName =="lollypop")
  {   price= 149;
      return price;
  }
  if (foodName ==" chicken Biriyani")
  {
	   price =199;
	   return price;
  }
  if(foodName =="set dosa")
  {
	  price =99;
	  return price;
  }
  if (foodName == "sandwich")
  {   price =70;
      return price;
  }
  if (foodName =="roti curry")
  {   price = 120;
      return price;
  }
  if (foodName =="onion dosa")
  {   price = 120;
      return price;
  }
  if (foodName=="masaldose")
  {   price = 80;
      return price;
  }
  if(foodName=="poori")
  {    price= 50;
       return price;
  }	  
  if (foodName=="chow chowbath")
  {    price =110;
       return price;
  }
  if(foodName=="kaara bath")
  {    price=400;
       return price;
  }
  if(foodName=="veg palav")
  {  price=89;
      return price;
  }
  if(foodName=="donne biriyani")
  {   price =56;
      return price;
  }
  if(foodName=="mentya dose")
  {   price =60;
       return price;
  }
  if(foodName=="idli sambar")
  {   price= 30;
      return price;
  }
  if(foodName=="chitranna")
  {    price=45;
       return price;
  }
  if(foodName=="uppittu")
  {   price=35;
      return price;
  }
  if (foodName=="fish kabab")
  {    price =60;
       return price;
  }
 if( foodName=="fish fry")
 {    price =77;
      return price;
 }
 if(foodName=="fried rice")
 {    price= 99;
      return price;
 }
 if(foodName=="neer dose")
 {   
      price=50;
	  return price;
 }
 if(foodName=="rave idli")
 {    
      price=79;
      return price;	  

 }
  if(foodName=="rave dose")
  {    price= 60;
      return price;
  }
  
  if(foodName=="lemon rice")
  {    price= 65;
      return price;
  }
  if(foodName=="puliogre")
  {    price=99;
      return price;
  }
  
  if(foodName=="veg kaday")
  {    price= 50;
      return price;
  }
  
  if(foodName=="tandoori chicken")
  {    price= 70;
      return price;
  }
  if(foodName=="Sicilian pizza")
  {    price= 95;
      return price;
  }
  
  if(foodName=="kfc chicken")
  {    price= 45;
      return price;
  }
  
  if(foodName=="paroota")
  {    price= 99;
      return price;
  }
  
  if(foodName == "chilli chicken")
  {    price=280;
      return price;
  }
  
  if(foodName=="mutton chaps")
  {    price=105;
      return price;
  }
  
  if(foodName == "avalakki uppittu")
  {    price= 80;
      return price;
  }
  
  if(foodName == "vangi bath")
  {    price= 50;
      return price;
  }
  
  if(foodName=="bisibele bath")
  {    price= 90;
      return price;
  }
  
  if(foodName == "veg manchurian")
  {    price=60;
      return price;
  }
  
  if(foodName=="jalebi")
  {    price=50;
      return price;
  }
  
  if(foodName == "Mango juice")
  {    price=55;
      return price;
  }
  
  if(foodName == "Egg Burji")
  {    price=42;
      return price;
  }
  
  if(foodName == "Boneless Chicken Curry")
  {    price=120;	

      return price;
  }
  
  if(foodName=="ragi roti")
  {    price=25;
      return price;
  }
  
  if(foodName=="Chapatti")
  {    price=60;
      return price;
  }
  
  if(foodName=="tamatorice")
  {    price=79;
      return price;
  }
  
 if(foodName=="tamoto bath")
  {    price=47.30;
      return price;
  }
  if(foodName=="Bajji")
  {    price= 70.50;
      return price;
  }
  if(foodName== "Pepper mutton")
  {
      price= 90.00;
      return price;
  }
     if(foodName == "mutton curry")
  {
      price= 85.0;
      return price;
  }
  System.out.println("end of search");
      return price;
  
  }
  
  
  
  
  public static double search(String foodName,int quantity)
  {
	  double price = 0.0;
      System.out.println("invoked search : foodName(String)");
  
  if(foodName == "vada pav")
  {
      price = 110;
	  return price*quantity;
  }
  if(foodName == "Mutton Biriyani")
  {
	  price=250*quantity;
	  return price;
  }
  if (foodName=="sawarma")
  {
	  price= 150*quantity;
	  return price;
  }
  if(foodName == "Rolls")
  {
	   price =177*quantity;
	   return price;
  }
  if(foodName =="lollypop")
  {   price= 149*quantity;
      return price;
  }
  if (foodName ==" chicken Biriyani")
  {
	   price =199*quantity;
	   return price;
  }
  if(foodName =="set dosa")
  {
	  price =99*quantity;
	  return price;
  }
  if (foodName == "sandwich")
  {   price =70*quantity;
      return price;
  }
  if (foodName =="roti curry")
  {   price = 120*quantity;
      return price;
  }
  if (foodName =="onion dosa")
  {   price = 120*quantity;
      return price;
  }
  if (foodName=="masaldose")
  {   price = 80*quantity;
      return price;
  }
  if(foodName=="poori")
  {    price= 50*quantity;
       return price;
  }	  
  if (foodName=="chow chowbath")
  {    price =110*quantity;
       return price;
  }
  if(foodName=="kaara bath")
  {    price=400*quantity;
       return price;
  }
  if(foodName=="veg palav")
  {  price=89*quantity;
      return price;
  }
  if(foodName=="donne biriyani")
  {   price =56*quantity;
      return price;
  }
  if(foodName=="mentya dose")
  {   price =60*quantity;
       return price;
  }
  if(foodName=="idli sambar")
  {   price= 30*quantity;
      return price;
  }
  if(foodName=="chitranna")
  {    price=45*quantity;
       return price;
  }
  if(foodName=="uppittu")
  {   price=35*quantity;
      return price;
  }
  if (foodName=="fish kabab")
  {    price =60*quantity;
       return price;
  }
 if( foodName=="fish fry")
 {    price =77*quantity;
      return price;
 }
 if(foodName=="fried rice")
 {    price= 99*quantity;
      return price;
 }
 if(foodName=="neer dose")
 {   
      price=50*quantity;
	  return price;
 }
 if(foodName=="rave idli")
 {    
      price=79*quantity;
      return price;	  

 }
  if(foodName=="rave dose")
  {    price= 60*quantity;
      return price;
  }
  
  if(foodName=="lemon rice")
  {    price= 65*quantity;
      return price;
  }
  if(foodName=="puliogre")
  {    price=99*quantity;
      return price;
  }
  
  if(foodName=="veg kaday")
  {    price= 50*quantity;
      return price;
  }
  
  if(foodName=="tandoori chicken")
  {    price= 70*quantity;
      return price;
  }
  if(foodName=="Sicilian pizza")
  {    price= 95*quantity;
      return price;
  }
  
  if(foodName=="kfc chicken")
  {    price= 45*quantity;
      return price;
  }
  
  if(foodName=="paroota")
  {    price= 99*quantity;
      return price;
  }
  
  if(foodName == "chilli chicken")
  {    price=280*quantity;
      return price;
  }
  
  if(foodName=="mutton chaps")
  {    price=105*quantity;
      return price;
  }
  
  if(foodName == "avalakki uppittu")
  {    price= 80*quantity;
      return price;
  }
  
  if(foodName == "vangi bath")
  {    price= 50*quantity;
      return price;
  }
  
  if(foodName=="bisibele bath")
  {    price= 90*quantity;
      return price;
  }
  
  if(foodName == "veg manchurian")
  {    price=60*quantity;
      return price;
  }
  
  if(foodName=="jalebi")
  {    price=50*quantity;
      return price;
  }
  
  if(foodName == "Mango juice")
  {    price=55*quantity;
      return price;
  }
  
  if(foodName == "Egg Burji")
  {    price=42*quantity;
      return price;
  }
  
  if(foodName == "Boneless Chicken Curry")
  {    price=120*quantity;	

      return price;
  }
  
  if(foodName=="ragi roti")
  {    price=25*quantity;
      return price;
  }
  
  if(foodName=="Chapatti")
  {    price=60*quantity;
      return price;
  }
  
  if(foodName=="tamatorice")
  {    price=79*quantity;
      return price;
  }
  
 if(foodName=="tamoto bath")
  {    price=47.30*quantity;
      return price;
  }
  if(foodName=="Bajji")
  {    price= 70.50*quantity;
      return price;
  }
  if(foodName== "Pepper mutton")
  {
      price= 90.00*quantity;
      return price;
  }
     if(foodName == "mutton curry")
  {
      price= 85.0*quantity;
      return price;
  }
  System.out.println("end of search");
      return price;
  
  }
}

