package main.java.cli;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class CommandManager {
    // TODO METHOD TO CONVERT THIS TO DIRECTIVE
    private Context currentContext;
    private static Map<Context, ArrayList<CommandTemplate>> map;

    public CommandManager() {
        // TODO set a reasonable default context;
        map = new HashMap<>();
        for (Context c : Context.values()) {
            map.put(c, new ArrayList<CommandTemplate>());
        }
    }

    public void updateContext(Context c) {
        this.currentContext = c;
    }

    // TODO determines if the command is viable under currentContext.
    public boolean isViable(CommandTemplate cmd) {
        return false;
    }

    public CommandManager add(Context context, CommandTemplate cmd) {
        map.get(context).add(cmd);
        return this;
    }

    public CommandManager addAll(Context context, CommandTemplate[] cmd) {
        map.get(context).addAll(Arrays.asList(cmd));
        return this;
    }

    public enum Context {
        ALL_TIME, NET, // TODO etc.
    }
}
