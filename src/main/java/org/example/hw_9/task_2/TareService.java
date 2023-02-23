package org.example.hw_9.task_2;

public class TareService {
    public String createReceipt(Tare[] tares) {
        int[] numbers = calculateTare(tares);
        return "Вы сдали пластиковых бутылок: " + numbers[0] +
                ", стеклянных бутылок: " + numbers[1] +
                ",  алюминиевых банок: "
                + numbers[2] + ". Ваш чек: "
                + numbers[3] / 100 + " евро " + numbers[3] % 100 + " центов";
    }

    public int[] calculateTare(Tare[] tares) {
        int plastic = 10;
        int glass = 15;
        int aluminum = 15;

        int quantityPlastic = 0;
        int quantityGlass = 0;
        int quantityAluminum = 0;

        for (Tare tare : tares) {
            Material material = tare.getMaterial();
            if (Material.PLASTIC.equals(material)) {
                quantityPlastic++;
            } else if (Material.GLASS.equals(material)) {
                quantityGlass++;
            } else {
                quantityAluminum++;
            }
        }

        int moneyForPlastic = quantityPlastic * plastic;
        int moneyForGlass = quantityGlass * glass;
        int moneyForAluminum = quantityAluminum * aluminum;
        int receipt = moneyForPlastic + moneyForGlass + moneyForAluminum;

        return new int[]{quantityPlastic, quantityGlass, quantityAluminum, receipt};
    }
}
