package com.company;
import java.util.Scanner;
/**
 * Created by likho on 04.09.2016.
 */
public class Zadacha1 {
    public static void main(String[] args){
        Scanner in= new Scanner(System.in);
        System.out.println("Введите количество записей");
        int N=in.nextInt();
        System.out.println(N);
        String temp=new String();
        int max=0;
        String oldest=new String();
for (int i=1;i<3;i++)
{
    temp=in.nextLine();
    String[] tempo=temp.split(" ");
    if (Integer.valueOf(tempo[1])>max)
    {   oldest=tempo[0];
        max=Integer.valueOf(tempo[1]);
    }
}
//System.out.println(oldest+"is the oldest");
    }
}

