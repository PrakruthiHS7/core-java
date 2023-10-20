package com.xworkz.dmart.product;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor

public class Product {
    private int id;
    private String name;
    private String expireDate;
    private String manufacturingDate;
    private int price;
    private int weightInGms;
    private String ingredients;
    private String companyName;

}
