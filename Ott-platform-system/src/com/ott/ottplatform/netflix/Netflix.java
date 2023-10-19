package com.ott.ottplatform.netflix;

public class Netflix extends Ottplatform {

    @Override
    public boolean addMoviesName(String movieName) {
        System.out.println("calling the method of netflix class");

        if (index < movieNames.length) {
            movieNames[index] = movieName;
            index++;
            return true;
        } else {
            System.out.println("Netflix movie list is full. Cannot add more movies.");
            return false;

        }
    }
}