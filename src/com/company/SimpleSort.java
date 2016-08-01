package com.company;

/**
 * Created by d.lihodedov on 01.08.2016.
 */
public class SimpleSort {
    private int[] a;
    int NumberOfElements=10;
    int c;
    public SimpleSort(){
        a=new int[NumberOfElements];
    }
//---------------------------------------------------------------------
    public void BubbleSort(){
       int out,in;
        for (out=NumberOfElements-1;out>1; out--)
            for (in=0;in<out;in++){
                if (a[in]>a[in+1]){
                    c=a[in];
                    a[in]=a[in+1];
                    a[in+1]=c;
                }
            }
    }
//-----------------------------------------------------------------------
public void SelectionSort() {
    int min, out, in;
    for (out = 0; out < NumberOfElements - 1; out++) {
        min = out;
        for (in = out + 1; in < NumberOfElements; in++)
            if (a[in] < a[min])
                min = in;
        int temp = a[out];
        a[out] = a[min];
        a[min] = temp;
    }
}
//------------------------------------------------------------------------
public void insertionSort(){
    int in,out;
    for (out=1;out<NumberOfElements;out++)
    {
        int temp=a[out];
        in=out;
        while(in>0 && a[in-1]>=temp)
        {
            a[in]=a[in-1];
            --in;
        }
        a[in]=temp;
    }
}



}
