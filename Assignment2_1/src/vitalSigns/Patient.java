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
  
}