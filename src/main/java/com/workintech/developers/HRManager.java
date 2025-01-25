package com.workintech.developers;


import java.util.Arrays;

public class HRManager extends Employee{

    private JuniorDeveloper[] juniorDevelopers;
    private SeniorDeveloper[] seniorDevelopers;
    private MidDeveloper[] midDevelopers;

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
    }

    public HRManager(long id, String name, double salary,
                     JuniorDeveloper[] juniorDevelopers,
                     SeniorDeveloper[] seniorDevelopers, MidDeveloper[] midDevelopers) {
        super(id, name, salary);
        this.juniorDevelopers = juniorDevelopers;
        this.seniorDevelopers = seniorDevelopers;
        this.midDevelopers = midDevelopers;
    }

    public void addEmployee(int index,JuniorDeveloper juniorDeveloper){
        try {
            if (juniorDevelopers[index] ==null){
                juniorDevelopers[index]=juniorDeveloper;
            }else {
                System.out.println("index is full some record exist!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found "+index);
        }
    }
    public void addEmployee(int index,MidDeveloper midDeveloper){
        try {
            if (midDevelopers[index] ==null){
                midDevelopers[index]=midDeveloper;
            }else {
                System.out.println("index is full some record exist!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found "+index);
        }
    }
    public void addEmployee(int index,SeniorDeveloper seniorDeveloper){
        try {
            if (seniorDevelopers[index] ==null){
                seniorDevelopers[index]=seniorDeveloper;
            }else {
                System.out.println("index is full some record exist!");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            e.printStackTrace();
            System.out.println("index not found "+index);
        }
    }

    @Override
    public void work() {
        System.out.println(getName() +" HR manager starts to working");
    }

    @Override
    public String toString() {
        return "HRManager{" +
                "juniorDevelopers=" + Arrays.toString(juniorDevelopers) +
                ", seniorDevelopers=" + Arrays.toString(seniorDevelopers) +
                ", midDevelopers=" + Arrays.toString(midDevelopers) +
                '}';
    }
}
