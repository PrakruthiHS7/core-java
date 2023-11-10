package com.xworkz.dmart;

import com.xworkz.dmart.dmart.impl.Dmart;
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

            System.out.println("Enter the productType");
            product.setProductType(sc.next());


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
            System.out.println("Press 9 to productName By ProductType");
            System.out.println("Press 10 to get CompanyName By ProductType");
            System.out.println("press 11 to getManufactureDateAndExpireDateByProductType");
            System.out.println("Press 12 to updatePriceByName");
            System.out.println("Press 13 to deletedNameById");


            int option=sc.nextInt();
            switch (option){
                case 1:dmart.getAllProducts();
                    break;
                case 2:
                    try{
                    System.out.println("Enter the Id to get the product name");
                    String name=dmart.getNameById(sc.nextInt());
                    System.out.println(name);}
                    catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Enter the name to get the manufacture date");
                        String manufactureDate = dmart.getManufacturingDateByName(sc.next());
                        System.out.println(manufactureDate);
                    }catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }

                   break;
                case 4:
                    try{
                    System.out.println("enter CompanyName to get the productName");
                    String name1=dmart.getProductNameByCompanyName(sc.next());
                    System.out.println(name1);}catch (Exception e){
                        e.printStackTrace();
                    }
                  break;
                case 5:
                    try{
                    System.out.println("Enter name to get the expireDate");
                    String expireDate=dmart.getexpireDateByName(sc.next());
                    System.out.println(expireDate);}catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    break;
                case 6:
                    try{
                    System.out.println("Enter product name to get the manufacture date");
                    String manufacutureDate=dmart.getManufacturingDateByName(sc.next());
                    System.out.println(manufacutureDate);}catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    break ;
                case 7:
                    try{
                    System.out.println(" Enter weight to get the price ");
                    int priceByWeight= dmart.getPriceByWeight(sc.nextInt());
                    System.out.println(priceByWeight);}catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    break;
                case 8:
                    try{
                    System.out.println("Enter Id to delete product");
                     System.out.println(dmart.deletedNameById(sc.nextInt()));}catch (Exception e){
                        e.printStackTrace();
                        System.out.println(e);
                    }
                     break;
                case 9:
                    try{
                    System.out.println("Enter product type to get the product Name");
                    String companyName=dmart.getproductNameByProductType(sc.next());
                    System.out.println(companyName);}catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    break;
                case 10:
                    try {
                    System.out.println("Enter product type to get the company Name");
                    String companyName1=dmart.getCompanyNameByProductType(sc.next());
                    System.out.println(companyName1);}catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    break;
                case 11:
                    try{
                    System.out.println("Enter product type to get the ManufactureDateAndExpireDateByProductType");
                    String dates=dmart.getManufactureDateAndExpireDateByProductType(sc.next());
                    System.out.println(dates);}catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    break;
                case 12:
                    try{
                    System.out.println("enter upadted price");
                    int updatePrice=sc.nextInt();
                    System.out.println("enter name to update the price");
                    String nametoupdate=sc.next();
                    boolean updatePriceByName=dmart.updatePriceByName(updatePrice,nametoupdate);
                    System.out.println(updatePriceByName);}catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
                    break;
                case 13:
                    try{
                        System.out.println("enter id to delete the name");
                   boolean deleteName=dmart.deletedNameById(sc.nextInt());
                    System.out.println(deleteName);}catch (Exception e){
                        System.out.println(e);
                        e.printStackTrace();
                    }
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
