/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit252_final_project_b8b_g6;

/**
 *
 * @author ra52m
 */
public class Customer {

    private String id;
    private String name;
    private char gender;
    private String phone;
    private String DeviceInfo;
    private String location;
    private String time;

    public Customer() {
    }

    public Customer(String id, String name, char gender, String phone, String DeviceInfo, String location, String time) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.phone = phone;
        this.DeviceInfo = DeviceInfo;
        this.location = location;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public char getGender() {
        return gender;
    }

    public String getPhone() {
        return phone;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getDeviceInfo() {
        return DeviceInfo;
    }

    public void setDeviceInfo(String DeviceInfo) {
        this.DeviceInfo = DeviceInfo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

  
    

}
