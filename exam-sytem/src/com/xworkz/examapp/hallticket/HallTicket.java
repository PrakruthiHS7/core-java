package com.xworkz.examapp.hallticket;

public class HallTicket
{
    int hallticketId;
    String subjectName;
    String subjectCode;
    String candidateName;
    String usn;

    public HallTicket(int hallticketId,String subjectName,String subjectCode,String candidateName,String usn) //parameterised constructor
    {
        this.hallticketId=hallticketId;
        this.subjectName=subjectName;
        this.subjectCode=subjectCode;
        this.candidateName=candidateName;
        this.usn=usn;
    }

    public void displayDetails(){
        System.out.println("The hallticket details are :");
        System.out.println("The hallticketId is " +this.hallticketId);
        System.out.println("The Subject Name  is "+this.subjectName);
        System.out.println("The subjectCode is "+this.subjectCode);
        System.out.println("The candidateName is "+this.candidateName);
        System.out.println("The candidate usn is "+this.usn);

    }

}
