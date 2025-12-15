package com.chessGame;

import javax.swing.*;
import java.awt.*;

public class Square extends JPanel {
    private final String NAME;
    private final int SIZE;
    private final Color COLOR;

    public Square(String name, int size, Color color){
        this.NAME = name;
        this.SIZE = size;
        this.COLOR = color;
        setSize(SIZE, SIZE);
        setBackground(COLOR);
    }
}
