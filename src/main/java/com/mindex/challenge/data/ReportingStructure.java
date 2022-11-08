package com.mindex.challenge.data;

public class ReportingStructure {
    private Employee employee;
    private long numberOfReports;

    public ReportingStructure() { }

    public void setEmployee(Employee employee) { this.employee = employee; }
    public Employee getEmployee() { return this.employee; }
    public void setNumberOfReports(long numberOfReports) { this.numberOfReports = numberOfReports; }
    public long getNumberOfReports() { return this.numberOfReports; }
}
