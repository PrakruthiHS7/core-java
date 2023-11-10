package com.xworkz.policeapp.Officer.station;

import com.xworkz.policeapp.Officer.Officer.Officer;
import com.xworkz.policeapp.Officer.exception.*;
import java.util.Arrays;

public class RajajiNagarPoliceStation implements PoliceStation {
    Officer officer[];
    int index;
    int id=1;

    public RajajiNagarPoliceStation(int size){
        officer=new Officer[size];
    }
public boolean addOfficers(Officer officer){
        boolean isAdded=false;
        try{
        if(officer!=null)
        {
            officer.setOfficerId(id++);
            this.officer[index++]=officer;
            isAdded=true;
        }else{
            /*IllegalArgumentException illegalArgumentException=new IllegalArgumentException("Officer cannot be null");
            throw illegalArgumentException;
             */
            throw new IllegalArgumentException("Officer cannot be null");

        }
        }catch(IllegalArgumentException e){
            e.printStackTrace();
            System.out.println(e);
        }
        return isAdded;
    }
  //getALlOfficers
    public Officer getAllOfficer()
    {
        for (int i = 0; i <officer.length ;i ++)
        {
            System.out.println(Arrays.toString(officer));
        }
        return null;
    }

    public String getOfficersNameByPostName(String postName) {
        String officersName = null;
        try {
            System.out.println("invoking the method getOfficersNameByPostName");
            for (int i = 0; i < this.officer.length; i++) {
                if (officer[i].getPostName().equals(postName)) {
                    officersName = officer[i].getName();
                    break; // Break the loop once a match is found
                }
            }

            if (officersName == null) {
                // No match found, throw OfficersNameNotFoundException
                throw new OfficersNameNotFoundException("Officers name not found");
            }
        } catch (OfficersNameNotFoundException e) {
            System.out.println(e);
            e.printStackTrace();
        }

        return officersName;
    }

    public String getAdressById(int officerId){
        String officerAdress=null;

        System.out.println("invoking the method getAdressById");
        try {
            for (int i = 0; i < this.officer.length; i++) {
                if (officer[i].getOfficerId() == officerId) {
                    officerAdress = officer[i].getAddress();
                }

            }
            if (officerAdress==null){
                OfficersAddressNotFounfException officersAddressNotFounfException=new OfficersAddressNotFounfException("Officers Address not found..");
                throw officersAddressNotFounfException;
            }
        }catch (OfficersAddressNotFounfException e){
            System.out.println(e);
            e.printStackTrace();
        }
        return officerAdress;
    }
 public String getOfficerInfoById(int id) {
        try {
            for (int i = 0; i < officer.length; i++) {
                if (officer[i].getOfficerId() == id) {
                    System.out.println(Arrays.toString(officer));
                    return officer[i].toString(); // Return the officer info if the ID matches
                    //System.out.println(Arrays.toString(officer));
                    //return officer.toString();
                    //return officer.toString();
                }

            }
            throw new OfficerNotFoundException("Officers not found for the given ID ..");
        }catch (OfficerNotFoundException e)
        {
            System.out.println(e);
            e.printStackTrace();
        }
        return null;
    }

        public int getOfficersAGeByName (String name){
            int officerAge = 0;

            System.out.println("invoking the method getOfficersAGeByName");
            try {
                for (int i = 0; i < this.officer.length; i++) {
                    if (officer[i].getName().equals(name)) {
                        officerAge = officer[i].getAge();
                    }

                }
                if(officerAge==0)
                {
                    OfficerAgeNotFoundException officerAgeNotFoundException=new OfficerAgeNotFoundException("Officer age not found for the given name");
                    throw officerAgeNotFoundException;
                }
            }catch (OfficerAgeNotFoundException e){
                e.printStackTrace();
            }

            return officerAge;
        }
      public String postNameByName(String name){
          String postName = null;
         try {
             System.out.println("invoking the method postNameByName");
             for (int i = 0; i < this.officer.length; i++) {
                 if (officer[i].getName().equals(name)) {
                     postName = officer[i].getPostName();
                 }
             }
             if (postName==null){
                 PostNameNotFoundException postNameNotFoundException=new PostNameNotFoundException("PostName not found for the given name");
                 throw postNameNotFoundException;
             }
         }catch (PostNameNotFoundException e){
             e.printStackTrace();
         }
          return postName;
      }
 public String postNameById(int id){
        String postName = null;
     try{
        System.out.println("invoking the method postNameById");
        for (int i = 0; i < this.officer.length; i++) {
            if (officer[i].getOfficerId() == id) {
                postName= officer[i].getPostName();
            }

        }if(postName==null){
            PostNameNotFoundException postNameNotFoundException=new PostNameNotFoundException("post name not found for the given ID");
            throw postNameNotFoundException;
         }
     }
     catch (PostNameNotFoundException e){
         e.printStackTrace();
     }
        return postName;
    }

    public boolean updatePostNameByOfficerName(String updatedPostName, String existingOfficerName) {
        System.out.println(" invoking the method updatePostNameByOfficerName");
        boolean isPostNameUpdated = false;
        for (int i = 0; i < this.officer.length; i++) {
            if (officer[i].getName().equals(existingOfficerName)) {
                officer[i].setPostName(updatedPostName);
                isPostNameUpdated = true;
            }
        }
        return isPostNameUpdated;
    }
        public boolean deletedOfficerById(int id){
        System.out.println("Invoke deletedOfficerById" );
        int newIndex = 0;
        for (int index = 0; index < this.officer.length; index++) {
            if (officer[index].getOfficerId() != id) {
                officer[newIndex] = officer[index];
                newIndex++;
            } else {
                System.out.println("Given officer deleted.");
            }
        }
        //java.util
        officer = Arrays.copyOf(officer,newIndex);
        getAllNewApplication(officer);
            return false;
        }

    public void getAllNewApplication(Officer application[]){
        System.out.println("get all new application");
        for (int i = 0; i <officer.length ; i++) {
            System.out.println(officer[i]);

        }
    }
}