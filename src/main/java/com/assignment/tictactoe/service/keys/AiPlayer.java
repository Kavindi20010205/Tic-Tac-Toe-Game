package com.assignment.tictactoe.service.keys;

import java.util.Random;

public class AiPlayer extends Player {
    private Random random;

    public AiPlayer(BoardImpl board) {
        super(board);
        random = new Random();
    }

    @Override
    public void move(int row, int col) {
        if (board.isLegalMove(row, col)) {
            board.updateMove(row, col, Piece.O);
        }
    }

    public void findBestMove() {
        Piece[][] pieces = board.getPieces();
        int emptyCellsCount = 0;

        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                if (pieces[i][j] == Piece.EMPTY) {
                    emptyCellsCount++;
                }
            }
        }

        if (emptyCellsCount == 0) {
            return;
        }

        int randomIndex = random.nextInt(emptyCellsCount);
        int selectedRow = -1;
        int selectedCol = -1;

        for (int i = 0; i < pieces.length; i++) {
            for (int j = 0; j < pieces[i].length; j++) {
                if (pieces[i][j] == Piece.EMPTY) {
                    if (randomIndex == 0) {
                        selectedRow = i;
                        selectedCol = j;
                        break;
                    }
                    randomIndex--;
                }
            }
            if (selectedRow != -1) {
                break;
            }
        }

        if (selectedRow != -1 && selectedCol != -1) {
            move(selectedRow, selectedCol);
        }
    }
}
