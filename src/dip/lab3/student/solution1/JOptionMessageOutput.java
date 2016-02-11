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
public class JOptionMessageOutput implements MessageOutput {
    

     @Override
    public void sendMessage(MessageInput messageInput) {
        Message msg = messageInput.getMessage();
        JOptionPane.showMessageDialog(msg.getMessageAsString());
    }
}
