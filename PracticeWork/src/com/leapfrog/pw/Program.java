/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.pw;

import com.leapfrog.pw.command.MathCommand;
import com.leapfrog.pw.command.MathFactory;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SizeRequirements;






/**
 *
 * @author user
 */
public class Program {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner input= new Scanner(System.in);
        System.out.println("Enter the file path:");
       String filePath= input.next();
       
        try {
            BufferedReader reader= new BufferedReader(new FileReader(filePath));
            String line="";
            while((line=reader.readLine())!=null){
          String[] tokens= line.split(",");
          if(tokens.length>=3){
              double x=Double.parseDouble(tokens[0]);
              String key=tokens[1];
              double y=Double.parseDouble(tokens[2]);
              
              MathCommand cmd= MathFactory.get(key);
              if(cmd!=null){
                  System.out.println(cmd.calculate(x, y));
              }else
                  System.out.println("Invalid command");
          }
            }
        } catch (IOException ioe) {
            System.out.println(ioe.getMessage());
        }
        
       
         
    } 
}
