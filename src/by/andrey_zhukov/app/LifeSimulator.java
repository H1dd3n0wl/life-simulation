package by.andrey_zhukov.app;

import by.andrey_zhukov.Field;
import by.andrey_zhukov.StatusBar;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class LifeSimulator extends JFrame {

    private static final Field field = new Field();
    private static final StatusBar bar = new StatusBar();

    private static Timer game;

    private static final int width = 900;
    private static final int height = 969;

    public LifeSimulator() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(width, height);
        setTitle("Life simulator");
        setLayout(null);
        setLocationRelativeTo(null);
        setResizable(false);

        field.setBounds(0, 0, 900, 900);
        add(field);

        bar.setBounds(0, 900, 900, 40);
        add(bar);

        setVisible(true);
    }

    public static void startGame(ActionEvent ignoredEvent) {
        int delay = 150;
        game = new Timer(delay, e -> field.gameIteration());
        game.start();
    }

    public static void stopGame(ActionEvent ignoredEvent) {
        game.stop();
    }
}
