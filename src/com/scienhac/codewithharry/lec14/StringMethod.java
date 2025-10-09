package com.scienhac.codewithharry.lec14;

public class StringMethod {
    public static void main(String[] args) {
        String name = "Harry";
        int p = name.length(); // as string is class in java, and it has many own prewritten methods and here length() is one of them
        String x = name.toLowerCase();
        String x1 = name.toUpperCase(); // java uses camel case writing style and class is pascal case writing style
        name = "    Harry    ";
        String x2 = name.trim();
        char t = Character.toLowerCase(name.charAt(0)); // see char has no method to lower them and this has ability only to the class to do that
        String greeting = "Harry Hello";
        System.out.println(name);
        System.out.println(x2);
        System.out.println(greeting);

/*
-------------------String Methods in Java------------------
substring method in java
 */
        System.out.println(greeting.substring(0, 5)); // it will print from index 0 to index 4
        System.out.println(greeting.substring(6)); // it will print from index 6 to end
//        like python the first is the starting one, and it is the slicing type where it returns the new string
        System.out.println(greeting.replace("rr", "p")); // it will replace all the r with p
        System.out.println(greeting.replace('r', 'p')); // it will replace all the r with p
        System.out.println(greeting.startsWith("Har")); // it will return true if the string starts with Har otherwise false
        System.out.println(greeting.endsWith("llo")); // it will return true if the string ends with llo otherwise false
        System.out.println(greeting.charAt(4)); // it will return the character at index 4
        System.out.println(greeting.indexOf("llo")); // it will return the index of the first occurrence of llo or say the index of substring
        System.out.println(greeting.indexOf("z")); // it will return -1 if the string is not found
        System.out.println(greeting.lastIndexOf("l")); // it will return the index of the last occurrence of l here it is 9
        System.out.println(greeting.indexOf("l", 4)); // it will return the index of the first occurrence of l after index 4 here it is 9 here 4 is also included
        System.out.println(greeting.lastIndexOf("l", 4)); // it will return the index of the last occurrence of l before index 4 here it is 3 here 4 is also included
//        and lastindexof is return where the substring start from left to right no matter lastindex or index
        /*
In both the lastIndexOf or indexOf both will return the index actual index from left to right but the searching is different
        */
        System.out.println(greeting.equals("Harry Hello")); // it will return true if the string is equal to Harry Hello otherwise false
        System.out.println(greeting.equals("harry Hello")); // it will return false as it is case sensitive
        System.out.println(greeting.equalsIgnoreCase("harry Hello")); // it will return true as it ignores case sensitivity
//        One Important thing is ******************************************************************************
//        That when we compare the string to string like a==b where both a and b are object it true for all classes object that when we use a==b so we actually compare there memory what they store
//        here the object variable actually store the reference of that object
//        like in c++ the class actually store the reference address like array so it like two pointer we compare so address is differnt and when we use heap so they are in differnt addresss
//        but when we use String name = "ddf" so these string literal store in special memory in java
//        The memory name is **String pool** so when we compare it actually return true but not for which created using the new keyword
    }
}
