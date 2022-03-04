package by.andrey_zhukov;

import by.andrey_zhukov.domain.Point;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class PointClick implements MouseListener {

    private boolean isPressed = false;

    @Override
    public void mouseClicked(MouseEvent e) {
        Point curPoint = (Point) e.getSource();
        curPoint.setBackground(Color.BLACK);
        isPressed = false;
    }

    @Override
    public void mousePressed(MouseEvent e) {
        Point curPoint = (Point) e.getSource();
        curPoint.setBackground(Color.BLACK);
        isPressed = true;
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        if (isPressed) {
            Point curPoint = (Point) e.getSource();
            curPoint.setBackground(Color.BLACK);
        }
    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}
