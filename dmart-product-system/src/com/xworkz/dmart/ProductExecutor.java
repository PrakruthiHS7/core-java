package com.xworkz.dmart;

import com.xworkz.dmart.dmart.Dmart;
import com.xworkz.dmart.product.Product;
import java.lang.*;

import java.util.Scanner;

public class ProductExecutor {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number of products");
        //reads the integer from the keyboard/user.

        int size=sc.nextInt();
        Dmart dmart = new Dmart(size);
        for (int index = 0; index <size ; index++)
        {

            Product product=new Product();

            System.out.println("Enter the Name of the product");
            product.setName(sc.next());

            System.out.println("Enter the expireDate");
            product.setExpireDate(sc.next());

            System.out.println("Enter the manufacture date");
            product.setManufacturingDate(sc.next());

            System.out.println("Enter the price of the product");
            product.setPrice(sc.nextInt());

            System.out.println("Enter the weightInGms");
            product.setWeightInGms(sc.nextInt());

            System.out.println("Enter the company name ");
            product.setCompanyName(sc.next());

            System.out.println("Enter the ingredients ");
            product.setIngredients(sc.next());


            dmart.addProducts(product);
        }


        String input=null;
        do {
            System.out.println("Press 1 to get the all products");
            System.out.println("Press 2 to get the name of the product ");
            System.out.println("Press 3 to get the manufacture date");
            System.out.println("Press 4 to get the company name");
            System.out.println("Press 5 to get the expire date");
            System.out.println("Press 7 to get the price by weight");
            System.out.println("Press 6 to get the manufacture date by name ");
            System.out.println("Press 8 to delete the product");


            int option=sc.nextInt();
            switch (option){
                case 1:dmart.getAllProducts();
                    break;
                case 2:
                    System.out.println("Enter the Id to get the product name");
                    String name=dmart.getNameById(sc.nextInt());
                    System.out.println(name);
                    break;
                case 3:
                    System.out.println("Enter the name to get the manufacture date");
                     String manufactureDate= dmart.getManufacturingDateByName(sc.next());
                    System.out.println(manufactureDate);

                   break;
                case 4:
                    System.out.println("enter CompanyName to get the productName");
                    String name1=dmart.getProductNameByCompanyName(sc.next());
                    System.out.println(name1);
                  break;
                case 5:
                    System.out.println("Enter name to get the expireDate");
                    String expireDate=dmart.getexpireDateByName(sc.next());
                    System.out.println(expireDate);
                    break;
                case 6:
                    System.out.println("Enter product name to get the manufacture date");
                    String manufacutureDate=dmart.getManufacturingDateByName(sc.next());
                    System.out.println(manufacutureDate);
                    break ;
                case 7:
                    System.out.println(" Enter weight to get the price ");
                    int priceByWeight= dmart.getPriceByWeight(sc.nextInt());
                    System.out.println(priceByWeight);
                    break;
                case 8:
                    System.out.println("Enter Id to delete product");
                     System.out.println(dmart.deletedNameById(sc.nextInt()));
                     break;

                default:
                    System.out.println("Please choose the correct option");
                    break;
            }
            System.out.println("you want to continue yes/no");
            input=sc.next();
        }while (input.equals("yes"));
        System.out.println(("thank you for using!...."));
    }
}
