package vitalSigns;
import java.util.*;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author keshav
 */
public class Patient {
    int ageGroup;
    int respiratoryRate;
   int heartRate;
    int bloodPressure;
    int weightInKilos;
    int weightInPounds;
    public static boolean isPatientNormal(int age, int respiratoryRate, int heartRate, int bloodPressure, int weightInKilos, int weightInPounds)
  {
    if(age==1)
{
    if((respiratoryRate<30 || respiratoryRate>50) || (heartRate<120 || heartRate>160) || (bloodPressure<50 || bloodPressure>70) || (weightInKilos<2 || weightInKilos>3) || (weightInPounds<5 || weightInPounds>7))
    {  
    return false;
        }
    else
    {
       return true;
    }
}
    else if (age==2)
 {
    if((respiratoryRate<20 || respiratoryRate>30) || (heartRate<80 || heartRate>140) || (bloodPressure<70 || bloodPressure>100) || (weightInKilos<4 || weightInKilos>10) || (weightInPounds<9 || weightInPounds>22))
    {  
    return false;
        }
    else
    {
       return true;
    }
}       
    else if (age==3)
 {
    if((respiratoryRate<20 || respiratoryRate>30) || (heartRate<80 || heartRate>130) || (bloodPressure<80 || bloodPressure>100) || (weightInKilos<10 || weightInKilos>14) || (weightInPounds<22 || weightInPounds>31))
    {  
    return false;
        }
    else
    {
       return true;
    }
}
       else if (age==4)
 {
    if((respiratoryRate<20 || respiratoryRate>30) || (heartRate<80 || heartRate>120) || (bloodPressure<80 || bloodPressure>110) || (weightInKilos<14 || weightInKilos>18) || (weightInPounds<31 || weightInPounds>40))
    {  
    return false;
        }
    else
    {
       return true;
    }
}
          else if (age==5)
 {
    if((respiratoryRate<20 || respiratoryRate>30) || (heartRate<70 || heartRate>110) || (bloodPressure<80 || bloodPressure>120) || (weightInKilos<20 || weightInKilos>42) || (weightInPounds<41 || weightInPounds>92))
    {  
    return false;
        }
    else
    {
       return true;
    }
}
             else if (age==6)
 {
    if((respiratoryRate<12 || respiratoryRate>20) || (heartRate<55 || heartRate>105) || (bloodPressure<110 || bloodPressure>120) || (weightInKilos>50) || (weightInPounds>110))
    {  
    return false;
        }
    else
    {
       return true;
    }
}
    else{
                 
        return false;
    }
 }
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