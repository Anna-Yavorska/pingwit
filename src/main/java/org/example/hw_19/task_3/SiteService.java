package org.example.hw_19.task_3;

import java.util.*;

public class SiteService {
    public Set<String> printUsers(List<SiteVisit> siteVisits) {
        Set<String> names = new HashSet<>();
        for (SiteVisit siteVisit : siteVisits) {
            String userName = siteVisit.getUserName();
            names.add(userName);
        }
        return names;
    }

    public Set<String> printSites(List<SiteVisit> siteVisits) {
        Set<String> sites = new HashSet<>();
        for (SiteVisit siteVisit : siteVisits) {
            String site = siteVisit.getSite();
            sites.add(site);
        }
        return sites;
    }

    public Map<String, Integer> countVisits(List<SiteVisit> siteVisits) {
        Integer oneVisit = 1;
        Map<String, Integer> visits = new HashMap<>();
        for (SiteVisit siteVisit : siteVisits) {
            String site = siteVisit.getSite();
            if (visits.containsKey(site)) {
                Integer countVisits = visits.get(site);
                countVisits = countVisits + oneVisit;
                visits.put(site, countVisits);
            } else {
                visits.put(site, oneVisit);
            }
        }
        return visits;
    }
}
