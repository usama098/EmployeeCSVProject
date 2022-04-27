package model;

import java.util.ArrayList;

public class EmployeeList {
    private ArrayList<Employee> clean = new ArrayList<>();
    private ArrayList<Employee> duplicate = new ArrayList<>();
    private ArrayList<CorruptedEmployee> corrupted = new ArrayList<>();

    public ArrayList<Employee> getClean() {
        return clean;
    }

    public void setClean(ArrayList<Employee> clean) {
        this.clean = clean;
    }

    public ArrayList<Employee> getDuplicate() {
        return duplicate;
    }

    public void setDuplicate(ArrayList<Employee> duplicate) {
        this.duplicate = duplicate;
    }

    public ArrayList<CorruptedEmployee> getCorrupted() {
        return corrupted;
    }

    public void setCorrupted(ArrayList<CorruptedEmployee> corrupted) {
        this.corrupted = corrupted;
    }

    public void addCleanEmployee(Employee cln) {
        this.clean.add(cln);
    }

    public void addDuplicateEmployee(Employee dup) {
        this.duplicate.add(dup);
    }

    public void addCorruptedEmployee(CorruptedEmployee cor) {
        this.corrupted.add(cor);
    }
}
