package com.xworkz.object;
public class Xworkz  extends Object {
    String name;
    int number;
    @Override
    public String toString(){

        return "name: "+name+ ", number:" +number;
    }

    public void finalise(){
        int a=10;
        System.out.println(a);
    }
    public boolean equals(Object obj) {

        if (obj != null && this!=null )  {
            return true;
        }
        if(getClass() != obj.getClass()){
            return  true;
        }

        // Cast  object to Xworkz type-downcasting
        Xworkz x = (Xworkz) obj;


        if (name.equals(x.name) && number == x.number) {
            return true;
        }
        return false;
    }

}
