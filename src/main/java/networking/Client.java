package main.java.networking;

import main.java.AppView;

abstract class Client {
    private Server server;
    private AppView view;

    Client(Server server, AppView view) {
        this.server = server;
        this.view = view;
    }
}
