package com.company;

/**
 * Created by d.lihodedov on 22.07.2016.
 */
public class IOWArray {
    private long[] a;
    public IOWArray(int size) {
        a= new long[size];
    }
    public void SetElement (int index, long value){
        a[index]=value;
            }
    public long GetElement(int index) {return a[index];}
}
