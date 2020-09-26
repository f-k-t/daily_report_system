package models;

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Table(name = "attendances")
@NamedQueries({
        @NamedQuery(name = "getAllAttendances", query = "SELECT a FROM Attendance AS a ORDER BY a.id DESC"),
        @NamedQuery(name = "getAttendancesCount", query = "SELECT COUNT(a) FROM Attendance AS a"),
        @NamedQuery(name = "getMyAllAttendances", query = "SELECT a FROM Attendance AS a WHERE a.employee = :employee ORDER BY a.id DESC"),
        @NamedQuery(name = "getMyAttendancesCount", query = "SELECT COUNT(a) FROM Attendance AS a WHERE a.employee = :employee")
})
@Entity
public class Attendance {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    @JoinColumn(name = "employee_id", nullable = false)
    private Employee employee;

    @Column(name = "entering", length = 255, nullable = false)
    private String entering;

    @Column(name = "leaving", length = 255, nullable = false)
    private String leaving;

    @Column(name = "created_at", nullable = false)
    private Timestamp created_at;

    @Column(name = "updated_at", nullable = false)
    private Timestamp updated_at;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getEntering() {
        return entering;
    }

    public void setEntering(String entering) {
        this.entering = entering;
    }

    public String getLeaving() {
        return leaving;
    }

    public void setLeaving(String leaving) {
        this.leaving = leaving;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }
}
