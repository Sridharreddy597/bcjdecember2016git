package com.nivtek.training.refactor.method;

public class DemoRefactorMethodBefore {

  public static void main(String[] args) {
    
    // Refactor the following 4 lines as a method & make the 
    // name, city and state as parameters to the method.
    System.out.println("Hello, My name is Sujit Kumar");
    System.out.println("I live in Dallas, TX");
    System.out.println("I am a java instructor");
    System.out.println("I work for nivtek");
    
    System.out.println("Hello, My name is Sujit Kumar");
    System.out.println("I live in Dallas, TX");
    System.out.println("I am a java instructor");
    System.out.println("I work for nivtek");
    
    System.out.println("Hello, My name is Sujit Kumar");
    System.out.println("I live in Dallas, TX");
    System.out.println("I am a java instructor");
    System.out.println("I work for nivtek");
    
    int i = 5, j = 6;
    // Refactor the line below to create an add method.
    int k = i + j;
   
    System.out.println(k);
    k = 4 + 7;
    System.out.println(k);
  }
}
