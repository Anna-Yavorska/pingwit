package org.example.hw_23.task_1;

public class Application {
    public static void main(String[] args) {
        AnnotationsValidationService service = new AnnotationsValidationService();
        AccountInformation accountInformation = new AccountInformation("Lida", "Filatowa", "filatow@gmail.com", "258789856");
        service.validate(accountInformation);
        System.out.println(accountInformation);
    }
}
