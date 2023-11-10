package com.xworkz.dmart.product;

import lombok.*;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Product {
    private int id;
    private String name;
    private String expireDate;
    private String manufacturingDate;
    private int price;
    private int weightInGms;
    private String ingredients;
    private String companyName;
    private String productType;

}
