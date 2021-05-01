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

public class Computer {
    
    private String ComputerBrand;
    private int ProductNo;
    private String ComputerModel;
    private int Price;
    
    public void setComputerBrand(String ComputerBrand)
    {
     this.ComputerBrand=ComputerBrand;
    }      
    public String getComputer()
    {
     return ComputerBrand;
    }        
    public void setProductNo(int ProductNo)
    {
      this.ProductNo=ProductNo;
    }        
    public int getProductNo()
    {
      return ProductNo;  
    }        
    Scanner input=new Scanner(System.in);
    
   
    
    
}
