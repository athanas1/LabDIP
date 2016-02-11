/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

/**
 *
 * @author Alex
 */
public class Startup {
    public static void main(String[] args) {
        MessageInput input = new KeyboardMessageInput();
        MessageOutput output = new ConsoleMessageOutput();
        
        MessageService lab3 = new MessageService(input , output);
        lab3.produceMessage();
    }
}
