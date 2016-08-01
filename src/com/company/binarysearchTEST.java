package com.company;

/**
 * Created by d.lihodedov on 28.07.2016.
 */
public class binarysearchTEST {
    public static void main(String[] args){
        binarysearch arr;
        int nElems = 10;
        arr = new binarysearch(nElems);
        int searchKey=71;
        arr.insert(0,24);
        arr.insert(1,37);
        arr.insert(2,52);
        arr.insert(3,56);
        arr.insert(4,67);
        arr.insert(5,69);
        arr.insert(6,71);
        arr.insert(7,73);
        arr.insert(8,80);
        arr.insert(9,87);

        if( arr.find(searchKey) != 10 )
            System.out.println("Found " + searchKey);
        else
            System.out.println("Can't find " + searchKey);

    }

}
