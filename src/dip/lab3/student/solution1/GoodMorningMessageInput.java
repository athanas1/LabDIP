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
public class GoodMorningMessageInput implements MessageInput {
    private String Msg = "Hello and Good Morning";
    
    @Override
    public Message getMessage() {
        Message msg = new Message(Msg);
        return msg;
    }
}
