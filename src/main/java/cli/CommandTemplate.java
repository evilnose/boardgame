package main.java.cli;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * This class represents the template of a command and is used to:
 * 1) display the purpose and usage of each command to the user, and
 * 2) parse and verify string representations of cli, and
 */
public class CommandTemplate {
    // TODO add more attributes to classify the nature of this command as informational, executable, etc.
    private String fullName;
    private String abbrevName;
    private String description;
    private ArrayList<Arg> args;

    private static Class<?>[] allowedTypes = new Class[] {
            Integer.class,
            String.class,
    };

    public CommandTemplate(String fullName, String abbrevName) {
        this.fullName = fullName;
        this.abbrevName = abbrevName;
        this.args = new ArrayList<Arg>();
    }

    public CommandTemplate arg(String argName, Class<?> argType) {
        if (!Arrays.asList(allowedTypes).contains(argType)) {
            throw new TypeNotPresentException(argType.getName(),
                    new Throwable(String.format("Type '%s' is not allowed as a command argument.", argType.getName())));
        }

        args.add(new Arg(argName, argType));
        return this;
    }

    public CommandTemplate describe(String desc) {
        this.description = desc;
        return this;
    }

    @Override
    public String toString() {
        // TODO
        return null;
    }

    public boolean verify(Command cmd) {
        // TODO verify if the given Command has the right types of arguments
        return false;
    }

    private class Arg {
        private String name;
        private Class<?> type;

        private Arg(String name, Class<?> type) {
            this.name = (name == null) ? "" : name;
            this.type = type;
        }
    }
}
