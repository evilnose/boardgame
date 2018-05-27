package main.java.cli;

public class Command {
    private String name;
    private Object[] args;

    /*
    This is private because currently the only available view is console, which
    means that Commands can only possibly be specified in the name of Strings.
    */
    private Command(String name, Object[] args) {
        this.name = name;
        this.args = args;
    }

    public static Command parse(String commandStr) {
        // TODO
        return null;
    }

    /**
     * Represents this Command in the form of string.
     */
    public String stringify() {
        // TODO problem: do we need to specify originator? and how do we identify cli?
        return null;
    }

    public String getName() {
        return name;
    }

    public Object[] getArgs() {
        return args;
    }
}
