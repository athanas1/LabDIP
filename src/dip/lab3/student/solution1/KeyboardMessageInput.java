/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab3.student.solution1;

import java.util.Scanner;

/**
 *
 * @author Alex
 */
public class KeyboardMessageInput implements MessageInput {
Scanner input = new Scanner(System.in);


    @Override
    public Message getMessage() {
        String inputMsg = input.nextLine();
        Message msg = new Message(inputMsg);
        return msg;
    }

}
