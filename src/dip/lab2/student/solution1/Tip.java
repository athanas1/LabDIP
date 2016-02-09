/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

import dip.lab2.*;

/**
 *
 * @author Alex
 * Use Service or Manager when naming high level classes
 */
public class Tip {
    public double getTip(TipCalculator TC){
        return TC.getTip();
    }
}
