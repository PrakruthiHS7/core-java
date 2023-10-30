package com.xworkz.policeapp.Officer.station;

import com.xworkz.policeapp.Officer.Officer.Officer;

public interface PoliceStation {
    int dig=10;
    public boolean addOfficers(Officer officer);
    public Officer getAllOfficer();
    public String getOfficersNameByPostName(String postName);
    public String getAdressById(int officerId);
    public String getOfficerInfoById(int id);
    public int getOfficersAGeByName (String name);
    public String postNameByName(String name);
    public boolean updatePostNameByOfficerName(String updatedPostName, String existingOfficerName);
    public void deletedOfficerById(int id);
    public void getAllNewApplication(Officer application[]);
}
