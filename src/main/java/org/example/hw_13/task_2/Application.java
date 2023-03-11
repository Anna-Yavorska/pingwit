package org.example.hw_13.task_2;

public class Application {
    public static void main(String[] args) {
        Router router = new Router("TP-LINK", "FunBox");
        GameConsole gameConsole = new GameConsole("SONY", "PlayStation-5");

        String result = router.connectWiFi(gameConsole.NAME());
        System.out.println(result);
    }
}
