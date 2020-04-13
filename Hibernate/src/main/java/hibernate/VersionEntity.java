package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "version", schema = "system_manager", catalog = "")
public class VersionEntity {
    private int idVersion;

    @Id
    @Column(name = "id_version", nullable = false)
    public int getIdVersion() {
        return idVersion;
    }

    public void setIdVersion(int idVersion) {
        this.idVersion = idVersion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        VersionEntity that = (VersionEntity) o;

        if (idVersion != that.idVersion) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idVersion;
    }
}
