/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication5_1_2;

/**
 *
 * @author 梦曦
 */
public class Line {

    /**
     * @param args the command line arguments
     */
    InputScore one;
       DelScore two;
       ComputerAver three;
       Line()
       {
           three=new ComputerAver();
           two=new DelScore(three);
           one=new InputScore(two);
       }
       void givePersonScore()
       {
           one.inputScore();
       }
    
}
