/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vitalSigns;
import vitalSigns.Patient;
/**
 *
 * @author keshav
 */
public class vitals {
    public void isnormalNewBorn(Patient patient)
    {
        if (patient.respiratoryRate<30 && patient.respiratoryRate>50){
            System.out.println("");
        }
    }
}
