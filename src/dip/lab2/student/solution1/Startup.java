/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author athanas1
 */
public class Startup {
     
    
   public static void main(String[] args) {
        TipCalculator tip1 = new FoodTipCalculator(ServiceQuality.POOR, 45);
        TipCalculator tip2 = new BaggageTipCalculator(ServiceQuality.GOOD,12);
        
        Tip tp = new Tip();
        
        System.out.println(tp.getTip(tip1));
        System.out.println(tp.getTip(tip2));
    }
}

