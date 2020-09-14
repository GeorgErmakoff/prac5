package ru.gotchezz.ex5;

public class Main {
    public static void main(String[] args) {
    cyrcle cyrcle = new cyrcle(new point(1,1), 10f);
    System.out.println(cyrcle);
    pointMovable pointMovable = new pointMovable(10,10);
    System.out.println(pointMovable);
    pointMovable.move(12,19);
    System.out.println(pointMovable);
    System.out.println(cyrcle);
    CyrcleMovable cyrcleMovable = new CyrcleMovable(new pointMovable(5,5),10);
    cyrcleMovable.move(1,1);
    System.out.println(cyrcleMovable);
    }
}
