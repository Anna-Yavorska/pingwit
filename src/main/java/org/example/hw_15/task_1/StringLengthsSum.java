package org.example.hw_15.task_1;

public class StringLengthsSum {
    public static void main(String[] args) {
        String[] strings = new String[]{"tratata", "sea", "audi", "java", "online"};
        int sumLength = 0;

        for (String element : strings) {
            int elementLength = element.length();
            System.out.printf("Строка '%s' имеет длину: %d", element, elementLength);
            System.out.println();
            sumLength += elementLength;
        }
        System.out.println(sumLength);
    }
}
