package by.andrey_zhukov.domain.button;

import by.andrey_zhukov.app.LifeSimulator;

import javax.swing.*;

public class StopButton extends JButton {

    public StopButton() {
        setName("ButtonStop");
        setText("Stop");
        setFocusPainted(false);

        addActionListener(LifeSimulator::stopGame);
    }
}
