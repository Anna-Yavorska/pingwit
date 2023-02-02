package org.example.hw_2.task_2;

public class StringNumberConversion {
    public static void main(String[] args) {
        String byteType = "77";
        byte byteNumber = Byte.parseByte(byteType);
        System.out.println(byteNumber);

        String shortType = "12587";
        short shortNumber = Short.parseShort(shortType);
        System.out.println(shortNumber);

        String intType = "-78945627";
        int intNumber = Integer.parseInt(intType);
        System.out.println(intNumber);

        String floatType = "123.6789";
        float floatNumber = Float.parseFloat(floatType);
        System.out.println(floatNumber);

        String doubleType = "-8965.876655";
        double doubleNumber = Double.parseDouble(doubleType);
        System.out.println(doubleNumber);
    }
}
