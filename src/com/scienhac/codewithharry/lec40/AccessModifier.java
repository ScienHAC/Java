package com.scienhac.codewithharry.lec40;

public class AccessModifier { // public is optional here as it is default class but public is used when we want to access this class from other package
    // if we use private here it will give error as class is not member of another class
    /*
    Access Modifiers in Java
    1. Private: The member is accessible only within its own class.
    2. Default (no modifier): The member is accessible only within its own package.
    3. Protected: The member is accessible within its own package and by subclasses.
    4. Public: The member is accessible from any other class.

    Important point:
    -Default is also called package-private because it allows access only within the same package.
    like i use package com.scienhac.codewithharry.lec40; so any class in the same package can access the default members but not from other package
    it is same as we actually use class without importing them in other package and without specifying the public keyword
    so attribute and method are accessible only within the same package

    Important Note:
    In java like we can't use like protected in class level like protected class MyClass {
    or private class MyClass {  // it will give error
    because class is not member of another class so it can't be private or protected in c++ it is allowed
    here it is like
    we create nested class like
    class Outer {
        private class Inner { // it is allowed

        }
        protected class Inner2 { // it is allowed

        }
        public class Inner3 { // it is allowed

        }
    }
     */
    static void bla(String n) {
        System.out.println("Hello " + n);
    }

    public static void main(String[] args) {
        bla("Harry");
    }
}
