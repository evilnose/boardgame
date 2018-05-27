package main.java.cli;

import main.java.AppView;
import org.fusesource.jansi.AnsiConsole;

import static org.fusesource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.Color;

import java.io.PrintStream;
import java.util.Scanner;

public class AppCLI implements AppView {
    private static AppCLI ourInstance = new AppCLI();
    private PrintStream out;
    private Scanner in;

    private static MColor NRM = new MColor(Color.GREEN); // Normal text c
    private static MColor ANN = new MColor(Color.WHITE); // Color for announcements
    private static MColor ACT = new MColor(Color.CYAN); // Color for messages prompting action
    private static MColor CHT = new MColor(Color.YELLOW); // Color for chat messages

    private AppCLI() {
        AnsiConsole.systemInstall();
        out = AnsiConsole.out;
        in = new Scanner(System.in);
    }

    public static AppCLI getInstance() {
        return ourInstance;
    }

    @Override
    public void start() {
//        out.println( ansi().eraseScreen().fg(WHITE).a("Hello").fg(ACT).a(" World").reset() );
        clear();
        printlnc("Normal", NRM);
        printlnc("Announcements", ANN);
        printlnc("Actions", ACT);
        printlnc("Chat", CHT);
        reset();
        out.println("Done.");
    }

    @Override
    public void end() {
        // TODO maybe a goodbye message?
        AnsiConsole.systemUninstall();
        clear();
        reset();
    }

//    @Override
//    public boolean yesOrNo(String message) {
//        printlnc(message + " (y/n)", ACT);
//        return false;
//    }
//
//    @Override
//    public void confirm(String message) {
//        out.println(message);
//        in.nextLine();
//    }

    private void printc(String x, MColor mc) {
        if (mc.bright)
            out.print( ansi().fgBright(mc.c).a(x) );
        else
            // fg(Color.DEFAULT) makes c dark until fgBright() is called again.
            out.print( ansi().fg(Color.DEFAULT).fg(mc.c).a(x) );
    }

    private void printlnc(String x, MColor mc) {
        printc(x + "\n", mc);
    }

    private void clear() {
        out.print( ansi().eraseScreen() );
    }

    private void reset() {
        out.print( ansi().reset() );
    }

    /**
     * More colors: doubles the number of ANSI colors by recording the c to be bright/dark.
     */
    private static class MColor {
        Color c;
        boolean bright;

        MColor(Color c) {
            this.c = c;
            this.bright = true;
        }

        MColor(Color c, boolean bright) {
            this.c = c;
            this.bright = bright;
        }
    }
}
