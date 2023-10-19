package com.ott.ottplatform.netflix;

public class Ottplatform
{
    //instance variableclass OttPlatForm {
    String[] movieNames =new String[4];
    int index;//instance variable

    //create/add/save operation
    public boolean addMoviesName(String movieName){
        System.out.println("calling the method of parent class");
        System.out.println("Inside the movieNames()");
        boolean isAdded=false;//local variable it shoul be initialize at the time of declarartion
        if(movieName != null){
            System.out.println("valitation is proper");
            movieNames[index]=movieName;
            index++;
            isAdded=true;
        }
        return isAdded;

    }
    //read
    public void getMoviesName(){
        for(int index=0; index<movieNames.length;index++){
            System.out.println(movieNames[index]);

        }

    }

}

