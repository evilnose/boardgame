package main.java.game;

import java.io.Serializable;

/**
 * Keeps track of the state of the game world.
 */
public class WorldState implements Serializable {

    /**
     * Parses and executes the command specified by the command string.
     * @param commandString the command string to parse.
     * @throws ClassNotFoundException if no command with given name exists.
     */
    public void parseCommandString(String commandString) throws ClassNotFoundException {
        //TODO
//        Class<?> clazz = Class.forName(className);
//        Constructor<?> ctor = clazz.getConstructor(String.class);
//        Object object = ctor.newInstance(new Object[] { ctorArgument });
    }
}
