package ru.gotchezz.ex5;

public class pointMovable extends point implements Movable {

    public pointMovable(int x, int y) {
        super(x, y);
    }

    @Override
    public point move(int x, int y) {
        this.setX(getX()+x);
        this.setY(getY()+y);
        return  this;
    }
}
