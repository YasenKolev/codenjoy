package com.codenjoy.bomberman.console;

import com.codenjoy.bomberman.model.BasicWalls;
import com.codenjoy.bomberman.model.Board;
import com.codenjoy.bomberman.model.Level;
import com.codenjoy.bomberman.model.OriginalWalls;

import java.lang.String;

public class Main {

	private static final int BOARD_SIZE = 5;

	public static void main(String[] args) {
        Level level = new Level() {
            @Override
            public int bombsCount() {
                return 2;
            }

            @Override
            public int bombsPower() {
                return 1;
            }
        };
        Board board = new Board(new OriginalWalls(BOARD_SIZE), level, BOARD_SIZE);
		Printer printer = new BombermanPrinter();
		Console console = new ConsoleImpl();
		
		new BombermanRunner(board, printer, console).playGame();
	} 

}
