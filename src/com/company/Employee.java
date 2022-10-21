package com.company;

public class Employee {
    private String name;
    private String positionInCompany;
    private int amount, tex;

    public Employee(String name, int amount) {
        this.name = name;
        this.amount = amount;
        Company.companyEmployeesNumber++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPositionInCompany() {
        return positionInCompany;
    }

    public void setPositionInCompany(String positionInCompany) {
        this.positionInCompany = positionInCompany;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getTex() {
        return tex;
    }

    public void setTex(int tex) {
        this.tex = tex;
    }

    public int getNetAmount() {
        return ((100-tex)*amount)/100;
    }

    private static String setBossOrEmployeesFormat(int number, Employee employee) {
        return "    "+number+"         |    "+employee.getName()+"    |    "+employee.getPositionInCompany()+"    |    "+employee.getAmount()+"    |    "+employee.getTex()
                +"    |    "+employee.getNetAmount();
    }

    private static String setTeamManagerFormat(int number, Employee employee, String teamName) {
        return setBossOrEmployeesFormat(number, employee)+"  <- Team manager, Team name -> "+teamName;
    }

    public static void printEmployeeInfo(int number, Employee employee, Team team) {
        String print = employee.positionInCompany.equals("teamManager") && team != null ? setTeamManagerFormat(number, employee,team.getTeamName()) : setBossOrEmployeesFormat(number, employee);
        System.out.println(print);
    }
}
