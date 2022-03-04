package by.andrey_zhukov;

import by.andrey_zhukov.domain.button.StartButton;
import by.andrey_zhukov.domain.button.StopButton;

import javax.swing.*;
import java.awt.*;

public class StatusBar extends JPanel {

    private static final StartButton start = new StartButton();

    private static final StopButton stop = new StopButton();

    public StatusBar() {
        setLayout(new BorderLayout());
        add(start, BorderLayout.WEST);
        add(stop, BorderLayout.EAST);
    }
}
