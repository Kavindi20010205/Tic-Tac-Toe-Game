package com.assignment.tictactoe.service.keys;

public interface BoardUI {
    void update(int row, int col, Piece piece);
    void NotifyWinner(Piece winner);
}
