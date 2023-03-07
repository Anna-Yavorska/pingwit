package org.example.hw_11.task_1;

public abstract class AbstractPhone implements Phone {
    private String type;
    private String model;

    protected AbstractPhone(String type, String model) {
        this.type = type;
        this.model = model;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public void makeCall() {
        System.out.println("Доброго времени суток!");
    }

    @Override
    public void receiveCall() {
        System.out.println("Алло");
    }

    public abstract void adjustRingerVolume();

    @Override
    public String toString() {
        return "AbstractPhone: " +
                "type='" + type + '\'' +
                ", model='" + model + '\'';
    }
}
