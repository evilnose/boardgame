package main.java;

public interface AppView {

    /**
     * Starts the current view and displays a welcome message.
     */
    void start();

    /**
     * Closes the current view.
     */
    void end();

    /**
     * Asks the user to yesOrNo the given message and return their response as a boolean.
     * @param message the message to be confirmed.
     * @return true if the user confirms; false otherwise.
     */
//    boolean yesOrNo(String message);
//
//    void confirm(String message);
}
