package com.xworkz.object;

public class ExceptionHandleOne {
    /*public void execute()throws ClassNotFoundException{
        System.out.println("execute started");
        Class.forName("com.xworkz.object.ExceptionHandleOne");
        System.out.println("execution ended");}*/
       public void method1(){
           System.out.println("method1 started");
           method2();
           System.out.println("method1 ended");
       }

    private void method2() {
        System.out.println("method2 started");
        method3();
        System.out.println("method2 ended");
    }

    private void method3() {
        System.out.println("method3 started");
        method4();
        System.out.println("method3 ended");
    }

    private void method4() {
        System.out.println("method4 started");
        try{
        Class.forName("com.xworkz.object.ExceptionHandleOne");}
        catch (ClassNotFoundException e){
            System.out.println(e);
            e.printStackTrace();
        }

        System.out.println("method4 ended");
    }
    public static void main(String args[]){
            System.out.println("main started");
            ExceptionHandleOne exc=new ExceptionHandleOne();
            exc.method1();
            /*try{
                exc.execute();
            }catch(ClassNotFoundException e){
                System.out.println("No class found");
                e.getStackTrace();
            }
            System.out.println("main ended");
             */
    }
}
