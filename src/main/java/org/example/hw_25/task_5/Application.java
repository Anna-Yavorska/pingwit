package org.example.hw_25.task_5;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Supplier;

public class Application {
    public static void main(String[] args) {
        MedalService medalService = new MedalService();
        Sportsman lena = new Sportsman("Lena", 20, new ArrayList<>(List.of(Medal.BRONZE, Medal.BRONZE, Medal.SIlVER)));
        Sportsman valera = new Sportsman("Valera", 15, new ArrayList<>(List.of(Medal.BRONZE)));
        Sportsman vlad = new Sportsman("Vlad", 22, new ArrayList<>(List.of(Medal.GOLD, Medal.BRONZE)));
        Sportsman viktor = new Sportsman("Viktor", 24, new ArrayList<>(List.of(Medal.GOLD, Medal.GOLD, Medal.BRONZE)));
        Sportsman lora = new Sportsman("lora", 18, new ArrayList<>(List.of(Medal.BRONZE, Medal.GOLD)));
        List<Sportsman> sportsmen = new ArrayList<>(List.of(lena, valera, vlad, viktor, lora));

        Supplier<List<Sportsman>> findingWinners = () -> {
            Comparator<Sportsman> comparing = Comparator.comparing(Sportsman::getSpeed).reversed();
            sportsmen.sort(comparing);
            return sportsmen;
        };
        List<Sportsman> sortedSportsmen = findingWinners.get();
        medalService.reward(sortedSportsmen);
    }
}
