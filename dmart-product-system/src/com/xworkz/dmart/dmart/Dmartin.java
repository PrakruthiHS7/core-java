package com.xworkz.dmart.dmart;

import com.xworkz.dmart.product.Product;

public interface Dmartin {
    public boolean addProducts(Product product);
    public Product getAllProducts();
    public String getNameById(int id);
    public String getProductNameByCompanyName(String companyName);
    public String getexpireDateByName(String name);
    public String getManufacturingDateByName(String name);
    public int getPriceByWeight ( int weight);
    public boolean deletedNameById(int id);
    public String getproductNameByProductType(String Producttype);
    public String getCompanyNameByProductType(String productType);
    public String getManufactureDateAndExpireDateByProductType(String productType);
}
