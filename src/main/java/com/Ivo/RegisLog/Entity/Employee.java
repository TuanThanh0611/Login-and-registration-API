package com.Ivo.RegisLog.Entity;


import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {
    @Id
    @Column(name="employee_id",length=45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int employeeId;
    @Column(name="employee_name",length=255)
    private String employeeName;
    @Column(name="email",length=255)
    private String email;
    @Column(name="password",length=45)
    private String password;
    public Employee(){}

    public Employee(int employeeId, String employeeName, String email, String password) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.password = password;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
