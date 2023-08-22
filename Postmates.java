class Postmates
{
  public static double search(String foodName)
  {
	  double price = 0.0;
      System.out.println("invoked search : foodName(String)");
  
  if(foodName == "Kung Poa Chiken")
  {
      price = 250.0;
	  return price;
  }
  if(foodName == "Sweet and Sour pak")
  {
	  price=250.4;
	  return price;
  }
  if (foodName=="Mapo Tofu")
  {
	  price= 150.00;
	  return price;
  }
  if(foodName == "Spring rolls")
  {
	   price =177.6;
	   return price;
  }
  if(foodName =="Wonton soup")
  {   price= 149.90;
      return price;
  }
  if (foodName =="Biriyani rice")
  {
	   price =199.6;
	   return price;
  }
  if(foodName =="Pastry Cake")
  {
	  price =79.89;
	  return price;
  }
  if (foodName == "Char Siu")
  {   price =70.90;
      return price;
  }
  if (foodName =="Chiken fried Rice")
  {   price = 120.90;
      return price;
  }
  if (foodName =="Hot pot")
  {   price = 120.89;
      return price;
  }
  if (foodName=="Bumplings")
  {   price = 80.87;
      return price;
  }
  if(foodName=="Ma po tofu")
  {    price= 50.00;
       return price;
  }	  
  if (foodName=="Char siu")
  {    price =110.90;
       return price;
  }
  if(foodName=="Hunan ")
  {    price=400.00;
       return price;
  }
  if(foodName=="Noodles manchurian")
  {  price=89.90;
      return price;
  }
  if(foodName==" friut Salad")
  {   price =56.50;
      return price;
  }
  if(foodName=="Masala gobi")
  {   price =60.80;
       return price;
  }
  if(foodName=="Pani Puri ")
  {   price= 30.00;
      return price;
  }
  if(foodName==" Surplu fish fry")
  {    price=105.00;
       return price;
  }
  if(foodName=="Egg rolls")
  {   price=35.00;
      return price;
  }
  if (foodName=="Bitter ")
  {    price =60.90;
       return price;
  }
 if( foodName=="Dan dan noodles")
 {    price =77.80;
      return price;
 }
 if(foodName=="Saliva chiken ")
 {    price= 99.9;
      return price;
 }
 if(foodName=="Gan guo")
 {   
      price=100.00;
	  return price;
 }
 if(foodName=="Basil")
 {    
      price=79.80;
      return price;	  

 }
  if(foodName==" Rice Samber")
  {    price= 90.76;
      return price;
  }
  
  if(foodName=="Covered rice")
  {    price= 65.00;
      return price;
  }
  if(foodName==" Chineese BUrgers")
  {    price=99.50;
      return price;
  }
  
  if(foodName=="Hot spicy soup")
  {    price= 50.90;
      return price;
  }
  
  if(foodName=="A shared meal")
  {    price= 70.90;
      return price;
  }
  if(foodName=="MOtton soup")
  {    price= 155.90;
      return price;
  }
  
  if(foodName=="Stuffed BUns")
  {    price= 45.80;
      return price;
  }
  
  if(foodName=="Cream roll")
  {    price= 99.70;
      return price;
  }
  
  if(foodName == "JUJUbe")
  {    price=280.8;
      return price;
  }
  
  if(foodName=="Tomato soup")
  {    price=105.00;
      return price;
  }
  
  if(foodName == "Dim sum")
  {    price= 80.00;
      return price;
  }
  
  if(foodName == "Paking duck")
  {    price= 50.00;
      return price;
  }
  
  if(foodName=="Cheese corn ball")
  {    price= 90.00;
      return price;
  }
  
  if(foodName == "Thai chiken")
  {    price=60.00;
      return price;
  }
  
  if(foodName=="Egg noodles")
  {    price=50.50;
      return price;
  }
  
  if(foodName == "Chilly potato")
  {    price= 55.09;
      return price;
  }
  
  if(foodName == "Beef soup dinner")
  {    price=234.90;
      return price;
  }
  
  if(foodName == "Beef Stew Dinner")
  {    price=320.0;	

      return price;
  }
  
  if(foodName=="Dimsums")
  {    price=25.00;
      return price;
  }
  
  
  if(foodName=="Hawaiian")
  {    price=60.00;
      return price;
  }
  
  if(foodName=="Palak paneer")
  {    price=79.90;
      return price;
  }
  
 if(foodName=="chana masala")
  {    price=47.90;
      return price;
  }
  if(foodName=="fish curry ")
  {    price= 70.90;
      return price;
  }
  
  
  
  if(foodName== " Lamb hotpot")
  {    price=99.00;
      return price;
  }
   
  if(foodName== "Chinese Fries")
  {    price=510.00;
      return price;
  }
   
  if(foodName== " chilly baby corn")
  {    price=90.00;
      return price;
  }
 
  System.out.println("end of search");
      return price;
  
  }

  public static double search(String foodName,int quantity)
  {
	  double price = 0.0;
      System.out.println("invoked search : foodName(String),quantity(int)");
  
  if(foodName == "Kung Poa Chiken")
  {
      price = 250.0*quantity;
	  return price;
  }
  if(foodName == "Sweet and Sour pak")
  {
	  price=250.4*quantity;
	  return price;
  }
  if (foodName=="Mapo Tofu")
  {
	  price= 150.00*quantity;
	  return price;
  }
  if(foodName == "Spring rolls")
  {
	   price =177.6*quantity;
	   return price;
  }
  if(foodName =="Wonton soup")
  {   price= 149.90*quantity;
      return price;
  }
  if (foodName =="Biriyani rice")
  {
	   price =199.6*quantity;
	   return price;
  }
  if(foodName =="Pastry Cake")
  {
	  price =79.89*quantity;
	  return price;
  }
  if (foodName == "Char Siu")
  {   price =70.90*quantity;
      return price;
  }
  if (foodName =="Chiken fried Rice")
  {   price = 120.90*quantity;
      return price;
  }
  if (foodName =="Hot pot")
  {   price = 120.89*quantity;
      return price;
  }
  if (foodName=="Bumplings")
  {   price = 80.87*quantity;
      return price;
  }
  if(foodName=="Ma po tofu")
  {    price= 50.00*quantity;
       return price;
  }	  
  if (foodName=="Char siu")
  {    price =110.90*quantity;
       return price;
  }
  if(foodName=="Hunan ")
  {    price=400.00*quantity;
       return price;
  }
  if(foodName=="Noodles manchurian")
  {  price=89.90*quantity;
      return price;
  }
  if(foodName==" friut Salad")
  {   price =56.50*quantity;
      return price;
  }
  if(foodName=="Masala gobi")
  {   price =60.80*quantity;
       return price;
  }
  if(foodName=="Pani Puri ")
  {   price= 30.00*quantity;
      return price;
  }
  if(foodName==" Surplu fish fry")
  {    price=105.00*quantity;
       return price;
  }
  if(foodName=="Egg rolls")
  {   price=35.00*quantity;
      return price;
  }
  if (foodName=="Bitter ")
  {    price =60.90*quantity;
       return price;
  }
 if( foodName=="Dan dan noodles")
 {    price =77.80*quantity;
      return price;
 }
 if(foodName=="Saliva chiken ")
 {    price= 99.9*quantity;
      return price;
 }
 if(foodName=="Gan guo")
 {   
      price=100.00*quantity;
	  return price;
 }
 if(foodName=="Basil")
 {    
      price=79.80*quantity;
      return price;	  

 }
  if(foodName==" Rice Samber")
  {    price= 90.76*quantity;
      return price;
  }
  
  if(foodName=="Covered rice")
  {    price= 65.00*quantity;
      return price;
  }
  if(foodName==" Chineese BUrgers")
  {    price=99.50*quantity;
      return price;
  }
  
  if(foodName=="Hot spicy soup")
  {    price= 50.90*quantity;
      return price;
  }
  
  if(foodName=="A shared meal")
  {    price= 70.90*quantity;
      return price;
  }
  if(foodName=="MOtton soup")
  {    price= 155.90*quantity;
      return price;
  }
  
  if(foodName=="Stuffed BUns")
  {    price= 45.80*quantity;
      return price;
  }
  
  if(foodName=="Cream roll")
  {    price= 99.70*quantity;
      return price;
  }
  
  if(foodName == "JUJUbe")
  {    price=280.8*quantity;
      return price;
  }
  
  if(foodName=="Tomato soup")
  {    price=105.00*quantity;
      return price;
  }
  
  if(foodName == "Dim sum")
  {    price= 80.00*quantity;
      return price;
  }
  
  if(foodName == "Paking duck")
  {    price= 50.00*quantity;
      return price;
  }
  
  if(foodName=="Cheese corn ball")
  {    price= 90.00*quantity;
      return price;
  }
  
  if(foodName == "Thai chiken")
  {    price=60.00*quantity;
      return price;
  }
  
  if(foodName=="Egg noodles")
  {    price=50.50*quantity;
      return price;
  }
  
  if(foodName == "Chilly potato")
  {    price= 55.09*quantity;
      return price;
  }
  
  if(foodName == "Beef soup dinner")
  {    price=234.908*quantity;
      return price;
  }
  
  if(foodName == "Beef Stew Dinner")
  {    price=320.0*quantity;	

      return price;
  }
  
  if(foodName=="Dimsums")
  {    price=25.00*quantity;
      return price;
  }
  
  
  if(foodName=="Hawaiian")
  {    price=60.00*quantity;
      return price;
  }
  
  if(foodName=="Palak paneer")
  {    price=79.90*quantity;
      return price;
  }
  
 if(foodName=="chana masala")
  {    price=47.90*quantity;
      return price;
  }
  if(foodName=="fish curry ")
  {    price= 70.90*quantity;
      return price;
  }
  
  if(foodName== " Lamb hotpot")
  {    price=99.00*quantity;
      return price;
  }
   
  if(foodName== "Chinese Fries")
  {    price=510.00*quantity;
      return price;
  }
   
  if(foodName== " chilly baby corn")
  {    price=90.00*quantity;
      return price;
  }
 
  System.out.println("end of search");
      return price;
  
  }
}