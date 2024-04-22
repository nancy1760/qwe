/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication5_1_2;
import java.util.Scanner;
/**
 *
 * @author 梦曦
 */
public class InputScore {

    /**
     * @param args the command line arguments
     */
    DelScore del;
    InputScore(DelScore del)
    {
        this.del=del;
    }
    void inputScore()
    {
        System.out.print("输入评委数");
        Scanner read=new Scanner (System.in);
        int count=read.nextInt();
        System.out.print("输入各个评委的分数");
        double a[]=new double[count];
        for(int i=0;i<count;i++)
        {
            a[i]=read.nextDouble();
        }
        del.doDelete(a);
    }
}
    

