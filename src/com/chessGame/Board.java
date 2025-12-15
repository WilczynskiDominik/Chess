package com.chessGame;

import java.awt.*;

public class Board {
    //parameters
    private final int SIZE = 8;
    private final int SQUARE_SIZE = 100;
    private Square[][] board;
    //constructors
    public Board(){
        createBoard();
    }
    //getters
    public int getSize(){
        return SIZE;
    }
    public int getBoardSize(){
        return SIZE * SQUARE_SIZE;
    }
    public Square getSquare(int row, int column){
        return board[row][column];
    }
    //functions
    private void createBoard(){
        board = new Square[SIZE][SIZE];
        char row = 'H';
        int column = 1;

        int rowPointer = 7;
        int columnPointer = 0;

        while(rowPointer >= 0 && columnPointer < SIZE){
            String squareName = (row + "-" + column);
            Color color;
            if(((int)row + column) % 2 == 0){
                //BLACK
                color = new Color(153, 76, 0);
            }else{
                //WHITE
                color = new Color(225, 225,225);
            }
            board[rowPointer][columnPointer] = new Square(squareName, SQUARE_SIZE, color);

            if(columnPointer < SIZE - 1){
                columnPointer++;
                column += 1;
            }else{
                rowPointer--;
                columnPointer = 0;
                row -= 1;
                column = 1;
            }
        }
    }
    private void paintBoard(){

    }
}
