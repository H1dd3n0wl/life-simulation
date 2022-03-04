package by.andrey_zhukov.domain;

import by.andrey_zhukov.PointClick;
import by.andrey_zhukov.domain.Position;

import javax.swing.*;
import java.awt.*;

public class Point extends JPanel {

    public Position pos = new Position();

    public boolean live = false;

    public static String id;

    public Point(int x, int y) {
        setBackground(Color.WHITE);
        pos.setX(x);
        pos.setY(y);
        id = "x" + x + "_y" + y;
        addMouseListener(new PointClick());
    }

    public void alive() {
        setBackground(Color.BLACK);
    }

    public void die() {
        setBackground(Color.WHITE);
    }

    public boolean isAlive() {
        return getBackground() == Color.BLACK;
    }
}
