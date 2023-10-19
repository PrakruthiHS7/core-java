package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

public class Exam {
    public int fees; //instance variable
    HallTicket ticket;

    //has a relationship
    public Exam(HallTicket ticket)   //initialise through constructor
    {
        this.ticket = ticket;
    }

    public boolean write() {
        System.out.println("Calling write of exam");

        boolean isAllowed = false;

        if (fees >= 1200) {
            if (ticket != null) {
                System.out.println("Fees is paid ...collect the hallticket");
                //this.ticket=ticket; if not initialise in constructor.(intialise through method.
               this.ticket.displayDetails();
                isAllowed = true;
            }
            else {
                System.out.println("Hall ticket not found ");
                   }

        }
        else
        {
            System.out.println("To collect the hallticket pay the fees.. ");
        }
        return isAllowed;
    }
}
