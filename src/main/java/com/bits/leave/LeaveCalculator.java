
package com.bits.leave;

public class LeaveCalculator {

    private double totalLeaves;
    private double leavesTaken;
    private double dailySalary;

    public LeaveCalculator(double totalLeaves, double leavesTaken, double dailySalary) {
        this.totalLeaves = totalLeaves;
        this.leavesTaken = leavesTaken;
        this.dailySalary = dailySalary;
    }

    public double calculateLeaveBalance() {
        return totalLeaves - leavesTaken;
    }

    public double calculateLeaveEncashment() {
        return calculateLeaveBalance() * dailySalary;
    }
}
