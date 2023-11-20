package com.xworkz.object;

public class SampleExecutor {
    public static void main(String[] args) {
        System.out.println("main method started");
        String str="Romeo";//create object of String without use new,see romeo as object str1 also point to romeo
        String str1="Romeo";
        System.out.println(str.equals(str1));//true
        System.out.println(str==str1);//true

        String str2= new String("Romeo");
        System.out.println(str.equals(str2));
        System.out.println(str==str2);//eventhough string is same but new keyword create new object so false.

        String st=null;
        String st1="null";
        System.out.println(st==st1);//salse

        String strr=null;
        String strr1="null";
        System.out.println(strr.equals(str1));
        System.out.println(strr==strr1);
        System.out.println(strr.equals(strr1));//null pointer exception
        System.out.println(strr1.equals(strr));


        String name=null;
        String name1=null;
        System.out.println(name.equals(name1));//null pointer
        System.out.println(name==name1);//true both are pinting to samenull

        //String strrrr=new String(null);not acceptnull


        String exp=null;
        String exp1=new String(exp);//String cannot be null;
        System.out.println(exp==exp1);//

        String s=null;
        String s1=new String("null");

        /* exception handling */
        try {
            System.out.println(s.equals(s1));
        }catch(NullPointerException e) {
            System.out.println("Cannot Access Null value");
             }
        System.out.println("main method ended");
        }



    }

