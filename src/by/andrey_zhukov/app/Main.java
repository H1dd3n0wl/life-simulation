package by.andrey_zhukov.app;

import by.andrey_zhukov.app.LifeSimulator;

import javax.swing.*;
import java.lang.reflect.InvocationTargetException;

public class Main {

    public static void main(String[] args) {
        try {
            SwingUtilities.invokeAndWait(LifeSimulator::new);
        } catch (InterruptedException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
