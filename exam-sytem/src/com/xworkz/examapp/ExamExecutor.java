package com.xworkz.examapp;

import com.xworkz.examapp.exam.Exam;
import com.xworkz.examapp.exam.SupplementoryExam;
import com.xworkz.examapp.hallticket.HallTicket;
import com.xworkz.examapp.hallticket.HallTicket;

public class ExamExecutor {
    public static void main(String[] args) {

        HallTicket ticket =new HallTicket(6589,"Java Programming ","18CS062","Prakruthi H S","4PS19CS073");//at time of object creation passing the hallticket info

        //polymorphism
        Exam exam1=new SupplementoryExam(ticket);
        exam1.write();
        Exam exam= new Exam(ticket);
        //HallTicket ticket=null;

        exam.fees =1200;


       //has a relationship
        exam.write();

        SupplementoryExam supplementoryExam=(SupplementoryExam) exam;//down casting
        HallTicket hallTicket;
        supplementoryExam.write(ticket,1200);
    }
}
