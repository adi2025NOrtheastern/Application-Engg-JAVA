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
public class DeviceID{
    private long deviceNumber;
    private long serialnumber;

    public long getDeviceNumber() {
        return deviceNumber;
    }

    public void setDeviceNumber(long deviceNumber) {
        this.deviceNumber = deviceNumber;
    }

    public long getSerialnumber() {
        return serialnumber;
    }

    public void setSerialnumber(long serialnumber) {
        this.serialnumber = serialnumber;
    }
}
