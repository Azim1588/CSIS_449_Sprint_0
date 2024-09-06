package org.example;

import javax.swing.*;
import java.awt.*;

public class Board extends JPanel {
    private JButton[][] buttons;
    private int size;

    public Board(int size) {
        this.size = size;
        this.buttons = new JButton[size][size];
        setLayout(new GridLayout(size, size));
        initializeBoard();
    }

    private void initializeBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buttons[i][j] = new JButton("");
                buttons[i][j].setFont(new Font("Arial", Font.BOLD, 40));
                add(buttons[i][j]);
            }
        }
    }

    public JButton[][] getButtons() {
        return buttons;
    }

    public void resetBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                buttons[i][j].setText("");
                buttons[i][j].setEnabled(true);
            }
        }
    }
}
