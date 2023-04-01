package org.example.hw_19.task_1;

import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

public class Application {
    public static void main(String[] args) {
        FootballClub realMadrid = new FootballClub("Real Madrid", "Spain", "Madrid");
        FootballClub manchesterUnited = new FootballClub("Manchester United", "England", "Manchester");
        FootballClub barcelona = new FootballClub("Barcelona", "Spain", "Barcelona");
        FootballClub valencia = new FootballClub("Valencia", "Spain", "Valencia");
        FootballClub milan = new FootballClub("Milan", "Italy", "Milan");

        List<FootballClub> clubs = new ArrayList<>(List.of(realMadrid, manchesterUnited, barcelona, valencia, milan));
        SortedSet<String> sortedSet = new TreeSet<>();

        for (FootballClub footballClub : clubs) {
            String country = footballClub.getCountry();
            sortedSet.add(country);
        }
        System.out.println(sortedSet);
    }
}
