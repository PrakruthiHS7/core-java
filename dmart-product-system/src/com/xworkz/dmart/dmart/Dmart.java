package com.xworkz.dmart.dmart;

import com.xworkz.dmart.product.Product;

import java.util.Arrays;
import java.lang.*;


public class Dmart {
    int index;
    int id=1;
    Product product[];
    public Dmart(int size)
    {

        product=new Product[size];
    }

    public boolean addProducts(Product product)
    {
        boolean isAdded=false;
        if(product!=null)
        {
            product.setId(id++);
            this.product[index++]=product;
            isAdded=true;
        }
        return isAdded;
    }

    public Product getAllProducts()
    {
        for (int i = 0; i <product.length ;i ++)
        {
            System.out.println(product[i].getId()+" " + product[i].getName()+" " +product[i].getExpireDate()+ " "+product[i].getManufacturingDate()+ " "+product[i].getPrice()+" "+product[i].getWeightInGms()+ "  "+product[i].getIngredients());
        }
        return null;
    }

    public String getNameById(int id)
    {
        String Name=null;

        System.out.println("invoking the method get  productName By Id");
        for (int i = 0; i <this.product.length ; i++) {
            if (product[i].getId()==id) {
                Name = product[i].getName();
            }

        }
        return Name;
    }


    public String getProductNameByCompanyName(String companyName)
    {
        String name=null;

        for(int i = 0; i <product.length ; i++) {
            System.out.println("invoking the method   getNameCompanyName"+product[i].getCompanyName());

            if(product[i].getCompanyName()!=null) {
                if (product[i].getCompanyName().equals(companyName)) {
                    name = product[i].getName();
                }
            }

        }
        return name;
    }

    public String getexpireDateByName(String name) {
        String expireDate = null;

        System.out.println("invoking the method getexpireDateByName");
        for (int i = 0; i < index; i++) {
            if (product[i] != null) {
                System.out.println("Product name: " + product[i].getName()); // Debug statement
                if (product[i].getName().equals(name)) {
                    expireDate = product[i].getExpireDate();

                }
            }
        }

        return expireDate;
    }


    public String getManufacturingDateByName(String name){

            String manufactureDate = null;
            for (int i = 0; i < product.length; i++) {

                if ( product[i].getName().equals(name)) {

                    manufactureDate = product[i].getManufacturingDate();

                }

            }
       return manufactureDate;
        }


        public int getPriceByWeight ( int weight){
            int price = 0;
            System.out.println("getPriceByWeight");
            for (int index = 0; index < product.length; index ++) {
                if (product[index].getWeightInGms()== weight) {
                    price = product[index].getPrice();
                }
            }
            return price;
        }

        public boolean updatePriceByName( int updatedPrice, String existingName)
        {
            System.out.println("updatePriceByName");
            boolean isPriceUpdated = false;
            for (int i = 0; i < this.product.length; i++) {
                if (product[i].getName().equals(existingName)) {
                    product[i].setPrice(updatedPrice);
                    isPriceUpdated = true;
                }
            }
            return isPriceUpdated;
        }

        public boolean deletedNameById(int id){
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
            //java.util
            product = Arrays.copyOf(product, newIndex);
            getAllNewProduct(product);
            return false;
        }
        public void getAllNewProduct (Product product[]){
            System.out.println("get all new product");
            for (int i = 0; i < product.length; i++) {
                System.out.println(product[i].getName() + " " +
                        product[i].getId() + " " +
                        product[i].getPrice() + " " +
                        product[i].getManufacturingDate() + " " +
                        product[i].getExpireDate() + " " +
                        product[i].getCompanyName()
                );
            }
        }

}
