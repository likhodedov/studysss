package com.company;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * Created by d.lihodedov on 28.07.2016.
 */
public class binarysearch {
    private int[] a;
    private int Elems;
    public binarysearch(int max_number_of_elements) {
        a= new int[max_number_of_elements];
        Elems=max_number_of_elements;
    }
    public int find(int Searchkey){
         int LowerBound=0;
        int UpperBound=Elems-1;
        while (true){
        int Average=(UpperBound-LowerBound)/2;
        if (a[Average]==Searchkey) return Average;
        else if (LowerBound>UpperBound) return Elems;
        else {
            if (a[Average] < Searchkey) LowerBound = Average + 1;
            else UpperBound=Average-1;
        }
        }
    }
public void insert(int position, int value) {
    a[position]=value;
}
}
