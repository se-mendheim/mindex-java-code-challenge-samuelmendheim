package com.mindex.challenge.data;

import java.util.Date;

public class Compensation {
    private String compensationId;
    private Employee employee;
    private double salary;

    private Date effectiveDate;

    public Compensation() { }

    public String getCompensationId() { return this.compensationId; }
    public void setCompensationId(String compensationId) { this.compensationId = compensationId; }

    public Employee getEmployee() { return this.employee; }
    public void setEmployee(Employee employee) { this.employee = employee; }

    public double getSalary() { return this.salary; }
    public void setSalary(double salary) { this.salary = salary; }

    public Date getEffectiveDate() { return effectiveDate; }
    public void setEffectiveDate(Date effectiveDate) { this.effectiveDate = effectiveDate; }
}
