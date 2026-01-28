package javacore.chapter03.loop.exercise;

public class ChessboardDrawing {

    public static void main(String[] args) {

        int chessboardDrawing = 5;

        for (int row = 0; row < chessboardDrawing; row++) {
            for(int col = 0; col < chessboardDrawing; col++ ){

                char symbol;
                if ((row + col ) % 2 == 0) {
                    symbol = '#';

                }else {
                    symbol = '.';
                }
                System.out.print(symbol + " ");

            }
            
            System.out.println();
        }
    }
}
