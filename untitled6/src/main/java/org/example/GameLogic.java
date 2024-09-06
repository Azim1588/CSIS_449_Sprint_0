package org.example;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameLogic {
    private JFrame frame;
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;

    public GameLogic() {
        frame = new JFrame("SOS Game");
        board = new Board(3);
        player1 = new Player("Blue", "S", false);
        player2 = new Player("Red", "O", false);
        currentPlayer = player1;
        setupFrame();
    }

    private void setupFrame() {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 400);
        frame.add(board);
        frame.setVisible(true);
        addActionListeners();
    }

    private void addActionListeners() {
        for (JButton[] row : board.getButtons()) {
            for (JButton button : row) {
                button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (button.getText().equals("")) {
                            button.setText(currentPlayer.getSymbol());
                            switchPlayer();
                        }
                    }
                });
            }
        }
    }

    private void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
        checkGameStatus();
    }

    private void checkGameStatus() {
        // Implement logic to check for SOS sequences and handle win/draw conditions.
    }

    public void startGame() {
        board.resetBoard();
        currentPlayer = player1;
    }
}
