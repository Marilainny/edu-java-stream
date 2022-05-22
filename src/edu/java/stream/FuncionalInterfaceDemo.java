package edu.java.stream;

@FunctionalInterface //permite apenas um método abstrato, caso contrário retirar a anotação.
public interface FuncionalInterfaceDemo {

    //método abstrato
    public void test();

    public default void defaultMethod(){
        System.out.println("Método Default");
    }

    public static void staticMethod(){
        System.out.println("Método Static");
    }

}
