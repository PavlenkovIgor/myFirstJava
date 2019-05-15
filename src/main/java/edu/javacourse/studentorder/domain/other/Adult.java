package edu.javacourse.studentorder.domain.other;

import edu.javacourse.studentorder.domain.Person;

import java.time.LocalDate;

public class Adult extends Person
{
    private String passportSeria;
    private String passporNumber;
    private LocalDate issueDate;
    private String issueDepartment;
    private String university;
    private  String sudentId;

    public Adult(String surName, String givenName, String patronymic, LocalDate dateOfBirth) {
        super(surName, givenName, patronymic, dateOfBirth);
    }


    public void setSudentId(String sudentId) {
        this.sudentId = sudentId;
    }

    public String getPassportSeria() {
        return passportSeria;
    }

    public void setPassportSeria(String passportSeria) {
        this.passportSeria = passportSeria;
    }

    public String getPassporNumber() {
        return passporNumber;
    }

    public void setPassporNumber(String getPassporNumber) {
        this.passporNumber = getPassporNumber;
    }

    public LocalDate getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(LocalDate issueDate) {
        this.issueDate = issueDate;
    }

    public String getIssueDepartment() {
        return issueDepartment;
    }

    public void setIssueDepartment(String issueDepartment) {
        this.issueDepartment = issueDepartment;
    }
}
