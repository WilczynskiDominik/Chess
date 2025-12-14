package game;

import java.awt.*;

public class Board {
    //parameters
    private final int SIZE;
    private final int SQUARE_SIZE = 10;
    private Square[][] board;
    //constructors
    public Board(int size){
        this.SIZE = size;
        createBoard();
    }
    //functions
    private void createBoard(){
        board = new Square[SIZE][SIZE];
        char row = 'A';
        int column = 1;

        int rowPointer = 0;
        int columnPointer = 0;

        while(rowPointer < SIZE && columnPointer < SIZE){
            String squareName = (row + "-" + column);
            Color color;
            if(((int)row + column) % 2 == 0){
                //BLACK
                color = new Color(0, 0, 0);
            }else{
                //WHITE
                color = new Color(225, 225,225);
            }
            board[rowPointer][columnPointer] = new Square(squareName, SQUARE_SIZE, color);

            if(columnPointer < SIZE - 1){
                columnPointer++;
                column += 1;
            }else{
                rowPointer++;
                columnPointer = 0;
                row += 1;
                column = 1;
            }
        }
    }
}
