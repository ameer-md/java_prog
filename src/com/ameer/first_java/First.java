package com.ameer;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class First {
    public static void main(String[] args) {
        OUT.p.prtl("i have idea what i did");
    }
}

class OUT{
    static PRT p = null;
}

class PRT{
    static void prtl(String str){
        System.out.println(str);
    }
}