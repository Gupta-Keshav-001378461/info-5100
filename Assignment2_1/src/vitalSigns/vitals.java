/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitalSigns;

import java.util.Scanner;

/**
 *
 * @author keshav
 */
public class vitals {
     public static void main(String[] args)
    {
         Patient p1=new Patient();
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter Age Group:" + "1- New Born " + "2- Infant " + "3- Toddler "+ "4- Preschooler "+ "5- School Age "+ "6- Adolescent ");
  p1.ageGroup=sc.nextInt();
  if(p1.ageGroup<1 || p1.ageGroup>6)
  {
      System.out.println(" Invalid Age Group");
      System.exit(0);
  }
 
    
  System.out.print(" Enter the Respiratory Rate : ");
  p1.respiratoryRate=sc.nextInt();
  System.out.print("Enter the Heart Rate: ");
  p1.heartRate=sc.nextInt();
  System.out.println("Enter the Blood Pressure: ");
 p1.bloodPressure=sc.nextInt();
  System.out.print("Enter the Weight in Kilos: ");
  p1.weightInKilos=sc.nextInt();
  System.out.print("Enter the Weight in Pounds: ");
  p1.weightInPounds=sc.nextInt();
boolean result= p1. isPatientNormal(p1.ageGroup, p1.respiratoryRate, p1.heartRate, p1.bloodPressure, p1.weightInKilos, p1.weightInPounds);
    System.out.println("Patient vitals are" + " "+ result);
 
   }
}

