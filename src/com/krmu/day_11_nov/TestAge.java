package com.krmu.day_11_nov;
class checkVote extends Exception{
    public checkVote(String eM){
        super(eM);
    }
}
public class TestAge{
    static void verify( int age) throws checkVote{
        if(age < 18){
            throw new checkVote("AGe is less than 18, sorry can't vote.");
        }else{
            System.out.println("you're eligible to vote.");
        }
    }
    public static void main(String[] args){
        try{
            verify(15);
        }catch(checkVote N){
            System.out.println("Caught the exception");
        }
    }
}
