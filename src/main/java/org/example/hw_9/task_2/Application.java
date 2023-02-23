package org.example.hw_9.task_2;

public class Application {
    public static void main(String[] args) {
        TareService tareService = new TareService();
        Tare tare = new Tare();

        Tare firstAluminum = new Tare("Банка", Material.ALUMINUM);
        Tare firstGlass = new Tare("Бутылка", Material.GLASS);
        Tare firstPlastic = new Tare("Бутылка", Material.PLASTIC);
        Tare secondGlass = new Tare("Бутылка", Material.GLASS);
        Tare secondPlastic = new Tare("Бутылка", Material.PLASTIC);
        Tare thirdPlastic = new Tare("Бутылка", Material.PLASTIC);
        Tare fourthPlastic = new Tare("Бутылка", Material.PLASTIC);
        Tare fifthPlastic = new Tare("Бутылка", Material.PLASTIC);
        Tare secondAluminum = new Tare("Банка", Material.ALUMINUM);
        Tare thirdAluminum = new Tare("Банка", Material.ALUMINUM);
        Tare fourthAluminum = new Tare("Банка", Material.ALUMINUM);

        Tare[] tares = new Tare[]{firstAluminum, firstGlass, firstPlastic, secondGlass, secondPlastic, thirdPlastic, fourthPlastic, fifthPlastic, secondAluminum, thirdAluminum, fourthAluminum};

        String first = tareService.createReceipt(tares);
        System.out.println(first);

        Receipt receipt = tare.printReceipt(tares);
        System.out.println(receipt);
    }
}
