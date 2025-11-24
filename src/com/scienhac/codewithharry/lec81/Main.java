package com.scienhac.codewithharry.lec81;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;
        int c;
        try {
            int[] arr = new int[3];
//            System.out.println(arr[3]);
            c = a / b;
            System.out.println("The result is: " + c);
            System.out.println("Some other exception occurred.");
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
            System.out.println(e.getMessage());
            System.out.printf("\n %s", e.toString());
            System.out.println(e); // e by default call internally toString method so e.toString and e are same
//            e print like exception name and description ( here description is divided by zero) --> best example interruptionexception but the message is differnt for differnt case so all error under one exception name can be done by telling the message
            System.out.printf("\n %s", e.getStackTrace());
            e.printStackTrace();
        }
//        catch(ArithmeticException t){  Error because ArithmeticException is already caught above that's why we can't add the Exception at parent level as it caught already everythin and include exception so why putting top no logic behind it
//
//        }
        catch (ArrayIndexOutOfBoundsException arr) {
            System.out.println("Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Some other exception occurred." + e);
        }
    }
}
