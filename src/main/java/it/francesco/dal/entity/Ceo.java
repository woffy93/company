package it.francesco.dal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "ceo")
public class Ceo {

    @Id
    private String cf;

    private List<String> projectIds;

    public Ceo() {
    }

    public Ceo(String cf, List<String> projectIds) {
        this.cf = cf;
        this.projectIds = projectIds;
    }

    public String getCf() {
        return cf;
    }

    public void setCf(String cf) {
        this.cf = cf;
    }

    public List<String> getProjectIds() {
        return projectIds;
    }

    public void setProjectIds(List<String> projectIds) {
        this.projectIds = projectIds;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ceo ceo = (Ceo) o;
        return Objects.equals(cf, ceo.cf) &&
                Objects.equals(projectIds, ceo.projectIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cf, projectIds);
    }
}
