package com.company;

import static java.lang.Boolean.FALSE;
import static java.lang.Boolean.TRUE;

/**
 * Created by d.lihodedov on 21.07.2016.
 */
public class Arrayplay {
    public static void main(String[] args){
        long arr[];
        arr = new long[100];
        int j;
        boolean FIND_FLAG=false;
        long SearchKey;
        arr[0] = 77; // Вставка 10 элементов
        arr[1] = 99;
        arr[2] = 44;
        arr[3] = 55;
        arr[4] = 22;
        arr[5] = 88;
        arr[6] = 11;
        arr[7] = 00;
        arr[8] = 66;
        arr[9] = 33;
       int nElems = 10;

        for (j=0;j<=nElems;j++){
            System.out.print(arr[j]+"  ");
        }
        SearchKey=55;
        for (j=0;j<nElems;j++)
            if (SearchKey==arr[j])
                break;
            if (j==nElems)
            System.out.println("NOT FOUND "+SearchKey);
        else
            System.out.println("FOUND "+SearchKey+" at "+(j+1)+" position");
            }
    float SearchDeleteKey=44;
    

}
