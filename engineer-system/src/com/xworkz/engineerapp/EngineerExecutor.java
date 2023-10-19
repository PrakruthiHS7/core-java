package com.xworkz.engineerapp;


import com.xworkz.engineerapp.engineer.CsEngineer;
import com.xworkz.engineerapp.engineer.Engineer;
import com.xworkz.engineerapp.engineer.MarineEngineer;

public class EngineerExecutor {
    public static void main(String[] args) {
        //polimorphism-parent class reference is used to refer to a child class object(upcasting)
        Engineer engineer=new CsEngineer();
        engineer.problemSolving();

        //down casting to access the csenginner method from engineer
        CsEngineer csEngineer=(CsEngineer)engineer;
        csEngineer.softwareDevelopment();


        Engineer engineer1=new MarineEngineer();


        //down casting
        MarineEngineer marineEngineer=(MarineEngineer)engineer1;
        marineEngineer.enjoy();

    }
}
