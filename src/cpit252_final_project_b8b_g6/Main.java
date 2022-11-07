/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cpit252_final_project_b8b_g6;

import java.util.ArrayList;
import javax.swing.JLabel;

/**
 *
 * @author ra52m
 */
public class Main {

    // for lines
    static double pricetest;
    int index = 0;
    static ArrayList<String> info = new ArrayList<>();

    public static void main(String[] args) {

    }

    public void chooseService(String service) {
        //c.setService(service);
        info.add(index, service);
        index++;
    }

    public void chooseServiceType(String service, double price) {
        pricetest = price;
        info.add(index, service);
        index++;
    }

    public void BrandDevice(String BrandDevice) {
        info.add(index, BrandDevice);
        index++;
    }

    public void fillInformation(String username, String mobile, String deviceType) {
        info.add(index, username);
        index++;
        info.add(index, mobile);
        index++;
        info.add(index, deviceType);
        index++;
    }

    public void gender(String gender) {
        info.add(index, gender);
        index++;
    }

    public void showformation() {
        // test if it prints right
       // System.out.println("Total price is " + pricetest);
        for (int i = 0; i < info.size(); i++) {
            System.out.println(info.get(i) + " ");
        }
    }

    public void time(String time, String date) {
        info.add(index, time);
        index++;
        info.add(index, date);
        index++;
    }

    public void location(String location) {
        info.add(index, location);
        index++;
    }

    public static double getPricetest() {
        return pricetest;
    }

    public static void setPricetest(double pricetest) {
        Main.pricetest = pricetest;
    }
    
    public void payment(String discount) {
        if (discount.equals("FCIT")) {
            pricetest = pricetest - (pricetest * (15 / 100.0));
        } else {
            pricetest = pricetest;
        }
      //  JLabel label1 = new JLabel("Test");

        /* 
        # of orders list size of 9S
        Total Price ( accssorie + maintainance )
        Discout ? // FCIT Discount 15%
        check box to pay in cash or credit card
        when done show information and recipt
         */
//        System.out.print("Enter discount:");
//        System.out.println("");
//        String discount = "";
//        // test the calculations of the discount
//        if(discount.equals("FCIT")){
//            System.out.println("Total price is " + pricetest);
//            pricetest = pricetest - (pricetest * (15/100.0));
//            System.out.println("The price after discount is "+pricetest);
//        }else{
//            System.out.println("Total price is " + pricetest);
//        }
//        }
    }
}
