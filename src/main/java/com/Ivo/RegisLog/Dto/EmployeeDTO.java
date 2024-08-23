package com.Ivo.RegisLog.Dto;

public class EmployeeDTO {
    private int employeeId;
    private String employeeName;
    private String email;
    private String password;
    public EmployeeDTO(){};

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

    public EmployeeDTO(int employeeId, String employeeName, String email, String password) {
        this.employeeId = employeeId;
        this.employeeName = employeeName;
        this.email = email;
        this.password = password;
    }
}
