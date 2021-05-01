/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author lenovo
 */
import java.util.Scanner;


public class Product 
{
    private String ProductName;
    private String Productcategory;
    private int Price;
    private int Number;
    
    public void setProductName(String ProductName)
    {
        this.ProductName=ProductName;
    }        
    public String getProductName()
    {
      return  ProductName;
    }
    
    public void setProductcategory(String Productcategory)
    {
        this.Productcategory=Productcategory;
    }        
    public String getProductcategory() 
    {
      return  Productcategory;
    }        
    public void setPrice(int Price)
    {
      this.Price=Price;
    }
    public int getPrice()   
    {
      return Price;
    }        
    public void setNumber(int Number)
    {
      this.Number=Number;
    }        
    public int getNumber()
    {
      return Number;
    }        
    
    public static void main(String[]args)
    {
       String ProductName;
       Scanner input=new Scanner(System.in);
       
        System.out.println("Search ProductName:");
        ProductName=input.nextLine();
        
        
        
        
        if(ProductName.equals("Computer"))
        {
            System.out.println("Choose a product");
        }    
        else
        {
            System.out.println("Enter another product name");     
        }    
    }        
    
    
    @Override
    public String toString()
    {
        return ""+ProductName+""+Productcategory+""+Price+""+Number;
    }
    
    
    
}
