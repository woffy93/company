package it.francesco.dal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "devs")
public class Dev {

    @Id
    private String cf;

    public Dev() {
    }

    public Dev(String cf) {
        this.cf = cf;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dev dev = (Dev) o;
        return Objects.equals(cf, dev.cf);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cf);
    }

    @Override
    public String toString() {
        return "Dev{" +
                "cf='" + cf + '\'' +
                '}';
    }
}
