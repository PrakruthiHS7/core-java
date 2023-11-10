package com.xworkz.dmart.dmart.impl;

import com.xworkz.dmart.dmart.Dmartin;
import com.xworkz.dmart.exception.*;
import com.xworkz.dmart.product.Product;
import java.util.Arrays;
import java.lang.*;

public class Dmart implements Dmartin {
    int index;
    int id=1;
    Product product[];
    public Dmart(int size)
    {
        product=new Product[size];
    }
   @Override
    public boolean addProducts(Product product)
    {
            boolean isAdded = false;
        try
        {
            if (product != null)
            {
                product.setId(id++);
                this.product[index++] = product;
                isAdded = true;
            }
            else
            {
                new ProductAdditionException("Product storage is full. Cannot add more products.");
            }
        } catch (ProductAdditionException e){
            System.out.println(e.getMessage());
            e.printStackTrace();
        }
        return isAdded;
    }
@Override
    public Product getAllProducts()
    {
        for (int i = 0; i <product.length ;i ++)
        {
            System.out.println(Arrays.toString(product));
        }
        return null;
    }

    public String getNameById(int id)
    {
        String name=null;
        try {
            System.out.println("invoking the method get  productName By Id");
            for (int i = 0; i < this.product.length; i++) {
                if (product[i].getId() == id) {
                    name = product[i].getName();
                }
            }
            if (name == null) {
                throw new ProductNameNotFoundException(" product name is found for the given id");
            }
        }catch(ProductNameNotFoundException e){
                System.out.println(e);
                e.printStackTrace();
            }
        return name;
    }


    public String getProductNameByCompanyName(String companyName) {
        String name = null;
        try {
            for (int i = 0; i < product.length; i++) {
                System.out.println("invoking the method getNameCompanyName" + product[i].getCompanyName());

                if (product[i].getCompanyName() != null && product[i].getCompanyName().equals(companyName)) {
                    name = product[i].getName();
                    break;
                }
            }
            if (name == null) {
                throw new ProductNameNotFoundException("Product name not found for the given company name");
            }
        } catch (ProductNameNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        return name;
    }


    public String getexpireDateByName(String name) {
        String expireDate = null;
        try{
        System.out.println("invoking the method getexpireDateByName");
        for (int i = 0; i < index; i++) {
            if (product[i] != null) {
                System.out.println("Product name: " + product[i].getName()); // Debug statement
                if (product[i].getName().equals(name)) {
                    expireDate = product[i].getExpireDate();

                }
            }
        }
            if (expireDate==null){
                throw new ExpireDateNotFoundException("expiredate not found by name");
            }
        }catch(ExpireDateNotFoundException e){
                System.out.println(e);
                e.printStackTrace();
        }
        return expireDate;
    }


    public String getManufacturingDateByName(String name){

            String manufactureDate = null;
            try {
                for (int i = 0; i < product.length; i++) {

                    if (product[i].getName().equals(name)) {

                        manufactureDate = product[i].getManufacturingDate();

                    }
                }
                if (manufactureDate==null){
                    throw new ManufactureDateNotFoundException("manufacture date not found by the name");
                }
            }catch (ManufactureDateNotFoundException e){
                System.out.println(e);
                e.printStackTrace();

            }
       return manufactureDate;
        }
        public int getPriceByWeight ( int weight){
            int price = 0;
            System.out.println("getPriceByWeight");
            try {
                for (int index = 0; index < product.length; index++) {
                    if (product[index].getWeightInGms() == weight) {
                        price = product[index].getPrice();
                    }
                }
                if (price==0){
                    throw new PriceNotFoundException("price not found by given weight");
                }
            }catch (PriceNotFoundException e){
                System.out.println(e);
                e.printStackTrace();

            }
            return price;
        }
    @Override
    public String getproductNameByProductType(String productType){
        String productName=null;
        try{
        for (int i = 0; i < product.length; i++) {
            if (product[i].getProductType().equals(productType)){
                productName=product[i].getName();
            }
        }if(productName==null){
            throw new ProductNameNotFoundException("product name not found by the type");
            }
        }catch (ProductNameNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }
     return productName;
    }
    @Override
    public String getCompanyNameByProductType(String productType){
     String companyName=null;
     try {
         for (int i = 0; i < product.length; i++) {
             if (product[i].getProductType().equals(productType)) {
                 companyName = product[i].getCompanyName();
             }
         }
         if (companyName==null){
             throw new CompanayNameNotFoundException("Companyname not found for the given product Type");
         }
     }
        catch(CompanayNameNotFoundException e){
            System.out.println(e);
            e.printStackTrace();

        }
     return companyName;
    }
    @Override
    public String getManufactureDateAndExpireDateByProductType(String productType){
      String manufactureDate=null;
      String expireDate=null;
      try {
          for (int i = 0; i < product.length; i++) {
              if (product[i].getProductType().equals(productType)) {
                  manufactureDate = product[i].getManufacturingDate();
                  expireDate = product[i].getExpireDate();
              }

          }
          if (manufactureDate==null||expireDate==null){
              throw new DateNotFoundException("Manufacture date or expire date not found for the given product type");
          }
      }catch (DateNotFoundException e){
          System.out.println(e);
          e.printStackTrace();

      }
        return "Manufacture Date: " + manufactureDate + "\nExpire Date: " + expireDate;
    }
        public boolean updatePriceByName( int updatedPrice, String existingName)
        {
            System.out.println("invoke method of updatePriceByName");
            boolean isPriceUpdated = false;
            try{
            for (int i = 0; i < this.product.length; i++) {
                if (product[i].getName().equals(existingName)) {
                    product[i].setPrice(updatedPrice);
                    isPriceUpdated = true;
                    System.out.println("price is updated");
                }
            }}catch (Exception e) {
                // Handle exceptions specific to your application's logic or log the exception
                System.err.println("Error updating price: " + e.getMessage());
                e.printStackTrace();
            }
            return isPriceUpdated;
        }
        public boolean deletedNameById(int id) {
            System.out.println("Invoke  deletedNameById ");
            int newIndex = 0;
            for (int index = 0; index < this.product.length; index++) {
                if (product[index].getId() != id) {
                    product[newIndex] = product[index];
                    newIndex++;
                } else {
                    System.out.println("Given product name is  deleted.");
                }
            }
            boolean productFound = false;
            try{
            if (!productFound) {
                throw new ProductNotFoundException("Product not found for the given ID.");
            }}
            catch (ProductNotFoundException e){
                e.printStackTrace();
            }
            //java.util
            product = Arrays.copyOf(product, newIndex);
            getAllNewProduct(product);
            return false;
        }
        public void getAllNewProduct (Product product[]){
            System.out.println("get all new product");
            for (int i = 0; i < product.length; i++) {
                System.out.println(product[i]);
            }
        }

}
