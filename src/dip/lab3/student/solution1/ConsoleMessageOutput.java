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
public class ConsoleMessageOutput implements MessageOutput {
    
    @Override
    public void sendMessage(final MessageInput msgInput) {
        Message msg = msgInput.getMessage();
        System.out.println(msg.getMessageAsString());
    }
}
