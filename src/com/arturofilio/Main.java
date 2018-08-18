package com.arturofilio;

public class Main {

    public static void main(String[] args) {
	// write your code here

        // the array of the lamb class is like shown:
        // array = { 'marry', 'had', 'a','little','lamb'}

        Lamb lamb = new Lamb();
        lamb.print();

        lamb.insert("very", 3);
        lamb.print();

        lamb.insert("only", 1);
        lamb.print();

        lamb.insert("Doctor", 0);
        lamb.print();

        lamb.insert("chop", 8);
        lamb.print();

        lamb.insert("eaten", 4);
        lamb.print();
    }
}
