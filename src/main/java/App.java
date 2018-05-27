package main.java;

import main.java.cli.AppCLI;
import main.java.game.Game;

/**
 * This class handles the flow of the program for each user; e.g. it provides an interface for user to navigate through
 * the menus, start or join games as well as interact with other users. It is the glue of all other components of the
 * program.
 */
class App {
    private static App ourInstance = new App();
    private Game game; // change this to server
    private AppView view;

    private boolean isRunning;

    // Suppress instantiation
    private App() {
        isRunning = false;
        view = AppCLI.getInstance();
    }

    static App getInstance() {
        return ourInstance;
    }

    void init() {
        if (isRunning)
            ourInstance.stop();

        isRunning = true;
        view.start();
    }

    void stop() {
        view.end();
        isRunning = false;
    }
}
