package com.scienhac.codewithharry.lec26;

public class Array {
    public static void main(String[] args){
        String[] name = new String[12];
        int[] id = new int[50];
//        In java array are actually objects so it same as we create object of string so it come with predefined methods like string so like python we have a lot of function that not in c++
//        like arrays in java we have option length also, but I know it is not the method in java but a data member we can say
        int i = 0;
        while(i<name.length){
            i++;
        }
//        like in c++ we have no error if we assign value of that index that is out of bound but in java they will throw the error and not allow to do that
//Declaration of an array
        int[] p;//here it allow memory allocation at run time
        p = new int[23]; // memory allocation we give like these also !!
        p = new int[34]; // but it like creating new array so it is normal array not dynamic array
//        ****************Methods of declaration and Initialization in the array****************************************
        int[] q = new int[4]; // declaration and memory allocation
        q[0] = 12; //initialization
        int[] r = {1,2,3,4,5}; // declaration and initialization
        int[] s;
        s = new int[]{1,2,3,4,5}; // declaration memory allocation and initialization
        int[] l;
        l = new int[10];
        int[] q1;
//        q = {1,2,3,4}; // java not allow these same as c++  as now q is the reference variable not the array variable
        q1 = new int[]{1,2,3,4}; // java allow these same as c++
//        ***********************************************************************************************************
    }
}
