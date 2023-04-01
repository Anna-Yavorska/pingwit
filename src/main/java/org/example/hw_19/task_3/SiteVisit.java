package org.example.hw_19.task_3;

import java.util.Objects;

public class SiteVisit {
    private final String userName;
    private final String site;

    public SiteVisit(String userName, String site) {
        this.userName = userName;
        this.site = site;
    }

    public String getUserName() {
        return userName;
    }

    public String getSite() {
        return site;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SiteVisit siteVisit = (SiteVisit) o;
        return Objects.equals(userName, siteVisit.userName) && Objects.equals(site, siteVisit.site);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userName, site);
    }

    @Override
    public String toString() {
        return "SiteVisit{" +
                "userName='" + userName + '\'' +
                ", site='" + site + '\'' +
                '}';
    }
}
