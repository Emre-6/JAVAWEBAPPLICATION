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

public class Search 
{
    public static void main(String[]args)
    {
      Scanner input=new Scanner(System.in);
      
      String Keyword;
        
      System.out.println("Enter a keyword:");
      Keyword=input.nextLine();
      
      if(Keyword.equals("Computer"))
      {
          System.out.println("Computer keyword:");
      }
    }
}
