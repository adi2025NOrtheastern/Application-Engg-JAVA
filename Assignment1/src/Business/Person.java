/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import Business.Address;
/**
 *
 * @author aditi
 */

public class Person {

private String name;
private Address geographicData;
private String dob;
private String[] telephoneNumber;

    private long faxNumber;
    private String[] emailAddresses;
    private long ssn;
    private String medicalRecordNumber;
    private String healthPlanBeneficiaryNumber;
    private String[] bankAccountNumbers;
    private String licenseNumber;  // certificate
    private Vehicle vehicle;
    /* Vehicle identifiers and serial numbers including license plates*/
    private DeviceID device;
    /*Device identifiers and serial numbers*/
    private String linkedIn;
    private String internetProtocolAddresses;
    private BiometricIdentifiers bi; //(i.e. retinal scan, fingerprints)
   /* Full face photos and comparable images */
    private String photo;
    
     /*Any unique identifying number, characteristic, or code*/
    private String ID;
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getGeographicData() {
        return geographicData;
    }

    public void setGeographicData(Address geographicData) {
        this.geographicData = geographicData;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String[] getTelephoneNumber() {
        return telephoneNumber;
    }

    public void setTelephoneNumber(String[] telephoneNumber) {
        this.telephoneNumber = telephoneNumber;
    }

    public long getFaxNumber() {
        return faxNumber;
    }

    public void setFaxNumber(long faxNumber) {
        this.faxNumber = faxNumber;
    }

    public String[] getEmailAddresses() {
        return emailAddresses;
    }

    public void setEmailAddresses(String[] emailAddresses) {
        this.emailAddresses = emailAddresses;
    }

    public long getSsn() {
        return ssn;
    }

    public void setSsn(long ssn) {
        this.ssn = ssn;
    }

    public String getMedicalRecordNumber() {
        return medicalRecordNumber;
    }

    public void setMedicalRecordNumber(String medicalRecordNumber) {
        this.medicalRecordNumber = medicalRecordNumber;
    }

    public String getHealthPlanBeneficiaryNumber() {
        return healthPlanBeneficiaryNumber;
    }

    public void setHealthPlanBeneficiaryNumber(String healthPlanBeneficiaryNumber) {
        this.healthPlanBeneficiaryNumber = healthPlanBeneficiaryNumber;
    }

    public String[] getBankAccountNumbers() {
        return bankAccountNumbers;
    }

    public void setBankAccountNumbers(String[] bankAccountNumbers) {
        this.bankAccountNumbers = bankAccountNumbers;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public DeviceID getDevice() {
        return device;
    }

    public void setDevice(DeviceID device) {
        this.device = device;
    }

    public String getLinkedIn() {
        return linkedIn;
    }

    public void setLinkedIn(String linkedIn) {
        this.linkedIn = linkedIn;
    }

    public String getInternetProtocolAddresses() {
        return internetProtocolAddresses;
    }

    public void setInternetProtocolAddresses(String internetProtocolAddresses) {
        this.internetProtocolAddresses = internetProtocolAddresses;
    }

    public BiometricIdentifiers getBi() {
        return bi;
    }

    public void setBi(BiometricIdentifiers bi) {
        this.bi = bi;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

  

}
