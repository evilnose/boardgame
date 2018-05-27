package main.java.cli;

import main.java.game.WorldState;

/**
 * Responsible for validating and executing command targeted to the server-side world.
 */
public class CommandExecutor {
    /*
    NOTE CommandExecutor calls the commands on the controller directly; OR, if networking is required,
    it coverts the Command into a string and sends it to the server.
     */
    private WorldState state;

    public CommandExecutor(WorldState state) {
        this.state = state;
    }

    /**
     * Executes the command specified by the command string on the WorldState associated with this CommandExecutor.
     * @param commandString the command string to parse and execute.
     */
    public void execute(String commandString) {
    }

    /**
     * Simulate the execution of the command as specified by the given command string on a
     * temporary copy of the given WorldState. Returns the modified copy.
     * @param commandString the command string to parse and execute.
     * @return the modified copy of the WorldState associated with this CommandExecutor.
     */
    public WorldState simulate(String commandString) {
        // TODO throw some errors (try-catch exec command)
        return null;
    }
}
