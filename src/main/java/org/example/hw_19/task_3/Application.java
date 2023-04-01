package org.example.hw_19.task_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Application {
    public static void main(String[] args) {
        SiteVisit firstSite = new SiteVisit("Lolita", "YouTube");
        SiteVisit secondSite = new SiteVisit("Valera", "Google");
        SiteVisit thirdSite = new SiteVisit("Lolita", "Google");
        SiteVisit fourthSite = new SiteVisit("Valera", "Jobs");
        SiteVisit fifthSite = new SiteVisit("Piotr", "Stack over flow");

        List<SiteVisit> siteVisits = new ArrayList<>(List.of(firstSite, secondSite, thirdSite, fourthSite, fifthSite));

        SiteService service = new SiteService();
        Set<String> users = service.printUsers(siteVisits);
        Set<String> sites = service.printSites(siteVisits);
        Map<String, Integer> countVisits = service.countVisits(siteVisits);

        System.out.println("Unique usernames:");
        System.out.println(users);
        System.out.println("Unique sites:");
        System.out.println(sites);
        System.out.println("Quantity of site visits:");
        System.out.println(countVisits);
    }
}
