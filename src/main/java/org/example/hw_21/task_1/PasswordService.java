package org.example.hw_21.task_1;

public class PasswordService {
    private static final int UNIT = 1;
    private static final int ZERO = 0;
    private static boolean block = false;

    public void checkAttemptsQuantity(Password password) {
        if (password.getAttemptsQuantity() == UNIT) {
            System.out.println("You have last chance. If you enter the wrong password, account will be blocked!");
        }
        if (password.getAttemptsQuantity() == ZERO) {
            System.out.println("Account is blocked");
            block = true;
        }
    }

    public boolean isBlock() {
        return block;
    }
}
