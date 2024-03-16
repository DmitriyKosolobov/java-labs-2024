package chO1.secO1;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
    }
}
//javac HellowWorld.java => файл класса в каталог, где HelloWorld.java

//java HelloWorld => Error: Could not find or load main class HelloWorld
//                    Caused by: java.lang.NoClassDefFoundError: HelloWorld (wrong name: chO1/secO1/HelloWorld)

//javap HelloWorld  =>  Warning: File ./HelloWorld.class does not contain class HelloWorld
//                      Compiled from "HelloWorld.java"
//                      public class chO1.secO1.HelloWorld {
//                          public chO1.secO1.HelloWorld();
//                          public static void main(java.lang.String[]);
//                      }

