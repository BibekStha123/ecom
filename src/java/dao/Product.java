/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

/**
 *
 * @author bibek
 */
public class Product {
    public static int id;
    public static String name;
    public static String price;
    public static String details;

    public Product(int id, String name, String price, String details) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.details = details;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getDetails() {
        return details;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
    
}
