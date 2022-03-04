package by.andrey_zhukov.domain.button;

import by.andrey_zhukov.app.LifeSimulator;

import javax.swing.*;

public class StartButton extends JButton {

    public StartButton() {
        setName("ButtonStart");
        setText("Start");
        setFocusPainted(false);

        addActionListener(LifeSimulator::startGame);
    }
}
