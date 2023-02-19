package org.example.hw_6.hw_8.task_3;

public class CashService {
    public int calculatePayment(Car[] car) {
        int totalCost = 0;
        int totalQuantityPassengers = 0;
        for (int i = 0; i < car.length; i++) {
            totalQuantityPassengers += car[i].getQuantityPassengers();
            if (CarType.TRUCK.equals(car[i].getCarType())) {
                totalCost += 30;
            }
            if (CarType.PASSENGER_CAR.equals(car[i].getCarType())) {
                if (car[i].getQuantityPassengers() <= 2) {
                    totalCost += 10;
                } else {
                    totalCost += 15;
                }
            }
        }
        System.out.println("Количество пассажиров на пароме: " + totalQuantityPassengers);
        System.out.print("Общая сумма оплат: ");
        return totalCost;
    }
}
