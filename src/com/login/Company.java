package com.login;

public class Company {
     private void bloodDonation(int age,int weight) {
     if(age>18 && weight>50) {
     System.out.println("eligible to join gym");
	}
     else {
    	 System.out.println("not eligible to join");
        }
     } 
     public static void main(String[] args) {
		Company c = new Company();
		c.bloodDonation(10,40);
      }
   }