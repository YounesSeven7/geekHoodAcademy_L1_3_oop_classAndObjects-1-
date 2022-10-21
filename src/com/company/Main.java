package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner scanner;
    private static int employeeNumber, teamNumber;
    private  static List<Team> teamsList;
    public static void main(String[] args) {
        scanner = new Scanner(System.in);
        makeCompany();
    }

    private static void makeCompany() {
        teamsList = new ArrayList<>();
        List<Employee> teamEmployeesList;
        Team team;
        // for make company.
        System.out.print("Welcome in Company System, \n enter its name: ");
        String companyName = scanner.nextLine();
        Employee boss = makeBoss();
        do {
            team = makeNewTeam();
            teamEmployeesList = new ArrayList<>();
            while (true) {
                teamEmployeesList.add(makeNewTeamEmployee());
                if (doYouNeedMoreEmployees())  {
                    break;
                }
            }
            team.setTeamEmployeesList(teamEmployeesList);
            teamsList.add(team);
            System.out.print("Enter more teams \n yes  \n no(or any word) \n -->");
        } while (scanner.nextLine().equals("yes"));
        Company company = new Company(companyName, boss, teamsList);
        company.printCompanyInfo();
    }

    private static Employee makeBoss() {
        System.out.print("Enter boss name: ");
        String bossName = scanner.nextLine();
        System.out.print("Enter boss amount: ");
        return new Employee(bossName, scanner.nextInt());
    }

    private static Team makeNewTeam() {
        scanner.nextLine();
        teamNumber++;
        System.out.print("Team number " + teamNumber + " Enter its name: ");
        String teamName = scanner.nextLine();
        System.out.print("Enter team manager name: ");
        String teamManagerName = scanner.nextLine();
        System.out.print("Enter team manager amount: ");
        int amount = scanner.nextInt();
        Employee teamManager = new Employee(teamManagerName, amount);
        scanner.nextLine();
        return new Team(teamName, teamManager);
    }

    private static Employee makeNewTeamEmployee() {
        employeeNumber++;
        System.out.print("Employee number "+ employeeNumber +"\nEnter employee name: ");
        String employeeName = scanner.nextLine();
        System.out.print("Enter its amount:" );
        int amount = scanner.nextInt();
        scanner.nextLine();
        Employee employee = new Employee(employeeName, amount);
        employee.setPositionInCompany("employee");
        return employee;
    }

    private static boolean doYouNeedMoreEmployees() {
        System.out.print("Enter more teem employees \n yes  \n no(or any word) \n -->");
        // when I use return !scanner.next().equals("yes"); there problem help me to fix it .
        return !scanner.nextLine().equals("yes");
    }


}