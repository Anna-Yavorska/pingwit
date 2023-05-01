package org.example.hw_25.task_5;

public enum Medal {
    GOLD(1),
    SIlVER(2),
    BRONZE(3);
    private final Integer place;

    Medal(Integer place) {
        this.place = place;
    }

    public Integer getPlace() {
        return place;
    }
}
