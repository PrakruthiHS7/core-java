package com.xworkz.examapp.exam;

import com.xworkz.examapp.hallticket.HallTicket;

public class SupplementoryExam extends Exam {
    int noOfAttempts=2;

  public SupplementoryExam(HallTicket ticket) {
    super(ticket);
  }
  @Override
    public boolean  write() {
    System.out.println("calling write of the supplementary exam");
      if (noOfAttempts > 1)
      {
        return super.write();
      }
      else {
        System.out.println("You are not eligible for supplementary exam.");
        return false;
         }
    }
    public void write(HallTicket ticket,int fees) {
      System.out.println("method of write having two prameter");
    }
  }
