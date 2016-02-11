/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import javax.swing.JOptionPane;
/**
 *
 * @author Alex
 */
public class Startup {
    public static void main(String[] args) {
        MessageInput input = new KeyboardMessageInput();
        MessageOutput output = new JOptionMessageOutput();
        
        MessageService lab3 = new MessageService(input , output);
        lab3.makeMessage();
        
        MessageInput input2 = new GoodMorningMessageInput();
        MessageOutput output2 = new ConsoleMessageOutput();
        
        MessageService service = new MessageService(input2 , output2);
        service.makeMessage();
    }
}
