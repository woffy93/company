package it.francesco.dal.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.List;
import java.util.Objects;

@Entity
@Table(name = "pms")
public class PM {

    @Id
    private String cf;

    private List<String> projectIds;

    public PM() {
    }


    public PM(String cf, List<String> projectIds) {
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
        PM pm = (PM) o;
        return Objects.equals(cf, pm.cf) &&
                Objects.equals(projectIds, pm.projectIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cf, projectIds);
    }

    @Override
    public String toString() {
        return "PM{" +
                "cf='" + cf + '\'' +
                ", projectIds=" + projectIds +
                '}';
    }
}
