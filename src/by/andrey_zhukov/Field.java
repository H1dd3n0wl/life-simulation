package by.andrey_zhukov;

import by.andrey_zhukov.domain.Point;
import by.andrey_zhukov.enums.GameRules;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Field extends JPanel {

    private final int gridRows = 100;
    private final int gridCols = 100;

    private final GameRules gameRules = GameRules.defaultRules;

    private final Point[][] cells = new Point[gridRows][gridCols];

    public Field() {
        setLayout(new GridLayout(gridRows, gridCols));

        Random rnd = new Random();

        for (int i = 0; i < gridCols * gridRows; ++i) {
            int x = i / gridCols;
            int y = i % gridRows;
            boolean isAlive = rnd.nextDouble() <= 0.3d;
            cells[x][y] = new Point(x,y);
            if (isAlive) {
                cells[x][y].alive();
            }
            add(cells[x][y]);
        }
    }

    private void checkCell(int x, int y) {
        int countLive = 0;
        for (int i = -1; i <= 1; ++i) {
            for (int j = -1; j <= 1; ++j) {
                if (i == 0 && j == 0) {
                    continue;
                }
                int nextX = x + i;
                int nextY = y + j;
                if (nextX < 0) {
                    nextX = gridRows - 1;
                }
                if (nextX >= gridRows) {
                    nextX = 0;
                }
                if (nextY < 0) {
                    nextY = gridCols - 1;
                }
                if (nextY >= gridCols) {
                    nextY = 0;
                }
                if (cells[nextX][nextY].live) {
                    countLive++;
                }
            }
        }
        if (gameRules.getBorn().contains(countLive) && !cells[x][y].live) {
            cells[x][y].alive();
        } else if (!gameRules.getStay().contains(countLive) && cells[x][y].live) {
            cells[x][y].die();
        }
    }

    public void gameIteration() {
        for (int i = 0; i < gridRows; ++i) {
            for (int j = 0; j < gridCols; ++j) {
                checkCell(i,j);
            }
        }
        for (int i = 0; i < gridRows; ++i) {
            for (int j = 0; j < gridCols; ++j) {
                cells[i][j].live = cells[i][j].isAlive();
            }
        }
        revalidate();
        repaint();
    }
}
