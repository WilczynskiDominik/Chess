package com.chessGame;

import javax.swing.*;

public class Launcher {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                Board board = new Board();
                MainWindow main = new MainWindow(board);
            }
        });
    }
}
