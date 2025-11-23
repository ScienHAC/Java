package com.scienhac.codewithharry.lec66;

public class Main {
    //    we can use javac -d . StudentResultSystem.java to compile and create package structure automatically like we can say package com.scienhac.codewithharry.lec66; so it will create com/scienhac/codewithharry/lec66 folders automatically but add the compiled bytecode .class file in the lec66 folder. and if we use javac -d /path/to/directory StudentResultSystem.java then it will create the package structure from that directory. so . is actually current path.
//    javac StudentResultSystem.java then java Main where Main is assume to be a class file in current directory
    // and these is how we run the file
    // if we use javac -d . StudentResultSystem.java and we use java Main it will give error because Main class is not in current directory it is in com/scienhac/codewithharry/lec66 folder so we have to run it like this
    // java com.scienhac.codewithharry.lec66.Main
    public static void main(String[] args) {
        System.out.println("This is lec 66 on packages in java");
    }
}
