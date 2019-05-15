package edu.javacourse.studentorder.domain;

import edu.javacourse.studentorder.domain.other.Adult;

public class StudentOrder
{
private  long sudenOrderId;
private Adult husband;
private  Adult wife;
private  Child child;

    public long getSudenOrderId() {
        return sudenOrderId;
    }

    public void setSudenOrderId(long sudenOrderId) {
        this.sudenOrderId = sudenOrderId;
    }

    public Adult getHusband() {
        return husband;
    }

    public void setHusband(Adult husband) {
        this.husband = husband;
    }

    public Adult getWife() {
        return wife;
    }

    public void setWife(Adult wife) {
        this.wife = wife;
    }

    public Child getChild() {
        return child;
    }

    public void setChild(Child child) {
        this.child = child;
    }
}
