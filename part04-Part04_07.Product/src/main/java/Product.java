/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ganesh
 */
public class Product {
    private double Price;
    private int quantity;
    private String name;
    
    public Product(String initialName, double initialPrice,int initialQuantity){
        name=initialName;
        Price=initialPrice;
        quantity=initialQuantity;
    }
    public void printProduct(){
        System.out.println(name+",price "+ Price+", "+quantity+" pcs");
    }
    
    
}
