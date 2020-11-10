/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author aditi
 */
public class BiometricIdentifiers{
    private String retinaScan;
    private String fingerPrint;
    
    public String getRetinaScan() {
        return retinaScan;
    }

    public void setRetinaScan(String retinaScan) {
        this.retinaScan = retinaScan;
    }

    public String getFingerPrint() {
        return fingerPrint;
    }

    public void setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
    }
    
}