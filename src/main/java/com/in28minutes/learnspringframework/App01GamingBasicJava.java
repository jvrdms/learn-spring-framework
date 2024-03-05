package com.in28minutes.learnspringframework;

import com.in28minutes.learnspringframework.game.GameRunner;
import com.in28minutes.learnspringframework.game.MarioGame;
import com.in28minutes.learnspringframework.game.PacmanGame;
import com.in28minutes.learnspringframework.game.SuperContraGame;

public class App01GamingBasicJava {
    public static void main(String[] args) {
        // 1: Object creation
        // var game = new MarioGame();
        // var game = new SuperContraGame();
        var game = new PacmanGame();

        // 2: Object creation + Wiring dependencies
        var gameRunner = new GameRunner(game); // game is a dependency of gameRunner

        gameRunner.runGame();
    }
}
