package hibernate;

import javax.persistence.*;

@Entity
@Table(name = "system_under_test", schema = "system_manager", catalog = "")
public class SystemUnderTestEntity {
    private int idSystemUnderTest;
    private String nameSystem;

    @Id
    @Column(name = "id_system_under_test", nullable = false)
    public int getIdSystemUnderTest() {
        return idSystemUnderTest;
    }

    public void setIdSystemUnderTest(int idSystemUnderTest) {
        this.idSystemUnderTest = idSystemUnderTest;
    }

    @Basic
    @Column(name = "name_system", nullable = false, length = 45)
    public String getNameSystem() {
        return nameSystem;
    }

    public void setNameSystem(String nameSystem) {
        this.nameSystem = nameSystem;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        SystemUnderTestEntity that = (SystemUnderTestEntity) o;

        if (idSystemUnderTest != that.idSystemUnderTest) return false;
        if (nameSystem != null ? !nameSystem.equals(that.nameSystem) : that.nameSystem != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = idSystemUnderTest;
        result = 31 * result + (nameSystem != null ? nameSystem.hashCode() : 0);
        return result;
    }
}
