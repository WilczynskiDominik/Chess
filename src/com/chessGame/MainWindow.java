package com.chessGame;

import javax.swing.*;
import java.awt.*;

public class MainWindow {

    private JFrame window;
    private final String TITLE = "Chess";
    private Board board;
    private final int SIZE;

    public MainWindow(Board board){
        this.board = board;
        SIZE = board.getBoardSize();
        initialize();
    }
    private void initialize(){
        window = new JFrame();
        window.setTitle(TITLE);
        window.setSize(SIZE, SIZE);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setLocationRelativeTo(null);
        window.setResizable(false);
        window.setVisible(true);
        addChildren();
    }
    private void addChildren(){
        GameWindow gameWindow = new GameWindow(board);
        window.add(gameWindow);
    }
}
