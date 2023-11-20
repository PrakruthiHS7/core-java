package com.xworkz.object;

import static java.lang.Class.forName;

public class UserInfoExecutor {
    public static void main(String[] args) {
        try{
            Class userInfo=Class.forName("com.xworkz.object.user.UserInfo");
        System.out.println(userInfo);
        System.out.println("Class Loaded Successfully ");}
        catch(ClassNotFoundException cne){
            cne.getStackTrace();
        }
    }
}
