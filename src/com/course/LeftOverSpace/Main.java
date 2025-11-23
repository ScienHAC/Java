package com.course.LeftOverSpace;

import java.util.Scanner;

//If using nextLine always use twice one to consume the new line character but do only if already use nextInt or nextDouble or any other next
//If using nextInt or nextDouble after nextLine then it will give error as nextLine will consume the new line character left by nextInt or nextDouble
//So the order should be nextLine first and then nextInt or nextDouble
//Or use next() instead of nextLine if you want to take single word input
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        String a = sc.next();
        System.out.println(a);
        sc.nextLine();
        String str = sc.nextLine();
        System.out.println(str);
        str = str.replace("\\n", "\n"); //replace fake \n with the actual new line character and as in \\n is noraml \n actual is \n
        System.out.println(str);
        System.out.println("Piyush\nhello");
//        char[] b = {' '};
//        System.out.println(b);
    }
}
