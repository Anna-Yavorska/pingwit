package org.example.hw_8.task_3;

public class CarMain {
    public static void main(String[] args) {
        CashService cashService = new CashService();
        FerryCrossingService flightClearance = new FerryCrossingService();

        Car firstCar = new Car("AA8597CI", CarType.PASSENGER_CAR, 4, 1010);
        Car secondCar = new Car("T113EP", CarType.TRUCK, 3, 5034);
        Car thirdCar = new Car("999AAA", CarType.PASSENGER_CAR, 7, 1403);
        Car fourthCar = new Car("E969YT", CarType.TRUCK, 1, 2047);
        Car fifthCar = new Car("E781KX", CarType.PASSENGER_CAR, 2, 987);

        Car[] cars = new Car[]{firstCar, secondCar, thirdCar, fourthCar, fifthCar};
        int allPayments = cashService.calculatePayment(cars);
        System.out.println(allPayments + " евро");

        System.out.print("Проверка допуска парома к рейсу: ");
        boolean result = flightClearance.isCrossing(cars);
        System.out.println(result);
    }
}
