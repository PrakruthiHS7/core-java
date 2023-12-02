package com.collection.anythingapp;

public class Armstrong {

    int order(int number){
        int count = 0;

        while(number!=0){
            count++;
            number = number/10;
        }
        return count;
    }

    int power(int x, long y){
        if(y == 0)
            return 1;
        if(y%2 == 0)
            return power(x,y/2)*power(x,y/2);

        return x*power(x,y/2)*power(x,y/2);
    }

    boolean isArmstrong(int number){
        int length = order(number);
        int original = number;
        int sum = 0,rem = 0;

        while(number != 0){
            rem = number%10;
            sum = sum + power(rem,length);
            number = number/10;
        }

        if (original == sum)
            return true;
        else
            return false;

    }
}
