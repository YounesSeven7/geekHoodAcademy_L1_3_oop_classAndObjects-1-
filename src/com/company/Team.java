package com.company;

import java.util.List;

public class Team {
    private String teamName;
    private Employee teamManager;
    private List<Employee> teamEmployeesList;

    public Team(String teamName, Employee teamManager) {
        this.teamName = teamName;
        setTeamManager(teamManager);
    }

    public String getTeamName() {
        return teamName;
    }

    public void setTeamName(String teamName) {
        this.teamName = teamName;
    }

    public Employee getTeamManager() {
        return teamManager;
    }

    public void setTeamManager(Employee teamManager) {
        teamManager.setPositionInCompany("teamManager");
        teamManager.setTex(10);
        this.teamManager = teamManager;
    }

    public List<Employee> getTeamEmployeesList() {
        return teamEmployeesList;
    }

    public void setTeamEmployeesList(List<Employee> teamEmployeesList) {
        this.teamEmployeesList = teamEmployeesList;
    }



}
