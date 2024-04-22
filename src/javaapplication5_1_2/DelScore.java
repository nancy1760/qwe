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
public class DelScore {

    /**
     * @param args the command line arguments
     */
    ComputerAver computer;
    DelScore(ComputerAver computer)
    {
        this.computer=computer;
    }
    void doDelete(double a[])
    {
        java.util.Arrays.sort(a);
        System.out.print("去掉一个最高分"+a[a.length-1]+",");
        System.out.print("去掉一个最低分"+a[0]+"。");
        double b[]=new double[a.length-2];
        for(int i=1;i<a.length-1;i++)
        {
            b[i-1]=a[i];
        }
        computer.giveAver(b);
    }
}
