package com.chessGame;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JPanel{

    private Board board;

    public GameWindow(Board board){
        this.board = board;
        initialize();
    }
    private void initialize(){
        setBackground(Color.BLACK);
        setLayout(new GridLayout(board.getSize(), board.getSize()));
        addChildren();
    }
    private void addChildren(){
        for(int i = board.getSize() - 1; i >= 0; i--){
            for(int j = 0; j < board.getSize(); j++){
                add(board.getSquare(i, j));
            }
        }
    }
}
