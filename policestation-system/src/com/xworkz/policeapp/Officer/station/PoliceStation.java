package com.xworkz.policeapp.Officer.station;

import com.xworkz.policeapp.Officer.Officer.Officer;

import java.util.Arrays;

public class PoliceStation {
    Officer officer[];
    int index;
    int id=1;

    public PoliceStation(int size){

        officer=new Officer[size];
    }


    public boolean addOfficers(Officer officer){
        boolean isAdded=false;
        if(officer!=null)
        {
            officer.setOfficerId(id++);
            this.officer[index++]=officer;
            isAdded=true;
        }
        return isAdded;
    }

    public Officer getAllOfficer()
    {
        for (int i = 0; i <officer.length ;i ++)
        {
            System.out.println(officer[i].getOfficerId()+" " + officer[i].getName()+" " +officer[i].getAge()+ " "+officer[i].getGender()+ " "+officer[i].getAddress()+" "+officer[i].getPostName()+ "  "+officer[i].getBloodGroup());
        }
        return null;
    }

    public String getOfficersNameByPostName(String postName)
    {
        String officersName=null;

        System.out.println("invoking the method get getOfficersNameByPostName");
        for (int i = 0; i <this.officer.length ; i++) {
            if (officer[i].getPostName().equals(postName)) {
                officersName = officer[i].getName();
            }

        }
        return officersName;
    }
    public String getAdressById(int officerId){
        String officerAdress=null;

        System.out.println("invoking the method getAdressById");
        for (int i = 0; i <this.officer.length ; i++) {
            if(officer[i].getOfficerId() == officerId){
                officerAdress=officer[i].getAddress();
            }

        }
        return officerAdress;
    }


    public void getOfficerInfoById(int id) {
        for (int i = 0; i < officer.length; i++) {
            if (officer[i].getOfficerId() == id) {
                System.out.println(officer[i].getName() + " " +
                        officer[i].getAge() + " " +
                        officer[i].getPostName() + " " + officer[i].getGender() + " " +
                        officer[i].getAddress() + " " + officer[i].getBloodGroup());
            }

        }
    }

        public int getOfficersAGeByName (String name){
            int officerAge = 0;

            System.out.println("invoking the method getOfficersAGeByNam");
            for (int i = 0; i < this.officer.length; i++) {
                if (officer[i].getName().equals(name)) {
                    officerAge = officer[i].getAge();
                }

            }
            return officerAge;
        }
      public String postNameByName(String name){
          String postName = null;

          System.out.println("invoking the method postNameByName");
          for (int i = 0; i < this.officer.length; i++) {
              if (officer[i].getName().equals(name)) {
                  postName = officer[i].getPostName();
              }
   }
          return postName;
      }


    public String postNameById(int id){
        String postName = null;

        System.out.println("invoking the method postNameById");
        for (int i = 0; i < this.officer.length; i++) {
            if (officer[i].getOfficerId() == id) {
                postName= officer[i].getPostName();
            }

        }
        return postName;
    }

    public boolean updatePostNameByOfficerName(String updatedPostName, String existingOfficerName)
    {
        System.out.println("updatePostNameByOfficerName");
        boolean isPostNameUpdated =false;
        for(int i=0;i< this.officer.length;i++)
        {
            if(officer[i].getName()==existingOfficerName){
                officer[i].setPostName(updatedPostName);
                isPostNameUpdated =true;
            }
        }
        return isPostNameUpdated;
    }

    public void deletedOfficerById(int id){
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
    }
    public void getAllNewApplication(Officer application[]){
        System.out.println("get all new application");
        for (int i = 0; i <officer.length ; i++) {
            System.out.println(officer[i].getOfficerId()+" "+
                    officer[i].getName()+" "+
                    officer[i].getPostName()+" "+
                    officer[i].getGender()+" "+
                    officer[i].getAddress()+" "+
                    officer[i].getBloodGroup()+" "+
                    officer[i].getPostName());

        }
    }
}