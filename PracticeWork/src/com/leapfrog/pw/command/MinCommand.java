/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.pw.command;

/**
 *
 * @author user
 */
public class MinCommand extends MathCommand {

    @Override
    public double calculate(double x, double y) {
        if(x<y){
            return x;
        }else
            return y;
    }
    
}
