package it.francesco.presentation.domain.dto;

public class Employee {
    private String cf;
    private int ral;
    private BadgeDto badge;

    public Employee(String cf, int ral, BadgeDto badge) {
        this.cf = cf;
        this.ral = ral;
        this.badge = badge;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public int getRal() {
        return ral;
    }

    public void setRal(int ral) {
        this.ral = ral;
    }

    public BadgeDto getBadge() {
        return badge;
    }

    public void setBadge(BadgeDto badge) {
        this.badge = badge;
    }
}
