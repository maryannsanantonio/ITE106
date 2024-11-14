// Java Program to illustrate the
// concept of Multilevel Inheritance
import java.io.*;
import java.lang.*;
import java.util.*;

class One {
    public void print_geek() {
        System.out.println("Geeks");
    }
}

class two extends One {
    public void print_for() {
        System.out.println("for");
    }
}

class three extends two {
    public void print_lastgeek() 
    {
        System.out.println("Geeks");
    }
}