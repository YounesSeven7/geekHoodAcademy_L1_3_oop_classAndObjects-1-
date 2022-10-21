package com.company;

import java.util.List;

public class  Company {
    private String companyName;
    private Employee boss;
    private List<Team> teams;
    static int companyEmployeesNumber;

    public Company(String companyName, Employee boss, List<Team> teams) {
        this.companyName = companyName;
        setBoss(boss);
        this.teams = teams;
    }

    public Employee getBoss() {
        return boss;
    }

    public void setBoss(Employee boss) {
        boss.setPositionInCompany("boss");
        boss.setTex(5);
        this.boss = boss;
    }

    public List<Team> getTeams() {
        return teams;
    }

    public void setTeams(List<Team> teams) {
        this.teams = teams;
    }

    public void printCompanyInfo() {
        int number = 1;
        System.out.println("welcome in company :" + this.companyName);
        System.out.println("    number    |    name    |    position   |    salary    |    tex    |    net    ");
        Employee.printEmployeeInfo(number++, boss, null);
        for (Team team : teams) {
            System.out.println("_______________________________________________________________________________________");
            Employee.printEmployeeInfo(number++, team.getTeamManager(), team);
            System.out.println("_______________________________________________________________________________________");
            for (Employee employee : team.getTeamEmployeesList()) {
                Employee.printEmployeeInfo(number++, employee, null);
            }

        }
    }


}
