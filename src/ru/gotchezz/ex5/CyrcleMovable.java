package ru.gotchezz.ex5;

public class CyrcleMovable extends cyrcle implements Movable {
    public CyrcleMovable(point center, double radius) {
        super(center, radius);
    }

    @Override
    public point move(int x, int y) {
        this.setCenter(((pointMovable)getCenter()).move(10,15));
        return getCenter();
    }
}
