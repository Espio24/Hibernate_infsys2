package hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "link_tests", schema = "system_manager", catalog = "")
public class LinkTestsEntity {
    private int idLinkTests;

    @Id
    @Column(name = "id_link_tests", nullable = false)
    public int getIdLinkTests() {
        return idLinkTests;
    }

    public void setIdLinkTests(int idLinkTests) {
        this.idLinkTests = idLinkTests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        LinkTestsEntity that = (LinkTestsEntity) o;

        if (idLinkTests != that.idLinkTests) return false;

        return true;
    }

    @Override
    public int hashCode() {
        return idLinkTests;
    }
}
