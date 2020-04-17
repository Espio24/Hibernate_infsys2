package hibernate;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "results", schema = "system_manager", catalog = "")
public class ResultsEntity {
    private int idResults;
    private Date date;

    @Id
    @Column(name = "id_results", nullable = false)
    public int getIdResults() {
        return idResults;
    }

    public void setIdResults(int idResults) {
        this.idResults = idResults;
    }

    @Temporal(TemporalType.DATE)
    @Column(name = "date", nullable = false)
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ResultsEntity that = (ResultsEntity) o;

        if (idResults != that.idResults) return false;
        if (date != null ? !date.equals(that.date) : that.date != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idResults;
        result = 31 * result + (date != null ? date.hashCode() : 0);
        return result;
    }
}
