package com.company.singleton;

class Singleton {

  private static Singleton single_instance = new Singleton();

  // Declaring a variable of type String
  public String s;

  // Constructor
  private Singleton() {
    s = "Hello, I am a part of singleton";
  }

  public static Singleton getInstance() {
    return single_instance;
  }
}

public class GFG {
  public static void main(String args[]) {
    Singleton x = Singleton.getInstance();
    Singleton y = Singleton.getInstance();
    Singleton z = Singleton.getInstance();

    System.out.println("Hashcode of singletone[x] is "
                           + x.hashCode());
    System.out.println("Hashcode of singletone[y] is "
                           + y.hashCode());
    System.out.println("Hashcode of singletone[z] is "
                           + z.hashCode());

    if (x == y && y == z) {
      System.out.println(
          "Three objects point to the same memory location on the heap i.e, to the same object");
    }
    else {
      System.out.println(
          "Three objects DO NOT point to the same memory location on the heap");
    }
  }
}